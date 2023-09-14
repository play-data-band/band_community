package com.example.community.domain.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
public class ReserveRequest {
    private String communityName;
    private String communityImgPath;

    public ReserveRequest(String communityName, String communityImgPath) {
        this.communityName = communityName;
        this.communityImgPath = communityImgPath;
    }
}
