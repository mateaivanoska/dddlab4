package mk.ukim.finki.emt.sharedkernel.events;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;

import java.time.Instant;

@Getter
public abstract class DomainEvents {
    private String topic;
    private Instant occurredOn;

    public DomainEvents(String topic) {
        this.occurredOn = Instant.now();
        this.topic = topic;
    }

    public String toJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        String output = null;
        try {
            output = objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {

        }
        return output;
    }

    public String topic() {
        return topic;
    }

    public static <E extends DomainEvents> E fromJson(String json, Class<E> eventClass) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json,eventClass);
    }
}
