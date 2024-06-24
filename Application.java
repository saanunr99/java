public class Application {
    // Static variables
    static int staticVar1 = 10;
    static double staticVar2 = 3.14;
    static String staticVar3 = "Hello";
    static boolean staticVar4 = true;
    static char staticVar5 = 'A';
    static long staticVar6 = 1000000L;
    static float staticVar7 = 5.5f;
    static byte staticVar8 = 127;
    static short staticVar9 = 30000;

    public static void main(String[] args) {
        int localVar1 = 20;
        double localVar2 = 2.71;
        String localVar3 = "World";
        boolean localVar4 = false;
        char localVar5 = 'B';
        long localVar6 = 500000L;
        float localVar7 = 3.3f;
        byte localVar8 = -128;

        System.out.println("Static Variables:");
        System.out.println("staticVar1 = " + staticVar1);
        System.out.println("staticVar2 = " + staticVar2);
        System.out.println("staticVar3 = " + staticVar3);
        System.out.println("staticVar4 = " + staticVar4);
        System.out.println("staticVar5 = " + staticVar5);
        System.out.println("staticVar6 = " + staticVar6);
        System.out.println("staticVar7 = " + staticVar7);
        System.out.println("staticVar8 = " + staticVar8);
        System.out.println("staticVar9 = " + staticVar9);

        System.out.println("\nLocal Variables:");
        System.out.println("localVar1 = " + localVar1);
        System.out.println("localVar2 = " + localVar2);
        System.out.println("localVar3 = " + localVar3);
        System.out.println("localVar4 = " + localVar4);
        System.out.println("localVar5 = " + localVar5);
        System.out.println("localVar6 = " + localVar6);
        System.out.println("localVar7 = " + localVar7);
        System.out.println("localVar8 = " + localVar8);
    }
}
