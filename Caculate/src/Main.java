import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 创建两个分数对象
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(), in.nextInt());

        // 打印分数
        a.print();
        b.print();

        // 加法运算并打印结果
        a.plus(b).print();

        // 乘法运算后加上另一个分数的结果并打印
        a.multiply(b).plus(new Fraction(5, 6)).print();

        // 再次打印原始分数
        a.print();
        b.print();

        in.close();
    }
}