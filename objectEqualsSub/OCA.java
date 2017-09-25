public class OCA extends Exam {

	private int numQuestions = 70;

	public void print() {
		System.out.println("I am using an OCA method.");
	}

	public static void main(String args[]) {
		Exam A = new OCA();
		System.out.println("Exam A = new OCA();");
		System.out.println(A.getClass());
		A.print();
		System.out.println();
		System.out.println("OCA B = new Exam();");
		System.out.println("Incompatible types, Exam cannot be converted to OCA.");
	}

}
