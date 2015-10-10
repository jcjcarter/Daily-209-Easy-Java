package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numUsers = Integer.valueOf(scan.nextLine());

        User[] users = new User[numUsers];

        for (int i = 0; i < numUsers; i++) {
            String[] tokens = scan.nextLine().split(": ");
            users[i] = new User(tokens[0], Double.valueOf(tokens[1]));
        }

        Arrays.sort(users);

        users[0].setFlair(null);
        System.out.println(users[0]);

        for (int i = 1; i < numUsers; i++) {
            users[i].setFlair(users[i - 1]);
            System.out.println(users[i]);
        }
    }
}
