package food;

import lombok.*;

@ToString(exclude = "weight")
@EqualsAndHashCode(doNotUseGetters = true)
@RequiredArgsConstructor
public class KittyCat {
    @NonNull
    private String name;
    @Getter
    @Setter
    @NonNull
    private double weight;
    @Getter
    @Setter
    private int kcal;
}
