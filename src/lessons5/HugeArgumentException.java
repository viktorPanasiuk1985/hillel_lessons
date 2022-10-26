package lessons5;

public class HugeArgumentException extends Exception {
    HugeArgumentException() {

    }
    HugeArgumentException(Exception e) {
        super(e);
    }
}
