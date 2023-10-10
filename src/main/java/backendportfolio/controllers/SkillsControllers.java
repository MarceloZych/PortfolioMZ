package backendportfolio.controllers;

import backendportfolio.dtos.SkillsDTO;
import backendportfolio.service.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/portfolio")
public class SkillsControllers  {

    @Autowired
    private SkillsService skillsService;

    @GetMapping("/skills")
    public List<SkillsDTO> getAllskills (){
        return skillsService.allSkillService();
    }
}
