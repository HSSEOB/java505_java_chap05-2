public class DefaultMethodEx {
    public static void main(String[] args) {
        MyInterface m1 = new MyClassA();
        m1.method1();
        m1.method2();

        MyInterface m2 = new MyClassB();
        m2.method1();
        m2.method2();
    }
}
