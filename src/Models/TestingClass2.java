package Models;

public class TestingClass2 extends TestingClass{
    @Override
    public void publicMethod() {
        protectedMethod();
        publicMethod();

        System.out.println(x);
        System.out.println(f1);
    }
}
