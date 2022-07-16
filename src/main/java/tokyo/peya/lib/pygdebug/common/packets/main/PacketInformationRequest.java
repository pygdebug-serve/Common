package tokyo.peya.lib.pygdebug.common.packets.main;

import lombok.AllArgsConstructor;
import lombok.Value;
import tokyo.peya.lib.pygdebug.common.PacketBase;
import tokyo.peya.lib.pygdebug.common.PacketSender;

@Value
@AllArgsConstructor
@PacketSender(PacketSender.Type.CLIENT)
public class PacketInformationRequest implements PacketBase
{
    Action action;

    public PacketInformationRequest()
    {
        this.action = null;
    }

    @Override
    public byte getId()
    {
        return 0x00;
    }

    public enum Action
    {
        PLATFORM,
        SERVER_STATUS
    }
}
