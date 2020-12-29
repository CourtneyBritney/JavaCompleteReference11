package com.courtney;

/* Demonstrate the Observable class and the
   Observer interface.
*/

import java.util.*;

// This is the observing class.
class Watcher implements Observer {
    public void update(Observable obj, Object arg) {
        System.out.println("update() called, count is " +
                ((Integer)arg).intValue());
    }
}
