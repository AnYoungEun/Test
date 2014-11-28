package oop3_instance_method;

import java.util.Scanner;

public class Exam {
	private int num;
	private int kor;
	private int eng;
	private int math;
	
	public void input(){
		Scanner scan = new Scanner(System.in);
		
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
		System.out.println("영어:");
		eng = scan.nextInt();
			if(eng<0 || 100<eng)
				System.out.println("영어값 똥값 다시입력");
		}while(eng<0 || 100<eng);
		
		do{
		System.out.print("수학:");
		math = scan.nextInt();	
			if(math<0 || 100<math)
				System.out.println("수학값 똥값 다시입력");
		}while(math<0 || 100<math);
		
	}
	
public void print(){
	
		int total = total();/*kor+eng+math*/
		int avg = avg();/*total/3*/
		
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
		
		
	}

	public int avg() {
		return total()/3;
	}
	
	public int total() {
		return kor + eng + math;
	}

}





