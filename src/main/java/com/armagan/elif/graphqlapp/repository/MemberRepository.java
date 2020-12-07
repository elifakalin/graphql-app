package com.armagan.elif.graphqlapp.repository;

import com.armagan.elif.graphqlapp.model.Category;
import com.armagan.elif.graphqlapp.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
