package animals;

import lombok.*;

@Getter
@ToString(exclude = "weight")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Animal {
    private String name;
    @Setter
    private double weight;
}
