package answer1and2;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class MyEventListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {

        System.out.println("Invoked event is : " + event);
    }
}

public class Main {


    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        ((ClassPathXmlApplicationContext) ctx).start();
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((ClassPathXmlApplicationContext) ctx).stop();

        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ((ClassPathXmlApplicationContext) ctx).close();
    }


}
