package tokyo.peya.lib.pygdebug.common.packets.debug;

import lombok.AllArgsConstructor;
import lombok.Value;
import tokyo.peya.lib.pygdebug.common.Packet;
import tokyo.peya.lib.pygdebug.common.PacketBase;

import java.util.logging.LogRecord;

@Value
@AllArgsConstructor
@Packet(value = 0x02, sender = Packet.Sender.SERVER)
public class PacketServerConsoleOutput implements PacketBase
{
    LogRecord context;

    public PacketServerConsoleOutput()
    {
        this(null);
    }
}
