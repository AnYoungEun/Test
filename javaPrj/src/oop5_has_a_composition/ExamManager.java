package oop5_has_a_composition;

public class ExamManager {
	private Exam exam;
	
	public ExamManager(){
		exam = new Exam();
	}
	
	public void input(){
		System.out.println("��������������������������������������������������������������������������������");
		System.out.println("��                ���� �Է�                        ��");
		System.out.println("������������������������������������������������������������������������������");
		
		exam.input();
	}
	
	public void print(){
		System.out.println("������������������������������������������������������������������������������");
		System.out.println("��             ���� ���                           ��");
		System.out.println("������������������������������������������������������������������������������");
		System.out.println("�� ��ȣ  ��	����     �� ����  �� ����  �� ����  �� ���  ��");
		System.out.println("������������������������������������������������������������������������������");
		exam.print();
		System.out.println("������������������������������������������������������������������������������");
		
	}
}
