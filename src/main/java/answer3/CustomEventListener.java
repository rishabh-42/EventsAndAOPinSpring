package answer3;

import org.springframework.context.ApplicationListener;

public class CustomEventListener implements ApplicationListener<MyCustomEvent> {
    @Override
    public void onApplicationEvent(MyCustomEvent event) {
        System.out.println("Custom Event is invoked " + event );
    }
}
