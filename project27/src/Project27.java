import java.util.Scanner;

public class Project27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] s = new int[5];
		int[] cnt = {0,0,0,0,0,0,0,0,0,0};
		int max = -1;
		
		for(int i = 0; i < s.length; i++)//1
		{
			System.out.print((i + 1) + "번째 숫자를 입력하세요: ");
			s[i] = sc.nextInt();
		}
		System.out.print("입력된 숫자는 다음과 같습니다.\n");
		for(int i = 0; i < s.length; i++)//2
		{
			System.out.print(s[i] + " ");
		}
		System.out.print("\n역순 출력입니다.\n");
		for(int i = s.length - 1; i >= 0; i--)//3
		{
			System.out.print(s[i] + " ");
		}
		for(int i = 0; i < s.length; i++)//4
		{	
			if(s[i] > max)
			{
				max = s[i];
			}
		}
		System.out.print("\n가장 큰수는 " + max + "입니다.");
		System.out.print("\n숫자 별로 입력된 횟수는 다음과 같습니다.\n");
		for(int i = 0; i < s.length; i++)//5
		{
			cnt[s[i]]++;
		}
		for(int i = 0; i < 10; i++)//6
		{
			System.out.print("숫자" + i +": " + cnt[i] + "번\n");
		}
		System.out.print("가장 큰 수는 " + max + "이고 배열 내에 " + cnt[max] + "번 나타납니다");
	}

}
