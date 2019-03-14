package answer7;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("this(MyService)")
    void before(){
        System.out.println("Before Method- Answer 7 THIS");
    }

    @After("within(answer7.*))")
    void after(){
        System.out.println("After Method - Answer 7 WITHIN");
    }

    @After("bean(myService2)")
    void aftebean(){
        System.out.println("After Method - Answer 7 BEAN");
    }

    @After("args(Integer)")
    void argsMethod(){
        System.out.println("After Method - Answer 7 Integer");
    }

    @After("execution(* * ())")
    void method(){
        System.out.println("I am execution - answer7");
    }

}

