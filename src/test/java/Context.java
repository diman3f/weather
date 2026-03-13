import com.diman3f.weather.Config;
import com.diman3f.weather.controller.Company;
import com.diman3f.weather.model.Developer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Context {
    @Test
    public void sprintTest(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Company company = context.getBean("company", Company.class);
        Assertions.assertEquals(company.getDeveloper().getClass().getName(), Developer.class.getName());

    }
}
