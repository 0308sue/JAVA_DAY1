package JAVA_01;

import java.util.Scanner;

public class java_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요>>");
		String name = sc.next();
		System.out.println("국어 수학 영어 성적을 입력하세요>>");
	    int kor = sc.nextInt();
	    int math = sc.nextInt();
	    int eng = sc.nextInt();
	    
	    int total = kor+math+eng;
	    float avg = total/3;
	    
	    System.out.println(name+"의 총점 : "+total);
	    System.out.println(name+"의 평균 : "+avg);
	}

}
