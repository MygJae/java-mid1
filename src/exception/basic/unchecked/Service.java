package exception.basic.unchecked;


public class Service {
    Client client = new Client();

    // 예외를 잡아서 처리
    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            System.out.println("예외 처리: " + e.getMessage());
        }

        System.out.println("정상 흐름");
    }

    // 예외를 밖으로 던짐
    public void catchThrow() {
        client.call();
    }

}
