package day12.inheritance;

import java.util.Scanner;

class Calculation{

    void additon(int a,int b){
        System.out.printf("두 수의 합 : %d%n" ,a+b);
    }

    void subtraction(int a,int b) {
        System.out.printf("두 수의 뺄셈 : %d%n",a-b);
    }
}

class Inheritance01 extends Calculation{
    void multiplication(int a,int b){
        System.out.printf("두 수의 곱셈:%d%n",a*b);
    }
}

public class inHer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inheritance01 obj = new Inheritance01(); // 자식 클래스 객체 생성시 기본 생성자를 호출하면 부모클래스도 기본생성자가 호출된다.

        System.out.println("두 수 입력");
        int a = sc.nextInt();
        int b = sc.nextInt();

        obj.additon(a,b);
        obj.subtraction(a,b);
        obj.multiplication(a,b);
    }
}
