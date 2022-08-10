package yeling.spring.persistence;

import org.springframework.data.repository.CrudRepository;
import yeling.spring.domain.Member;

public interface MemberRepository extends CrudRepository<Member, String> {

}
