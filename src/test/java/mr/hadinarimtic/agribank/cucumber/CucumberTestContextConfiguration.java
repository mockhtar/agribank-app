package mr.hadinarimtic.agribank.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import mr.hadinarimtic.agribank.AgriBankApp;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = AgriBankApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
