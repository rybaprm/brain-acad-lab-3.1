package ua.zp.brainacad;

public class Main {
    /**
     * Class Main output to consol different types of variables
     */
    public static void main(String[] args) {
        byte byteVar = 10;
        short shortVar = 100;
        int intVar = 1_000;
        long longVar = 10_000;
        float floatVar = 100_000;
        double doubleVar = 1000_000;
        char charVar = '\u0039';
        boolean booleanVar = true;
        System.out.println("byteVar = " + byteVar);
        System.out.println("shortVar = " + shortVar);
        System.out.println("intVar = " + intVar);
        System.out.println("longVar = " + longVar);
        System.out.println("floatVar = " + floatVar);
        System.out.println("doubleVar = " + doubleVar);
        System.out.println("charVar = " + charVar);
        System.out.println("booleanVar = " + booleanVar);
    }
}
