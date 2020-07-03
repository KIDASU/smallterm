package day02.homework;

/**
 * @program: smallterm
 * @description:
 * @version：
 * @author: Mr.Wang
 * @create: 2020-06-23 20:00
 **/

public class DiscountOne implements IDiscount {
    @Override
    public double discount(double price) {
        return price*0.5;
    }
}
