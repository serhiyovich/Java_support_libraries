package property.holder;

import org.aeonbits.owner.Config;
@Config.Sources("classpath:kcalLevel.properties")
public interface KcalLevel extends Config {
        @Config.Key("soup")
        String getSoupValue();

        @Config.Key("meat")
        String getMeatValue();
}
