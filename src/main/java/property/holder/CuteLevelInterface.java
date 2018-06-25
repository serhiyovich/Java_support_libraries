package property.holder;

import enumerations.CuteLevel;
import org.aeonbits.owner.Config;

@Config.Sources("classpath:cuteLevelInterface.properties")
public interface CuteLevelInterface extends Config{
        @Config.ConverterClass(CuteLevelConverter.class)
        @Config.Key("Puh")
        CuteLevel getMurzikCute();

        @Config.ConverterClass(CuteLevelConverter.class)
        @Config.Key("Red")
        CuteLevel getBarsikCute();

        @Config.ConverterClass(CuteLevelConverter.class)
        @Config.Key("White")
        CuteLevel getMatroskinCute();
    }
