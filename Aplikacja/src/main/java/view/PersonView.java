package view;

import com.yammer.dropwizard.views.View;

public class PersonView extends View {
    final private Person person;

    protected PersonView(Person person){
        super("person.ftl");
        this.person = person;
    }

    public Person getPerson(){
        return person;
    }
}
