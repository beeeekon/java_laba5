package reflection;

/**
 * Class inheriting class SomeOtherInterface
 */
public class SODoer implements SomeOtherInterface {

    /**
     * Override method from SomeOtherInterface
     */
    @Override
    public void doSome() {
        System.out.println("C");
    }
}