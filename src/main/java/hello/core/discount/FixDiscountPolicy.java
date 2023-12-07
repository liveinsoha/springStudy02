package hello.core.discount;

import hello.core.member.Repository.MemberRepository;
import hello.core.member.Repository.MemoryMemberRepository;
import hello.core.member.domain.Grade;
import hello.core.member.domain.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    @Override
    public int discount(Member member, int itemPrice) {
        if (member.getGrade() == Grade.VIP) {
            return 1000;
        }
        return 0;
    }
}
