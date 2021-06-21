package de.fham.softwareentwicklung.zwei.list;

public class PersonList implements ListInterface {

    ListElement firstElement;

    @Override
    public void add(Person person) {

//        check if firstElement is empty (empty List)
        if (firstElement == null) {
//            add new Element when List is empty
            firstElement = new ListElement();
            firstElement.person = person;
        } else {
//            when list isn't empty find last element
            ListElement tmp = firstElement;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
//            add new element as the new next element of the last element of the list.
            tmp.next = new ListElement();
            tmp.next.person = person;
        }
    }

    @Override
    public Person getPerson(int i) {
        ListElement tmp = firstElement;
//        as long as the conter is bigger than 0
        while (i > 0) {
//            if there the next element is available
            if (tmp.next != null) {
//            go to the next element in the list
                tmp = tmp.next;
                i--;
            } else {
//                return null when the size of the list is < i
                return null;
            }
        }
//        return the element of the current position
        return tmp.person;
    }

    @Override
    public void remove(Person person) {
        // Store head node
        ListElement temp = firstElement;
        ListElement prev = null;

        // If head node itself holds
        // the key to be deleted
        if (temp != null && temp.person.name.equals(person.name) && temp.person.birthdate.equals(person.birthdate)) {
            firstElement = temp.next; // Changed head
        }

        // Else Search for the key to be deleted,
        // keep track of the previous node as we
        // need to change 'prev->next' */
        else {
            while (temp != null && !temp.person.name.equals(person.name) && !temp.person.birthdate.equals(person.birthdate)) {
                prev = temp;
                temp = temp.next;
            }

            // If key was not present in linked list
            if (temp == null) {
                return;
            }

            // Unlink the node from linked list
            prev.next = temp.next;
        }
    }
}
