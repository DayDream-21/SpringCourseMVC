package spring_test.component_configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentMainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ComponentConfig.class);

        ExampleBean exampleBean = context.getBean("exampleBean", ExampleBean.class);

        exampleBean.exampleMethod();
    }
}
