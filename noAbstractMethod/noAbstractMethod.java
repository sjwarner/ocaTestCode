// Abstract classes can have no abstract method.
// This question was asking about overriding a method.
// Cannot make overridden method more private.
// Program currently compiles. Switch access modifiers
// and it no longer compiles.

abstract class noAbstractMethod {

	int m1() {
		return 0;
	}

}

class B extends noAbstractMethod {

	protected int m1() {
		return 1;
	}

}
