package backendportfolio.service.Implement;

import backendportfolio.dtos.SkillsDTO;
import backendportfolio.repositories.SkillsRepository;
import backendportfolio.service.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SkillsServiceImplement implements SkillsService {

    @Autowired
    private SkillsRepository skillsRepository;

    @Override
    public List<SkillsDTO> allSkillService(){
        return skillsRepository.findAll()
                .stream()
                .map(skills -> new SkillsDTO(skills))
                .collect(Collectors.toList());
    }

}
