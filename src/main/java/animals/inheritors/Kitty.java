package animals.inheritors;

import animals.Animal;
import enumerations.CuteLevel;
import food.EatCharacteristic;
import food.KittyCat;
import humans.Owner;
import lombok.*;
import lombok.extern.log4j.Log4j;
import org.apache.commons.lang3.StringUtils;

@Log4j
@ToString(callSuper = true)
@Setter
@Getter
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class Kitty extends Animal {
    @EqualsAndHashCode.Include
    private CuteLevel cuteLevel;
    @EqualsAndHashCode.Include
    private Owner owner;
    private KittyCat kittyCat;

    public Kitty(String name, double weight) {
        super(name, weight);
        log.info("Kitty was born!");
    }

    public void eatFood(EatCharacteristic eatCharacteristic) {
        if (kittyCat.getWeight() == 0.0) {
            log.warn("Cat is concerned about lack of food!");
        } else if (kittyCat.getWeight() > eatCharacteristic.getAmountFoodEaten()) {
            kittyCat.setWeight(kittyCat.getWeight() - eatCharacteristic.getAmountFoodEaten());
            log.info("Cat has eaten!");
        } else {//todo
            double neededFood = eatCharacteristic.getAmountFoodEaten() - kittyCat.getWeight();//todo
            log.info(String.format("Kitty has eaten, but there was not enough %f g. of food!", neededFood));//todo
            kittyCat.setWeight(0);//todo
        }
    }

    @SneakyThrows(InterruptedException.class)
    public void killCat() {
        log.error("Cat has died!");
        if (!cuteLevel.equals(CuteLevel.BAD_CAT)) {
            log.info(StringUtils.join("Owner ", owner.getFirstName(), " is sad!"));
            throw new InterruptedException();
        }
    }
}
