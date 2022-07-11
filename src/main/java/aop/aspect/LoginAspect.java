package aop.aspect;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
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

    @Before("aop.aspect.MyPointCuts.allAddMethods()")
    public void beforeAddLoginAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Information about the book - " + myBook.getNameBook() +
                            ", author - " + myBook.getAuthor() +
                            ", Year Of Publication - " + myBook.getYearOfPublication());
                } else if (obj instanceof  String) {
                    System.out.println("Book adds to the library " + obj);
                }
            }

        }

        System.out.println("beforeAddLoginAdvice: Logging try to get a book/magazine ");
        System.out.println("____________________________");
    }


}
