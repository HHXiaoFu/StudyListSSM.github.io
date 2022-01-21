import com.alascanfu.pojo.Plan;
import com.alascanfu.service.PlanService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PlanService planService = context.getBean("planService", PlanService.class);
        List<Plan> plans = planService.queryAllPlan();
        for (Plan plan : plans) {
            System.out.println(plan);
        }
    }
}
