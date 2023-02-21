//컴퓨터학과_가유빈_20220740
import java.util.Scanner;

public class Project22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int x = sc.nextInt();
		
		int y = abs(x);
		System.out.print("입력된 정수 " + x + "의 절대값은 " + y + "입니다.");
	}
	public static int abs(int a) {
		if(a >= 0)
		{
			return a;
		}
		else
		{
			return 0 - a;
		}
	}
}
