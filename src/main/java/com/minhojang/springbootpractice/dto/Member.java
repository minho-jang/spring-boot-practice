package com.minhojang.springbootpractice.dto;

import lombok.*;

@ToString
@Data
@NoArgsConstructor
public class Member {
    private Long uuid;
    private String name;
    private String password;

    @Builder
    public Member(Long uuid, String name, String password) {
        this.uuid = uuid;
        this.name = name;
        this.password = password;
    }
}
