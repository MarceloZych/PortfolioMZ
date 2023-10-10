package backendportfolio;

import backendportfolio.models.MyProjects;
import backendportfolio.models.Skills;
import backendportfolio.repositories.MyProjectsRepository;
import backendportfolio.repositories.SkillsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendPortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendPortfolioApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(MyProjectsRepository myProjectsRepository, SkillsRepository skillsRepository){
		return (args -> {
			// my projects save
			MyProjects adnpage = new MyProjects(
			"https://adnwebsolutions.github.io/ADN-Solutions/"
			,"https://github.com/MarceloZych/adn-page"
			,"https://images.unsplash.com/photo-1571171637578-41bc2dd41cd2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2070&q=80"
			,"ADN OFICIAL PAGE"
			,"This is the official DNA page, in which I work together with several of the members of this beautiful group"
			);

			myProjectsRepository.save(adnpage);

			// homebanking
			MyProjects homebanking = new MyProjects(
					""
					,"https://github.com/MarceloZych/zych.marcelo.AP9"
					,"https://images.unsplash.com/photo-1571171637578-41bc2dd41cd2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2070&q=80"
					,"Homebanking APP"
					,"This is an api made for a MindHub course where I learned SpringBoot"
			);

			myProjectsRepository.save(homebanking);

			// Backend ArgP
			MyProjects argpBackend = new MyProjects(
					"https://portfolio-arg-programa-efae2.web.app/"
					,"https://github.com/MarceloZych/Back-End-ArgPrograma-2"
					,"https://images.unsplash.com/photo-1571171637578-41bc2dd41cd2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2070&q=80"
					,"Backend for course argentina programa"
					,"In this api I learned to use SpringBoot to make an api during the Argentina program course"
			);

			myProjectsRepository.save(argpBackend);

			// Frontend ArgP
			MyProjects argpFrontEnd = new MyProjects(
					"https://portfolio-arg-programa-efae2.web.app/"
					,"https://github.com/MarceloZych/Front-End-ArgPrograma"
					,"https://images.unsplash.com/photo-1571171637578-41bc2dd41cd2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2070&q=80"
					,"Frontend for course argentina programa"
					,"In this api I learned to use Angular to make an api during the Argentina program course"
			);

			myProjectsRepository.save(argpFrontEnd);

			// Frontend mindhub
			MyProjects mindhubFrontend = new MyProjects(
					""
					,"https://github.com/MarceloZych/mindhubEj1/tree/tarea4"
					,"https://images.unsplash.com/photo-1571171637578-41bc2dd41cd2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2070&q=80"
					,"Frontend for course mindhub frontend"
					,"In this api I learned how to interact an html/css project with javascript"
			);

			myProjectsRepository.save(mindhubFrontend);

			// Frontend EcoAmbienttal
			MyProjects EcoAmbienttal = new MyProjects(
					"https://www.ecoambientaldesinfecciones.com.ar/"
					,"https://github.com/MarceloZych/mindhubEj1/tree/tarea4"
					,"https://images.unsplash.com/photo-1571171637578-41bc2dd41cd2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2070&q=80"
					,"Frontend for course mindhub frontend"
					,"In this api I learned how to interact an html/css project with javascript"
			);

			myProjectsRepository.save(EcoAmbienttal);

			//Skills
			//html
			Skills html = new Skills(
					"html"
					,"https://cdn-icons-png.flaticon.com/512/919/919827.png"
			);
			skillsRepository.save(html);
			//css
			Skills css = new Skills(
					"css"
					,"https://cdn-icons-png.flaticon.com/512/919/919826.png"
			);
			skillsRepository.save(css);
			//js
			Skills js = new Skills(
					"javascript"
					,"https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Unofficial_JavaScript_logo_2.svg/800px-Unofficial_JavaScript_logo_2.svg.png"
			);
			skillsRepository.save(js);
			//npm
			Skills npm = new Skills(
					"npm"
					,"https://upload.wikimedia.org/wikipedia/commons/thumb/d/db/Npm-logo.svg/1200px-Npm-logo.svg.png"
			);
			skillsRepository.save(npm);
			//java
			Skills java = new Skills(
					"java"
					,"https://cdn.icon-icons.com/icons2/2415/PNG/512/java_original_wordmark_logo_icon_146459.png"
			);
			skillsRepository.save(java);
			//wordp
			Skills wordp = new Skills(
					"wordpress"
					,"https://e7.pngegg.com/pngimages/390/227/png-clipart-wordpress-logo-wordpress-logo-website-blog-icon-wordpress-logo-free-blue-emblem.png"
			);
			skillsRepository.save(wordp);
			//springb
			Skills springb = new Skills(
					"spring boot"
					,"https://img.icons8.com/color/480w/spring-logo.png"
			);
			skillsRepository.save(springb);
			//jwt
			Skills jwt = new Skills(
					"jwt"
					,"https://play-lh.googleusercontent.com/3C-hB-KWoyWzZjUnRsXUPu-bqB3HUHARMLjUe9OmPoHa6dQdtJNW30VrvwQ1m7Pln3A"
			);
			skillsRepository.save(jwt);
			//react
			Skills react = new Skills(
					"react"
					,"https://www.svgrepo.com/show/452092/react.svg"
			);
			skillsRepository.save(react);
			//angular
			Skills angular = new Skills(
					"angular"
					,"https://cdn4.iconfinder.com/data/icons/logos-and-brands/512/21_Angular_logo_logos-512.png"
			);
			skillsRepository.save(angular);
			//vue
			Skills vue = new Skills(
					"vue"
					,"https://cdn.icon-icons.com/icons2/2107/PNG/512/file_type_vue_icon_130078.png"
			);
			skillsRepository.save(vue);
			//node
			Skills node = new Skills(
					"node"
					,"https://cdn-icons-png.flaticon.com/512/919/919825.png"
			);
			skillsRepository.save(node);
			//mongodb
			Skills mongodb = new Skills(
					"mongodb"
					,"https://cyclr.com/wp-content/uploads/2022/03/ext-553.png"
			);
			skillsRepository.save(mongodb);
			//express
			Skills express = new Skills(
					"express"
					,"https://w7.pngwing.com/pngs/925/447/png-transparent-express-js-node-js-javascript-mongodb-node-js-text-trademark-logo.png"
			);
			skillsRepository.save(express);
			//mysql
			Skills mysql = new Skills(
					"mysql"
					,"https://static-00.iconduck.com/assets.00/database-mysql-icon-462x512-6itsq0zm.png"
			);
			skillsRepository.save(mysql);
			//postgresql
			Skills postgresql  = new Skills(
					"postgresql "
					,"https://cdn.icon-icons.com/icons2/2699/PNG/512/postgresql_vertical_logo_icon_168900.png"
			);
			skillsRepository.save(postgresql);
			//tailwind
			Skills tailwind = new Skills(
					"tailwind"
					,"https://static-00.iconduck.com/assets.00/tailwind-css-icon-2048x1229-u8dzt4uh.png"
			);
			skillsRepository.save(tailwind);
			//bootstrap
			Skills bootstrap = new Skills(
					"bootstrap"
					,"https://i.stack.imgur.com/dMXbE.png"
			);
			skillsRepository.save(bootstrap);
			//postman
			Skills postman = new Skills(
					"postman"
					,"https://static-00.iconduck.com/assets.00/postman-icon-497x512-beb7sy75.png"
			);
			skillsRepository.save(postman);
		});

	}

}
