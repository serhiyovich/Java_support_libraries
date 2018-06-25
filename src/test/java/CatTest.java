import animals.inheritors.Kitty;
import enumerations.CatPosition;
import enumerations.CuteLevel;
import enumerations.DayPart;
import food.EatCharacteristic;
import food.KittyCat;
import humans.Owner;
import org.apache.log4j.BasicConfigurator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CatTest {

    @BeforeClass
    public void setUp() {
        BasicConfigurator.configure();
    }

    @Test
    public void verifyThatCatCreates() {
        Kitty cat = new Kitty("Puh", 2.7);
        Assert.assertEquals(cat.getName(), "Puh");
    }

    @Test
    public void verifyThatCatDies() {
        Kitty cat = new Kitty("Puh", 2.7);
        cat.setOwner(new Owner() {
            {
                setFirstName("Vitalii");
                setSecondName("Shramko");
                setAge(45);
            }}
        );
        cat.setCuteLevel(CuteLevel.GOOD_CAT);
        cat.setKittyCat(new KittyCat("meat", 135));
        EatCharacteristic eatenFood = EatCharacteristic.builder().
                amountFoodEaten(200)
                .catPosition(CatPosition.LIE)
                .dayPart(DayPart.EVENING)
                .createCharacteristic();

    }
}
