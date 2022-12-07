package lessons17.streambasics.examples;

public class ParralelExample {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;

        Void operation = new Void() {
            int operate(int a, int b) {
                return a + b;
            }
        };
        operate(a, b, operation);

    }

    public int oparate(int a, int b, Void operation) {
        operation.operate(a, b);
    }
}
