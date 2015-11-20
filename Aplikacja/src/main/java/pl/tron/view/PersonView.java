package pl.tron.view;

import com.yammer.dropwizard.views.View;

import pl.tron.Person;

public class PersonView extends View {
    final private Person person;

    public PersonView(Person person){
        super("person.ftl");
        this.person = person;
    }

    public Person getPerson(){
        return person;
    }
}
