package backendportfolio.service.Implement;

import backendportfolio.dtos.MyProjectsDTO;
import backendportfolio.models.MyProjects;
import backendportfolio.repositories.MyProjectsRepository;
import backendportfolio.service.MyProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MyProjectsServiceImplements implements MyProjectsService {

    @Autowired
    private MyProjectsRepository myProjectsRepository;

    @Override
    public MyProjectsDTO myProjectsByIdService (Long id){
        MyProjects myProjects = myProjectsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("invalid project id: "+ id));

        return new MyProjectsDTO(myProjects);
    }

    @Override
    public List<MyProjectsDTO > allProjectsService(){
        return myProjectsRepository.findAll()
                .stream()
                .map(myProjects -> new MyProjectsDTO(myProjects))
                .collect(Collectors.toList());
    }
}
