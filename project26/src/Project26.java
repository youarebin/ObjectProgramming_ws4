import java.util.Scanner;

public class Project26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] s = new int[5];
		
		for(int i = 0; i < s.length; i++)//1
		{
			System.out.print((i + 1) + "번째 숫자를 입력하세요: ");
			s[i] = sc.nextInt();
		}
		System.out.print("입력된 숫자는 다음과 같습니다.\n");
		for(int i = 0; i < s.length; i++)//2
		{
			System.out.print(s[i]);
		}
		System.out.print("\n역순 출력입니다.\n");
		for(int i = 0; i < s.length; i++)//3
		{
			System.out.print(s[4 - i]);
		}
		for(int i = 0; i < s.length; i++)//4
		{
			int max = s[i];
			
			if(s[i] > max)
			{
				max = s[i];
			}
			if(i == s.length - 1)
			{
				System.out.print("\n가장 큰수는 " + max + "입니다.");
			}
		}

	}

}
