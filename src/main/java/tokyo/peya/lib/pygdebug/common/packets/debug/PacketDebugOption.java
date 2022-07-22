package tokyo.peya.lib.pygdebug.common.packets.debug;

import lombok.AllArgsConstructor;
import lombok.Value;
import tokyo.peya.lib.pygdebug.common.Packet;
import tokyo.peya.lib.pygdebug.common.PacketBase;
import tokyo.peya.lib.pygdebug.common.config.DebuggerOption;

@Value
@AllArgsConstructor
@Packet(value = 0x01, sender = Packet.Sender.CLIENT)
public class PacketDebugOption implements PacketBase
{
    DebuggerOption debuggerOption;

    public PacketDebugOption()
    {
        this(null);
    }
}
