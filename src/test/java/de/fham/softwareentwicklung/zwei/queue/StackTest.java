package de.fham.softwareentwicklung.zwei.queue;

import jdk.swing.interop.SwingInterOpUtils;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
import java.util.logging.StreamHandler;

class StackTest
{
    public static void main(String[] args)
    {
        Stack s=new Stack();

        Queue q= new LinkedList();

        System.out.println("Add " + s.push("Red"));
        System.out.println("Add " + s.push("Orange"));
        System.out.println("Add " + s.push("Yellow"));
        System.out.println("Add " + s.push("Green"));
        System.out.println("Add " + s.push("Blue"));
        System.out.println("Add " + s.push("Indigo"));
        System.out.println("Add " + s.push("Violet"));


        System.out.println("Colors of the Rainbow" + s);



        System.out.println("Remove "+ s.pop());
        System.out.println("Remove "+ s.pop());
        System.out.println("Remove "+ s.pop());
        System.out.println("Remove "+ s.pop());
        System.out.println("Remove "+ s.pop());
        System.out.println("Remove "+ s.pop());
        System.out.println("Remove "+ s.pop());

        System.out.println("What Colors are left?" + s);

        q.add("Strawberries");
        q.add("Blueberries");
        q.add("Raspberries");
        q.add("Kiwis");
        q.add("Orange");
        q.add("Apples");
        q.add("Mango");
        q.add("Grapes");

        System.out.println("Now it is a Fruit Salad: ");
        Iterator itr= q.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("I ate in FIFO Order:");
        System.out.println("First " + q.remove());
        System.out.println("Second " + q.remove());
        System.out.println("Third " + q.remove());
        System.out.println("Fourth " + q.remove());
        System.out.println("Fifth " + q.remove());
        System.out.println("Sixth " + q.remove());
        System.out.println("Seventh " + q.remove());
        System.out.println("Finally the " + q.remove());

        }

    }

