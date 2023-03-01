package self.study1.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import self.study1.member.Grade;
import self.study1.member.Member;
import self.study1.member.MemberService;
import self.study1.member.MemberServiceImpl;

public class OrderServiceTest {
    MemberService memberService=new MemberServiceImpl();
    OrderService orderService=new OrderServiceImpl();

    @Test
    void createOrder(){
        Long memberId=1L;
        Member member = new Member(memberId,"memberA", Grade.Vip);
        memberService.join(member);

        Order order = orderService.createOrder(memberId,"itemA",10000);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(3000);
    }
}
