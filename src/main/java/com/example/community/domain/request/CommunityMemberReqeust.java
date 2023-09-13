package com.example.community.domain.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CommunityMemberReqeust {
    private Long memberId;
    private String memberRole;
    private String memberName;
    private String memberImage;
    private String communityName;
    private String communityImage;


}
