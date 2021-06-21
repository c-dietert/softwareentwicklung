package de.fham.softwareentwicklung.zwei.list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonListShould {

    PersonList personList;

    @BeforeEach
    void setUp() {
        personList = new PersonList();
    }

    @Test
    void addAnElementToTheList() {
        Person person = new Person();
        person.name = "1";

        personList.add(person);

        assertThat(personList.firstElement.person.name).isEqualTo("1");
    }

    @Test
    void addMoreElementsToTheList() {
        Person person = new Person();
        person.name = "1";
        Person person2 = new Person();
        person2.name = "2";

        personList.add(person);
        personList.add(person2);

        assertThat(personList.firstElement.person.name).isEqualTo("1");
        assertThat(personList.firstElement.next.person.name).isEqualTo("2");
    }

    @Test
    void fetchAnElementFromTheList() {
        Person person = new Person();
        person.name = "1";
        Person person2 = new Person();
        person2.name = "2";
        personList.add(person);
        personList.add(person2);


        Person fetschedPerson = personList.getPerson(1);

        assertThat(fetschedPerson.name).isEqualTo("2");
    }

    @Test
    void removeAnElementFromTheList() {
        Person person = new Person();
        person.name = "1";
        person.birthdate = "1";
        Person person2 = new Person();
        person2.name = "2";
        person2.birthdate = "2";
        personList.add(person);
        personList.add(person2);

        personList.remove(person);

        assertThat(personList.firstElement.person.name).isEqualTo("2");
        assertThat(personList.firstElement.next).isNull();
    }
}