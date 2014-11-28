package oop1_structured_data;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		int num = 1;
		/*int kor = 50;
		int eng = 60;
		int math = 70;*/
		int menu = 0;
		
		Exam exam = new Exam();
		
		
		
		Scanner scan = new Scanner(System.in);
		
		벗어나고파:
		while(true)
		{
			menu = inputMenu(scan);
			
			switch(menu)
			{
			case 1:
			{
				Exam.input(exam);

				break;
				
			}
			case 2:
			{
				
				Exam.print(exam, num);
				
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

