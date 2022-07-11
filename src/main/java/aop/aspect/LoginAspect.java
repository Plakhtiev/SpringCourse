package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoginAspect {
//
//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptMagazineFromUniLibrary() {
//    }
//
//    @Before("allMethodsExceptMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptMagazineFromUniLibraryAdvice() {
//        System.out.println("beforeAllMethodsExceptMagazineFromUniLibraryAdvice: writing Log #10 ");
//    }

//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private  void allGetMethodsFromUniLibrary(){};
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoginAdvice() {
//        System.out.println("beforeGetLoginAdvice: writing Log #1 ");
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private  void allReturnMethodsFromUniLibrary(){};
//
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    private void beforeReturnLoginAdvice() {
//        System.out.println("beforeReturnLoginAdvice: writing Log #2 ");
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()" )
//    private void allGetAndReturnMethodsFromUniLibrary() {
//
//    }
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    private void beforeGetAndReturnMethodsFromUniLibrary() {
//        System.out.println("beforeGetAndReturnMethodsFromUniLibrary: writing Log #3 ");
//    }

    @Before("aop.aspect.MyPointCuts.allGetMethods()")
    public void beforeGetLoginAdvice() {
        System.out.println("beforeGetLoginAdvice: Logging try to get a book/magazine ");
    }



}
