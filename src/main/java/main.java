class main {
    public static void main(String[] args){
        Hobby hobbies[] = {
                new HandballHobby("Handball"),
                new CarsHobby("", 100)
        };
        for (Hobby hobby : hobbies) {
            try {
                hobby.validate();
                hobby.tellAbout();
            } catch (HobbyException ex) {
                System.out.println(ex.toString());
            }
        }
    }
}
