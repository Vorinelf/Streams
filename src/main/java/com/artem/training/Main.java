package com.artem.training;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> noChildren = null;

        List<User> childrenAnna = new ArrayList<>();

        childrenAnna.add(new User(1, 8, "Mike"));
        childrenAnna.add(new User(2, 4, "Dave"));
        childrenAnna.add(new User(3, 2, "Nick"));
        User anna = new User(1, 32, "Anna", childrenAnna);

        List<User> childrenBob = new ArrayList<>();
        childrenBob.add(new User(4, 5, "Sam"));
        childrenBob.add(new User(5, 1, "Jack"));
        childrenBob.add(new User(6, 3, "Tad"));
        User bob = new User(2, 30, "Bob", childrenBob);

        List<User> childrenMike = new ArrayList<>();
        childrenMike.add(new User(7, 7, "Kate"));
        childrenMike.add(new User(8, 1, "Jack"));
        User mike = new User(3, 31, "Mike", childrenMike);

        List<User> childrenNick = new ArrayList<>();
        childrenNick.add(new User(9, 10, "Gary"));
        User nick = new User(4, 34, "Nick", childrenNick);

        List<User> childrenJasica = new ArrayList<>();
        childrenJasica.add(new User(10, 4, "David"));
        User jassica = new User(5, 22, "Jassica", childrenJasica);

        List<User> childrenMonica = new ArrayList<>();
        childrenMonica.add(new User(11, 8, "Tim"));
        User monica = new User(6, 26, "Monica", childrenMonica);


        User steve = new User(7, 20, "Steve", noChildren);

        User сolin = new User(8, 45, "Сolin", null);

        List<User> childrenRoy = new ArrayList<>();
        childrenRoy.add(new User(12, 12, "John"));
        User roy = new User(9, 25, "Roy", childrenRoy);

        List<User> childrenLuk = new ArrayList<>();
        childrenLuk.add(new User(13, 11, "Kate"));
        childrenLuk.add(new User(14, 9, "Mary"));
        childrenLuk.add(new User(15, 6, "Tad"));
        User luk = new User(10, 30, "Luk", childrenLuk);


        List<User> parents = new ArrayList<>();
        parents.add(anna);
        parents.add(bob);
        parents.add(mike);
        parents.add(nick);
        parents.add(jassica);
        parents.add(monica);
        parents.add(steve);
        parents.add(сolin);
        parents.add(roy);
        parents.add(luk);
        AllMethods allMethods = new AllMethods();
        allMethods.getMapWithKeyParentValueListNameChildren(parents);

        User dave = new User(1, 32, "Anna", childrenAnna);
        System.out.println(anna.equals(dave));
        System.out.println(anna.equals(bob));
    }


}
