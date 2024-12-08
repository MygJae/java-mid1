package exception.ex1;

public class NetworkClientV1 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        if (connectError) {
            System.out.println(address + " 연결 실패"); // 연결 실패
            return "connectError";
        }

        System.out.println(address + " 연결 성공"); // 연결 성공
        return "success";
    }

    public String send(String message) {
        if (sendError) {
            System.out.println(address + " 메시지 전송 실패: " + message); // 메시지 전송 실패
            return "sendError";
        }
        System.out.println(address + " 메시지 전송 성공: " + message); // 메시지 전송 성공
        return "success";
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
