package self.study1.discount;

import self.study1.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);//return이 할인할 금액
}
