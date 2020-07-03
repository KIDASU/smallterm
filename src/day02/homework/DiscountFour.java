package day02.homework;

/**
 * @program: smallterm
 * @description:
 * @version：
 * @author: Mr.Wang
 * @create: 2020-06-23 20:03
 **/

public class DiscountFour implements IDiscount {
    @Override
    public double discount(double price) {
        return price>=300?price-30:price;
    }
}
