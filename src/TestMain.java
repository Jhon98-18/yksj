import java.lang.reflect.Constructor;

public class TestMain {
    public static void main(String[] args) {
//git  开发新功能 a
//git  开发新功能 b
        //测试push1
        //测试push2
        //测试push3
        //测试push4
        //master reset 测试一
        //reset devlop测试一
        //reset devlop测试二
        Class<Long> longClass = Long.class;
        Constructor<?>[] constructors = longClass.getConstructors();
    }
}
