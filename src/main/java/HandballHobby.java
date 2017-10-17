public class HandballHobby extends Hobby {
    private String tell = "I'm going into handball for 10 years";

    HandballHobby(String name) {
        super(name);
    }

    @Override
    public void tellAbout(){
        super.tellAbout();
        System.out.println(tell);
    }
}
