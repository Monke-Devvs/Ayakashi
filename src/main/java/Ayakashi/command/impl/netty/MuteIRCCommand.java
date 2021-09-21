package Ayakashi.command.impl.netty;

import Ayakashi.command.Command;
import Ayakashi.command.CommandInfo;
import Ayakashi.exeptions.CommandException;
import Ayakashi.helpers.ChatHelper;

@CommandInfo(
        alias = "muteirc",
        aliases = {"mute", "ircmute", "ircoff"}
)
public class MuteIRCCommand extends Command {
    public static boolean isMuted = true;

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
        ChatHelper.sendMessage(String.format("IRC has been &f%s&7!", !isMuted ? "enabled" : "disabled"));
        isMuted = !isMuted;
    }
}
