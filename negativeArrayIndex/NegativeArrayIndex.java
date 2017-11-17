// This small code snippet is to demonstrate that the Java
// compiler doesn't check the range of the index positions
// at which you try to access an array element.

// The following will still compile, even though it references
// a negative element in the array. It will, however, throw an
// ArrayIndexOutOfBounds exception at runtime.

public class NegativeArrayIndex {

	public static void main(String args[]) {
		int intArray[] = new int[2];
		System.out.println(intArray[-10]);
	}

}
