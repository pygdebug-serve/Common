package tokyo.peya.lib.pygdebug.common.packets.main;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;
import tokyo.peya.lib.pygdebug.common.PacketBase;
import tokyo.peya.lib.pygdebug.common.Packet;

@Value
@Builder
@AllArgsConstructor
@Packet(value = 0x01, sender = Packet.Sender.SERVER)
public class PacketPlatformInformation implements PacketBase
{

    ServerInfo server;

    InfoWithVendor os;
    InfoWithVendor java;

    CPUInformation cpu;

    public PacketPlatformInformation()
    {
        this.server = null;
        this.os = null;
        this.java = null;
        this.cpu = null;
    }

    @Value
    @Builder
    @AllArgsConstructor
    public static class ServerInfo
    {
        String name;
        String version;
        String minecraftVersion;
        boolean onlineMode;

        public ServerInfo()
        {
            this("", "", "", false);
        }
    }


    @Value
    @Builder
    @AllArgsConstructor
    public static class InfoWithVendor
    {
        String name;
        String arch;
        String version;

        public InfoWithVendor()
        {
            this("", "", "");
        }
    }

    @Value
    @Builder
    @AllArgsConstructor
    public static class CPUInformation
    {
        String name;
        int cores;
        int threads;

        public CPUInformation()
        {
            this("", 0, 0);
        }
    }

}
