package lang.immutable.address;

public class MemberMainV1 {

    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 memberV1 = new MemberV1("홍길동", address);
        MemberV1 memberV2 = new MemberV1("김길동", address);

        System.out.println("memberV1 = " + memberV1);
        System.out.println("memberV2 = " + memberV2);

        memberV2.getAddress().setValue("부산");
        System.out.println("부산 -> memberV2");
        System.out.println("memberV1 = " + memberV1);
        System.out.println("memberV2 = " + memberV2);
    }


}

