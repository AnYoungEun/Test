package oop6_has_a_association;

public class ExamManager {
	private Exam exam;
	
	public ExamManager(){
		//exam = new Exam();
	}
	
	public ExamManager(Exam exam){
		this.exam = exam;
	}
	
//	manager.setExam(exam);
	
	/*public void setExam(Exam exam) {
		this.exam = exam;
	}*/

	public void input(){
		System.out.println("��������������������������������������������������������������������������������");
		System.out.println("��                ���� �Է�                        ��");
		System.out.println("������������������������������������������������������������������������������");
		
		if(exam != null)
			exam.input();
	}
	
	public void print(){
		System.out.println("������������������������������������������������������������������������������");
		System.out.println("��             ���� ���                           ��");
		System.out.println("������������������������������������������������������������������������������");
		System.out.println("�� ��ȣ  ��	����     �� ����  �� ����  �� ����  �� ���  ��");
		System.out.println("������������������������������������������������������������������������������");
		
		if(exam != null)
			exam.print();
		
		System.out.println("������������������������������������������������������������������������������");
		
	}
}
