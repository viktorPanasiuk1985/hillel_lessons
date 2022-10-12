package lesson3.ad_hoc;

class Helper {
    static int multiply(int a, int b) {
        return a * b;
    }

    static int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Helper.multiply(2, 4));
        System.out.println(Helper.multiply(2, 7, 3));
    }
}

