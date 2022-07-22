package tokyo.peya.lib.pygdebug.common.config;

import lombok.Data;

@Data
public class KeyBinding
{
    private final String displayName;
    private int[] keys;

    public KeyBinding()
    {
        this("unknown", -1);
    }

    public KeyBinding(String displayName, int... keys)
    {
        this.displayName = displayName;
        this.keys = keys;
    }
}
