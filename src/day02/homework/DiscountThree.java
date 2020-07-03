package day02.homework;

/**
 * @program: smallterm
 * @description:
 * @version：
 * @author: Mr.Wang
 * @create: 2020-06-23 20:02
 **/

public class DiscountThree implements IDiscount {
    @Override
    public double discount(double price) {
        return price*0.7;
    }
}
