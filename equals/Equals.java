public class Equals {

	public static void main(String args[]) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		Double d1 = new Double(10);
		int i3 = 10;
		int i4 = 10;
		System.out.println("i1 (Integer(10)) and i2 (Integer(10)) .equals() " + i1.equals(i2));
		System.out.println("i1 (Integer(10)) and i2 (Integer(10)) == " + (i1 == i2));
		System.out.println("i1 (Integer(10)) and d1 (Double(10)) .equals() " + i1.equals(d1));
		// System.out.println("i1 (Integer(10)) and d1 (Double(10)) " + (i1 == d1));		<-- Incomparible types
		System.out.println("i1 (Integer(10) and d1 (Double(10)) == results in incomparible types");
		System.out.println("i1 (Integer(10)) and i3 (int (10)) .equals() " + i1.equals(i3));
		System.out.println("i1 (Integer(10)) and i3 (int (10)) == " + (i1 == i3));
		// System.out.println("i3 (int (10)) and i4 (int (10)) " + i3.equals(i4));		<-- Primatives can't use .equals()
		System.out.println("i3 (int (10)) and i4 (int 10)) .equals() results in primative can't be dereferenced");
		System.out.println("i3 (int (10) and i3 (int (10)) == " + (i3 == i4));
	}

}
