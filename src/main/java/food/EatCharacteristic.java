package food;

import enumerations.CatPosition;
import enumerations.DayPart;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(builderClassName = "FoodCollector", buildMethodName = "createCharacteristic")
public class EatCharacteristic {
    private double eatedFoodAmount;
    private DayPart dayPart;
    private CatPosition catPosition;
}
