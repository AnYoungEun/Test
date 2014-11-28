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
		System.out.print("����:");
		kor = scan.nextInt();
			if(kor<0 || 100<kor)
				System.out.println("��� �˰� �ٽ��Է�");
		}while(kor<0 || 100<kor);
		
		
		do{
		System.out.println("����:");
		eng = scan.nextInt();
			if(eng<0 || 100<eng)
				System.out.println("��� �˰� �ٽ��Է�");
		}while(eng<0 || 100<eng);
		
		do{
		System.out.print("����:");
		math = scan.nextInt();	
			if(math<0 || 100<math)
				System.out.println("���а� �˰� �ٽ��Է�");
		}while(math<0 || 100<math);
		
	}
	
public void print(){
	
		int total = total(); // kor+eng+math
		double avg = avg(); // total/3
			
		System.out.printf("��ȣ: %d \n",1);
		System.out.printf("����: %d \n",kor);
		System.out.printf("����: %d \n",eng);
		System.out.printf("����: %d \n",math);
		//Ȯ��� ���� ������ ��⿡
		onPrint();
		System.out.printf("����: %d \n",total);
		System.out.printf("���: %f \n",avg);
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





