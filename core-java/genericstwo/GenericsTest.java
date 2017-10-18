package genericstwo;

import java.time.LocalDate;

/**
 * @author spiritree
 * @date 2017/10/18
 */
public class GenericsTest {
    public static void main(String[] args) {
        LocalDate [] birthdays = {
                LocalDate.of(1906, 1, 1),
                LocalDate.of(1815, 1, 1),
                LocalDate.of(1903, 1, 1),
                LocalDate.of(1910, 2, 1)
        };
        Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
        System.out.println("min = "+mm.getFirst());
        System.out.println("max = "+mm.getSecond());
    }
}