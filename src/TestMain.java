import java.lang.reflect.Constructor;

public class TestMain {
    public static void main(String[] args) {
//git  master开发新功能 a
//git  devlop b
        //测试push3
        Class<Long> longClass = Long.class;
        Constructor<?>[] constructors = longClass.getConstructors();
    }
}
