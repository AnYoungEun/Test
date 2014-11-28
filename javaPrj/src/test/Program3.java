package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\workspace\\javaPrj\\src\\test\\Program3.java");
		
		Scanner scan = new Scanner(fis);
		int ch = 0, ch2 = 0;
		
		while(scan.hasNext())
		{
			String line = scan.next();
			ch += line.length();
			ch2++;
		}
			System.out.println(ch2+" "+ch);
		
		scan.close();
		fis.close();
		
	}

}
