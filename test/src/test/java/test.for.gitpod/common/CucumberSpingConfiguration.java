package test.for.gitpod.common;


import test.for.gitpod.TestApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { TestApplication.class })
public class CucumberSpingConfiguration {
    
}
