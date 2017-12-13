interface IQuestion {

    // Will not compile - can't be both default and static
    default static void method1() {}

    // Will compile
    static int method2() {return 1;}

    // Will not compile - abstract cannot have a body
    abstract int method3() {};

    // Will compile
    public void method4();

}
