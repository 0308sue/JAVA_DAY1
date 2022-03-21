package JAVA_01;

public class java_01 {

	public static void main(String[] args) {
		float a = 40.0f;
		long b = 1000000L;
		
		System.out.println(a+b);
		
		//묵시적 형 변환 작 ---> 큰 
		int c = 8;
		a = c;
		System.out.println(a);
		
		//명시적 형 변환 큰 ---> 작 
		c = (int)a;
		System.out.println(c);
		
		int d = 2;
		int e = 3;
		System.out.println(d+"와"+ e+"의 합 : "+(e+d));
		
	}

}
