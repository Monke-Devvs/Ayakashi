package Ayakashi.client;

import Ayakashi.command.impl.netty.ChatGlobalCommand;
import Ayakashi.command.impl.netty.MuteIRCCommand;
import Ayakashi.helpers.ChatHelper;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;
import net.minecraft.client.Minecraft;
import xyz.szymeko.packet.ChatPacket;
import xyz.szymeko.packet.OnlineUsersPacket;
import xyz.szymeko.packet.ShutdownPacket;

import java.util.ArrayList;
import java.util.List;

public class Client extends Thread {
    public static List<String> users = new ArrayList<>();
    private boolean connected;
    private Channel channel;

    public static String getHWID() {
        /*StringBuilder s = new StringBuilder();
        String main = System.getenv("PROCESSOR_IDENTIFIER") + System.getenv("COMPUTERNAME") + System.getProperty("user.name").trim();
        byte[] bytes = main.getBytes(StandardCharsets.UTF_8);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] md5 = messageDigest.digest(bytes);
        int i = 0;
        for (byte b : md5) {
            s.append(Integer.toHexString(b & 0xFF | 0x300), 0, 3);
            if (i != md5.length - 1)
                s.append("-");
            i++;
        }
        return s.toString();*/
        return "spierdalaj";
    }

    @Override
    public void run() {
        try {
            final Bootstrap bootstrap = new Bootstrap();
            final NioEventLoopGroup nioEventLoopGroup = new NioEventLoopGroup();
            bootstrap.group(nioEventLoopGroup);
            bootstrap.channel(NioSocketChannel.class);
            bootstrap.handler(new ChannelInitializer<SocketChannel>() {
                public void initChannel(final SocketChannel socketChannel) {
                    final ChannelPipeline channelPipeline = socketChannel.pipeline();
                    channelPipeline.addFirst("decoder", new ObjectDecoder(ClassResolvers.cacheDisabled(this.getClass().getClassLoader())));
                    channelPipeline.addAfter("decoder", "handler", new SimpleChannelInboundHandler<Object>() {
                        public void exceptionCaught(final ChannelHandlerContext ctx, final Throwable cause) {
                        }

                        protected void channelRead0(final ChannelHandlerContext chc, final Object o) {

                            if (o instanceof ChatPacket) {
                                final ChatPacket info = (ChatPacket) o;
                                if (Minecraft.getMinecraft().thePlayer != null) {
                                    if (!MuteIRCCommand.isMuted)
                                        return;
                                    if (ChatGlobalCommand.username.equals("Noxerek") || ChatGlobalCommand.username.equals("Szymeko")) {
                                        ChatHelper.sendMessage("&8[&4IRC&8] [&f&o&lDEV&8] &f" + info.getNick() + "&8: &c" + info.getMessage());
                                        return;
                                    }
                                    ChatHelper.sendMessage("&8[&4IRC&8] &f" + info.getNick() + "&8: &c" + info.getMessage());
                                }
                            }

                            if (o instanceof OnlineUsersPacket) {
                                final OnlineUsersPacket info = (OnlineUsersPacket) o;
                                ChatHelper.sendMessage("&7Online&8: " + info.getOnline(), true);
                                ChatHelper.sendMessage("&7" + info.getUsers(), false);
                            }

                            //XD
                            if (o instanceof ShutdownPacket) {
                                System.out.println("s");
                                //System.exit(1);
                                //System.exit(0);
                                //Ayakashi.ExitBigBoi();
                                //Ayakashi.checkHwid();
                            }

                        }

                    });
                    channelPipeline.addAfter("handler", "encoder", new ObjectEncoder());
                }
            });
            final ChannelFuture channelFuture = bootstrap.connect("185.150.25.3", 4096).syncUninterruptibly();
            System.out.println("Connected");
            this.channel = channelFuture.channel();

            //Ayakashi.nettyServer.getChannel().writeAndFlush(new ShutdownPacket(true, getHWID()));

            this.connected = true;

        } catch (Exception ex) {
            //System.exit(0);
            //Ayakashi.ExitBigBoi();
            ex.printStackTrace();
            this.connected = false;
        }
    }

    public Channel getChannel() {
        return this.channel;
    }

    public boolean isConnected() {
        return this.connected;
    }

}
