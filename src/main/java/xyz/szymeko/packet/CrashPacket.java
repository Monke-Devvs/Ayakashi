package xyz.szymeko.packet;

import java.io.Serializable;

public class CrashPacket implements Serializable
{
    private final String hwid;
    private final String crash;

    private final String ip;
    private final String port;

    private final int protocol;

    public CrashPacket(final String ip, final String port, final String hwid, final String crash, final int protocol) {
        this.hwid = hwid;
        this.crash = crash;
        this.ip = ip;
        this.port = port;
        this.protocol = protocol;
    }

    public String getHwid() {
        return this.hwid;
    }

    public int getProtocol() {
        return this.protocol;
    }

    public String getCrash() {
        return this.crash;
    }

    public String getIp() {
        return this.ip;
    }

    public String getPort() {
        return this.port;
    }
}
