package day02;

import java.util.Scanner;

/**
 * @program: smallterm
 * @description:
 * @version：
 * @author: Mr.Wang
 * @create: 2020-06-23 13:40
 **/

public class CalcMain {
    public static void main(String[] args) {
        System.out.println("请输入+ - * /");
        Scanner scanner = new Scanner(System.in);
        String op = scanner.next();
        System.out.println("请输入第一个整数：");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = scanner.nextInt();

        switch (op){
            case "+" :
                Add add = new Add();
                add.ope(num1,num2);
                break;
            case "-" :
                Minus minus = new Minus();
                minus.ope(num1,num2);
                break;
            case "*" :
                Multiply multiply = new Multiply();
                multiply.ope(num1,num2);
                break;
            case "/" :
                Division division = new Division();
                division.ope(num1,num2);
                break;
            default:
                break;
        }
    }

}
