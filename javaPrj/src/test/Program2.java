package test;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0, n=1; i<10; i++)
			
			if(i+1 == n*3)
			{
				System.out.print("¡Ú");
				n++;
			}
			else
				System.out.printf("%3d",i+1);
	}

}
