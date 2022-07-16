package tokyo.peya.lib.pygdebug.common.packets.main;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;
import tokyo.peya.lib.pygdebug.common.PacketBase;
import tokyo.peya.lib.pygdebug.common.Packet;

import java.util.UUID;

@Value
@Builder
@AllArgsConstructor
@Packet(value = 0x02, sender = Packet.Sender.CLIENT)
public class PacketServerStatus implements PacketBase
{
    PluginInformation[] plugins;
    PlayerInformation[] players;
    WorldInformation[] worlds;

    ServerLoad load;

    public PacketServerStatus()
    {
        this.plugins = new PluginInformation[0];
        this.players = new PlayerInformation[0];
        this.worlds = new WorldInformation[0];
        this.load = null;
    }

    @Value
    @Builder
    @AllArgsConstructor
    public static class ServerLoad
    {
        double tps1;
        double tps5;
        double tps15;

        long ram;
        long ramMax;

        double cpu;

        public ServerLoad()
        {
            this(0, 0, 0, 0, 0, 0);
        }
    }

    @Value
    @AllArgsConstructor
    public static class WorldInformation
    {
        String name;
        long entities;
        long chunks;

        public WorldInformation()
        {
            this("", 0, 0);
        }
    }

    @Value
    @AllArgsConstructor
    public static class PluginInformation
    {
        String name;
        String version;
        boolean isEnabled;

        public PluginInformation()
        {
            this("", "", false);
        }
    }

    @Value
    @AllArgsConstructor
    public static class PlayerInformation
    {
        String name;
        UUID uuid;
        String ip;

        public PlayerInformation()
        {
            this("", null, "");
        }
    }
}
