import java.util.Random;

public class Project29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] rd = new int[20];
		
		System.out.print("생성된 난수는 다음과 같습니다.\n");
		for(int i = 0; i < rd.length; i++)
		{
			rd[i] = random.nextInt(100);
		}
		displayArray(rd);
		System.out.print("가장 큰 숫자는" + findMax(rd) + "입니다.");
	}
	public static void displayArray(int[] iArray) {
		for(int i = 0; i < iArray.length; i++)
		{
			System.out.print(iArray[i] + "\t");
			if((i + 1) % 10 == 0)
			{
				System.out.print("\n");
			}
		}
	}
	public static int findMax(int[] iArray) {
		int max = -1;
		
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
