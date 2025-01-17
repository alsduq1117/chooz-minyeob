package com.cdg.chooz.domain.vote;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class CreateVoteInfo {


    private String title;

    private String titleA;

    private String titleB;

    private String imageA;

    private String imageB;

    private GenderType filteredGender;

    private AgeType filteredAge;

    private MbtiType filteredMbti;

    public CreateVoteInfo(String title, String titleA, String titleB, String imageA, String imageB, GenderType filteredGender, AgeType filteredAge, MbtiType filteredMbti) {
        this.title = title;
        this.titleA = titleA;
        this.titleB = titleB;
        this.imageA = imageA;
        this.imageB = imageB;
        this.filteredGender = filteredGender;
        this.filteredAge = filteredAge;
        this.filteredMbti = filteredMbti;
    }
}
