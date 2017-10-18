package interfacetimer;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * @author spiritree
 * @date 2017/10/17
 */
public class TimerTest {
    public static void main(String[] args) {
        /**
         * error: this cannot be referenced from a static context
         * 解决方法：将类变为静态内部类即加上`static`
         * 将类移到外部定义
         */
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(3000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit?");
        System.exit(0);
    }
    static class TimePrinter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println(new Date());
            Toolkit.getDefaultToolkit().beep();
        }
    }
}
