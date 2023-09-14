package com.example.community.api;

import com.example.community.domain.request.CommunityMemberReqeust;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("COMMUNITYMEMBER-SERVICE")
public interface CommunityMemberClient {

    @PutMapping("api/v1/communitymember/updatecommunity/{communityId}")
    void updateCommunityInCommunityMember(
            @RequestBody CommunityMemberReqeust communityMemberReqeust,
            @PathVariable("communityId") Long communityId);

}


