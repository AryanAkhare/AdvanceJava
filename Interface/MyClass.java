package Interface;

interface A {
    int age=45;
    String name="Aryan";
    public void display();
    public void show();
}
class B implements A{
    public void display(){
        System.out.println(":sajlasd");
    }
    public void show(){
        System.out.println("bsadhjbasd");
    }
}
public class MyClass {
    public static void main(String[] args) {
        A A=new B();
        System.out.println(A.age);
        System.out.println(A.name);
        A.display();
        A.show();

    }
}
