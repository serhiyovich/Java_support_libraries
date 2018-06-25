package Main;

import animals.inheritors.Kitty;
import enumerations.CatPosition;
import enumerations.CuteLevel;
import enumerations.DayPart;
import food.EatCharacteristic;
import food.KittyCat;
import humans.Owner;
import org.apache.log4j.BasicConfigurator;

public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        Kitty kitty = new Kitty("Puh", 5);
        kitty.getCuteLevel();
        kitty.setOwner(new Owner() {//todo
            {
                setFirstName("Vitalii");
                setSecondName("Shramko");
                setAge(25);
            }
        });
        kitty.setCuteLevel(CuteLevel.GOOD_CAT);
        kitty.setKittyCat(new KittyCat("meat", 600));//todo

        /*Owner owner = new Owner();
        owner.setFirstName("Vitalii");
        owner.setSecondName("Shramko");

        kitty.getOwner();*/

//        KittyCat kittyCat = new KittyCat("meat", 600);
        EatCharacteristic fullPlateOfFood = EatCharacteristic.builder()
                .amountFoodEaten(400)
                .catPosition(CatPosition.SIT)
                .dayPart(DayPart.DAY)
                .createCharacteristic();

        EatCharacteristic emptyPlateOfFood = EatCharacteristic.builder()
                .amountFoodEaten(400)
                .catPosition(CatPosition.SIT)
                .dayPart(DayPart.DAY)
                .createCharacteristic();
        
        kitty.eatFood(fullPlateOfFood);
        kitty.eatFood(emptyPlateOfFood);
        kitty.eatFood(emptyPlateOfFood);

        kitty.killCat();
    }
}
