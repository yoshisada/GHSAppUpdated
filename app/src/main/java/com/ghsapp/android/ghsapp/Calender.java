package com.ghsapp.android.ghsapp;

import android.app.Activity;
import android.app.Dialog;
import android.app.DownloadManager;
import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.squareup.picasso.Downloader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Calender extends ListActivity implements LoadCalTask.Listener{
    private static final String TAG = "Calender";

    ImageButton back;
    String Result = "test";
    Global global;
    List<CalEvent> eventsss = new ArrayList<>();
    ListView listView;
    TextView mTextView;
    Dialog myDialog;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        global=((Global)getApplicationContext());
        setTheme(global.getThemes());
        setContentView(R.layout.activity_counselor);
        listView = getListView();//(ListView) findViewById(R.id.list);
        back = findViewById(R.id.BackButton1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        new LoadCalTask(this).execute();
        myDialog = new Dialog(this);


    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        myDialog.setContentView(R.layout.custompopup);
        TextView name = myDialog.findViewById(R.id.eName);
        TextView date = myDialog.findViewById(R.id.eDate);
        TextView des = myDialog.findViewById(R.id.eDes);
        Button aButton = myDialog.findViewById(R.id.AwesomeButton);
        //Toast.makeText(getApplicationContext(), "view clicked:", Toast.LENGTH_SHORT).show();
        name.setText(eventsss.get(position).getName());

        String datefinal = " ";
        String dateActual;
        String month;
        String day;
        dateActual = eventsss.get(position).getStart();
        month = dateActual.substring(5,7);
        if(dateActual.length() == 10)
            day = dateActual.substring(8);
        else
            day = dateActual.substring(8,dateActual.indexOf("T"));
        if(month.equals("01"))
            datefinal = "Jan";
        if(month.equals("02"))
            datefinal = "Feb";
        if(month.equals("03"))
            datefinal = "Mar";
        if(month.equals("04"))
            datefinal = "Apr";
        if(month.equals("05"))
            datefinal = "May";
        if(month.equals("06"))
            datefinal = "Jun";
        if(month.equals("07"))
            datefinal = "Jul";
        if(month.equals("08"))
            datefinal = "Aug";
        if(month.equals("09"))
            datefinal = "Sep";
        if(month.equals("10"))
            datefinal = "Oct";
        if(month.equals("11"))
            datefinal = "Nov";
        if(month.equals("12"))
            datefinal = "Dec";

        datefinal += " " + day;
        date.setText(datefinal);
        des.setText(eventsss.get(position).getDesc());
        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    @Override
    public void onLoaded(List<CalEvent> eventList) {

        eventsss = eventList;
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

    }

    @Override
    public void onError() {
        Intent myIntent = new Intent(Calender.this, MainActivity.class);
        startActivity(myIntent);
    }

    class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount(){
            Log.v(TAG, "count ="+ eventsss.size());
            return eventsss.size();
        }

        @Override
        public Object getItem(int i){
            return  eventsss.get(i);
        }
        @Override
        public long getItemId(int i){
            return i;
        }
//        @Override
//        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//            long viewId = view.getId();
//
//            if (viewId == R.id.button) {
//                Toast.makeText(getApplicationContext(), "Button 1 clicked", Toast.LENGTH_SHORT).show();
//            }
//            else {
//                Toast.makeText(getApplicationContext(), "ListView clicked" + id, Toast.LENGTH_SHORT).show();
//            }
//        }
        String names = " ";
        String dates = " ";
        String description = " ";
        @Override
        public View getView(int i, View view, ViewGroup viewGroup){
            view = getLayoutInflater().inflate(R.layout.customlayout,null);
            TextView title = view.findViewById(R.id.title);
            title.setText(eventsss.get(i).getName());
            TextView date = view.findViewById(R.id.date);
            String datefinal = " ";
            String dateActual;
            String month;
            String day;
            dateActual = eventsss.get(i).getStart();
            month = dateActual.substring(5,7);
            if(dateActual.length() == 10)
                day = dateActual.substring(8);
            else
                day = dateActual.substring(8,dateActual.indexOf("T"));
            if(month.equals("01"))
                datefinal = "Jan";
            if(month.equals("02"))
                datefinal = "Feb";
            if(month.equals("03"))
                datefinal = "Mar";
            if(month.equals("04"))
                datefinal = "Apr";
            if(month.equals("05"))
                datefinal = "May";
            if(month.equals("06"))
                datefinal = "Jun";
            if(month.equals("07"))
                datefinal = "Jul";
            if(month.equals("08"))
                datefinal = "Aug";
            if(month.equals("09"))
                datefinal = "Sep";
            if(month.equals("10"))
                datefinal = "Oct";
            if(month.equals("11"))
                datefinal = "Nov";
            if(month.equals("12"))
                datefinal = "Dec";

            datefinal += "\n" + day;



            date.setText(datefinal);


            return view;

        }
    }
}
