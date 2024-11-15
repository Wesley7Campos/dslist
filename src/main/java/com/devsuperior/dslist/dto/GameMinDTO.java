package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){
    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
        year = entity.getYear();
        title = entity.getTitle();
    }

    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
        year = projection.getYear();
        title = projection.getTitle();
    }

    public Long getId() {
        return id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }
}
