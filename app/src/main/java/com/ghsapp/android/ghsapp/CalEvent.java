package com.ghsapp.android.ghsapp;
public class CalEvent {

    private String eventName;
    private String eventStart;
    private String eventEnd;
    private String eventLink;
    private String eventLoc;
    private String eventDesc;

    public CalEvent(String eventNamef, String eventStartf, String eventEndf, String eventLinkf, String eventLocf, String eventDescf) {
        eventName = eventNamef;
        eventStart = eventStartf;
        eventEnd = eventEndf;
        eventLink = eventLinkf;
        eventLoc = eventLocf;
        eventDesc = eventDescf;
    }
    public String getName() {
        return eventName;
    }
    public String getStart() {
        return eventStart;
    }
    public String getEnd() {
        return eventEnd;
    }
    public String getLink(){
        return eventLink;
    }
    public String getLoc() {
        return eventLoc;
    }
    public String getDesc() {
        return eventDesc;
    }

}
