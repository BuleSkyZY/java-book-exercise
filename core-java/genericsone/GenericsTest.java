package genericsone;
/**
 * @author spiritree
 * @date 2017/10/18
 */
public class GenericsTest {
    public static void main(String[] args) {
        String[] words = {"b", "a", "y", "d"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println(mm.getFirst());
        System.out.println(mm.getSecond());
    }
}
