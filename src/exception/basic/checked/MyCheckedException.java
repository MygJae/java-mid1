package exception.basic.checked;

/**
 * Exception 클래스를 상속받은 예외는 체크 예외
 */
public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }
}
