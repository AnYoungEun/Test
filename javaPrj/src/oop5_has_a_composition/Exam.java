package oop5_has_a_composition;

import java.util.Scanner;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	
	public Exam(){
		this(1,1,1);
	}
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public Exam(int kor, int eng, int math){
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void input(){
		Scanner scan = new Scanner(System.in);
		
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
		double avg = avg();/*total/3*/
		
			
		for(int i=0; i<3; i++)
		{
			System.out.printf("│ %d   │  %d   │ %d  │ %d  │ %d │ %d  │\n", 1, kor, eng, math, total, avg);
			
		}
		
		
	}

	public double avg() {
		return total()/3;
	}
	
	public double avg(float div) {
		return total()/div;
	}
	
	public int total() {
		return kor + eng + math;
	}

}





