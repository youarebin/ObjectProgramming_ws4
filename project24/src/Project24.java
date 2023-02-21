//컴퓨터학과_가유빈_20220740
import java.util.Scanner;

public class Project24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		printTimes(num);
	}
	public static void printTimes(int a) {
		System.out.println("구구단" + a + "단 입니다.");
		
		for(int i = 1; i < 10; i++)
		{
			System.out.println(a + "*" + i + "=" + a * i);
		}
	}
}
