package self.study1;

import self.study1.member.Grade;
import self.study1.member.Member;
import self.study1.member.MemberService;
import self.study1.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService=new MemberServiceImpl();
        Member member = new Member(1L,"memberA", Grade.Vip);
        memberService.join(member);

        Member findMember=memberService.findMember(1L);
        System.out.println("new member = " + member);
        System.out.println("findMember = " + findMember);
    }
}
