package top.t117503445.spring_boot_docker;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping
    public String Hello(){
        return "This is Spring Boot Docker Test :D";
    }
}
