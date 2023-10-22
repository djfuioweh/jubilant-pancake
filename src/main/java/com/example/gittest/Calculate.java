package com.example.gittest;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        calu();
    }

    public static void calu(){
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字：");
        double num = scanner.nextDouble();
        while (true){
            System.out.println("请选择运算符：1(+)  2(-)  3(*)  4(/)  5(%)");
            int operator = scanner.nextInt();
            String oper = null;
            System.out.println("请输入数字：");
            double number = scanner.nextDouble();
            switch (operator){
                case 1 : result = num + number;oper = "+" ;break;
                case 2 : result = num - number;oper = "-" ;break;
                case 3 : result = num * number;oper = "*" ;break;
                case 4 : result = num / number;oper = "/" ;break;
                case 5 : result = num % number;oper = "%" ;break;
                default:
                    System.out.println("输入错误");break;
            }
            System.out.println("结果为："+ result);
            System.out.println("(" + num + oper + number + ")");
            num = result;
            System.out.println("1(继续)  2（退出）  3(清除)");
            int state = scanner.nextInt();
            if (state == 1){

            }else if(state == 2){
                break;
            }else if (state == 3){
                calu();
                break;
            }
        }
    }
}
