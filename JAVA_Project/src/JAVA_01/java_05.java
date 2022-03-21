package JAVA_01;

import java.util.Scanner;

public class java_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 숫자를 입력 하세요 >>");
	    int max = sc.nextInt();
	    int min = sc.nextInt();
	    int tmp = 0;
	    if(min>max) {
	    	tmp=min;
	    	min=max;
	    	max=tmp;
	    	
	    }
	    System.out.println("큰 수 : "+max);
	    System.out.println("작은 수 : "+min);
	    System.out.println("차 : "+ (max-min));
	    
	    System.out.println("-----------------------------------");
	    
	    System.out.println("점수를 입력 하세요 >>");
	    int score = sc.nextInt();
	    String grade;
	    if(score >= 90) {
	    	grade="A학점";
	    }else if(score >= 80) {
	    	grade="B학점";
	    }else if(score >= 70) {
	    	grade="C학점";
	    }else if(score >= 60) {
	    	grade="D학점";
	    }else {
	    	grade="F학점";
	    }
	    System.out.println(grade);
	    

	}

}
