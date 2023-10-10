package backendportfolio.service;

import backendportfolio.dtos.MyProjectsDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MyProjectsService {

    MyProjectsDTO myProjectsByIdService(Long id);

    List<MyProjectsDTO> allProjectsService();
}
