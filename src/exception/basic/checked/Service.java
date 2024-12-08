package exception.basic.checked;

public class Service {
    Client client = new Client();

    // 예외를 잡아서 처리
    public void callCatch() {
        try {
            client.call();
        } catch (MyCheckedException e) {
            System.out.println("예외 처리: " + e.getMessage());
        }

        System.out.println("정상 흐름");
    }

    // 예외를 밖으로 던짐
    public void catchThrow() throws MyCheckedException {
        client.call();
    }

}
