// The following aims to illustrate that static fields need to be imported using the
// import static syntax. Failure to do so will cause compile time errors.

import static java.lang.Math.PI; // Static values (like PI) need to be statically imported
// import java.lang.Math.PI; <--- Importing it non-statically will cause compile errors

class StaticImportPi {

	public static void main(String[] args) {
		System.out.println(PI);
	}

}
