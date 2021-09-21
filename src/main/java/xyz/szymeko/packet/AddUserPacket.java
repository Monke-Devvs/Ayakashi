package xyz.szymeko.packet;

import java.io.Serializable;

public class AddUserPacket implements Serializable
{
    private final String nickname;

    public AddUserPacket(final String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {return this.nickname; }

}
