package voctrals.study.eventdriven.event;

import lombok.Data;

import java.util.EventObject;

/**
 * @author lei.liu
 * @since 19-4-1
 */
@Data
public class DoorEvent extends EventObject {

    private static final long serialVersionUID = 9017960616879247913L;

    private String state;

    public DoorEvent(Object source, String state) {
        super(source);
        this.state = state;
    }
}
