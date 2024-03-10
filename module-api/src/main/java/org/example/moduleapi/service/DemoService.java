package org.example.moduleapi.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.moduleapi.exception.CustomException;
import org.example.modulecommon.domain.Member;
import org.example.modulecommon.enums.CodeEnum;
import org.example.modulecommon.repositories.MemberRepository;
import org.example.modulecommon.service.CommonDemoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DemoService {

    @Value("${spring.profiles.active}")
    private String name;

    private final CommonDemoService commonDemoService;

    private final MemberRepository memberRepository;

    public String save() {
        System.out.println("name :" + name);
        memberRepository.save(Member.builder()
                .name(Thread.currentThread().getName()
                        ).build());

        return "save";
    }

    public String find() {
        int size = memberRepository.findAll().size();
        System.out.println("DB size : " + size);
        return "find";
    }

    public String exception() {
        if(true) {
            throw new CustomException(CodeEnum.UNKNOWN_ERROR);
        }
        return "exception";
    }
}
