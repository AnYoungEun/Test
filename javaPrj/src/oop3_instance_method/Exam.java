package oop3_instance_method;

import java.util.Scanner;

public class Exam {
	private int num;
	private int kor;
	private int eng;
	private int math;
	
	public void input(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��������������������������������������������������������������������������������");
		System.out.println("��                ���� �Է�                        ��");
		System.out.println("������������������������������������������������������������������������������");
		
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
	
		int total = total();/*kor+eng+math*/
		int avg = avg();/*total/3*/
		
			System.out.println("������������������������������������������������������������������������������");
			System.out.println("��             ���� ���                           ��");
			System.out.println("������������������������������������������������������������������������������");
			System.out.println("�� ��ȣ  ��	����     �� ����  �� ����  �� ����  �� ���  ��");
			System.out.println("������������������������������������������������������������������������������");
		for(int i=0; i<3; i++)
		{
			System.out.printf("�� %d   ��  %d   �� %d  �� %d  �� %d �� %d  ��\n", num, kor, eng, math, total, avg);
			System.out.println("������������������������������������������������������������������������������");
		}
		
		
	}

	public int avg() {
		return total()/3;
	}
	
	public int total() {
		return kor + eng + math;
	}

}





