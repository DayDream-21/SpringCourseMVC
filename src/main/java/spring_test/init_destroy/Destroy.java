package spring_test.init_destroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring_test.CDPlayer;

public class Destroy {
    @Autowired
    CDPlayer cdPlayer;

    public void removeDisk() {
        System.out.println("Disk " + cdPlayer.getDisk().getDescription() + " removed");
    }
}
