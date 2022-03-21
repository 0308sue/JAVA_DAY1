package JAVA_01;

import java.util.Scanner;

public class java_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요 >> ");
		int stu = sc.nextInt();
		System.out.println("한줄에 앉을 학생수를 입력하세요 >> ");
		int line = sc.nextInt();
		int i;
		for(i=1;i<=stu;i++) {
			System.out.print(i+"\t");
			if(i%line==0) {
				System.out.println();
			}
		}
		//조건연산자(삼항연산자) 
		int row = (stu%line==0) ? stu/line : stu/line+1;
		System.out.println();
		System.out.println("필요한 줄 수 : " + row);
		
		

	}

}
