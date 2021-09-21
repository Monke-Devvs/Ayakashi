package Ayakashi.helpers;

import Ayakashi.mods.alts.MagicField;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;
import xyz.szymeko.managers.FileManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public final class GuiLicenseHelper extends GuiScreen {
    private final static File dataFile = new File("data");
    private MagicField code;
    private boolean xd = false;
    private final String error = "Login by using your four-digit code";

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

    protected void actionPerformed(GuiButton button) {
        if (button.id == 0) {/*try {
                    Class.forName("uwu.narumii.FixMemAndAvarionSkidsSecurityManager");

                    //Noxerek: wjeb tu cos mocnego
                    //szymeko: Sie robi szefu

                    try {
                        URI uri = new URI("https://discord.gg/f3JySAMdVd");
                        java.awt.Desktop.getDesktop().browse(uri);
                    } catch (Exception ignored) {
                    }

                    try {
                        File f = new File("SzymekoMujKrul");
                        File f2 = new File("SzymekoMujKrul/aKrafcigToGEj.txt");
                        File f3 = new File("SzymekoMujKrul/NoxerekSzef.txt");
                        if (!f.exists()) {
                            f.mkdir();
                        }
                        if (!f2.exists()) {
                            f2.createNewFile();
                        }
                        if (!f3.exists()) {
                            f3.createNewFile();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    for (int i = 0; i < 500; i++) {
                        File f3 = new File("murzyn" + i);
                        f3.mkdir();
                    }

                    for (int i = 0; i < 500; i++) {
                        try {
                            URI uri = new URI("https://discord.gg/f3JySAMdVd");
                            java.awt.Desktop.getDesktop().browse(uri);
                        } catch (Exception ignored) {
                        }
                    }
                    Ayakashi.ExitBigBoi();
                    System.exit(0);


                } catch (ClassNotFoundException ignored) {

                    try {
                        URL conn = new URL("http://pvpclub.pl/license/blackcrack/Ayakashi/" + getHWID() + ".txt");
                        URLConnection yc = conn.openConnection();
                        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
                        String inputLine;
                        while ((inputLine = in.readLine()) != null) {
                            if (inputLine.equalsIgnoreCase("true"))
                                continue;
                            Ayakashi.ExitBigBoi();
                            System.exit(0);
                        }
                        in.close();
                    } catch (Throwable ex) {
                        Ayakashi.ExitBigBoi();
                        System.exit(0);
                    }
                    Ayakashi.checkHwid();
                }*/

                /*try {
                    try {
                        Scanner scanner = new Scanner(new URL("http://pvpclub.pl/license/blackcrack/AyakashiLogin/" + getHWID() + ".txt").openStream());
                        while (scanner.hasNext()) {
                            String[] split = scanner.nextLine().split(":");
                            String license = split[1];
                            if (this.code.getText().equals(license)) {

                                //Ayakashi.nettyServer.getChannel().writeAndFlush(new AddUserPacket(this.mc.session.getUsername()));
                                xd = true;
                                //Ayakashi.getNettyServer().getChannel().writeAndFlush(new AddUserPacket(UserNameApi.getName()));


                                if (dataFile.exists()) {
                                    try (FileWriter _fileWriter = new FileWriter(dataFile + "/saved.txt")) {
                                        _fileWriter.write(code.getText());
                                        _fileWriter.flush();
                                        System.out.println(code.getText());
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                } else {
                                    FileManager.CreateDataFile();
                                }


                                Minecraft.getMinecraft().displayGuiScreen(new MainMenuHelper());
                            } else {
                                error = "Wrong four-digit code!";
                                return;
                            }
                        }
                        scanner.close();
                    } catch (IOException | NumberFormatException exception) {
                        Ayakashi.ExitBigBoi();
                        try {
                            URI uri = new URI("https://discord.gg/f3JySAMdVd");
                            java.awt.Desktop.getDesktop().browse(uri);
                        } catch (Exception ignored) {
                        }
                        System.exit(1);
                        return;
                    }
                } catch (Exception exception) {
                    Ayakashi.ExitBigBoi();
                    try {
                        URI uri = new URI("https://discord.gg/f3JySAMdVd");
                        java.awt.Desktop.getDesktop().browse(uri);
                    } catch (Exception ignored) {
                    }
                    System.exit(1);
                    return;
                }*/

            xd = true;
            try {
                //Ayakashi.getNettyServer().getChannel().writeAndFlush(new AddUserPacket(UserNameApi.getName()));
            } catch (Exception e) {
            }

            if (dataFile.exists()) {
                try (FileWriter _fileWriter = new FileWriter(dataFile + "/saved.txt")) {
                    _fileWriter.write(code.getText());
                    _fileWriter.flush();
                    System.out.println(code.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                FileManager.CreateDataFile();
            }


            Minecraft.getMinecraft().displayGuiScreen(new MainMenuHelper());
        }
    }

    public void drawScreen(int x2, int y2, float z2) {
        this.mc.getTextureManager().bindTexture(new ResourceLocation("Ayakashi/menu/MainMenu.png"));
        drawModalRectWithCustomSizedTexture(0, 0, 0.0F, 0.0F, width, height, (float) width, (float) height);
        this.code.drawTextBox();

        drawCenteredString(this.mc.fontRendererObj, error, width / 2, 10, -1);

        if (this.code.getText().isEmpty()) {
            drawString(this.mc.fontRendererObj, "C", width / 2 - 96, 106, -7829368);
        }

        super.drawScreen(x2, y2, z2);
    }

    public void initGui() {
        int var3 = height / 4 + 24;
        this.buttonList.add(new GuiButton(0, width / 2 - 100, var3 + 72 + 12, "Enter this shit client"));
        this.buttonList.add(new GuiButton(4, width / 2 - 1000, var3 + 702 + 120, ""));
        this.code = new MagicField(this.mc.fontRendererObj, width / 2 - 100, 100, 200, 20);
        Keyboard.enableRepeatEvents(true);
        //Ayakashi.checkHwid();
        code.writeText(FileManager.loadPinCode());
    }

    protected void keyTyped(char character, int key) {
        try {
            super.keyTyped(character, key);
        } catch (IOException var4) {
            var4.printStackTrace();
        }
        if (character == '\r') {
            this.actionPerformed(this.buttonList.get(0));
        }
        this.code.textboxKeyTyped(character, key);
    }

    protected void mouseClicked(int x2, int y2, int button) {
        try {
            super.mouseClicked(x2, y2, button);
        } catch (IOException var5) {
            var5.printStackTrace();
        }

        this.code.mouseClicked(x2, y2, button);
    }

    public void onGuiClosed() {
        Keyboard.enableRepeatEvents(false);
        if (!xd) {
            System.exit(0);
        }
    }

    public void updateScreen() {
        this.code.updateCursorCounter();
    }
}
