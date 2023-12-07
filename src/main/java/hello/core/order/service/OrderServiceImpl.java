package hello.core.order.service;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Repository.MemberRepository;
import hello.core.member.Repository.MemoryMemberRepository;
import hello.core.member.domain.Member;
import hello.core.order.Order;

public class OrderServiceImpl implements OrderService {

    MemberRepository memberRepository = new MemoryMemberRepository();
    DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order order(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemPrice, discountPrice);
    }
}
