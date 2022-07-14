package tokyo.peya.lib.pygdebug.common.packets.main;

import lombok.Builder;
import lombok.Value;
import tokyo.peya.lib.pygdebug.common.PacketBase;

import java.util.UUID;

@Value
@Builder
public class PacketServerStatus implements PacketBase
{
    PluginInformation[] plugins;
    PlayerInformation[] players;
    WorldInformation[] worlds;

    ServerLoad load;

    @Override
    public byte getId()
    {
        return 0x01;
    }

    @Value
    @Builder
    public static class ServerLoad
    {
        double tps1;
        double tps5;
        double tps15;

        long ram;
        long ramMax;

        double cpu;
    }

    @Value
    public static class WorldInformation
    {
        String name;
        long entities;
        long chunks;
    }

    @Value
    public static class PluginInformation
    {
        String name;
        String version;
        boolean isEnabled;
    }

    @Value
    public static class PlayerInformation
    {
        String name;
        UUID uuid;
        String ip;
    }
}
