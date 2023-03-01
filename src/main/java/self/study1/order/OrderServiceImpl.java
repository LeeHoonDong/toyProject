package self.study1.order;

import self.study1.discount.DiscountPolicy;
import self.study1.discount.FixDicountPolicyImpl;
import self.study1.member.Member;
import self.study1.member.MemberRepository;
import self.study1.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository=new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy=new FixDicountPolicyImpl();
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member findmember=memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(findmember,itemPrice);

        return new Order(memberId,itemName,itemPrice,discountPrice);
    }
}
