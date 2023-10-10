package backendportfolio.dtos;

import backendportfolio.models.MyProjects;

public class MyProjectsDTO {

    private Long id;
    private String projectURL;
    private String githubURL;
    private String img;
    private String title;
    private String description;

    public MyProjectsDTO(MyProjects myProjects) {
        this.id = myProjects.getId();
        this.projectURL = myProjects.getProjectURL();
        this.githubURL = myProjects.getGithubURL();
        this.img = myProjects.getImg();
        this.title = myProjects.getTitle();
        this.description = myProjects.getDescription();
    }

    public Long getId() {
        return id;
    }

    public String getProjectURL() {
        return projectURL;
    }

    public String getGithubURL() {
        return githubURL;
    }

    public String getImg() {
        return img;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
