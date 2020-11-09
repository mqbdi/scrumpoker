package mqbdi.scrumpoker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ServletComponentScan
@SpringBootApplication
@EnableAutoConfiguration
@Slf4j
@EnableWebMvc
@Controller
public class ScrumPokerApplication {

	@Value("${spring.application.name}")
	String appName;

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(ScrumPokerApplication.class);
		log.debug("Scrum Poker starting ...");
		springApplication.run(args);
	}



	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("appName", appName);
		return "home";
	}

}
