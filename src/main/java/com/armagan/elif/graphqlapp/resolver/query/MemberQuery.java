package com.armagan.elif.graphqlapp.resolver.query;

import com.armagan.elif.graphqlapp.model.Member;
import com.armagan.elif.graphqlapp.service.MemberService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class MemberQuery implements GraphQLQueryResolver {

    private final MemberService memberService;

    public MemberQuery(MemberService memberService) {
        this.memberService = memberService;
    }

    public Member getMemberById(Long id){
        return memberService.getById(id);
    }
}
