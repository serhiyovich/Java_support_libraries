package property.holder;

import org.aeonbits.owner.ConfigFactory;

public class PropertyHolder {
    public static CuteLevelInterface cuteLevelInterface = ConfigFactory.create(CuteLevelInterface.class);
    public static KcalLevel kcalLevel = ConfigFactory.create(KcalLevel.class);
}
