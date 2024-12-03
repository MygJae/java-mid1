package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberV1 = new MemberV2("홍길동", address);
        MemberV2 memberV2 = new MemberV2("김길동", address);

        System.out.println("memberV1 = " + memberV1);
        System.out.println("memberV2 = " + memberV2);

        //회원B의 주소를 부산으로 변경해야 함
        ImmutableAddress address1 = new ImmutableAddress("부산");
        memberV2.setAddress(address1);
        System.out.println("memberV1 = " + memberV1);
        System.out.println("memberV2 = " + memberV2);

    }


}

