package oop11_dynamic_binding;

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
	
		int total = total(); // kor+eng+math
		double avg = avg(); // total/3
			
		System.out.printf("번호: %d \n",1);
		System.out.printf("국어: %d \n",kor);
		System.out.printf("영어: %d \n",eng);
		System.out.printf("수학: %d \n",math);
		//확장된 과목 성적을 요기에
		onPrint();
		System.out.printf("총점: %d \n",total);
		System.out.printf("평균: %f \n",avg);
		System.out.println("------------------------");
		
	}

	public void onPrint() {
	// TODO Auto-generated method stub
}

	public double avg() {
		return total()/3.0f;
	}
	
	public double avg(float div) {
		return total()/div;
	}
	
	public int total() {
		return kor + eng + math;
	}

}





