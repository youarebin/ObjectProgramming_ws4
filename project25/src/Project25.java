//컴퓨터학과_가유빈_20220740
import java.util.Scanner;

public class Project25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		int result = judgeNum(num);
		while(result == 2)
		{
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			System.out.print("정수를 입력하세요: ");
			num = sc.nextInt();
			result = judgeNum(num);
		}
		printTimes(num);
		
	}
	public static void printTimes(int a) {
		System.out.println("구구단" + a + "단 입니다.");
		
		if(a >= 10) {
			for(int i = 1; i < a + 1; i++)
			{
				System.out.println(a + "*" + i + "=" + a * i);
			}
		}
		else {
			for(int i = 1; i < 10; i++)
			{
				System.out.println(a + "*" + i + "=" + a * i);
				
			}
		}
	}
	public static int judgeNum(int a) {
		if(a > 0)
		{
			return 1;
		}
		else//다시 입력해야함
		{
			return 2;
		}
	}
}
