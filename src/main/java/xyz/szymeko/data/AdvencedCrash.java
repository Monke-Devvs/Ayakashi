package xyz.szymeko.data;


public class AdvencedCrash {

    private String packetType;

    private final Integer packets;
    private final Integer delay;
    private final Integer amount;

    public AdvencedCrash(String _packetType, Integer _packets, Integer _delay, Integer _amount) {
        this.packetType = _packetType;
        this.packets = _packets;
        this.delay = _delay;
        this.amount = _amount;
    }

}