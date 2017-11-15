// This exercise demonstrates that arrays can only be
// declared with integer numbers. Any double or float
// will result in a compiler error (possible lossy
// conversion), even if the float is a '.0'

public class FloatArraySize {

	public static void main(String args[]) {
		int[] intArraySize = new int[10]; // This is fine
		int[] floatArraySize2 = new int[10.01]; // It is intuitive this won't work
		int[] floatArraySize1 = new int[10.0]; // Not so intuitive, but won't work
	}

}
