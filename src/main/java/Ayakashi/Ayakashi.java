package Ayakashi;

import Ayakashi.client.Client;
import Ayakashi.command.impl.*;
import Ayakashi.command.impl.netty.MuteIRCCommand;
import Ayakashi.command.impl.netty.OnlineUsersCommand;
import Ayakashi.command.impl.netty.OutGameCommand;
import Ayakashi.helpers.MemoryHelper;
import Ayakashi.helpers.OpenGlHelper;
import Ayakashi.managers.CommandManager;
import Ayakashi.managers.CrashManager;
import Ayakashi.methods.impl.*;
import Ayakashi.mods.blockparticles.FBP;
import Ayakashi.mods.crashitems.TabArmor;
import Ayakashi.mods.crashitems.TabExploits;
import Ayakashi.mods.crashitems.TabSword;
import Ayakashi.mods.viamcp.ViaMCP;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.Display;
import xyz.szymeko.managers.FileManager;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public enum Ayakashi {
    INSTANCE;
    //public static Client nettyServer;
    private static final String version = "1.0.5";
    private final CommandManager commandManager;
    private final CrashManager crashManager;

    Ayakashi() {
        new DiscordRP();
        this.commandManager = new CommandManager(
                new AdvancedCrashCommand(),

                new CrashCommand(),
                new HelpCommand(),
                new WingsCommand(),
                new MethodsCommand(),
                new GamemodeCommand(),
                new ThreadsCommand(),
                new ExploitCommand(),
                new ClearChatCommand(),
                new HudCommand(),
                new OnlineUsersCommand(),
                new OutGameCommand(),
                new ProtocolsCommand(),
                new MuteIRCCommand(),
                new RpcCommand());
        this.crashManager = new CrashManager(
                new CrashYokai1(),
                new CrashYokai2(),
                new CrashYokai3(),
                new CrashShade1(),
                new CrashShade2(),
                new CrashShade3(),
                new CrashMare1(),
                new CrashMare2(),
                new CrashMare3(),
                new CrashSpirit1(),
                new CrashSpirit2(),
                new CrashSpirit3(),
                new CrashSpirit4(),
                new CrashSpirit5(),
                new CrashUbume1(),
                new CrashUbume2(),
                new CrashUbume3(),
                new CrashObake1(),
                new CrashObake2(),
                new CrashTengu1(),
                new CrashTengu2(),
                new CrashTengu3(),
                new CrashTengu4(),
                new CrashTengu5(),
                new CrashTengu6(),
                new CrashTengu7());
        ViaMCP.getInstance().start();
        new FBP();
        new MemoryHelper().run();
        FBP.INSTANCE.onStart();
        new TabArmor();
        new TabExploits();
        new TabSword();
        Minecraft.getMinecraft().gameSettings.gammaSetting += 9999.0F;
        Minecraft.getMinecraft().gameSettings.ofFastRender = true;
    }

    public static Client getNettyServer() {
        //if (nettyServer == null){
        //    nettyServer = new Client();
        //}
        //return  nettyServer;
        return null;
    }

    public static void checkHwid() {
        /*try {

            URL conn = new URL("http://pvpclub.pl/license/blackcrack/Ayakashi/" + GuiLicenseHelper.getHWID() + ".txt");
            URLConnection yc = conn.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                if (inputLine.equalsIgnoreCase("true"))
                    continue;
                Ayakashi.ExitBigBoi();
                System.exit(0);
                Minecraft.ExitBigBoi2();
            }
            in.close();
        } catch (Exception ex) {
            Minecraft.ExitBigBoi2();
            ExitBigBoi();
            System.exit(0);
        }*/
    }

    public static void ExitBigBoi() {
        /*try {
            System.exit(1);
        } catch (Exception ignored) {
        }*/
    }

    public static String getHWID() throws NoSuchAlgorithmException {
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

    public void setDisplay() throws IOException {
        Display.setTitle("Ayakashi 1.8.9 | " + version + " - OutGame Methods Update!");
        OpenGlHelper.setWindowIcon("https://i.imgur.com/tsb5f3N.png", "https://i.imgur.com/DVNhGaK.png");
        //getNettyServer().start();
        FileManager.CreateDataFile();
        Timer timer = new Timer();
        timer.schedule(new RemoveOne(), 0, 1000);

        File folder = new File("data");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < Objects.requireNonNull(listOfFiles).length; i++) {
            if (listOfFiles[i].isFile() && !listOfFiles[i].getName().equalsIgnoreCase("saved.txt")) {
                AdvancedCrashCommand.methods.add(listOfFiles[i].getName());
                System.out.println("File " + listOfFiles[i].getName());
            }
        }

        try {
            //Ayakashi.getNettyServer().getChannel().writeAndFlush(new ShutdownPacket(getHWID()));
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("log");
        }
    }

    public CommandManager getCommandManager() {
        return this.commandManager;
    }

    public CrashManager getExploitManager() {
        return this.crashManager;
    }
}


class RemoveOne extends TimerTask {

    public static String getHWID() throws NoSuchAlgorithmException {
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

    public void run() {
        /*if (OutGameCommand.cooldownTime == 0) {
            try {
                //Ayakashi.getNettyServer().getChannel().writeAndFlush(new ShutdownPacket(getHWID()));
            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("log");
            }
            return;
        }
        OutGameCommand.cooldownTime--;*/
    }

}
