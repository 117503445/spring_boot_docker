package top.t117503445.spring_boot_docker;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    /**
     * 当前版本
     */
    @Value("${app.version}")
    private String version;
    /**
     * 打包时间
     */
    @Value("${app.build.time}")
    private String buildTime;


    @Value("${env.var1}")
    private String envVar1;
    @Value("${env.var2}")
    private String envVar2;

    @GetMapping
    public String Hello() {
        System.out.println(version);
        System.out.println(buildTime);

        return String.format("This is Spring Boot Docker Test :D {%s} {%s} {%s} {%s}", version, buildTime, envVar1, envVar2);

    }
}
