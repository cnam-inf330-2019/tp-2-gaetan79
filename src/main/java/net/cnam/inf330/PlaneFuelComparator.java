package net.cnam.inf330;

import java.util.Comparator;

public class PlaneFuelComparator implements Comparator<Plane> {


    @Override
    public int compare(Plane plane, Plane t1) {
        if(plane.getFuelCapacity()>t1.getFuelCapacity())
            return 0;
        else
            return 1;
    }
}
