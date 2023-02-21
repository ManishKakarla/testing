package npc.testpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Project1Application {

    public static void main(String[] args) {
        SpringApplication.run(Project1Application.class, args);
    }
    @GetMapping("first")
    public String display(@RequestParam int a,@RequestParam String name)
    {
        //int a=Integer.parseInt(args[0]);

        return "Hello Welcome to the Spring Boot world"+" "+a+" "+ name;   }

}
