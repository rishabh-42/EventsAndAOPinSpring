package answer8;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect3 {

    @Before("idPointcut() || getStringPointcut()")
    void beforeAdvice() {
        System.out.println("Running before advice- Point Cut");
    }



    @Pointcut("execution(int getId())")
    void idPointcut(){

    }

    @Pointcut("execution(String getName())")
    void getStringPointcut(){
    }

}

