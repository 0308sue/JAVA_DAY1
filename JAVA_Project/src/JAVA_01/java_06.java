package JAVA_01;

import java.util.Scanner;

public class java_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 >>");
		int max = sc.nextInt();
		int i;
		int sum = 0;
		for(i=0;i<=max;i+=2) {
			System.out.print(i+"\t");//탭 만큼 띄우기 
			sum +=i;	
		}
		System.out.println();
		System.out.println(max+"까지의 짝수의 합 : "+sum);
		

	}

}
