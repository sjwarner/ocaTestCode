// Lines 11 and 14 will not compile, as widened primitives will not fit.

class WideningArithmetic {

    public static void main(String args[]) {

        byte b = 1;
        char c = 1;
        short s = 1;
        int i = 1;

        s = b*b;
        i = b + b;
        s *= b;
        c = c + b;
        s += i;

    }

}
