package oop5_has_a_composition;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		int num = 1;
		/*int kor = 50;
		int eng = 60;
		int math = 70;*/
		int menu = 0;
		
		ExamManager manager = new ExamManager();
		
		Scanner scan = new Scanner(System.in);
		
		�������:
		while(true)
		{
			menu = inputMenu(scan);
			
			switch(menu)
			{
			case 1:
			{
				manager.input();

				break;
				
			}
			case 2:
			{
				
				manager.print();
				
				break;
			}
			case 3:
				break �������;
				
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�");
				break;
			}
		}
		
	}
	
	static int inputMenu(Scanner scan){
		System.out.println("��������������������������������������������������������������������������������");
		System.out.println("��                ���θ޴�                        ��");
		System.out.println("������������������������������������������������������������������������������");
		System.out.println("1.�����Է�");
		System.out.println("2.�������");
		System.out.println("3.����");
		
		int menu = scan.nextInt();
		return menu;
	}
	
	
	
}

