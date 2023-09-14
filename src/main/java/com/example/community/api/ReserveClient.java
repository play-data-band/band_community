package com.example.community.api;

import com.example.community.domain.request.ReserveRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("BAND-USER-SERVICE")
public interface ReserveClient {
    @PutMapping("/api/v1/bandMember/reserve/{communityId}")
    void updateById(@PathVariable Long communityId, @RequestBody ReserveRequest request);
}
