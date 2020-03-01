package core.animal;

public class Cat implements core.animal.Animal {

    public void talk(){
        System.out.println("mew");
    }
    private String name;
    public Cat (String name){
        this.name = name;
    }
    public void eat(){
        System.out.println("Seep, Seep, Seep");
    }
    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name=name;
    }
    //public Cat (String name) {
        //super(name);
    //}

}