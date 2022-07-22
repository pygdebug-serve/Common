package tokyo.peya.lib.pygdebug.common.config;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DebuggerOption
{
    private boolean pipeServerConsole;

    private ClientConfig clientConfig = new ClientConfig();
}
