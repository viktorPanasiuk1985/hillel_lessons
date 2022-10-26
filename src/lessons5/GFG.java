package lessons5;

class GFG {
    static int divideByZero(int a, int b)  {
        if (b == 0) {
            throw new IllegalArgumentException("0 is not available");
        }

        if (b > 10000000) {
            throw new IllegalArgumentException(b + " is soo huge");
        }

        int i = a / b;

        return i;
    }

    static int computeDivision(int a, int b) throws Exception {
        int res = 0;

        try {
            res = divideByZero(a, b);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw new HugeArgumentException(e);
        }
        return res;
    }

    public static void main(String args[]) throws Exception {
        int a = 1;
        int b = 10000001;

        int i = computeDivision(a, b);
    }
}

