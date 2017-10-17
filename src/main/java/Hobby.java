import java.util.Objects;

class Hobby{
    private String name;
    private int value = 0;

    Hobby (String name){
        this.name = name;
        }

    Hobby (String name, Integer value){
        this.name = name;
        this.value = value;
    }
    
    public void tellAbout(){
        System.out.println(this.value == 0 ? 
                "My hobby is " + this.name :
                "My hobby is " + this.name + "and it costs " + this.value);
    }

    void validate() throws HobbyException {
        if (Objects.equals(this.name, "")) {
            throw new HobbyException("ERROR: Set name for hobby " + getClass().getName());
        }
    }
}
