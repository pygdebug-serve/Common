package tokyo.peya.lib.pygdebug.common.packets.main;

import lombok.AllArgsConstructor;
import lombok.Value;
import tokyo.peya.lib.pygdebug.common.PacketBase;
import tokyo.peya.lib.pygdebug.common.Packet;

@Value
@AllArgsConstructor
@Packet(value = 0x00, sender = Packet.Sender.SERVER)
public class PacketInformationRequest implements PacketBase
{
    Action action;

    public PacketInformationRequest()
    {
        this.action = null;
    }

    public enum Action
    {
        PLATFORM,
        SERVER_STATUS
    }
}
