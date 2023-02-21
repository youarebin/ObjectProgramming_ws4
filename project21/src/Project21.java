//컴퓨터학과_가유빈_20220740
import java.util.Scanner;

public class Project21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("정수를 입력하세요: ");
		x = sc.nextInt();
		
		System.out.print("정수를 입력하세요: ");
		y = sc.nextInt();
		
		sum(x, y);
		sum(y, x);
	}
	public static void sum(int a, int b) {
		System.out.println(a + "+" + b + "=" + (a+b));
	}
}
