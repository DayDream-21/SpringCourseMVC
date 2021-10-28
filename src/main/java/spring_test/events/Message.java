package spring_test.events;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("message")
public class Message {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message: " + this.message;
    }
}
