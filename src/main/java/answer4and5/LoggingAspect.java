package answer4and5;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("this(MyService)")
    void before(){
        System.out.println("Before Method");
    }

    @After("execution(* *(..))")
    void after(){
        System.out.println("After Method");
    }
}

