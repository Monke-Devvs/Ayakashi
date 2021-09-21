package xyz.szymeko.packet;

import java.io.Serializable;

public class RemoveUserPacket implements Serializable
{
    private final String nickname;

    public RemoveUserPacket(final String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {return this.nickname; }

}
