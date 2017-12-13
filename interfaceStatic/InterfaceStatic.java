// Interfaces may only have bodies if they are
// default or static. Default and static cannot
// be used together.

interface InterfaceStatic {

    public void method1() {};

    static void method2() {};

    default void method3() {};

    public static void method4() {};

    default public void method5() {};

    default static void method6() {};

}
