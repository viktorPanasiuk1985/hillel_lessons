package lesson3.this_examples;

class Student3{
    int rollno;
    String name,course;
    float fee;
    Student3(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    Student3(int rollno,String name,String course,float fee){
        this(rollno,name,course);//reusing constructor
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
class Main5 {
    public static void main(String args[]){
        Student3 s1=new Student3(111,"ankit","java");
        Student3 s2=new Student3(112,"sumit","java",6000f);
        s1.display();
        s2.display();
    }}
