package nhs;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\kavit\\IdeaProjects\\nhs\\src\\main\\Resources\\Features",
        tags="@nhswales, @birth,@partnerlive,@claims,@pregnant,@pension,@glaucoma,@care,@save ",
        glue = "MyStepdefinition",
        format ={"pretty", "html:target/cucumber-reports"})//generate report in html

public class Run {
}
