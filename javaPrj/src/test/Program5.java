package test;

import java.util.Random;

public class Program5 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		
		//번호생성		
		genLotto(lotto);
		
		//번호출력		
		printLotto(lotto);
		
		//왕찾기		
		sortLotto(lotto);
			
		//번호출력
		printLotto(lotto);	
	}
	
	static void genLotto(int[] lotto){
		Random R = new Random();
		
		for(int i=0; i<6; i++)
			lotto[i] = R.nextInt(45)+1;
	}
	
	static void printLotto(int[] lotto){
		for(int i=0; i<6; i++ )
			System.out.printf("%3d", lotto[i]);
		
		System.out.println();
	}
	
	static void sortLotto(int[] lotto){
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
	}

}

	
