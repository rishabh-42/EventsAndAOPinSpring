package answer8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("myService3")
public class MyService3 {

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
        MyService3 myService3 = context.getBean("myService3", MyService3.class);
        myService3.setId(1);
        myService3.setName("Rishabh");

        System.out.println(myService3.getId());
        System.out.println(myService3.getName());

    }
}
