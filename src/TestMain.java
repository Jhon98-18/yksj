import java.lang.reflect.Constructor;

public class TestMain {
    public static void main(String[] args) {
//git  开发新功能 a
//git  开发新功能 b
        Class<Long> longClass = Long.class;
        Constructor<?>[] constructors = longClass.getConstructors();
    }
}
