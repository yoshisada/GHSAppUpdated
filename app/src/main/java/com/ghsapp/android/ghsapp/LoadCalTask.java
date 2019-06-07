package com.ghsapp.android.ghsapp;

import android.os.AsyncTask;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.sql.Time;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;


//begins asyncTask
public class LoadCalTask extends AsyncTask<String, Void, CalEventResponse> {
    public LoadCalTask(Listener listener) { //async task function called LoadCalTask

        mListener = listener;
    }

    public interface Listener {

        void onLoaded(List<CalEvent> eventList); //array list of CalEvents

        void onError();
    }

    private Listener mListener;



    @Override
    protected CalEventResponse doInBackground(String... strings){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH'%3A'mm'%3A'ss'Z'");
        String date = df.format(Calendar.getInstance().getTime());
        final CalEventResponse calEventResponse = new CalEventResponse();
        try {

        String jsonURL = "https://www.googleapis.com/calendar/v3/calendars/apps4ghs%40gmail.com/events?alwaysIncludeEmail=false&orderBy=startTime&singleEvents=true&fields=accessRole%2CdefaultReminders%2Cdescription%2Cetag%2Citems%2Ckind%2CnextPageToken%2CnextSyncToken%2Csummary%2CtimeZone%2Cupdated&key=AIzaSyDxwGex3IzkW286tBs-i3DiQiS8aCpT3fw";
        String jsonURL2 = "https://www.googleapis.com/calendar/v3/calendars/apps4ghs%40gmail.com/events?alwaysIncludeEmail=false&maxResults=20&orderBy=startTime&singleEvents=true&fields=accessRole%2CdefaultReminders%2Cdescription%2Cetag%2Citems%2Ckind%2CnextPageToken%2CnextSyncToken%2Csummary%2CtimeZone%2Cupdated&timeMin=" + date + "&key=AIzaSyDxwGex3IzkW286tBs-i3DiQiS8aCpT3fw";
        URL url = null;

        url = new URL(jsonURL2);

        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        conn.setReadTimeout(10000);
        conn.setConnectTimeout(15000);
        conn.setRequestMethod("GET");
        conn.setDoInput(true);
        conn.connect();

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        StringBuilder response = new StringBuilder();

        while ((line = in.readLine()) != null) {

            response.append(line);
        }

        in.close();
        JSONObject myevents = new JSONObject(response.toString());
        JSONArray events = myevents.getJSONArray("items");


        //beginning of for loop
        for(int i = 0; i < events.length(); i++)
        {

            //list of vars
            String eventName;
            String eventStart;
            String eventEnd;
            String eventLink;
            String eventLoc;
            String eventDesc;


            JSONObject e = events.getJSONObject(i);
            JSONObject start = e.getJSONObject("start");
            JSONObject end = e.getJSONObject("end");
            if(e.has("summary")) {

                eventName =  e.getString("summary");
            }
            else
                eventName = " ";
            if(e.has("description")) {

                eventDesc = e.getString("description");
            }
            else
                eventDesc = " ";
            if(e.has("location")) {

                eventLoc = e.getString("location");
            }
            else
                eventLoc = " ";
            if(start.has("dateTime")) {

                eventStart = start.getString("dateTime");
            }
            else {

                eventStart = start.getString("date");
            }
            if(end.has("dateTime")) {

                eventEnd = end.getString("dateTime");
            }
            else {

                eventEnd = end.getString("date");
            }


            eventLink = e.getString("htmlLink");


            //events get added to array list
            CalEvent event = new CalEvent(eventName, eventStart, eventEnd, eventLink, eventLoc, eventDesc);
            calEventResponse.getEventList().add(event);


            //end for loop
        }
//        StringRequest stringRequest = new StringRequest(com.android.volley.Request.Method.GET, url,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//
//
//                        // Display the first 500 characters of the response string.
//
//                        try {
//                            JSONObject myevents = new JSONObject(response);
//                            JSONArray events = myevents.getJSONArray("items");
//
//
//                            //beginning of for loop
//                            for(int i = 0; i < events.length(); i++)
//                            {
//
//                                //list of vars
//                                String eventName;
//                                String eventStart;
//                                String eventEnd;
//                                String eventLink;
//                                String eventLoc;
//                                String eventDesc;
//
//
//                                JSONObject e = events.getJSONObject(i);
//                                JSONObject start = e.getJSONObject("start");
//                                JSONObject end = e.getJSONObject("end");
//                                if(e.has("summary")) {
//
//                                    eventName =  e.getString("summary");
//                                }
//                                else
//                                    eventName = " ";
//                                if(e.has("description")) {
//
//                                    eventDesc = e.getString("description");
//                                }
//                                else
//                                    eventDesc = " ";
//                                if(e.has("location")) {
//
//                                    eventLoc = e.getString("location");
//                                }
//                                else
//                                    eventLoc = " ";
//                                if(start.has("dateTime")) {
//
//                                    eventStart = start.getString("dateTime");
//                                }
//                                else {
//
//                                    eventStart = start.getString("date");
//                                }
//                                if(end.has("dateTime")) {
//
//                                    eventEnd = end.getString("dateTime");
//                                }
//                                else {
//
//                                    eventEnd = end.getString("date");
//                                }
//
//
//                                eventLink = e.getString("htmlLink");
//
//
//                                //events get added to array list
//                                CalEvent event = new CalEvent(eventName, eventStart, eventEnd, eventLink, eventLoc, eventDesc);
//                                calEventResponse.getEventList().add(event);
//
//
//                                //end for loop
//                            }
//
//
//
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//
//                        //mTextView.setText("Response is: " + response.substring(0, 500));
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//
//
//            }
//        });

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return calEventResponse;

    }


    @Override
    protected void onPostExecute(CalEventResponse calEventResponse){
        if (calEventResponse != null) {

            mListener.onLoaded(calEventResponse.getEventList());

        } else {

            mListener.onError();
        }
    }
}
