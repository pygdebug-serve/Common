package tokyo.peya.lib.pygdebug.common.packets.main;

import lombok.Value;
import tokyo.peya.lib.pygdebug.common.PacketBase;

@Value
public class PacketInformationRequest implements PacketBase
{
    Action action;

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
