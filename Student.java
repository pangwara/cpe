package SAproject.demo.entity;
import javax.persistence.*;
import lombok.*;
@Data
@Entity
@Getter @Setter
@ToString
@EqualsAndHashCode
@Table (name = "student")
public class Student {

    @Id
    @SequenceGenerator(name = "student_seq", sequenceName = "student_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @Column(name = "Student_id", unique = true, nullable = true)
    private @NonNull
    long id;
    private @NonNull
    String username;
    private @NonNull
    String num;
    private @NonNull
    String nation;
    private @NonNull
    String disease;
    private @NonNull
    String allergy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Gender ")
    private Gender Gender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Religion ")
    private Religion Religion;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Nationality")
    private Nationality Nationality;

    public Student(String username,
                   String num,
                   String disease,
                   String allergy,
                   String nation

    ) {
        this.username = username;
        this.num = num;
        this.disease = disease;
        this.allergy = allergy;
        this.nation = nation;
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

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public SAproject.demo.entity.Gender getGender() {
        return Gender;
    }

    public void setGender(SAproject.demo.entity.Gender gender) {
        Gender = gender;
    }

    public SAproject.demo.entity.Religion getReligion() {
        return Religion;
    }

    public void setReligion(SAproject.demo.entity.Religion religion) {
        Religion = religion;
    }

    public SAproject.demo.entity.Nationality getNationality() {
        return Nationality;
    }

    public void setNationality(SAproject.demo.entity.Nationality nationality) {
        Nationality = nationality;
    }

    public Student() {
    }

}