import java.lang.reflect.Constructor;

public class TestMain {
    public static void main(String[] args) {
//git  master开发新功能 a
//git  devlop b
        Class<Long> longClass = Long.class;
        Constructor<?>[] constructors = longClass.getConstructors();
    }
}
