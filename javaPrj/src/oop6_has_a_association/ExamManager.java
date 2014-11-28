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
		System.out.println("┌──────────────────────────────────────┐");
		System.out.println("│                성적 입력                        │");
		System.out.println("└─────────────────────────────────────┛");
		
		if(exam != null)
			exam.input();
	}
	
	public void print(){
		System.out.println("┌─────────────────────────────────────┐");
		System.out.println("│             성적 출력                           │");
		System.out.println("├─────┬───────┬─────┬─────┬─────┬─────┤");
		System.out.println("│ 번호  │	국어     │ 영어  │ 수학  │ 총점  │ 평균  │");
		System.out.println("├─────┼───────┼─────┼─────┼─────┼─────┤");
		
		if(exam != null)
			exam.print();
		
		System.out.println("└─────┴───────┴─────┴─────┴─────┴─────┘");
		
	}
}
