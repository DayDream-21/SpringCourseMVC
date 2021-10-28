package spring_test.cd_player_app.init_destroy;

import org.springframework.beans.factory.annotation.Autowired;
import spring_test.cd_player_app.CDPlayer;

public class Destroy {
    @Autowired
    CDPlayer cdPlayer;

    public void removeDisk() {
        System.out.println("Disk " + cdPlayer.getDisk().getDescription() + " removed");
    }
}
