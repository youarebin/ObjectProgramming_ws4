import java.util.Scanner;

public class Project28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		
		for(int i = 0; i < num.length; i++)
		{
			System.out.print("\n" + (i + 1) + "번째 숫자를 입력하세요: ");
			num[i] = sc.nextInt();
		}
		displayArray(num);
		System.out.print("\n가장 큰 숫자는 " + findMax(num) + "입니다.");
		
	}
	public static void displayArray(int[] iArray) {
		System.out.print("입력된 숫자는 다음과 같습니다.\n");
		for(int i = 0; i < iArray.length; i++)
		{
			System.out.print(iArray[i] + "\t");
		}
	}
	public static int findMax(int[] iArray) {
		int max = 0;
		for(int i = 0; i < iArray.length; i++)
		{
			if(iArray[i] > max)
			{
				max = iArray[i];
			}
		}
		return max;
	}


}
