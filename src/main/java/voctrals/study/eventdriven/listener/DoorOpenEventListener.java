package voctrals.study.eventdriven.listener;

import voctrals.study.eventdriven.event.DoorEvent;

/**
 * @author lei.liu
 * @since 19-4-1
 */
public class DoorOpenEventListener implements DoorEventListener {
    @Override
    public void fireEvent(DoorEvent event) {
        if ("open".equals(event.getState())) {
            System.out.println("Door opened");
        }
    }
}
