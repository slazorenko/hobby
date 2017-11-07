import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class main {
    public static void main(String[] args) {
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

        List<Hobby> list = new ArrayList<>();
        list.add(new Hobby("Cars"));
        list.add(new Hobby("Swimming"));
        list.add(new Hobby("Running"));
        list.add(new Hobby("Codding"));
        list.add(new Hobby("Reading"));
        printList(list);

        Collections.sort(list, new Comparator<Hobby>() {
            @Override
            public int compare(Hobby o1, Hobby o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    private static void printList(List<Hobby> list){
        for (Hobby hobby : list) {
            System.out.println(hobby.getName());
        }
    }
}