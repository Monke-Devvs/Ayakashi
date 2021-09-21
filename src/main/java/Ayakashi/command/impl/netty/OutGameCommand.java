package Ayakashi.command.impl.netty;

import Ayakashi.command.Command;
import Ayakashi.command.CommandInfo;
import Ayakashi.helpers.ChatHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandException;

@CommandInfo(
        alias = "outgame",
        usage = ",outgame <method/list> <protocol>",
        aliases = {"hanshake", "attack"}
)
public class OutGameCommand extends Command {

    private static final Minecraft mc = Minecraft.getMinecraft();
    public static int cooldownTime = 0;
    private final boolean blocked = false;

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

    public void execute(String... args) throws CommandException {
        try {
            //Ayakashi.getNettyServer().getChannel().writeAndFlush(new ShutdownPacket(getHWID()));
        } catch (Exception ex) {
            System.exit(1);
        }

        /*try {
            URL conn = new URL("http://pvpclub.pl/license/blackcrack/blacklist/" + mc.getCurrentServerData().serverIP + ".txt");
            URLConnection yc = conn.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                blocked = inputLine.equalsIgnoreCase("true");
            }
            in.close();
        } catch (Exception ex) {
            blocked = false;
        }

        if (blocked) {
            ChatHelper.sendMessage("This server has blacklist, you can buy blacklist on our DISCORD", true);
            return;
        }*/

        if (args.length == 2) {

            String arg = args[0];

            String serverIpPort = Minecraft.getMinecraft().getNetHandler().getNetworkManager().getRemoteAddress().toString().split("/")[1];
            String serverPort = serverIpPort.split(":")[1];
            String serverIP = serverIpPort.split(":")[0];

            //if (cooldownTime > 0) {
            //    throw new CommandException("&7Try again after &f" + cooldownTime + "&7 sec!");
            //}
            switch (arg) {
                case "1":
                case "join": {
                    //try {
                    long start = System.currentTimeMillis();
                    ChatHelper.sendMessage("Connecting to the machine...", true);
                    //Ayakashi.getNettyServer().getChannel().writeAndFlush(new CrashPacket(serverIP, serverPort, getHWID(), "join", Integer.parseInt(args[1])));
                    ChatHelper.sendMessage(String.format("Sending &8(&fJOIN&8) [&f%sms&8]", System.currentTimeMillis() - start), true);
                    //cooldownTime = 60;
                    //} catch (NoSuchAlgorithmException ex) {
                    //    ex.printStackTrace();
                    //}
                    break;
                }
                case "2":
                case "aegis": {
                    //try {
                    long start = System.currentTimeMillis();
                    ChatHelper.sendMessage("Connecting to the machine...", true);
                    //Ayakashi.getNettyServer().getChannel().writeAndFlush(new CrashPacket(serverIP, serverPort, getHWID(), "aegis", Integer.parseInt(args[1])));
                    ChatHelper.sendMessage(String.format("Sending &8(&fAEGIS&8) [&f%sms&8]", System.currentTimeMillis() - start), true);
                    //cooldownTime = 60;
                    //} catch (NoSuchAlgorithmException ex) {
                    //    ex.printStackTrace();
                    //}
                    break;
                }
                case "3":
                case "antibotdeluxe": {
                    //try {
                    long start = System.currentTimeMillis();
                    ChatHelper.sendMessage("Connecting to the machine...", true);
                    //Ayakashi.getNettyServer().getChannel().writeAndFlush(new CrashPacket(serverIP, serverPort, getHWID(), "antibotdeluxe", Integer.parseInt(args[1])));
                    ChatHelper.sendMessage(String.format("Sending &8(&fANTIBOTDELUXE&8) [&f%sms&8]", System.currentTimeMillis() - start), true);
                    //cooldownTime = 60;
                    //} catch (NoSuchAlgorithmException ex) {
                    //    ex.printStackTrace();
                    //}
                    break;
                }
                case "4":
                case "nantibot": {
                    //try {
                    long start = System.currentTimeMillis();
                    ChatHelper.sendMessage("Connecting to the machine...", true);
                    //Ayakashi.getNettyServer().getChannel().writeAndFlush(new CrashPacket(serverIP, serverPort, getHWID(), "nantibot", Integer.parseInt(args[1])));
                    ChatHelper.sendMessage(String.format("Sending &8(&fNANTIBOT&8) [&f%sms&8]", System.currentTimeMillis() - start), true);
                    //cooldownTime = 60;
                    //} catch (NoSuchAlgorithmException ex) {
                    //    ex.printStackTrace();
                    //}
                    break;
                }
                case "5":
                case "spigot1": {
                    //try {
                    long start = System.currentTimeMillis();
                    ChatHelper.sendMessage("Connecting to the machine...", true);
                    //Ayakashi.getNettyServer().getChannel().writeAndFlush(new CrashPacket(serverIP, serverPort, getHWID(), "spigot1", Integer.parseInt(args[1])));
                    ChatHelper.sendMessage(String.format("Sending &8(&fSPIGOT1&8) [&f%sms&8]", System.currentTimeMillis() - start), true);
                    //cooldownTime = 60;
                    //} catch (NoSuchAlgorithmException ex) {
                    //    ex.printStackTrace();
                    //}
                    break;
                }
                case "6":
                case "spigot2": {
                    //try {
                    long start = System.currentTimeMillis();
                    ChatHelper.sendMessage("Connecting to the machine...", true);
                    //Ayakashi.getNettyServer().getChannel().writeAndFlush(new CrashPacket(serverIP, serverPort, getHWID(), "spigot2", Integer.parseInt(args[1])));
                    ChatHelper.sendMessage(String.format("Sending &8(&fSPIGOT2&8) [&f%sms&8]", System.currentTimeMillis() - start), true);
                    //cooldownTime = 60;
                    //} catch (NoSuchAlgorithmException ex) {
                    //    ex.printStackTrace();
                    //}
                    break;
                }
                case "7":
                case "flamecord": {
                    //try {
                    long start = System.currentTimeMillis();
                    ChatHelper.sendMessage("Connecting to the machine...", true);
                    //Ayakashi.getNettyServer().getChannel().writeAndFlush(new CrashPacket(serverIP, serverPort, getHWID(), "flamecord", Integer.parseInt(args[1])));
                    ChatHelper.sendMessage(String.format("Sending &8(&fFLAMECORD&8) [&f%sms&8]", System.currentTimeMillis() - start), true);
                    //cooldownTime = 60;
                    //} catch (NoSuchAlgorithmException ex) {
                    //    ex.printStackTrace();
                    //}
                    break;
                }
                case "8":
                case "motd": {
                    //try {
                    long start = System.currentTimeMillis();
                    ChatHelper.sendMessage("Connecting to the machine...", true);
                    //Ayakashi.getNettyServer().getChannel().writeAndFlush(new CrashPacket(serverIP, serverPort, getHWID(), "motd", Integer.parseInt(args[1])));
                    ChatHelper.sendMessage(String.format("Sending &8(&fMOTD&8) [&f%sms&8]", System.currentTimeMillis() - start), true);
                    //cooldownTime = 60;
                    //} catch (NoSuchAlgorithmException ex) {
                    //    ex.printStackTrace();
                    //}
                    break;
                }
                case "9":
                case "flasher": {
                    //try {
                    long start = System.currentTimeMillis();
                    ChatHelper.sendMessage("Connecting to the machine...", true);
                    //Ayakashi.getNettyServer().getChannel().writeAndFlush(new CrashPacket(serverIP, serverPort, getHWID(), "flasher", Integer.parseInt(args[1])));
                    ChatHelper.sendMessage(String.format("Sending &8(&fFLASHER&8) [&f%sms&8]", System.currentTimeMillis() - start), true);
                    //cooldownTime = 60;
                    //} catch (NoSuchAlgorithmException ex) {
                    //    ex.printStackTrace();
                    //}
                    break;
                }
                case "10":
                case "auth": {
                    //try {
                    long start = System.currentTimeMillis();
                    ChatHelper.sendMessage("Connecting to the machine...", true);
                    //Ayakashi.getNettyServer().getChannel().writeAndFlush(new CrashPacket(serverIP, serverPort, getHWID(), "auth", Integer.parseInt(args[1])));
                    ChatHelper.sendMessage(String.format("Sending &8(&fAUTH&8) [&f%sms&8]", System.currentTimeMillis() - start), true);
                    //cooldownTime = 60;
                    //} catch (NoSuchAlgorithmException ex) {
                    //    ex.printStackTrace();
                    //}
                    break;
                }
                case "11":
                case "pingxjoin": {
                    //try {
                    long start = System.currentTimeMillis();
                    ChatHelper.sendMessage("Connecting to the machine...", true);
                    //Ayakashi.getNettyServer().getChannel().writeAndFlush(new CrashPacket(serverIP, serverPort, getHWID(), "pingxjoin", Integer.parseInt(args[1])));
                    ChatHelper.sendMessage(String.format("Sending &8(&fPINGXJOIN&8) [&f%sms&8]", System.currentTimeMillis() - start), true);
                    //cooldownTime = 60;
                    //} catch (NoSuchAlgorithmException ex) {
                    //    ex.printStackTrace();
                    //}
                    break;
                }
                case "12":
                case "timeouter": {
                    //try {
                    long start = System.currentTimeMillis();
                    ChatHelper.sendMessage("Connecting to the machine...", true);
                    //Ayakashi.getNettyServer().getChannel().writeAndFlush(new CrashPacket(serverIP, serverPort, getHWID(), "timeouter", Integer.parseInt(args[1])));
                    ChatHelper.sendMessage(String.format("Sending &8(&fTIMEOUTER&8) [&f%sms&8]", System.currentTimeMillis() - start), true);
                    //cooldownTime = 60;
                    //} catch (NoSuchAlgorithmException ex) {
                    //    ex.printStackTrace();
                    //}
                    break;
                }
                case "13":
                case "handshake": {
                    //try {
                    long start = System.currentTimeMillis();
                    ChatHelper.sendMessage("Connecting to the machine...", true);
                    //Ayakashi.getNettyServer().getChannel().writeAndFlush(new CrashPacket(serverIP, serverPort, getHWID(), "handshake", Integer.parseInt(args[1])));
                    ChatHelper.sendMessage(String.format("Sending &8(&fHANDSHAKE&8) [&f%sms&8]", System.currentTimeMillis() - start), true);
                    //cooldownTime = 60;
                    //} catch (NoSuchAlgorithmException ex) {
                    //    ex.printStackTrace();
                    //}
                    break;
                }
                case "14":
                case "httpsddos": {
                    //try {
                    long start = System.currentTimeMillis();
                    ChatHelper.sendMessage("Connecting to the machine...", true);
                    //Ayakashi.getNettyServer().getChannel().writeAndFlush(new CrashPacket(serverIP, serverPort, getHWID(), "httpddos", Integer.parseInt(args[1])));
                    ChatHelper.sendMessage(String.format("Sending &8(&fHTTPDDOS&8) [&f%sms&8]", System.currentTimeMillis() - start), true);
                    //cooldownTime = 60;
                    //} catch (NoSuchAlgorithmException ex) {
                    //    ex.printStackTrace();
                    //}
                    break;
                }
                default:
                    throw new CommandException("Correct usage&8: &f" + this.getUsage());
            }

        } else if (args.length == 1 && args[0].equals("list")) {
            ChatHelper.sendMessage("", false);
            ChatHelper.sendMessage("List of all outgame methods&8: ", true);
            ChatHelper.sendMessage("", false);
            ChatHelper.sendMessage("&8[&f1&8] -> &fjoin", true);
            ChatHelper.sendMessage("&8[&f2&8] -> &faegis", true);
            ChatHelper.sendMessage("&8[&f3&8] -> &fantibotdeluxe", true);
            ChatHelper.sendMessage("&8[&f4&8] -> &fnantibot", true);
            ChatHelper.sendMessage("&8[&f5&8] -> &fspigot1", true);
            ChatHelper.sendMessage("&8[&f6&8] -> &fspigot2", true);
            ChatHelper.sendMessage("&8[&f7&8] -> &fflamecord", true);
            ChatHelper.sendMessage("&8[&f8&8] -> &fmotd", true);
            ChatHelper.sendMessage("&8[&f9&8] -> &fflasher", true);
            ChatHelper.sendMessage("&8[&f10&8] -> &fauth", true);
            ChatHelper.sendMessage("&8[&f11&8] -> &fpingxjoin", true);
            ChatHelper.sendMessage("&8[&f12&8] -> &fftimeouter", true);
            ChatHelper.sendMessage("&8[&f13&8] -> &ffhandshake", true);
            ChatHelper.sendMessage("&8[&f14&8] -> &ffhttpddos", true);
            ChatHelper.sendMessage("", false);
        } else {
            throw new CommandException("Correct usage&8: &f" + this.getUsage());
        }

    }
}