package JAVA_01;

import java.util.Scanner;

public class JAVA_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 숫자의 개수 >>");
		int cnt = sc.nextInt();
		int i;
		int sum = 0;
		for(i=0;i<cnt;i++) {
//		int num = sc.nextInt();
//		sum += num;
		sum += sc.nextInt();
		}
		System.out.println("입력값의 합 : "+sum);

	}

}
