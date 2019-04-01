package voctrals.study.eventdriven.listener;

import voctrals.study.eventdriven.event.DoorEvent;

import java.util.EventListener;

public interface DoorEventListener extends EventListener {
    void fireEvent(DoorEvent event);
}