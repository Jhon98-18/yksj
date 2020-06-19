import java.lang.reflect.Constructor;

public class TestMain {
    public static void main(String[] args) {
//git A
//git master B
        Class<Long> longClass = Long.class;
        Constructor<?>[] constructors = longClass.getConstructors();
    }
}
