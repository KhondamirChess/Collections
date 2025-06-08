package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Contacts app" +
                "\n1.Adding new contact" +
                "\n2.Removing contact" +
                "\n3.Show all contacts" +
                "\n4.Search contact" +
                "\n5.Show group of contacts" +
                "\n0.Exit");
        String str = scanner.nextLine();
        while (str.equals("0")){

            Scanner Scanner = null;
            switch (str){
                case "1":
                    System.out.println("1.Adding new contact");
                    addingNewContact(Scanner, list);
                case "2":
                    removingContact(Scanner, list);
                    System.out.println("2.Removing contact");
                case "3":
                    showContacts(list);
                    System.out.println("3.Show all contacts");
                case "4":
                    searchContact(Scanner, list);
                    System.out.println("3.Show all contacts");
                case "0":
                    System.out.println("Program was stopped");
                    break;
            }
            str = scanner.nextLine();
            // adding one more comment to make PR
        }

    }


    // Functions
    private static void addingNewContact(Scanner sc, ArrayList<Contact> list){
        String userName = sc.nextLine();
        String userPhone = sc.nextLine();
        String userEmail = sc.nextLine();
        String userGroup = sc.nextLine();
        list.add(new Contact(userName, userPhone,userEmail,userGroup));
    }
    private static void removingContact(Scanner sc, ArrayList<Contact> list){
        String name = sc.nextLine();
        Iterator<Contact> iterator = list.iterator();
        while (iterator.hasNext()){
            if (name.equals(iterator.next().getName())){
                iterator.remove();
            }
        }
    }
    private static void showContacts(ArrayList<Contact> list){
        System.out.println(list);
    }
    private static void searchContact(Scanner sc, ArrayList<Contact> list){
        String name = sc.nextLine();
        Iterator<Contact> iterator = list.iterator();
        while (iterator.hasNext()){
            if (name.equals(iterator.next().getName())){
                System.out.println(iterator.next());
            }
        }
    }
}

/// FINAL