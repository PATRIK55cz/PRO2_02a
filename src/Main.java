import Models.*;
import Models.dataSaver.DataSaver;
import Models.dataSaver.MemoryDataSaver;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        final int x = 10;
        final double p1 = 3.14;

        TestingClass tesCLs = new TestingClass();
        System.out.println(tesCLs.x);
        tesCLs.publicMethod();

        System.out.println(MyMathClass.p1);
        System.out.println(MyMathClass.sum(5, 8));

        System.out.println(TestingClass.InnerClass.x);

        Box<String> box = new Box<>("Ahoj");
        Box<Integer> boxInterger = new Box<>(15);

        Pair<Integer, String> myPair1 = new Pair<>(1, "Praha");
        Pair<Integer, String> myPair2 = new Pair<>(2, "Hradec");

        Car car1 = new Car("škoda", "superb");

        DataSaver<Integer> mySaver;
        mySaver = new MemoryDataSaver<>();
        mySaver.save(20);

        System.out.println(mySaver.load());

    }
}
