package exception.ex0;

public class NetworkClientV0 {

    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect() {
        System.out.println("connected to " + address); // 연결 성공
        return "success";
    }

    public String send(String message) {
        System.out.println("send message: " + message); // 메시지 전송 성공
        return "success";
    }

    public void disconnect() {
        System.out.println("disconnected from " + address); // 연결 종료
    }

}
