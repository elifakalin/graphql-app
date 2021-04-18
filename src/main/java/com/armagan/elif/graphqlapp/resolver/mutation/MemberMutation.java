package com.armagan.elif.graphqlapp.resolver.mutation;

import com.armagan.elif.graphqlapp.model.Member;
import com.armagan.elif.graphqlapp.service.MemberService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class MemberMutation implements GraphQLMutationResolver {

    private final MemberService memberService;

    public MemberMutation(MemberService memberService) {
        this.memberService = memberService;
    }

    public Member createMember(String name, String password){
        return memberService.save(name, password);
    }
}
