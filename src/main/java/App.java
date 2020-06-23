import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String[] args) {
    ApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(AppConfig.class);
    HelloWorld beanHWFirst =
        (HelloWorld) applicationContext.getBean("helloworld");
    HelloWorld beanHWSecond =
        (HelloWorld) applicationContext.getBean("helloworld");
    Cat beanCatirst =
        (Cat) applicationContext.getBean("cat");
    Cat beanCatSecond =
        (Cat) applicationContext.getBean("cat");
    System.out.println(beanHWFirst.equals(beanHWSecond));
    System.out.println(beanCatirst.equals(beanCatSecond));

  }
}