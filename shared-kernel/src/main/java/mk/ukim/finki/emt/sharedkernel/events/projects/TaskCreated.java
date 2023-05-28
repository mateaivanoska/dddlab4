package mk.ukim.finki.emt.sharedkernel.events.projects;

import mk.ukim.finki.emt.sharedkernel.events.DomainEvents;

public class TaskCreated extends DomainEvents {

    private  String teamMid;
    private String title;
    private  String desc;

    public TaskCreated(String topic) {
        super(topic);
    }
}
