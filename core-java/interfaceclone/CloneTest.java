package interfaceclone;

/**
 * @author spiritree
 * @date 2017/10/17
 */
public class CloneTest {
    public static void main(String[] args) {
        try {
            Employee origin = new Employee("a", 5000);
            origin.setHireDay(2010, 1, 1);
            Employee copy = origin.clone();
            copy.raiseSalary(50);
            copy.setHireDay(2012, 1, 1);
            System.out.println(origin);
            System.out.println(copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
