package lesson3.this_examples;

class Main6 {
    void m(Main6 obj){
        System.out.println("method is invoked");
    }
    void p(){
        m(this);
    }
    public static void main(String args[]){
        Main6 s1 = new Main6();
        s1.p();
    }
}
