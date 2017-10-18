package abstractclass;

/**
 * @author spiritree
 * @date 2017/10/16
 */
public class Student extends Person {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "student" + major;
    }
}
