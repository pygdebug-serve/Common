package tokyo.peya.lib.pygdebug.common.config;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.event.KeyEvent;
import java.util.HashMap;

@Data
@NoArgsConstructor
public class ClientConfig
{
    private final HashMap<String, KeyBinding> keyBindings = new HashMap<String, KeyBinding>()
    {
        {
            this.put("gui.show", new KeyBinding("Show GUI", KeyEvent.VK_ALT));
        }
    };
}
