package Second;

//4 Use a Sealed Class concept to create a class hierarchy
//5 Mark Child classes as final, sealed, and non sealed and observe their behavior
sealed class A permits B,D{
    void print(){
        System.out.println("A's Method");
    }
}

sealed class B extends A{
    void print(){
        System.out.println("B's Method");
    }
}
non-sealed class D extends A{
    void print(){
        System.out.println("D's Method");
    }
}

final class C extends B{
    void print(){
        System.out.println("C's Method");
    }
}

public class Ques4 {
    public static void main(String[] args) {
        A obj2 = new B();
        A obj3 = new C();
        obj2.print();
        obj3.print();

    }
}
