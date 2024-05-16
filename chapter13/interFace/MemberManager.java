package chapter13.연습;

public class MemberManager implements MemberDTO{

    @Override
    public boolean addMember(MemberDTO member){
        return false;
    }

    @Override
    public boolean removeMember(String name,String phone){
        return false;
    }

    @Override
    public boolean updateMember(MemberDTO member){
        return false;
    }

    //기능추가
    public boolean hi(){
        return false;
    }
}