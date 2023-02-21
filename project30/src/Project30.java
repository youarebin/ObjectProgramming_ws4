import java.util.Random;

public class Project30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = getData(20);

		displayArray(data);
		System.out.print("가장 큰 숫자는" + findMax(data) + "입니다.");
	}
	public static void displayArray(int[] iArray) {
		System.out.print("생성된 난수는 다음과 같습니다.\n");
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
	public static int[] getData(int num) {
		Random random = new Random();
		int[] rslt = new int[num];
		
		for(int i = 0; i < rslt.length; i++)
		{
			rslt[i] = random.nextInt(100);
		}
		return rslt;

	}

}
