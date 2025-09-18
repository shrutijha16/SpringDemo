package IOCExample;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCCouplingExample {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean.xml");

        UserManager userManagerWithDB =
                (UserManager) context.getBean("ManagerBean");
        System.out.println(userManagerWithDB.getUserinfo());
    }
}
