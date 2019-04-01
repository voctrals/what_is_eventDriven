package voctrals.study.eventdriven.listener;

import voctrals.study.eventdriven.event.DoorEvent;

/**
 * @author lei.liu
 * @since 19-4-1
 */
public class DoorCloseEventListener implements DoorEventListener {
    @Override
    public void fireEvent(DoorEvent event) {
        if ("close".equals(event.getState())) {
            System.out.println("Door closed!");
        }
    }
}
