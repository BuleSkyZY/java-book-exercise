package abstractclass;

/**
 * @author spiritree
 * @date 2017/10/16
 */
public abstract class Person {
    /**
     * 获取各个类中的描述
     * 抽象类更加抽象，抽象方法充当占位的作用，在子类重载复写方法
     * 抽象类不能被实例化
     */
    public abstract String getDescription();
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
