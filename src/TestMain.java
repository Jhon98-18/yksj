import java.lang.reflect.Constructor;

public class TestMain {
    public static void main(String[] args) {
//git  master a
//git  b
        Class<Long> longClass = Long.class;
        Constructor<?>[] constructors = longClass.getConstructors();
    }
}
