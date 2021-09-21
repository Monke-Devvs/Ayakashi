package xyz.szymeko.packet;

import java.io.Serializable;

public class ShutdownPacket implements Serializable
{
    private final String hwid;

    public ShutdownPacket(final String hwid) {
        this.hwid = hwid;
    }

    public String getHwid() {
        return this.hwid;
    }
}
