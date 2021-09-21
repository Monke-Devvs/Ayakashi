package Ayakashi.command.impl.netty;

import Ayakashi.command.Command;
import Ayakashi.command.CommandInfo;
import net.minecraft.command.CommandException;

import java.util.ArrayList;
import java.util.List;

@CommandInfo(
        alias = "online",
        usage = ",list",
        aliases = {"onlineusers", "list"}
)
public class OnlineUsersCommand extends Command {

    private final List<String> users = new ArrayList<>();

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

        if (args.length == 0) {

            //Ayakashi.getNettyServer().getChannel().writeAndFlush(new OnlineUsersPacket(1, Client.users));

        } else {
            throw new CommandException("Correct usage&8: &f" + this.getUsage());
        }
    }

}