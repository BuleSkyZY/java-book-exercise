package exerciseinheritance;

/**
 * @author spiritree
 * @date 2017/10/16
 */
public class Test {
    public static void main(String[] args) {
        Manager boss = new Manager("boos", 80000, 1987, 12, 12);
        boss.setBonus(5000);
        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("ab", 20000, 1988, 12, 12);
        staff[2] = new Employee("abc", 10000, 1990, 12, 12);
        for (Employee e : staff) {
            System.out.println(e.getSalary());
        }
    }
}
