package answer9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("myService4")
public class MyService4 {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        MyService4 myService4 = context.getBean("myService4", MyService4.class);
        myService4.setId(1);
        myService4.setName("Rishabh");

        System.out.println(myService4.getId());
        System.out.println(myService4.getName());

    }
}
