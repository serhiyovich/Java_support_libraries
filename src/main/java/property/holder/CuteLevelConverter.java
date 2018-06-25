package property.holder;

import java.lang.reflect.Method;
import enumerations.CuteLevel;
import org.aeonbits.owner.Converter;

public class CuteLevelConverter implements Converter<CuteLevel> {
    public CuteLevel convert(Method method, String s) {
        return CuteLevel.valueOf(s);
    }
}
