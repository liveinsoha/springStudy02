package hello.core.member.Repository;

import hello.core.member.domain.Member;

public interface MemberRepository {

    public Long join(Member member);
    public Member findById(Long memberId);
}
