public class PrecedenceOfCodeBlocks {

    static {
        System.out.println("I am the first static initializer");
    }

    static {
        System.out.println("I am the second static curly initializer ");
    }

    {
        System.out.println("I am the first static initializer");
    }

    {
        System.out.println("I am the first initializer");
    }

    public Main(){
        System.out.println("I am the constructor");
    }

    public static void main(String[] args) {
        System.out.println("I am the main");
        System.out.println("-----------------------------------------------------");
        new Main();
    }

  
}
