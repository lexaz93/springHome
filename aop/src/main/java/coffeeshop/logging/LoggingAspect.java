package coffeeshop.logging;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* coffeeshop.service.CoffeeService.start())")
    public void logBefore() {
        System.out.println("+++Подготовка к запуску CoffeeService+++");
        System.out.println(new Date().toString() + "\n");
    }

    @After("execution(* coffeeshop.service.CoffeeService.start())")
    public void logAfter() {
        System.out.println("\n+++Закрытие CoffeeService+++");
        System.out.println(new Date().toString());
    }

}
