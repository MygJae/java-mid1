package exception.basic.unchecked;

/**
 * RuntimeException 클래스를 상속받은 예외는 언체크 예외
 */
public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}
