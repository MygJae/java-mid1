package exception.basic.unchecked;

public class Client {
    public void call()  {
        throw new MyUncheckedException("MyUncheckedException 발생");
    }
}
