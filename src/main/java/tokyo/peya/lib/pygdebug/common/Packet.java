package tokyo.peya.lib.pygdebug.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Packet
{
    byte value();

    Sender sender() default Sender.SERVER;

    enum Sender
    {
        CLIENT,
        SERVER
    }
}
