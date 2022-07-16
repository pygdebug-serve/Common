package tokyo.peya.lib.pygdebug.common.packets.main;

import tokyo.peya.lib.pygdebug.common.Packet;
import tokyo.peya.lib.pygdebug.common.PacketBase;

@Packet(value = 0x03, sender = {Packet.Sender.SERVER, Packet.Sender.CLIENT})
public class PacketPygDebugAvailable implements PacketBase
{
}
