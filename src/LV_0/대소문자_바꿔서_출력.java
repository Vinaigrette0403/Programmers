package LV_0;
import java.util.Scanner;
public class 대소문자_바꿔서_출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String result = "";
		sc.close();
		
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) {
				result += Character.toUpperCase(x);
			} else {
				result += Character.toLowerCase(x);
			}
		}
		System.out.println(result);

	}

}
