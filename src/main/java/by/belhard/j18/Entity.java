package by.belhard.j18;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
@Data
@AllArgsConstructor
public class Entity {
    @Getter
    private int a = 5;

    @Getter
    @Setter
    private String s = "hello";
}


