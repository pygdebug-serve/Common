package tokyo.peya.lib.pygdebug.common.packets.debug;

import lombok.AllArgsConstructor;
import lombok.Value;
import tokyo.peya.lib.pygdebug.common.Packet;
import tokyo.peya.lib.pygdebug.common.PacketBase;

@Value
@AllArgsConstructor
@Packet(value = 0x03, sender = Packet.Sender.CLIENT)
public class PacketSendConsoleCommand implements PacketBase
{
    String command;

    public PacketSendConsoleCommand()
    {
        this(null);
    }
}
