package coffeeshop;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Coffee {
    private String type;

    @Override
    public String toString() {
        return type;
    }
}
