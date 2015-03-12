package com.prolificinteractive.materialcalendarview;

/**
 * Callback used to see if our dates have events
 */
public interface EventDelegate {

    public boolean dateHasEvent(CalendarDay date);
}