package tokyo.peya.lib.pygdebug.common.packets.main;

import lombok.Builder;
import lombok.Value;
import tokyo.peya.lib.pygdebug.common.PacketBase;

@Value
@Builder
public class PacketPlatformInformation implements PacketBase
{

    ServerInfo server;

    InfoWithVendor os;
    InfoWithVendor java;

    CPUInformation cpu;

    @Override
    public byte getId()
    {
        return 0x00;
    }

    @Value
    @Builder
    public static class ServerInfo
    {
        String name;
        String version;
        String minecraftVersion;
        boolean onlineMode;
    }


    @Value
    @Builder
    public static class InfoWithVendor
    {
        String name;
        String arch;
        String version;
    }

    @Value
    @Builder
    public static class CPUInformation
    {
        String name;
        int cores;
        int threads;
    }

}
