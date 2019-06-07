package com.ghsapp.android.ghsapp;

import android.app.ActionBar;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TeacherSearch extends AppCompatActivity {
    ImageButton back;
    Button GO;
    Button Directory;
    String nameTeacher;
    Global global;
    private  static String[] Teachers = new String[] {"Aguirre, Audra",
            "Alva, Laura",
            "Andrecht, David",
            "Ashley, Michelle",
            "Banthrum, Erin",
            "Bell, Jennifer",
            "Bergslien, Linda",
            "Blades, Steve",
            "Brown, Dave",
            "Bondurant, Eric",
            "Burgan, Chris",
            "Carlos, Ricardo",
            "Clune, Debra",
            "Coak, D’Ann",
            "Coats, Janel",
            "Huebbe, Kathy",
            "Cruz, Thom",
            "DeOrio, Tricia",
            "Diaz, Sean",
            "DuBransky, Jeff",
            "Dykstra, Kurt",
            "Edward, Pam",
            "Elder, Candace",
            "El Yousef, Rana",
            "Ensman, Diana",
            "Fallon, Ashley",
            "Falls, Steven",
            "Feldsher, Joshua",
            "Franssen, Erin",
            "Fuentes, Connie",
            "Gautreau, Barbara",
            "Gonzalez, Rene",
            "Gonzalez, Ruth",
            "Granquist, Doug",
            "Hanrahan, Desmond",
            "Hardgrove, Julianna",
            "Harrison, Chris",
            "Hart, Mindi",
            "Hart, Monique",
            "Hart, Pat",
            "Henley, Dan",
            "Hernandez, Vanessa",
            "Hill, Kiese",
            "Hoffmeister, Brenda",
            "Hoffmeister, George",
            "Hoolihan, Kelley",
            "Huey, Brooke",
            "Huss, Shawnee",
            "Iles, James",
            "Izell, Bobbie",
            "Johnson, Tom",
            "Jones, Jennifer",
            "Kassotis, Amy",
            "Kent, Dani",
            "Lawrence, Ryan",
            "Liao, Jimmy",
            "Lopez, Paul",
            "Lozano, Luz",
            "Manalo, Lucy",
            "Martinez, Janie",
            "Martinez, Jennifer",
            "Mason, Dillon",
            "Merrick, Ian",
            "Mobley, Janet",
            "Moltoni, Johnathan",
            "Montgomery, Steve",
            "Nakata, Greg",
            "Nelson, Michael",
            "O’Neal, Jason",
            "Orosz, Ann",
            "Pazos, Amy",
            "Perez, Robin",
            "Pierce, Laura",
            "Reigstad, Michelle",
            "Riihimaki, Lor",
            "Riley, Jennifer",
            "Robles, Jashua",
            "Rohrer, Brandon",
            "Rollon, Laura",
            "Ruiz, Aaron",
            "Salle, Kathy",
            "Schwarz, Scott",
            "Shier, Julie",
            "Shires, Deric",
            "Smith, Eric",
            "Spengler, Lee",
            "Stowell, Erin",
            "Sullivan, John",
            "Sullivan, Reid",
            "Summers, Kathy",
            "Tanzillo, Jen",
            "Tilton, Rod",
            "Trevor, Brian",
            "Tumer, Scott",
            "Wall, Terry",
            "Walters, Luke",
            "White, Rik",
            "Lindsay, Christie",
            "Williams, Kim",
            "Wingerd, Loren",
            "Winslow, Ben",
            "Wooldridge, Brittany",
            "Zabel, Darin",
            "Bouman, Sam",
            "Fernandez, Lucia",
            "Hill, Todd",
            "Khadem, Tanyia",
            "Bink, Dagmar",
            "Ziliotto, Cynthia",
            "Aguilar, Corina",
            "Crandall, Jodi",
            "O’Connell, Joanne",
            "Pearce, Winnie",
            "Nichols, Marianne",
            "Acuna, Lorena",
            "Bedo, Laurie",
            "Cruse, Kim",
            "Reichert, Joy",
            "Kerr, Dion",
            "Molina, Danielle",
            "Silvestre, Kellie",
            "Bryant, Katie",
            "Johnson, Amy",
            "Bran, Norma",
            "Gerber, Julie",
            "Summers, Janette",
            "Matsudo, Stuart",
            "Castellanos, Lisa",
            "Poillucci, Gina",
            "Brown, Paul",
            "Browning, Jason",
            "Dunn, Joy",
            "Hamlow, Gordon",
            "Johnson, Kyle",
            "Kirkendall, Lauren",
            "Trevor, Patty",
            "Tulcan, Teresa"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        global=((Global)getApplicationContext());
        setTheme(global.getThemes());
            setContentView(R.layout.activity_teacher_search);
        //textview
        final AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,Teachers);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setBackgroundColor(Color.WHITE);
        //back button
        back = findViewById(R.id.BackButton1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        GO = findViewById(R.id.GObutton);
        GO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameTeacher = autoCompleteTextView.getText().toString();
                Intent myIntent = new Intent(TeacherSearch.this, TeacherDetails.class);
                myIntent.putExtra("name",nameTeacher);
                startActivity(myIntent);
            }

        });
        Directory = findViewById(R.id.Directory);
        Directory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TeacherSearch.this, Directory.class);
                startActivity(myIntent);
            }

        });
        //theme

    }
}
