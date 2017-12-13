public class ArgsArray {

    public static void main(String args[]) {

        args = {"1","2","3"};

        for (String s : args) {
            if (s.equals("1")) continue;
            System.out.print(s);
        }

    }

}
