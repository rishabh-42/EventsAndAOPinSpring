package answer6;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.io.IOException;

@Aspect
public class AspectException {

    @AfterThrowing(pointcut = "this(ExceptionInMethod)", throwing = "ex")
    void afterReturningAdvice(IOException ex) {
        System.out.println("Running AfterThrowing " + ex);
    }


}

