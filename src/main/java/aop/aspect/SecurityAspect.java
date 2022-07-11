package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("aop.aspect.MyPointCuts.allGetMethods()")
    public void beforeSecurityAdvice() {
        System.out.println("beforeSecurityAdvice: Logging checking right for take a book ");
    }
}
