package de.fham.softwareentwicklung.zwei.queue;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.util.logging.StreamHandler;

class StackTest
{
    public static void main(String[] args)
    {
        Stack s=new Stack();

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

    }
}
