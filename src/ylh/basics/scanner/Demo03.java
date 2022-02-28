/**
 * @param null
 * @throws
 * @return
 * @author II
 * @date 2022/2/23 10:44
 */
package ylh.basics.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用nextLine方式进行接收：");
        //使用nextLine方式接收
        String s = scanner.nextLine();

        System.out.println("输入的内容为：" + s);

        //凡是属于io流的类如果不关闭就会一直占用资源，要养成好习惯，用完就关闭！
        scanner.close();
    }
}
