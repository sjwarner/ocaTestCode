public class MultiDimensionalArrayDeclaration {

	public static void main(String args[]) {

		int[] multiArray1[]; // This is fine, the two sets add up to make a 2D array
		int[][] multiArray2; // This is also fine, and maybe more clear
		int multiArray3[][]; // This is also a clear way to write it

		multiArray1 = new int[1][1]; // This works! We have a 2D array
		multiArray2 = new int[1][]; // This works, and sets a size for the first dimension
		multiArray3 = new int[][1]; // This does not work! Must declare sizes left to right

		int[] multiArray4[] = new int[][]; // This doesn't work - missing array size
		int[] multiArray5[] = new int[]; //This also doesn't work - mismatched array sizes

	}

}
