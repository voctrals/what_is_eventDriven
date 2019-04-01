package voctrals.study.eventdriven.source;

import voctrals.study.eventdriven.event.DoorEvent;
import voctrals.study.eventdriven.listener.DoorEventListener;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lei.liu
 * @since 19-4-1
 */
public class DoorManager {

    private Set<DoorEventListener> listeners = new HashSet<>();

    /**
     * 注册事件
     */
    public void addListener(DoorEventListener listener) {
        listeners.add(listener);
    }

    /**
     * 删除事件
     */
    public void removeListener(DoorEventListener listener) {
        listeners.remove(listener);
    }

    /**
     * 通知所有注册的事件
     *
     * @param event 事件对象
     */
    private void notifyListeners(DoorEvent event) {
        for (DoorEventListener listener : listeners) {
            listener.fireEvent(event);
        }
    }

    public void openDoor() {
        DoorEvent event = new DoorEvent(this, "open");
        notifyListeners(event);
    }

    public void closeDoor() {
        DoorEvent event = new DoorEvent(this, "close");
        notifyListeners(event);
    }
}
