package javaPrj;

import java.util.Scanner;

public class Program2 {
	
	public static void main(String[] args) {
		int num = 1;
		int kor = 50;
		int eng = 60;
		int math = 70;
		int menu = 0;
		
		Scanner scan = new Scanner(System.in);
		
		�������:
		while(true)
		{
			menu = inputMenu(scan);
			
			switch(menu)
			{
			case 1:
			{
				input(kor,math,eng);

				break;
				
			}
			case 2:
			{
				
				print(kor, eng, math, num);
				
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
	
	static void print(int kor, int eng, int math, int num){
		int total = kor+eng+math;
		int avg = total/3;
		
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
	
	static void input(int kor,int math, int eng){
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
		System.out.print("����:");
		math = scan.nextInt();	
			if(math<0 || 100<math)
				System.out.println("���а� �˰� �ٽ��Է�");
		}while(math<0 || 100<math);
		
		do{
		System.out.println("����:");
		eng = scan.nextInt();
			if(eng<0 || 100<eng)
				System.out.println("��� �˰� �ٽ��Է�");
		}while(eng<0 || 100<eng);
	}

}
