package property.holder;

import org.aeonbits.owner.ConfigFactory;

public class PropertyHolder {
    public static CuteLevel cuteLevel = ConfigFactory.create(CuteLevel.class);
    public static KcalLevel kcalLevel = ConfigFactory.create(KcalLevel.class);
}
