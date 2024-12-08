package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV4 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV4(String address) {
        this.address = address;
    }

    public void connect() {
        if (connectError) {
            throw new ConnectExceptionV4(address, address + " 연결 실패");
        }

        System.out.println(address + " 연결 성공"); // 연결 성공
    }

    public void send(String data) {
        if (sendError) {
            throw new SendExceptionV4(data, address + " 데이터 전송 실패: " + data);
//            알 수 없는 에러
//            throw new RuntimeException("error2");
        }
        System.out.println(address + " 데이터 전송: " + data); // 전송 성공
    }

    public void disconnect() {
        System.out.println(address + " 연결 해제"); // 연결 종료
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
