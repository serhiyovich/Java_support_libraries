package property.holder;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:cuteLevel.properties")
public interface CuteLevel extends Config{
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
