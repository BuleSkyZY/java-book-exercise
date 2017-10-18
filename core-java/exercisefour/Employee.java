package exercisefour;

import java.util.Random;

/**
 * @author spiritree
 * @date 2017/10/16
 */
public class Employee {
    private static int nextId;
    private int id;
    /**
     * 实例域初始化
     */
    private String name = "";
    private double salary;
    // 静态初始块
    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }
    // 对象初始块
    {
        id = nextId;
        nextId++;
    }
    /**
     * 重载构造函数
     */
    public Employee(String n, double s) {
        name = n;
        salary = s;
    }
    public Employee(double s) {
        // 用this调用另外一个构造器
        this("Employee #" + nextId, s);
    }
    public Employee() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
