package spring_test.init_destroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring_test.CDPlayer;

public class Init {
    @Autowired
    CDPlayer cdPlayer;

    public void insertDisk() {
        System.out.println("Disk " + cdPlayer.getDisk().getDescription() + " inserted");
    }
}
