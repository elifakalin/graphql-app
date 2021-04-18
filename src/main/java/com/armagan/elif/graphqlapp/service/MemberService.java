package com.armagan.elif.graphqlapp.service;

import com.armagan.elif.graphqlapp.exception.UserAlreadyExistsException;
import com.armagan.elif.graphqlapp.exception.UserNotFoundException;
import com.armagan.elif.graphqlapp.model.Member;
import com.armagan.elif.graphqlapp.repository.MemberRepository;
import java.util.Objects;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member getById(Long id) {
        return memberRepository.findById(id)
            .orElseThrow(() -> new UserNotFoundException("User not found with given id: " + id, "userId"));
    }

    public Member save(String username, String password) {
        if (Objects.nonNull(memberRepository.findByUsername(username))) {
            throw new UserAlreadyExistsException("User already exist with username: " + username);
        }
        Member member = new Member();
        member.setUsername(username);
        member.setPassword(password);
        return memberRepository.save(member);
    }
}
