package xyz.szymeko.packet;

import java.io.Serializable;

public class ChatPacket implements Serializable
{
    private final String hwid;
    private final String message;
    private final String nick;


    public ChatPacket(final String hwid, final String message, final String nick) {
        this.hwid = hwid;
        this.message = message;
        this.nick = nick;
    }

    public String getHwid() {
        return this.hwid;
    }

    public String getMessage() {
        return this.message;
    }

    public String getNick() {
        return this.nick;
    }

}
