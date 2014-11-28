package javaPrj;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int num = 1;
		int kor = 50;
		int eng = 60;
		int math = 70;
		int menu = 0;
		
		Scanner scan = new Scanner(System.in);
		
		벗어나고파:
		while(true)
		{
			System.out.println("┌──────────────────────────────────────┐");
			System.out.println("│                메인메뉴                        │");
			System.out.println("└─────────────────────────────────────┛");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.종료");
			
			menu = scan.nextInt();
			
			switch(menu)
			{
			case 1:
			{
				System.out.println("┌──────────────────────────────────────┐");
				System.out.println("│                성적 입력                        │");
				System.out.println("└─────────────────────────────────────┛");
				
				do{
				System.out.print("국어:");
				kor = scan.nextInt();
					if(kor<0 || 100<kor)
						System.out.println("국어값 똥값 다시입력");
				}while(kor<0 || 100<kor);
				
				do{
				System.out.print("수학:");
				math = scan.nextInt();	
					if(math<0 || 100<math)
						System.out.println("수학값 똥값 다시입력");
				}while(math<0 || 100<math);
				
				do{
				System.out.println("영어:");
				eng = scan.nextInt();
					if(eng<0 || 100<eng)
						System.out.println("영어값 똥값 다시입력");
				}while(eng<0 || 100<eng);

				break;
				
			}
			case 2:
			{
				int total = kor+eng+math;
				int avg = total/3;
				
					System.out.println("┌─────────────────────────────────────┐");
					System.out.println("│             성적 출력                           │");
					System.out.println("├─────┬───────┬─────┬─────┬─────┬─────┤");
					System.out.println("│ 번호  │	국어     │ 영어  │ 수학  │ 총점  │ 평균  │");
					System.out.println("├─────┼───────┼─────┼─────┼─────┼─────┤");
				for(int i=0; i<3; i++)
				{
					System.out.printf("│ %d   │  %d   │ %d  │ %d  │ %d │ %d  │\n", num, kor, eng, math, total, avg);
					System.out.println("└─────┴───────┴─────┴─────┴─────┴─────┘");
				}
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

}
