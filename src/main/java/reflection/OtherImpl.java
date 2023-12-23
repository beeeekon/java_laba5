package reflection;

/**
 * Class inheriting class SomeInterface
 */
public class OtherImpl implements SomeInterface {

    /**
     * Override method from SomeInterface
     */
    @Override
    public void doSome() {
        System.out.println("B");
    }
}