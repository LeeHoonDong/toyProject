package self.study1.discount;

import self.study1.member.Grade;
import self.study1.member.Member;

public class FixDicountPolicyImpl implements DiscountPolicy{

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade()== Grade.Vip){
            return 3000;
        }
        else if (member.getGrade()==Grade.Business) {
            return 2000;
        }
        else {
            return 1000;
        }
    }
}
