package test;

import java.util.Random;

public class Program4 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		
		Random R = new Random();
		
		for(int i=0; i<6; i++)
			lotto[i] = R.nextInt(45)+1;
		
		//번호출력
		for(int i=0; i<6; i++ )
			System.out.printf("%3d", lotto[i]);
		
		System.out.println();
		
		//왕찾기
		for(int j=0; j<5; j++)
			for(int i=0; i<5-j; i++)
			{
				int temp;
					if(lotto[i+0]>lotto[i+1])
					{
						temp = lotto[i+0];
						lotto[i+0] = lotto[i+1];
						lotto[i+1] = temp;
					}
			}
			
		//번호출력
		for(int i=0; i<6; i++ )
			System.out.printf("%3d", lotto[i]);	
	}

}
