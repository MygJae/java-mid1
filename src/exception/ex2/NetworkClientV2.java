package exception.ex2;

public class NetworkClientV2 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 {
        if (connectError) {
            throw new NetworkClientExceptionV2("error1", address + " 연결 실패");
        }

        System.out.println(address + " 연결 성공"); // 연결 성공
    }

    public void send(String message) throws NetworkClientExceptionV2 {
        if (sendError) {
//            throw new NetworkClientExceptionV2("error2", address + " 메시지 전송 실패: " + message);
            // 알 수 없는 에러
            throw new RuntimeException("error2");
        }
        System.out.println(address + " 메시지 전송 성공: " + message); // 메시지 전송 성공
    }

    public void disconnect() {
        System.out.println(address + " 연결 종료"); // 연결 종료
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        } else if (data.contains("error2")) {
            sendError = true;
        }
    }

}
