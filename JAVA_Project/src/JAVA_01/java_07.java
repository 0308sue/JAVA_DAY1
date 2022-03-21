package JAVA_01;

public class java_07 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		for(i=1;i<101;i++) {
			sum +=i;
			if(i%10==0) {
				System.out.println("1부터"+i+"까지의 합 : "+ sum);
			}
		}
		sum = 0;
		for(i=1;i<101;i++) {
			sum +=i;
			if(i%10==0) {
				System.out.println((i-9)+"부터"+i+"까지의 합 : "+ sum);
			    sum = 0;
			}
		}
	}

}
