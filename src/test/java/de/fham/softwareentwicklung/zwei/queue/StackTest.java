package de.fham.softwareentwicklung.zwei.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

class StackTest {

    public static void main(String[] args)
    {
        Stack<String> s=new Stack<>();

         Queue<String> q= new LinkedList<>();

            s.push("Red");
            s.push("Orange");
            s.push("Yellow");
            s.push("Green");
            s.push("Blue");
            s.push("Indigo");
            s.push("Violet");

          System.out.println("\nColors of the Rainbow" + s);

        System.out.println("\nLet the Rainbow in LIFO Order disappear");
        System.out.println("Remove "+ s.pop());
        System.out.println("Remove "+ s.pop());
        System.out.println("Remove "+ s.pop());
        System.out.println("Remove "+ s.pop());
        System.out.println("Remove "+ s.pop());
        System.out.println("Remove "+ s.pop());
        System.out.println("Remove "+ s.pop());

    System.out.println("\nWhat Colors are left?" + s);

            q.add("Strawberries");
            q.add("Blueberries");
            q.add("Raspberries");
            q.add("Kiwis");
            q.add("Orange");
            q.add("Apples");
            q.add("Mango");
            q.add("Grapes");

                    System.out.println("\nTaste the Rainbow: " + q);


            System.out.println("\nI ate in FIFO Order:");
            System.out.println("First " + q.remove());
            System.out.println("Second " + q.remove());
            System.out.println("Third " + q.remove());
            System.out.println("Fourth " + q.remove());
            System.out.println("Fifth " + q.remove());
            System.out.println("Sixth " + q.remove());
            System.out.println("Seventh " + q.remove());
            System.out.println("Finally the " + q.remove());

            System.out.println("\nWhat Fruits are left?" + q);

        }

    }

