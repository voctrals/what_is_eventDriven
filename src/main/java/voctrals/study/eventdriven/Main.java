package voctrals.study.eventdriven;

import voctrals.study.eventdriven.listener.DoorCloseEventListener;
import voctrals.study.eventdriven.listener.DoorOpenEventListener;
import voctrals.study.eventdriven.source.DoorManager;

/**
 * @author lei.liu
 * @since 19-4-1
 */
public class Main {

    public static void main(String[] args) {
        DoorManager doorManager = new DoorManager();

        doorManager.addListener(new DoorOpenEventListener());
        doorManager.addListener(new DoorCloseEventListener());

        doorManager.openDoor();
        doorManager.closeDoor();
    }
}
