package spring_test.cd_player_app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("test");
        context.register(MyConfig.class);
        context.refresh();

        CDPlayer cdPlayer = context.getBean("cdPlayer", CDPlayer.class);

        cdPlayer.playDisk();

        context.close();
    }
}
