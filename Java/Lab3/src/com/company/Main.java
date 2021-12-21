//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        new Random();
        ArrayList<User> users = new ArrayList();
        users.add(new User("Ivan", "ivan@gmail.com", 14));
        users.add(new User("Jone", "jone@gmail.com", 18));
        users.add(new User("Mike", "mike@gmail.com", 24));
        users.add(new User("Greg", "greg@gmail.com", 11));
        users.add(new User("Jane", "jane@gmail.com", 17));
        List<UserDto> adults = (List)users.stream().filter((user) -> {
            return user.age >= 18;
        }).map((user) -> {
            return new UserDto(user.name, user.email, user.age);
        }).collect(Collectors.toList());
        System.out.println("Adults");
        Iterator var4 = adults.iterator();

        while(var4.hasNext()) {
            UserDto adult = (UserDto)var4.next();
            System.out.println("\tName: " + adult.name + "\n\tEmail: " + adult.email + "\n\tAge:" + adult.age + "\n");
        }

    }
}
