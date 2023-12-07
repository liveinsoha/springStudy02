package hello.core.member.Repository;

import hello.core.member.domain.Member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    Map<Long, Member> store = new HashMap<>();

    @Override
    public Long join(Member member) {
        Long memberId = member.getId();
        store.put(memberId, member);
        return memberId;
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
