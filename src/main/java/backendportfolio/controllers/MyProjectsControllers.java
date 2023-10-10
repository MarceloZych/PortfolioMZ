package backendportfolio.controllers;

import backendportfolio.dtos.MyProjectsDTO;
import backendportfolio.service.MyProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/portfolio")
public class MyProjectsControllers {

    @Autowired
    private MyProjectsService myProjectsService;

    @GetMapping("/myprojects")
    public List<MyProjectsDTO> getAllProjects (){

        return myProjectsService.allProjectsService();
    }

    @GetMapping("/myprojects/{id}")
    public MyProjectsDTO projectsId (@PathVariable Long id){

        return myProjectsService.myProjectsByIdService(id);
    }



}
