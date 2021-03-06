package sa.site.lab.petstore.domain;

import javax.persistence.*;

@Entity
public class Animal {

    @Id
    private int id;
    @GeneratedValue //Automatic primary key
    @Column
    private String name;
    @Column
    private String type;
    @Column
    private String sound;


    public Animal(){ }


    public Animal(String name){
        this.name=name;
    }

    @Transient
    public void eat(){
        throw new RuntimeException("not yet implemented");
    }
    @Transient
    public void talk(String voice){
        throw new RuntimeException("not yet implemented");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }

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



}
