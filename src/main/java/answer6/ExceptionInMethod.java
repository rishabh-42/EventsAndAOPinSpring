package answer6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ExceptionInMethod {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) throws IOException {
        this.id = id;
        throw  new IOException();


    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IOException {
        this.name = name;
        throw  new IOException();
    }

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ExceptionInMethod exceptionInMethod = context.getBean("exceptionInMethod", ExceptionInMethod.class);
        try {
            exceptionInMethod.setId(1);
        } catch (IOException e) {
            //e.printStackTrace();
        }

        try {
            exceptionInMethod.setName("Rishabh");
        } catch (IOException e) {
           // e.printStackTrace();
        }

        System.out.println(exceptionInMethod.getId());
        System.out.println(exceptionInMethod.getName());


    }
}
