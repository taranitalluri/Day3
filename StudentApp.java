package DAY3;

public class StudentApp {
	// user of application
	public static void main(String[] args) {
		
		Student ramesh = new Student();
		ramesh.setStudentName("Ramesh");
		ramesh.setTotalMarks(58);
		ramesh.giveExam(98);
		System.out.println(ramesh.getTotalMarks()+" - "+ramesh.getStudentName());
		System.out.println(ramesh.getStudentName()+" Status  "+ramesh.isStatus()+"\n");
		
		Student suresh = new Student();
		suresh.setStudentName("Suresh");
		suresh.setTotalMarks(48); 
		suresh.giveExam(78);
		System.out.println(suresh.getTotalMarks()+" - "+suresh.getStudentName());
		System.out.println(suresh.getStudentName()+" Status  "+suresh.isStatus()+"\n");
		
		Student abc = new Student("Mike");
		abc.setTotalMarks(90);
		abc.giveExam(97);
		System.out.println(abc.getTotalMarks()+" - "+abc.getStudentName());
		System.out.println(abc.getStudentName()+" Status  "+abc.isStatus());
	}

}