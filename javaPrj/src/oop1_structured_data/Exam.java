package oop1_structured_data;

import java.util.Scanner;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	
	public static void input(Exam exam){
		Scanner scan = new Scanner(System.in);
		
		int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math;
		
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
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
	}
	
static void print(Exam exam, int num){
		
		int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math;
		
		int total = total(exam);/*kor+eng+math*/
		int avg = avg(exam);/*total/3*/
		
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
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
	}

	private static int avg(Exam exam) {
		return total(exam)/3;
	}
	
	private static int total(Exam exam) {
		return exam.kor + exam.eng + exam.math;
	}

}





