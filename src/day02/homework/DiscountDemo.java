package day02.homework;

import java.util.Scanner;

/**
 * @program: smallterm
 * @description:
 * @version：
 * @author: Mr.Wang
 * @create: 2020-06-23 20:08
 **/

public class DiscountDemo {
    public static void main(String[] args) {
        System.out.println("请选择你的打折策略：\n" +
                "1、打5折\n" +
                "2、打3折\n" +
                "3、打7折\n" +
                "4、300-60");
        Scanner scanner = new Scanner(System.in);
        String choose=scanner.next();
        System.out.println("请输入价格：");
        int price=scanner.nextInt();

        IDiscount iDiscount = null ;
        DiscountFactory discountFactory = new DiscountFactory();
        iDiscount = discountFactory.getDiscount(choose);

        Double finalprice = iDiscount.discount(price);
        System.out.println("最终价格为"+finalprice+"元");

    }
}
