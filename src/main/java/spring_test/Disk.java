package spring_test;

import org.springframework.stereotype.Component;
import spring_test.my_annotations.qualifier.Genre;
import spring_test.my_annotations.qualifier.TypesOfGenre;
import spring_test.my_annotations.qualifier.Year;

public interface Disk {
    String getDescription();
}

@Component("blinkDiskBean")
@Genre(type = TypesOfGenre.PUNK) @Year(1999)
class BlinkDisk implements Disk {
    @Override
    public String getDescription() {
        return "Blink182";
    }
}

@Component("offspringDiskBean")
@Genre(type = TypesOfGenre.PUNK) @Year(1998)
class OffspringDisk implements Disk {
    @Override
    public String getDescription() {
        return "Offspring";
    }
}

@Component("sumDiskBean")
@Genre(type = TypesOfGenre.ROCK) @Year(2001)
class SumDisk implements Disk {
    @Override
    public String getDescription() {
        return "Sum41";
    }
}
