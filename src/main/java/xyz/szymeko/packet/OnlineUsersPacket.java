package xyz.szymeko.packet;

import java.io.Serializable;
import java.util.List;

public class OnlineUsersPacket implements Serializable
{
    public final int online;
    public final List<String> users;

    public OnlineUsersPacket(final int online, List<String> users) {
        this.online = online;
        this.users = users;
    }

    public int getOnline() {
        return this.online;
    }

    public List<String> getUsers() {return  this.users; }


}
