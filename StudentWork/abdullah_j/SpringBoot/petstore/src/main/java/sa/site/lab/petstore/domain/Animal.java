package sa.site.lab.petstore.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Animal {


    //primary key
    @Id
    private int id;

    @Column
    private String name;
    @Column
    private String type;
    @Column
    private String sound;


    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    // TODO: Ignore these methods in JPA
    @Transient
    public void eat() {
        throw new RuntimeException("not yet implemented");
    }

    // TODO: Ignore these methods in JPA
    @Transient
    public void talk(String voice) {
        throw new RuntimeException("not yet implemented");
    }


    // Setter & Getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
} // The End...
