package oop5_has_a_composition;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		int num = 1;
		/*int kor = 50;
		int eng = 60;
		int math = 70;*/
		int menu = 0;
		
		ExamManager manager = new ExamManager();
		
		Scanner scan = new Scanner(System.in);
		
		벗어나고파:
		while(true)
		{
			menu = inputMenu(scan);
			
			switch(menu)
			{
			case 1:
			{
				manager.input();

				break;
				
			}
			case 2:
			{
				
				manager.print();
				
				break;
			}
			case 3:
				break 벗어나고파;
				
			default:
				System.out.println("잘못입력하셨습니다");
				break;
			}
		}
		
	}
	
	static int inputMenu(Scanner scan){
		System.out.println("┌──────────────────────────────────────┐");
		System.out.println("│                메인메뉴                        │");
		System.out.println("└─────────────────────────────────────┛");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.종료");
		
		int menu = scan.nextInt();
		return menu;
	}
	
	
	
}

