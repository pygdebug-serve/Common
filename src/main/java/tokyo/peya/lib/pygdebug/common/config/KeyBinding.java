package tokyo.peya.lib.pygdebug.common.config;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class KeyBinding
{
    private final String displayName;
    private int key;

    public KeyBinding()
    {
        this("unknown", -1);
    }

}
