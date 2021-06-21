package de.fham.softwareentwicklung.zwei.list;

public class PersonList implements ListInterface {

    ListElement firstElement;

    @Override
    public void add(Person person) {

        if (firstElement == null) {
            firstElement = new ListElement();
            firstElement.person = person;
        } else {
            ListElement helper = firstElement;
            while (helper.successor != null) {
                helper = helper.successor;
            }
            helper.successor = new ListElement();
            helper.successor.person = person;
        }
    }

    @Override
    public Person getPerson(int i) {

        ListElement helper = firstElement;
        while (i > 0) {
            if (helper.successor != null) {
                helper = helper.successor;
                i--;
            } else {
                return null;
            }
        }
        return helper.person;
    }

    @Override
    public void remove(Person person) {
        // Store head node
        ListElement temp = firstElement;
        ListElement prev = null;

        // If head node itself holds
        // the key to be deleted
        if (temp != null && temp.person.name.equals(person.name) && temp.person.birthdate.equals(person.birthdate)) {
            firstElement = temp.successor; // Changed head
        }

        // Else Search for the key to be deleted,
        // keep track of the previous node as we
        // need to change 'prev->next' */
        else {
            while (temp != null && !temp.person.name.equals(person.name) && !temp.person.birthdate.equals(person.birthdate)) {
                prev = temp;
                temp = temp.successor;
            }

            // If key was not present in linked list
            if (temp == null) {
                return;
            }

            // Unlink the node from linked list
            prev.successor = temp.successor;
        }
    }
}
