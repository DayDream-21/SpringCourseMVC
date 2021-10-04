package spring_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring_test.my_annotations.qualifier.Genre;
import spring_test.my_annotations.qualifier.TypesOfGenre;
import spring_test.my_annotations.qualifier.Year;

public class CDPlayer {
    private Disk disk;

    @Autowired()
    public void setDisk(@Genre(type = TypesOfGenre.PUNK) @Year(1998) Disk disk) {
        this.disk = disk;
    }

    public Disk getDisk() {
        return disk;
    }

    public void playDisk() {
        System.out.println(disk.getDescription());
    }
}
