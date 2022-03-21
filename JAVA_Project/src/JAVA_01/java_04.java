package JAVA_01;

import java.util.Scanner;

public class java_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 숫자와 연산자를 입력 하세요 >>");
	    int num1 = sc.nextInt();
	    int num2 = sc.nextInt();
	    String p = sc.next();
	    int result = 0;
	    
	    switch(p) {
	    case "+":result = num1+num2;break;
	    case "-":result = num1-num2;break;
	    case "*":result = num1*num2;break;
	    case "/":result = num1/num2;break;
	    }
	    System.out.println("결과: "+result);
	    

	}

}
