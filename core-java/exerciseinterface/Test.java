package exerciseinterface;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author spiritree
 * @date 2017/10/16
 */
public class Test {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("a", 6000);
        staff[1] = new Employee("b", 4000);
        staff[2] = new Employee("c", 5000);

        Arrays.sort(staff);

        for (Employee e : staff) {
            System.out.println(e.getName() + e.getSalary());
        }
    }
}
