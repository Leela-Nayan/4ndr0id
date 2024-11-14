class Test1 {
    int a = 20;

    public Test1() {
        System.out.println(a);
    }
}

public class AccessModifiers {
    int b = 30;

    public static void main(String[] args) {
        Test1 obj = new Test1();
        AccessModifiers am = new AccessModifiers();
        System.out.println(am.b);
    }
}
