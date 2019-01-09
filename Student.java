package SAproject.demo.entity;
import javax.persistence.*;
import lombok.*;

public class Student {

    private @NonNull
    long id;
    private @NonNull
    String username;


    public Student(String username,
                   String num,
                   String disease,
                   String allergy,
                   String nation

    ) {
        this.username = username;

    }
public Student(String username){
        this.username = username;
}
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    }

}