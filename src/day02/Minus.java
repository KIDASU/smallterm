package day02;

/**
 * @program: smallterm
 * @description:
 * @version：
 * @author: Mr.Wang
 * @create: 2020-06-23 13:50
 **/

public class Minus implements Ope {
    @Override
    public void ope(int a, int b) {
        System.out.println(a-b);
    }
}
