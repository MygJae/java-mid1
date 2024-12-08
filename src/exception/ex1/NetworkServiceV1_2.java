package exception.ex1;

public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        String address = "http://localhost:8080";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("연결 실패로 메시지 전송을 중단합니다: " + connectResult);
            return;
        }

        String sendResult = client.send(data);
        if (isError(sendResult)) {
            System.out.println("메시지 전송 실패로 연결을 종료합니다: " + sendResult);
            return;
        }

        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }


}
