// This is a brief demo to show that with switches:
// byte, short, int DO WORK
// long, float, double, boolean DO NOT WORK

public class SwitchDatatype {

    public static void main(String args[]) {

        byte a = 0;
        short b = 0;
        int c = 0;
        long d = 0;
        float e = 0;
        double f = 0;
        boolean g = true;

        switch (a) {
            case 0: System.out.println("Works");
        }

        switch (b) {
            case 0: System.out.println("Works");
        }

        switch (c) {
            case 0: System.out.println("Works");
        }

        switch (d) {
            case 0: System.out.println("Works");
        }

        switch (e) {
            case 0: System.out.println("Works");
        }

        switch (f) {
            case 0: System.out.println("Works");
        }

        switch (g) {
            case true: System.out.println("Works");
        }

    }

}
