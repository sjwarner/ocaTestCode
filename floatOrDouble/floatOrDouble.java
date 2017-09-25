// If not specificed, decimal numers are
// of type double. Attempt to assign to
// float will result in possible lossy
// conversion and not compile.

public class floatOrDouble {

	double amount0 = 1000.0;
	double amount1 = 1000.0d;
	//float amount2 = 1000.0;
	float amount3 = 1000.0f;

}
