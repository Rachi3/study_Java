package chapter13.연습;

public interface MemberDTO {
    public boolean addMember(MemberDTO member);
    public boolean removeMember(String name,String phone);
    public boolean updateMember(MemberDTO member);
}
