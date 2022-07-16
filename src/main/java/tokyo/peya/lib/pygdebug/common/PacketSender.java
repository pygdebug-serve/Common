package tokyo.peya.lib.pygdebug.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface PacketSender
{
    Type[] value();

    enum Type
    {
        CLIENT,
        SERVER
    }
}
