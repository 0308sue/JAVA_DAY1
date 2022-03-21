package JAVA_01;

import java.util.Scanner;

public class java_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요>>");
		String name = sc.next();
		System.out.println(name);
		System.out.println("점수를 입력하세요>>");
		System.out.println("커트라인을 입력하세요>>");
		int score = sc.nextInt();
		int cut = sc.nextInt();
		if(score >= cut) {
			System.out.println("합격 ");
		}else {
			System.out.println("불합격 ");
		}
		
	}

}
