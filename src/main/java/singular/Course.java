package singular;

import lombok.*;

import java.io.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString

@Builder

public class Course {

    private String name;
    private String location;

    @Singular("studentList")
    private List<Student> studentList;

    @SneakyThrows
    public void readFile() {
        File f = new File("asd");
        f.createNewFile();
        FileReader fr = new FileReader(f);
    }

    @SneakyThrows
    public void utfString() {
        String str = new String("".getBytes(), "UTF-8");
    }
}
