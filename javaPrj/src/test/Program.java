package test;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int y=0; y<10; y++)
		{
			for(int x=0; x<10; x++)
				if(y<=x && 9<x+y)
					System.out.print("¡Ú");
				else
					System.out.print("¡Û");
		System.out.println();
		}
			
	}

}
