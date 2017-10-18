package exercisefour;

import java.util.*;

/**
 * @author spiritree
 * @date 2017/10/16
 * 根据泛型重构
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("aa", 50000));
        staff.add(new Employee(60000));
        staff.add(new Employee());
        for (Employee e : staff) {
            System.out.println(e.getId() + e.getSalary() + e.getName());
        }
    }
}
