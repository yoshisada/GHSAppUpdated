package com.ghsapp.android.ghsapp;

import java.util.ArrayList;
import java.util.List;

public class CalEventResponse {
    private List<CalEvent> eventList = new ArrayList<CalEvent>();

    public List<CalEvent> getEventList(){
        return eventList;
    }
}
