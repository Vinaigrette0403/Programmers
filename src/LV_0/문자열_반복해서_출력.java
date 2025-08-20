package LV_0;
import java.util.Scanner;
public class 문자열_반복해서_출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.print(str); //for문 이용
		}
		System.out.println();
		System.out.print(str.repeat(n)); //.repeat 이용

	}

}
