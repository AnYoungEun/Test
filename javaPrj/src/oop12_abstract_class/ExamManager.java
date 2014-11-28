package oop12_abstract_class;

import java.util.Scanner;

public class ExamManager {
	int size;
	private Exam[] exams;
	Scanner scan = new Scanner(System.in);
	
	public ExamManager(){
		size = 0;
		exams = new Exam[3];
	}
	
	public void input(){
		System.out.println("��������������������������������������������������������������������������������");
		System.out.println("��                ���� �Է�                        ��");
		System.out.println("������������������������������������������������������������������������������");
		
		int isCon = 0;
		
		do{
		Exam exam = new Exam();
		exam.input();
		
		exams[size] = exam;
		size++;
		
		System.out.println("���?(yes=1,no=0)");
		isCon = scan.nextInt();
		}while(isCon == 1);
	}
	
	public void print(){
		System.out.println("������������������������������������������������������������������������������");
		System.out.println("��             ���� ���                           ��");
		System.out.println("������������������������������������������������������������������������������");
		System.out.println("�� ��ȣ  ��	����     �� ����  �� ����  �� ����  �� ���  ��");
		System.out.println("������������������������������������������������������������������������������");
		
		for(int i=0; i<size; i++)
			exams[i].print();
		
		System.out.println("������������������������������������������������������������������������������");
		
	}
}
