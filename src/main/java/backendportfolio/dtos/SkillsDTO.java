package backendportfolio.dtos;

import backendportfolio.models.Skills;

public class SkillsDTO {

    private Long id;
    private String name;
    private String imgURL;

    public SkillsDTO(Skills skills){
        this.id = skills.getId();
        this.name = skills.getName();
        this.imgURL = skills.getImgURL();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImgURL() {
        return imgURL;
    }
}
