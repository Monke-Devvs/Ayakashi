package Ayakashi.command.impl.netty;

import Ayakashi.helpers.ChatHelper;

public class ChatGlobalCommand {
    public static int cooldownTime = 0;
    public static String username = "Ethyr";

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

    public static void execute(String... args) {

        try {
            //Ayakashi.getNettyServer().getChannel().writeAndFlush(new ShutdownPacket(getHWID()));
        } catch (Exception ex) {
            System.exit(1);
        }
        if (args.length != 0) {

            final StringBuilder sb = new StringBuilder();
            for (String arg : args) {
                sb.append(arg).append(" ");
            }
            final String message = sb.toString();

            //try {
                /*Scanner scanner = new Scanner(new URL("http://pvpclub.pl/license/blackcrack/AyakashiLogin/" + getHWID() + ".txt").openStream());
                while (scanner.hasNext()) {
                    String[] split = scanner.nextLine().split(":");
                    username = split[0];
                }
                scanner.close();*/
            if (!MuteIRCCommand.isMuted)
                return;
            //Ayakashi.getNettyServer().getChannel().writeAndFlush(new ChatPacket(getHWID(), message, username));
            System.out.println("[CHAT] Sended chat packet " + message);
            /*} catch (NoSuchAlgorithmException | MalformedURLException ignored) {

            } catch (IOException e) {
                e.printStackTrace();
            }*/
        } else {
            ChatHelper.sendMessage("Correct usage&8: &f# <message>");
            return;
        }
    }
}