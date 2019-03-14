package answer3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.text.DateFormat;

@Component
public class Database implements ApplicationEventPublisherAware {

    ApplicationEventPublisher applicationEventPublisher;


    void connect() {
        MyCustomEvent myCustomEvent = new MyCustomEvent(this);

        applicationEventPublisher.publishEvent(myCustomEvent);

    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {

        this.applicationEventPublisher = applicationEventPublisher;
    }
}

class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Database database = context.getBean("database",Database.class);
        database.connect();


    }

}
