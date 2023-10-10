package backendportfolio.repositories;

import backendportfolio.models.MyProjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyProjectsRepository extends JpaRepository<MyProjects, Long> {

}
