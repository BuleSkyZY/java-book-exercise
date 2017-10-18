package abstractclass;

/**
 * @author spiritree
 * @date 2017/10/16
 */
public class Test {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Employee("hh", 5000, 1999, 12, 12);
        people[1] = new Student("ok", "CS");
        for (Person p : people) {
            System.out.println(p.getName() + p.getDescription());
        }
    }
}