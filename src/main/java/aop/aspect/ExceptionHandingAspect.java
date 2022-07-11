package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandingAspect {
    @Before("aop.aspect.MyPointCuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println("beforeAddExceptionHandlingAdvice: catch the throw when trying to get book/magazine");
        System.out.println("____________________________");
    }
}
