public class Exam {

	private int numQuestions = 100;

	public void print() {
		System.out.println("I am using an Exam method.");
	}

	public static void main(String args[]) {
		Exam A = new Exam();
		System.out.println("Exam A = new Exam(); is a " + A.getClass());
		System.out.print("A.print(): ");
		A.print();
	}

}
