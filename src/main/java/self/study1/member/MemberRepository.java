package self.study1.member;

public interface MemberRepository {

    void save(Member member); //회원 가입

    Member findById(Long memberId);//회원 조회회
}
