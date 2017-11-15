// This exercise demonstrates that arrays can only be declared with integer numbers. Any double or
// float will result in a compiler error (possible lossy conversion), even if the float is a '.0'

public class FloatArraySize {

	public static void main(String args[]) {
		int[] intArraySize = new int[10]; // This is fine

		int[] floatArraySize1 = new int[10.01]; // It is intuitive this won't work
		int[] floatArraySize2 = new int[10.0]; // Not so intuitive, but won't work

		int[] weirdArraySize1 = new int[2*5]; // Evaluates to int, so it is fine
		int x = 10, y = 4;
		int[] weirdArraySize2 = new int[x+y]; // Evaluates to int, so it is fine
		int[] weirdArraySize3 = new int[Math.max(2, 3)]; // Math functions that return int!
	}

}
