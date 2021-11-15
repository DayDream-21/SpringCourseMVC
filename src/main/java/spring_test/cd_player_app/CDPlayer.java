package spring_test.cd_player_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import spring_test.cd_player_app.qualifier.Genre;
import spring_test.cd_player_app.qualifier.TypesOfGenre;
import spring_test.cd_player_app.qualifier.Year;

@Component("cdPlayer")
public class CDPlayer {
    private Disk disk;

    @Autowired
    public void setDisk(@Genre(type = TypesOfGenre.PUNK) @Year(1998) Disk disk) {
        this.disk = disk;
    }

    public Disk getDisk() {
        return disk;
    }

    public void playDisk() {
        System.out.println(disk.getDescription());
    }

    /*public CDPlayer getPlayer() {
        return new CDPlayer();
    }*/
}
