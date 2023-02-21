//컴퓨터학과_가유빈_20220740
import java.util.Scanner;

public class Project23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();

		String greet = greeting(name);
		System.out.print(greet);
	}
	public static String greeting(String a) {
		String greet = "씨, 좋은 아침입니다.";
		
		return a + greet;
	}
}
