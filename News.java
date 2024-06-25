public class News {
    static int staticVar1 = 10;
    static String staticVar2 = "Hello";
    static double staticVar3 = 3.14;
    static boolean staticVar4 = true;
    static char staticVar5 = 'A';

    public static void main(String[] args) {
        int localVar1 = 20;
        String localVar2 = "World";
        double localVar3 = 2.71;

        System.out.println("Static Variables:");
        System.out.println("staticVar1 = " + staticVar1);
        System.out.println("staticVar2 = " + staticVar2);
        System.out.println("staticVar3 = " + staticVar3);
        System.out.println("staticVar4 = " + staticVar4);
        System.out.println("staticVar5 = " + staticVar5);

        System.out.println("\nLocal Variables:");
        System.out.println("localVar1 = " + localVar1);
        System.out.println("localVar2 = " + localVar2);
        System.out.println("localVar3 = " + localVar3);
    }
}
