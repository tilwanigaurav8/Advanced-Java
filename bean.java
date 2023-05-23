import java.io.Serializable;

public class bean implements Serializable {
    private String name;
    private String tech;
    private int roll;

    public void setName(String name){
        this.name=name;
    }
    public void setRoll(int roll){
        this.roll=roll;
    }
    public void setTech(String tech){
        this.tech=tech;
    }
    public int getRoll(){
        return roll;
    }
    public String getName(){
        return name;
    }
    public String getTech(){
        return tech;
    }
    @Override
    public String toString() {
        return "bean [name="+name+",tech="+tech+",roll="+roll+"]";
    }
}
