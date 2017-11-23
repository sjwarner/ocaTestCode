import static java.lang.Math.PI; // Static values (like PI) need to be statically imported
// import java.lang.Math.PI; <--- Importing it non-statically will cause compile errors

class StaticImportPi {

	public static void main(String[] args) {
		System.out.println(PI);
	}

}
