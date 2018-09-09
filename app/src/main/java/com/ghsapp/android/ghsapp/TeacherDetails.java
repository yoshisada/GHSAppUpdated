package com.ghsapp.android.ghsapp;

import android.app.ActionBar;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
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

public class TeacherDetails extends AppCompatActivity {
    private String fName;
    private String Desc;
    private String room;
    private String email;
    public  TeacherDetails(){
        fName = " ";
        room = " ";
        email = " ";
        Desc = " ";
    }
    public void setDetails( String n, String r, String e, String D){
        fName = n;
        room = r;
        Desc = D;
        email = e;
    }
    public String getName(){
        return fName;
    }
    public String getRoom(){
        return room;
    }
    public String getEmail(){
        return email;
    }
    public String getDesc(){
        return Desc;
    }




    ImageButton back;
    Global global;
    Bundle extras;
    String someVariable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        global=((Global)getApplicationContext());
        if(global.getCounter() == 0) {setTheme(R.style.red);}
        if(global.getCounter() == 1) {setTheme(R.style.black_oled);}
        if(global.getCounter() == 2) {setTheme(R.style.space);}
        if(global.getCounter() == 3) {setTheme(R.style.forest);}
        setContentView(R.layout.activity_teacher_details);
        super.onCreate(savedInstanceState);
        back = findViewById(R.id.BackButton1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        extras = getIntent().getExtras();
        TextView name = findViewById(R.id.tName);
        TextView eml = findViewById(R.id.tEmail);
        TextView rm = findViewById(R.id.tRoom);
        TextView des = findViewById(R.id.tDesc);

        des.setMovementMethod(new ScrollingMovementMethod());


        //teacher object constructors

        TeacherDetails aAguirre= new TeacherDetails();
        aAguirre.setDetails("Ms. Aguirre", "121","aaguirre@glendora.k12.ca.us","  ");
        TeacherDetails lAlva= new TeacherDetails();
        lAlva.setDetails("Ms. Alva", "12","lalva@glendora.k12.ca.us","  ");
        TeacherDetails dAndrecht= new TeacherDetails();
        dAndrecht.setDetails("Mr. Andrecht", "116","dandrecht@glendora.k12.ca.us","Best Buddies Advisor, ASD Teacher, IT Essentials Teacher.");
        TeacherDetails mAshley= new TeacherDetails();
        mAshley.setDetails("Mrs. Ashley", "Counseling Office","mashley@glendora.k12.ca.us","Counselor for students with last names A-Ci");
        TeacherDetails eBanthrum= new TeacherDetails();
        eBanthrum.setDetails("Ms. Banthrum", "230","ebanthrum@glendora.k12.ca.us","  ");
        TeacherDetails jBell= new TeacherDetails();
        jBell.setDetails("Ms. Bell", "114","jbell@glendora.k12.ca.us","  ");
        TeacherDetails lBergslien= new TeacherDetails();
        lBergslien.setDetails("Ms. Bergslien", "330","lbergslien@glendora.k12.ca.us","  ");
        TeacherDetails sBlades= new TeacherDetails();
        sBlades.setDetails("Mr. Blades", "132","sblades@glendora.k12.ca.us","  ");
        TeacherDetails dBrown= new TeacherDetails();
        dBrown.setDetails("Mr. Brown", "17","dbrown@glendora.k12.ca.us","Government Teacher 🇺🇸 Water Polo Official 🤽🏽‍♂️🤽🏽‍♀️");
                TeacherDetails eBondurant= new TeacherDetails();
        eBondurant.setDetails("Mr. Bondurant", "Administration Office","ebondurant@glendora.k12.ca.us","Assistant Principal - Juniors, Special Education, CTE Avid fan of baseball, basketball, football, NASCAR, golf, theater, movies, and every type of music.");
                TeacherDetails cBurgan= new TeacherDetails();
        cBurgan.setDetails("Mr. Burgan", "7","cBurgan@glendora.k12.ca.us","Christopher Burgan was born in San Francisco, California in 1966. He has been blessed to work full time in the creative sector since starting his professional art career as a graphic artist for Jackson/Charvel Guitars in 1984. His work has been seen by millions of people around the world by way of companies and musicians who have utilized his talents. A short list includes: Kiss, Def Leppard, Heart, Journey, the Anaheim Angels, Walt Disney Corporation, IMAX Theaters, and the City of Glendora, California.His deep desire to give back to the communities that have provided so many opportunities for him has led to a fruitful career as an art educator at both the University of La Verne and Glendora High School in the greater Los Angeles area. Concurrent to working as an artist and art educator, Christopher has recorded and performed continuously as a professional guitarist, singer, and songwriter since 1984. In 1989 he began playing lead guitar with GRAMMY nominated \"San Francisco Sound\" groundbreakers We Five. In addition to We Five, he has released numerous CDs as a solo artist under his own name and as a member of The Tannins, and 541 Baseline. He has performed on television and stages around the country as diverse as the Hollywood Bowl to coffee houses. Christopher is a proud member of the Laguna Plein Air Painters Assosciation and the California Art Club.");
                TeacherDetails rCarlos= new TeacherDetails();
        rCarlos.setDetails("Mr. Carlos", "432","rCarlos@glendora.k12.ca.us","  ");
        TeacherDetails dClune= new TeacherDetails();
        dClune.setDetails("Mrs. Clune", "14","dclune@glendora.k12.ca.us","I am Italian, I love to cook and have fun foodie adventures all over this huge county. My family is pretty busy around Glendora, we have 2 active sons and a lazy cat. I love to read, waste time on Pinterest, travel and attend concerts!");
        TeacherDetails dCoak= new TeacherDetails();
        dCoak.setDetails("Ms. Coak", "204","dcoak@glendora.k12.ca.us","  ");
        TeacherDetails jCoats= new TeacherDetails();
        jCoats.setDetails("Mrs. Coats", "325","jcoats@glendora.k12.ca.us","  ");
        TeacherDetails kHuebbe= new TeacherDetails();
        kHuebbe.setDetails("Ms.Huebbe", "124","khuebbe@glendora.k12.ca.us","  ");
        TeacherDetails tCruz= new TeacherDetails();
        tCruz.setDetails("Mr. Cruz", "125","tCruz@glendora.k12.ca.us","CERAMICS AND 3D SCULPTURE BEST BUDDDIES ADVISOR VARSITY ASSISTANT BASEBALL COACH INSTAGRAM @CRUZ4CLAY TWITTER @CRUZ4CLAY “ART FOR ART SAKE” #ARTISEVERYWHERE “YOU CAN RUN ALL YOUR LIFE BUT NOT GO ANYWHERE” VINYL RECORD ADDICT");
        TeacherDetails tDeOrio= new TeacherDetails();
        tDeOrio.setDetails("Ms. DeOrio", "208","tDeOrio@glendora.k12.ca.us","  ");
        TeacherDetails sDiaz= new TeacherDetails();
        sDiaz.setDetails("Mr. Diaz", "Dean’s Office","sdiaz@glendora.k12.ca.us","  ");
        TeacherDetails jDuBransky= new TeacherDetails();
        jDuBransky.setDetails("Ms. DuBransky", "119","jdubransky@glendora.k12.ca.us","I teach Freshman English, Photography, and Journalism.  I love announcing football and basketball games.  I have an awesome 8-year-old son named Jake who loves soccer and baseball, and an adorable 6-year-old daughter who does NOT love soccer and baseball- she loves singing, dancing and crafts.");
        TeacherDetails kDykstra= new TeacherDetails();
        kDykstra.setDetails("Mr. Dykstra", "433","kdykstra@glendora.k12.ca.us","Enjoy Sports, Going to the Lake, Spending time with family and Working around the house! ");
        TeacherDetails pEdward= new TeacherDetails();
        pEdward.setDetails("Ms. Edward", "212","pedward@glendora.k12.ca.us","I have been teaching for many, many years. When I am not in the classroom, lesson planning, or grading papers, I enjoy reading, working out, going to the movies, and spending time with my sons. ");
        TeacherDetails cElder= new TeacherDetails();
        cElder.setDetails("Mrs. Elder", "430","celder@glendora.k12.ca.us","I love musical theater! Acting and singing on stage is my favorite thing to do! I also enjoy quilting, sewing, horseback riding, tennis and golf. My husband, my children and grandchildren are my greatest treasures! ");
        TeacherDetails rElYousef= new TeacherDetails();
        rElYousef.setDetails("Ms. El Yousef", "305","relyousef@glendora.k12.ca.us","I teach AP and Honors Chemistry!  ");
        TeacherDetails dEnsman= new TeacherDetails();
        dEnsman.setDetails("Ms. Ensman", "Dean’s Office","dEnsman@glendora.k12.ca.us","  ");
        TeacherDetails aFallon= new TeacherDetails();
        aFallon.setDetails("Mrs. Fallon", "105","afallon@glendora.k12.ca.us","I've been teaching at GHS for 17 years and I can't imagine my life anywhere else. I love my job; I love this community, and I feel lucky to be a part of it all.");
        TeacherDetails jFeldsher= new TeacherDetails();
        jFeldsher.setDetails("Mr. Feldsher", "411","jFeldsher@glendora.k12.ca.us","  ");
        TeacherDetails eFranssen= new TeacherDetails();
        eFranssen.setDetails("Mrs. Franssen", "421","efranssen@glendora.k12.ca.us","Hobbies: time with family, reading, exercising, baking, and going to the beach Personal: Married to husband Steve for 7 years, 2 sons (Jonah (6) and Levi (3)) Graduated from GHS in 1998 and attended Azusa Pacific University ");
        TeacherDetails cFuentes= new TeacherDetails();
        cFuentes.setDetails("Ms. Fuentes", "220","cfuentes@glendora.k12.ca.us","  ");
        TeacherDetails bGautreau= new TeacherDetails();
        bGautreau.setDetails("Ms. Gautreau", "303/310","bgautreau@glendora.k12.ca.us","  ");
        TeacherDetails reGonzalez= new TeacherDetails();
        reGonzalez.setDetails("Mrs. Gonzalez", "215","regonzalez@glendora.k12.ca.us","  ");
        TeacherDetails ruGonzalez= new TeacherDetails();
        ruGonzalez.setDetails("Mrs. Gonzalez", "420","rugonzalez@glendora.k12.ca.us","¡Hola! I teach Spanish 1 and Spanish 2.");
        TeacherDetails dGranquist= new TeacherDetails();
        dGranquist.setDetails("Mr. Granquist", "410/Lib","dgranquist@glendora.k12.ca.us","  ");
        TeacherDetails dHanrahan= new TeacherDetails();
        dHanrahan.setDetails("Ms. Hanrahan", "445","dHanrahan@glendora.k12.ca.us","  ");
        TeacherDetails jHardgrove= new TeacherDetails();
        jHardgrove.setDetails("Ms. Hardgrove", "234","jhardgrove@glendora.k12.ca.us","AP Art History, AP US History, CP Government ");
        TeacherDetails cHarrison= new TeacherDetails();
        cHarrison.setDetails("Mr. Harrison", "Gym","cHarrison@glendora.k12.ca.us","  ");
        TeacherDetails miHart= new TeacherDetails();
        miHart.setDetails("Mrs. Hart", "303/310","mihart@glendora.k12.ca.us","  ");
        TeacherDetails moHart= new TeacherDetails();
        moHart.setDetails("Ms. Hart", "321","mohart@glendora.k12.ca.us","  ");
        TeacherDetails pHart= new TeacherDetails();
        pHart.setDetails("Mr. Hart", "232","phart@glendora.k12.ca.us","  ");
        TeacherDetails dHenley= new TeacherDetails();
        dHenley.setDetails("Mr. Henley", "133","dHenley@glendora.k12.ca.us","  ");
        TeacherDetails vHernandez= new TeacherDetails();
        vHernandez.setDetails("Ms. Hernandez", "112","vHernandez@glendora.k12.ca.us","  ");
        TeacherDetails kHill= new TeacherDetails();
        kHill.setDetails("Ms. Hill", "130","khill@glendora.k12.ca.us","  ");
        TeacherDetails bHoffmeister= new TeacherDetails();
        bHoffmeister.setDetails("Mrs. Hoffmeister", "213","bHoffmeister@glendora.k12.ca.us","AP Psychology and English Teacher");
        TeacherDetails gHoffmeister= new TeacherDetails();
        gHoffmeister.setDetails("Mr. Hoffmeister", "110","ghoffmeister@glendora.k12.ca.us","  ");
        TeacherDetails kHoolihan= new TeacherDetails();
        kHoolihan.setDetails("Ms. Hoolihan", "224","khoolihan@glendora.k12.ca.us","I love to watch and review movies. I love my doggies");

        TeacherDetails bHuey= new TeacherDetails();
        bHuey.setDetails("Ms. Huey", "CCC","bhuey@glendora.k12.ca.us","  ");
        TeacherDetails sHuss= new TeacherDetails();
        sHuss.setDetails("Ms. Huss", "311","shuss@glendora.k12.ca.us","  ");
        TeacherDetails jIles= new TeacherDetails();
        jIles.setDetails("Mr. Iles", "422","jiles@glendora.k12.ca.us","  ");
        TeacherDetails bIzell= new TeacherDetails();
        bIzell.setDetails("Mr. Izell", "335","bizell@glendora.k12.ca.us","I teach AP Biology and Chemistry");
        TeacherDetails tJohnson= new TeacherDetails();
        tJohnson.setDetails("Mr. Johnson", "211","tjohnson@glendora.k12.ca.us","  ");
        TeacherDetails jJones= new TeacherDetails();
        jJones.setDetails("Ms. Jones", "205","jJones@glendora.k12.ca.us","I have been teaching for 16 years.  I spent 12+ years at the elementary level.  The last 3+ years have been at GHS.  I grew up in Diamond Bar.  I have a BA and an MA from Cal Poly Pomona.  I also have an AA from Fullerton College.  I am currently getting a second MA and credential from Concordia University Irvine. ");
        TeacherDetails aKassotis= new TeacherDetails();
        aKassotis.setDetails("Mrs. Kassotis", "323","akassotis@glendora.k12.ca.us","I am a GHS graduate and a life long resident of Glendora. I am passionate about teaching math and look forward to it's challenges. I care a lot about my students and what goes on in their daily lives. I enjoy spending time with my family, going to the gym and being poolside in my backyard.");
        TeacherDetails dKent= new TeacherDetails();
        dKent.setDetails("Mrs. Kent", "120","dkent@glendora.k12.ca.us","I am a fashion fiend with a flair for technology in my English classroom, where I have been teaching for eight years. It is my goal to promote, encourage, challenge, and inspire accuracy and innovation in both consuming and producing written work. Annotation, intellectual curiosity, hard work, and good characters welcome!");
        TeacherDetails rLawrence= new TeacherDetails();
        rLawrence.setDetails("Mr. Lawrence", "313","rlawrence@glendora.k12.ca.us","Varsity Football Coach");
        TeacherDetails jLiao= new TeacherDetails();
        jLiao.setDetails("Mr. Liao", "425","jliao@glendora.k12.ca.us","Formal Education: B.A. Physics - The University of Chicago M.S. Forensics - The City University of New York Teaching Credential from Azusa Pacific University");
        TeacherDetails pLopez= new TeacherDetails();
        pLopez.setDetails("Mr. Lopez", "Administration Office","plopez@glendora.k12.ca.us"," I love spending time with my wife, kids and Grandkids!  I also like Camping, Golf and spending time at GHS events.");
        TeacherDetails lLozano= new TeacherDetails();
        lLozano.setDetails("Ms. Lozano", "111","llozano@glendora.k12.ca.us","I LOVE: Teaching Spanish, Mexican food, my pets (2 dogs and 2 cats), College football, baseball and music.");
        TeacherDetails lManalo= new TeacherDetails();
        lManalo.setDetails("Ms. Manalo", "8","lmanalo@glendora.k12.ca.us","I'm so happy to have made the move to GHS.  This is my second year here, and I consider myself blessed to be a part of the Tartan family. I love all things art. Photography and graphics are what led me into teaching. Now drawing, painting (traditionally and digitally) as well as working with other mediums, are a part of my practice. I enjoy reading, hiking, swimming, going to museums, traveling and of course, creating art. I'm married with 3 children (2 girls and a boy).  I have two dogs named Copper (a German Shepherd/Lab Mix) and Princess (a Malti-poo).  I completed my undergraduate and graduate studies at Azusa Pacific University.  I have my Masters in Education with an emphasis in Digital Teaching and Learning. Because I love to learn, I decided to go back to school (again), and I am currently  working on my Masters in Fine Art.  My projected graduation date is 2020!  Go Cougars! ");
        TeacherDetails jaMartinez= new TeacherDetails();
        jaMartinez.setDetails("Ms. Martinez", "117","jaMartinez@glendora.k12.ca.us","  ");
        TeacherDetails jeMartinez= new TeacherDetails();
        jeMartinez.setDetails("Ms. Martinez", "226","jeMartinez@glendora.k12.ca.us","  ");
        TeacherDetails dMason= new TeacherDetails();
        dMason.setDetails("Mr. Mason", "423","dmason@glendora.k12.ca.us","  ");
        TeacherDetails iMerrick= new TeacherDetails();
        iMerrick.setDetails("Mr. Merrick", "312","imerrick@glendora.k12.ca.us","I've been teaching Math and AVID at GHS for 5 years.");
        TeacherDetails jMobley= new TeacherDetails();
        jMobley.setDetails("Ms. Mobley", "203","jmobley@glendora.k12.ca.us","  ");

        TeacherDetails jMoltoni= new TeacherDetails();
        jMoltoni.setDetails("Mr. Moltoni", "202","jmoltoni@glendora.k12.ca.us","  ");
        TeacherDetails sMontgomery= new TeacherDetails();
        sMontgomery.setDetails("Mr. Montgomery", "415","smontgomery@glendora.k12.ca.us","  ");
        TeacherDetails gNakata= new TeacherDetails();
        gNakata.setDetails("Mr. Nakata", "214","gnakata@glendora.k12.ca.us","I run half marathons, I am an avid Yelper, and I enjoy composing music!  I will be 60 years old when my son graduates from high school...");
        TeacherDetails mNelson= new TeacherDetails();
        mNelson.setDetails("Mr. Nelson", "11","mnelson@glendora.k12.ca.us","  ");
        TeacherDetails jNorell= new TeacherDetails();
        jNorell.setDetails("Mrs. Norell", "Administration Office","jnorell@glendora.k12.ca.us","I oversee issues dealing with curriculum, instruction and part of testing. I also work with 9th or 10th grade students or parents regarding class placement. Outside of GHS I enjoy spending time with my husband watching our three sons participate in their various activities, attending GHS and UCLA events. I am so privileged to work on such a wonderful campus with amazing students and staff. Go Tartans! ");
        TeacherDetails jONeal= new TeacherDetails();
        jONeal.setDetails("Mr. O’Neal", "412","jO’Neal@glendora.k12.ca.us","  ");
        TeacherDetails aOrosz= new TeacherDetails();
        aOrosz.setDetails("Mrs. Orosz", "CCC","aorosz@glendora.k12.ca.us","I have been a counselor at GHS for almost thirty years. I have two grown children (GHS class of 2013 and 2015), a husband, three dogs, a cat, a turtle and two snakes. Aside from my family, my passions are the GHS community, the outdoors, and the Dodgers.  ");
        TeacherDetails aPazos= new TeacherDetails();
        aPazos.setDetails("Ms. Pazos", "106","apazos@glendora.k12.ca.us","  ");
        TeacherDetails rPerez= new TeacherDetails();
        rPerez.setDetails("Mrs. Perez", "131","rperez@glendora.k12.ca.us","We delight in the beauty of the butterfly, but rarely admit the changes it has gone through to achieve that beauty\" - Maya Angelou. I strive to be the best person I can be and do the utmost to embrace the spirit of lifelong learning. I expect the same from my students, and I am honored when they call me teacher -Robin Perez");
        TeacherDetails lPierce= new TeacherDetails();
        lPierce.setDetails("Mrs. Pierce", "421","lpierce@glendora.k12.ca.us","¡Hola, estudiantes! Me gusta viajar, hacer senderismo, nadar, leer, y hablar español, ¡por supuesto! Tengo cuatro hijos y diez nietos fantásticos. Pero ustedes son mis favoritos (: ");
        TeacherDetails mReigstad= new TeacherDetails();
        mReigstad.setDetails("Ms. Reigstad", "123","mreigstad@glendora.k12.ca.us","  ");
        TeacherDetails lRiihimaki= new TeacherDetails();
        lRiihimaki.setDetails("Mr. Riihimaki", "140","lRiihimaki@glendora.k12.ca.us","Anything outdoors");
        TeacherDetails jRiley= new TeacherDetails();
        jRiley.setDetails("Ms. Riley", "135","jriley@glendora.k12.ca.us","Proud Auntie, USC Trojan Football, Lululemon life ");
        TeacherDetails jRobles= new TeacherDetails();
        jRobles.setDetails("Mr. Robles", "2/09","jrobles@glendora.k12.ca.us","  ");
        TeacherDetails bRohrer= new TeacherDetails();
        bRohrer.setDetails("Mr. Rohrer", "13","brohrer@glendora.k12.ca.us","  ");
        TeacherDetails lRollon= new TeacherDetails();
        lRollon.setDetails("Ms. Rollon", "435","lRollon@glendora.k12.ca.us","  ");
        TeacherDetails aRuiz= new TeacherDetails();
        aRuiz.setDetails("Mr. Ruiz", "Computer Lab","aruiz@glendora.k12.ca.us","  ");
        TeacherDetails kSalle= new TeacherDetails();
        kSalle.setDetails("Mrs. Salle", "CCC","kSalle@glendora.k12.ca.us","  ");
        TeacherDetails sSchwarz= new TeacherDetails();
        sSchwarz.setDetails("Mr. Schwarz", "11","sschwarz@glendora.k12.ca.us","Love music (especially jazz and classical), travel and dining");
        TeacherDetails jShier= new TeacherDetails();
        jShier.setDetails("Ms. Shier", "CCC","jshier@glendora.k12.ca.us","  ");
        TeacherDetails dShires= new TeacherDetails();
        dShires.setDetails("Mr. Shires", "332","dshires@glendora.k12.ca.us","  ");
        TeacherDetails eSmith= new TeacherDetails();
        eSmith.setDetails("Mr. Smith", "221","esmith@glendora.k12.ca.us","A lover of good food, good conversation and travel around the world. A dedicated LA Clippers fan. I announce for the LA Clippers, Los Angeles Chargers and USC Trojans. I trust logical arguments over emotional pleas. I love learning for the sake of knowing and for the widening of my perspective. I am a graduate of Pepperdine University. I am married, have two grown children and one grandson. My wife is the most important person in my life. I have three dogs - they are certifiably nuts, and they are a part of my family. Show me that you care about something - anything, other than yourself. High school is not as important as you think - and only lasts four years. Make the world better by what you do. Finally, what I teach matters to me, as does who I teach. Peace...");
        TeacherDetails lSpengler= new TeacherDetails();
        lSpengler.setDetails("Mr. Spengler", "6","lspengler@glendora.k12.ca.us","Teacher - English 1/2 and English 1/2 H");
        TeacherDetails eStowell= new TeacherDetails();
        eStowell.setDetails("Ms. Stowell", "331","estowell@glendora.k12.ca.us","I grew up in Glendora, and graduated from GHS. After living and teaching in Minnesota for 18 years, I'm happy to be back home. Besides thinking about new and different ways to teach math, I enjoy spending time with my family, traveling, reading listening to and playing music.");
        TeacherDetails jSullivan= new TeacherDetails();
        jSullivan.setDetails("Mr. Sullivan", "431","jsullivan@glendora.k12.ca.us","  ");
        TeacherDetails rSullivan= new TeacherDetails();
        rSullivan.setDetails("Mr. Sullivan", "315","rsullivan@glendora.k12.ca.us","  ");
        TeacherDetails kSummers= new TeacherDetails();
        kSummers.setDetails("Mrs. Summers", "122","ksummers@glendora.k12.ca.us","I enjoy spending time with my husband, our 7 kids, 16 grandkids, and 2 great-grandkids (so far). My favorite book is \"The Book Thief\", favorite movie is \"Life is Beautiful\", favorite singer is Andre Bocelli, favorite group is \"Celtic Thunder\", and ");
        TeacherDetails jTanzillo= new TeacherDetails();
        jTanzillo.setDetails("Mrs. Tanzillo", "Gym","jtanzillo@glendora.k12.ca.us","Mrs. Tanzillo loves her job and her family. She loves crafting, new restaurants and an occasional trip to Nordstrom. ");
        TeacherDetails rTilton= new TeacherDetails();
        rTilton.setDetails("Mr. Tilton", "Dean’s Office","rtilton@glendora.k12.ca.us","Watching GHS events, Tweeting about GHS Athletics, Golf, Watching my girls play basketball");
        TeacherDetails bTrevor= new TeacherDetails();
        bTrevor.setDetails("Mr. Trevor", "10","btevor@glendora.k12.ca.us","  ");
        TeacherDetails sTurner= new TeacherDetails();
        sTurner.setDetails("Mr. Turner", "134","sturner@glendora.k12.ca.us","After graduating from GHS in 1992, Mr. Turner received his English and Business degrees from Azusa Pacific and then is Master's degree from Cal State Fullerton.  He currently teachers English, AVID, and Personal Finance.  He is also the AVID coordinator.  In his spare time he enjoys golf, camping, and spending time with his family, chickens and cat Oscar.");
        TeacherDetails tWall= new TeacherDetails();
        tWall.setDetails("Mr. Wall", "223","twall@glendora.k12.ca.us","After 40 years of electronic and computer systems engineering I have decided to spend the last 10 years before I retire promoting engineering and computer science to high school students.  I like technology, anything that flies, and making things.  I like to do woodworking and wildlife photography if I ever have spare time.  I love to build robots with the robotics club.");
        TeacherDetails lWaters= new TeacherDetails();
        lWaters.setDetails("Mr. Waters", "233","lwaters@glendora.k12.ca.us","Teach, Travel, Save, Repeat.  ");
        TeacherDetails rWhite= new TeacherDetails();
        rWhite.setDetails("Mr. White", "113","rwhite@glendora.k12.ca.us","  ");
        TeacherDetails cLindsay= new TeacherDetails();
        cLindsay.setDetails("Ms. Lindsay", "231","cLindsay@glendora.k12.ca.us","  ");
        TeacherDetails kWilliams= new TeacherDetails();
        kWilliams.setDetails("Mrs. Williams", "309","kwilliams@glendora.k12.ca.us","In-N-Out is one of my favorite places to eat!!!");
        TeacherDetails lWingerd= new TeacherDetails();
        lWingerd.setDetails("Mr. Wingerd", "320","lwingerd@glendora.k12.ca.us","  ");
        TeacherDetails bWinslow= new TeacherDetails();
        bWinslow.setDetails("Mr. Winslow", "210","bwinslow@glendora.k12.ca.us","Hobbies: coaching, hiking, hunting, going to any park w/ my 2 sons");
        TeacherDetails bWooldridge= new TeacherDetails();
        bWooldridge.setDetails("Mrs. Wooldridge", "CCC","bwooldridge@glendora.k12.ca.us","I love reading, traveling, scrapbooking, and watching my kids' games!  Getting to know each of my students and hoping they know my office is a judgment-free zone where they can feel comfortable is important to me.");
        TeacherDetails dZabel= new TeacherDetails();
        dZabel.setDetails("Mr. Zabel", "Gym","dzabel@glendora.k12.ca.us","  ");
        TeacherDetails sBouman= new TeacherDetails();
        sBouman.setDetails("Mr. Bouman", "","sbouman@glendora.k12.ca.us","  ");
        TeacherDetails lFernandez= new TeacherDetails();
        lFernandez.setDetails("Ms. Fernandez", "","lfernandez@glendora.k12.ca.us","  ");
        TeacherDetails tHill= new TeacherDetails();
        tHill.setDetails("Mr. Hill", "","thill@glendora.k12.ca.us","  ");
        TeacherDetails tKhadem= new TeacherDetails();
        tKhadem.setDetails("Ms. Khadem", "","tKhadem@glendora.k12.ca.us","  ");
        TeacherDetails dBink= new TeacherDetails();
        dBink.setDetails("Ms. Bink", "Principal’s Secretary","dbink@glendora.k12.ca.us","  ");
        TeacherDetails cZiliotto= new TeacherDetails();
        cZiliotto.setDetails("Ms. Ziliotto", "Receptionist","cziliotto@glendora.k12.ca.us","  ");
        TeacherDetails cAguilar= new TeacherDetails();
        cAguilar.setDetails("Ms. Aguilar", "Assistant Principal’s Secretary","caguilar@glendora.k12.ca.us","  ");
        TeacherDetails jCrandall= new TeacherDetails();
        jCrandall.setDetails("Ms. Crandall", "Assistant Principal’s Secretary","jcrandall@glendora.k12.ca.us","  ");
        TeacherDetails jOConnell= new TeacherDetails();
        jOConnell.setDetails("Ms. O’Connell", "Assistant Principal’s Secretary","jo’connell@glendora.k12.ca.us","  ");
        TeacherDetails wPearce= new TeacherDetails();
        wPearce.setDetails("Ms. Pearce", "Athletics Secretary","wpearce@glendora.k12.ca.us","  Athletics Secretary.  Spouse John, Daughter Nikole, Son Drew. Lives in Glendora, GHS Alum.  Go Tartans, Go Angels");
        TeacherDetails mNichols= new TeacherDetails();
        mNichols.setDetails("Ms. Nichols", "Attendance Technician","mnichols@glendora.k12.ca.us","  ");
        TeacherDetails lAcuna= new TeacherDetails();
        lAcuna.setDetails("Ms. Acuna", "Attendance Clerk","lacuna@glendora.k12.ca.us","  ");
        TeacherDetails lBedo= new TeacherDetails();
        lBedo.setDetails("Ms. Bedo", "College Career Center Clerk","lbedo@glendora.k12.ca.us","  ");
        TeacherDetails kCruse= new TeacherDetails();
        kCruse.setDetails("Ms. Cruse", "Deans’ Clerk","kcruse@glendora.k12.ca.us","  ");
        TeacherDetails jReichert= new TeacherDetails();
        jReichert.setDetails("Ms. Reichert", "Food Services Manager","jreichert@glendora.k12.ca.us","  ");
        TeacherDetails dKerr= new TeacherDetails();
        dKerr.setDetails("Ms. Kerr", "Head Custodian","dkerr@glendora.k12.ca.us","  ");
        TeacherDetails dMolina= new TeacherDetails();
        dMolina.setDetails("Ms. Molina", "Health Clerk/LVN","dmolina@glendora.k12.ca.us","  ");
        TeacherDetails kSilvestre= new TeacherDetails();
        kSilvestre.setDetails("Ms. Silvestre", "LVN","ksilvestre@glendora.k12.ca.us","  ");
        TeacherDetails kBryant= new TeacherDetails();
        kBryant.setDetails("Ms. Bryant", "Job Placement Specialist [Workability]","kbryant@glendora.k12.ca.us","  ");
        TeacherDetails aJohnson= new TeacherDetails();
        aJohnson.setDetails("Ms. Johnson", "Library Media Technician","ajohnson@glendora.k12.ca.us","  ");
        TeacherDetails nBran= new TeacherDetails();
        nBran.setDetails("Ms. Bran", "Library Media Technician","nbran@glendora.k12.ca.us","  ");
        TeacherDetails jGerber= new TeacherDetails();
        jGerber.setDetails("Ms. Gerber", "Registrar","jgerber@glendora.k12.ca.us","  ");
        TeacherDetails jSummers= new TeacherDetails();
        jSummers.setDetails("Ms. Summers", "Registrar Clerk","jsummers@glendora.k12.ca.us","  ");
        TeacherDetails sMatsudo= new TeacherDetails();
        sMatsudo.setDetails("Mr. Matsudo", "Document Processing Technician","smatsudo@glendora.k12.ca.us","  ");
        TeacherDetails lCastellanos= new TeacherDetails();
        lCastellanos.setDetails("Ms. Castellanos", "Student Body Account Clerk","lcastellanos@glendora.k12.ca.us","  ");
        TeacherDetails gPoillucci= new TeacherDetails();
        gPoillucci.setDetails("Ms. Poillucci", "Testing Technician","cpoillucci@glendora.k12.ca.us","  ");
        TeacherDetails pBrown= new TeacherDetails();
        pBrown.setDetails("Mr. Brown", "235","pbrown@glendora.k12.ca.us","  ");
        TeacherDetails jBrowning= new TeacherDetails();
        jBrowning.setDetails("Mr. Browning", "216","jbrowning@glendora.k12.ca.us","  ");
        TeacherDetails jDunn= new TeacherDetails();
        jDunn.setDetails("Ms. Dunn", "CCC","jdunn@glendora.k12.ca.us","  ");
        TeacherDetails gHamlow= new TeacherDetails();
        gHamlow.setDetails("Mr. Hamlow", "322","ghamlow@glendora.k12.ca.us","  ");
        TeacherDetails kJohnson= new TeacherDetails();
        kJohnson.setDetails("Mr. Johnson", "333","kjohnson@glendora.k12.ca.us","  ");
        TeacherDetails lKirkendall= new TeacherDetails();
        lKirkendall.setDetails("Ms. Kirkendall", "225","lkirkendall@glendora.k12.ca.us","  ");
        TeacherDetails pTrevor= new TeacherDetails();
        pTrevor.setDetails("Ms. Trevor", "6","pTrevor@glendora.k12.ca.us","  ");
        TeacherDetails tTulcan= new TeacherDetails();
        tTulcan.setDetails("Ms. Tulcan", "15","ttulcan@glendora.k12.ca.us","  ");






        //end of teacher constructors

        //checks for null input
        if (extras != null)
            someVariable = extras.getString("name");

        //name.setText(someVariable);
        //name.setText(pHart.getDesc());
        switch(someVariable){ // going forward we should use a get request for this lol
            case "Aguirre, Audra":
                name.setText(aAguirre.getName());
                eml.setText(aAguirre.getEmail());
                rm.setText(aAguirre.getRoom());
                des.setText(aAguirre.getDesc());
                break;
            case "Alva, Laura":
                name.setText(lAlva.getName());
                eml.setText(lAlva.getEmail());
                rm.setText(lAlva.getRoom());
                des.setText(lAlva.getDesc());
                break;
            case "Andrecht, David":
                name.setText(dAndrecht.getName());
                eml.setText(dAndrecht.getEmail());
                rm.setText(dAndrecht.getRoom());
                des.setText(dAndrecht.getDesc());
                break;
            case "Ashley, Michelle":
                name.setText(mAshley.getName());
                eml.setText(mAshley.getEmail());
                rm.setText(mAshley.getRoom());
                des.setText(mAshley.getDesc());
                break;
            case "Banthrum, Erin":
                name.setText(eBanthrum.getName());
                eml.setText(eBanthrum.getEmail());
                rm.setText(eBanthrum.getRoom());
                des.setText(eBanthrum.getDesc());
                break;
            case "Bell, Jennifer":
                name.setText(jBell.getName());
                eml.setText(jBell.getEmail());
                rm.setText(jBell.getRoom());
                des.setText(jBell.getDesc());
                break;
            case "Bergslien, Linda":
                name.setText(lBergslien.getName());
                eml.setText(lBergslien.getEmail());
                rm.setText(lBergslien.getRoom());
                des.setText(lBergslien.getDesc());
                break;
            case "Blades, Steve":
                name.setText(sBlades.getName());
                eml.setText(sBlades.getEmail());
                rm.setText(sBlades.getRoom());
                des.setText(sBlades.getDesc());
                break;
            case "Brown, Dave":
                name.setText(dBrown.getName());
                eml.setText(dBrown.getEmail());
                rm.setText(dBrown.getRoom());
                des.setText(dBrown.getDesc());
                break;
            case "Bondurant, Eric":
                name.setText(eBondurant.getName());
                eml.setText(eBondurant.getEmail());
                rm.setText(eBondurant.getRoom());
                des.setText(eBondurant.getDesc());
                break;
            case "Burgan, Chris":
                name.setText(cBurgan.getName());
                eml.setText(cBurgan.getEmail());
                rm.setText(cBurgan.getRoom());
                des.setText(cBurgan.getDesc());
                break;
            case "Carlos, Ricardo":
                name.setText(rCarlos.getName());
                eml.setText(rCarlos.getEmail());
                rm.setText(rCarlos.getRoom());
                des.setText(rCarlos.getDesc());
                break;
            case "Clune, Debra":
                name.setText(dClune.getName());
                eml.setText(dClune.getEmail());
                rm.setText(dClune.getRoom());
                des.setText(dClune.getDesc());
                break;
            case "Coak, D’Ann":
                name.setText(dCoak.getName());
                eml.setText(dCoak.getEmail());
                rm.setText(dCoak.getRoom());
                des.setText(dCoak.getDesc());
                break;
            case "Coats, Janel":
                name.setText(jCoats.getName());
                eml.setText(jCoats.getEmail());
                rm.setText(jCoats.getRoom());
                des.setText(jCoats.getDesc());
                break;
            case "Huebbe, Kathy":
                name.setText(kHuebbe.getName());
                eml.setText(kHuebbe.getEmail());
                rm.setText(kHuebbe.getRoom());
                des.setText(kHuebbe.getDesc());
                break;
            case "Cruz, Thom":
                name.setText(tCruz.getName());
                eml.setText(tCruz.getEmail());
                rm.setText(tCruz.getRoom());
                des.setText(tCruz.getDesc());
                break;
            case "DeOrio, Tricia":
                name.setText(tDeOrio.getName());
                eml.setText(tDeOrio.getEmail());
                rm.setText(tDeOrio.getRoom());
                des.setText(tDeOrio.getDesc());
                break;
            case "Diaz, Sean":
                name.setText(sDiaz.getName());
                eml.setText(sDiaz.getEmail());
                rm.setText(sDiaz.getRoom());
                des.setText(sDiaz.getDesc());
                break;
            case "DuBransky, Jeff":
                name.setText(jDuBransky.getName());
                eml.setText(jDuBransky.getEmail());
                rm.setText(jDuBransky.getRoom());
                des.setText(jDuBransky.getDesc());
                break;
            case "Dykstra, Kurt":
                name.setText(kDykstra.getName());
                eml.setText(kDykstra.getEmail());
                rm.setText(kDykstra.getRoom());
                des.setText(kDykstra.getDesc());
                break;
            case "Edward, Pam":
                name.setText(pEdward.getName());
                eml.setText(pEdward.getEmail());
                rm.setText(pEdward.getRoom());
                des.setText(pEdward.getDesc());
                break;
            case "Elder, Candace":
                name.setText(cElder.getName());
                eml.setText(cElder.getEmail());
                rm.setText(cElder.getRoom());
                des.setText(cElder.getDesc());
                break;
            case "El Yousef, Rana":
                name.setText(rElYousef.getName());
                eml.setText(rElYousef.getEmail());
                rm.setText(rElYousef.getRoom());
                des.setText(rElYousef.getDesc());
                break;
            case "Ensman, Diana":
                name.setText(dEnsman.getName());
                eml.setText(dEnsman.getEmail());
                rm.setText(dEnsman.getRoom());
                des.setText(dEnsman.getDesc());
                break;
            case "Fallon, Ashley":
                name.setText(aFallon.getName());
                eml.setText(aFallon.getEmail());
                rm.setText(aFallon.getRoom());
                des.setText(aFallon.getDesc());
                break;
            case "Feldsher, Joshua":
                name.setText(jFeldsher.getName());
                eml.setText(jFeldsher.getEmail());
                rm.setText(jFeldsher.getRoom());
                des.setText(jFeldsher.getDesc());
                break;
            case "Franssen, Erin":
                name.setText(eFranssen.getName());
                eml.setText(eFranssen.getEmail());
                rm.setText(eFranssen.getRoom());
                des.setText(eFranssen.getDesc());
                break;
            case "Fuentes, Connie":
                name.setText(cFuentes.getName());
                eml.setText(cFuentes.getEmail());
                rm.setText(cFuentes.getRoom());
                des.setText(cFuentes.getDesc());
                break;
            case "Gautreau, Barbara":
                name.setText(bGautreau.getName());
                eml.setText(bGautreau.getEmail());
                rm.setText(bGautreau.getRoom());
                des.setText(bGautreau.getDesc());
                break;
            case "Gonzalez, Rene":
                name.setText(reGonzalez.getName());
                eml.setText(reGonzalez.getEmail());
                rm.setText(reGonzalez.getRoom());
                des.setText(reGonzalez.getDesc());
                break;
            case "Gonzalez, Ruth":
                name.setText(ruGonzalez.getName());
                eml.setText(ruGonzalez.getEmail());
                rm.setText(ruGonzalez.getRoom());
                des.setText(ruGonzalez.getDesc());
                break;
            case "Granquist, Doug":
                name.setText(dGranquist.getName());
                eml.setText(dGranquist.getEmail());
                rm.setText(dGranquist.getRoom());
                des.setText(dGranquist.getDesc());
                break;
            case "Hanrahan, Desmond":
                name.setText(dHanrahan.getName());
                eml.setText(dHanrahan.getEmail());
                rm.setText(dHanrahan.getRoom());
                des.setText(dHanrahan.getDesc());
                break;
            case "Hardgrove, Julianna":
                name.setText(jHardgrove.getName());
                eml.setText(jHardgrove.getEmail());
                rm.setText(jHardgrove.getRoom());
                des.setText(jHardgrove.getDesc());
                break;
            case "Harrison, Chris":
                name.setText(cHarrison.getName());
                eml.setText(cHarrison.getEmail());
                rm.setText(cHarrison.getRoom());
                des.setText(cHarrison.getDesc());
                break;
            case "Hart, Mindi":
                name.setText(miHart.getName());
                eml.setText(miHart.getEmail());
                rm.setText(miHart.getRoom());
                des.setText(miHart.getDesc());
                break;
            case "Hart, Monique":
                name.setText(moHart.getName());
                eml.setText(moHart.getEmail());
                rm.setText(moHart.getRoom());
                des.setText(moHart.getDesc());
                break;
            case "Hart, Pat":
                name.setText(pHart.getName());
                eml.setText(pHart.getEmail());
                rm.setText(pHart.getRoom());
                des.setText(pHart.getDesc());
                break;
            case "Henley, Dan":
                name.setText(dHenley.getName());
                eml.setText(dHenley.getEmail());
                rm.setText(dHenley.getRoom());
                des.setText(dHenley.getDesc());
                break;
            case "Hernandez, Vanessa":
                name.setText(vHernandez.getName());
                eml.setText(vHernandez.getEmail());
                rm.setText(vHernandez.getRoom());
                des.setText(vHernandez.getDesc());
                break;
            case "Hill, Kiese":
                name.setText(kHill.getName());
                eml.setText(kHill.getEmail());
                rm.setText(kHill.getRoom());
                des.setText(kHill.getDesc());
                break;
            case "Hoffmeister, Brenda":
                name.setText(bHoffmeister.getName());
                eml.setText(bHoffmeister.getEmail());
                rm.setText(bHoffmeister.getRoom());
                des.setText(bHoffmeister.getDesc());
                break;
            case "Hoffmeister, George":
                name.setText(gHoffmeister.getName());
                eml.setText(gHoffmeister.getEmail());
                rm.setText(gHoffmeister.getRoom());
                des.setText(gHoffmeister.getDesc());
                break;
            case "Hoolihan, Kelley":
                name.setText(kHoolihan.getName());
                eml.setText(kHoolihan.getEmail());
                rm.setText(kHoolihan.getRoom());
                des.setText(kHoolihan.getDesc());
                break;
            case "Huey, Brooke":
                name.setText(bHuey.getName());
                eml.setText(bHuey.getEmail());
                rm.setText(bHuey.getRoom());
                des.setText(bHuey.getDesc());
                break;
            case "Huss, Shawnee":
                name.setText(sHuss.getName());
                eml.setText(sHuss.getEmail());
                rm.setText(sHuss.getRoom());
                des.setText(sHuss.getDesc());
                break;
            case "Iles, James":
                name.setText(jIles.getName());
                eml.setText(jIles.getEmail());
                rm.setText(jIles.getRoom());
                des.setText(jIles.getDesc());
                break;
            case "Izell, Bobbie":
                name.setText(bIzell.getName());
                eml.setText(bIzell.getEmail());
                rm.setText(bIzell.getRoom());
                des.setText(bIzell.getDesc());
                break;
            case "Johnson, Tom":
                name.setText(tJohnson.getName());
                eml.setText(tJohnson.getEmail());
                rm.setText(tJohnson.getRoom());
                des.setText(tJohnson.getDesc());
                break;
            case "Jones, Jennifer":
                name.setText(jJones.getName());
                eml.setText(jJones.getEmail());
                rm.setText(jJones.getRoom());
                des.setText(jJones.getDesc());
                break;
            case "Kassotis, Amy":
                name.setText(aKassotis.getName());
                eml.setText(aKassotis.getEmail());
                rm.setText(aKassotis.getRoom());
                des.setText(aKassotis.getDesc());
                break;
            case "Kent, Dani":
                name.setText(dKent.getName());
                eml.setText(dKent.getEmail());
                rm.setText(dKent.getRoom());
                des.setText(dKent.getDesc());
                break;
            case "Lawrence, Ryan":
                name.setText(rLawrence.getName());
                eml.setText(rLawrence.getEmail());
                rm.setText(rLawrence.getRoom());
                des.setText(rLawrence.getDesc());
                break;
            case "Liao, Jimmy":
                name.setText(jLiao.getName());
                eml.setText(jLiao.getEmail());
                rm.setText(jLiao.getRoom());
                des.setText(jLiao.getDesc());
                break;
            case "Lopez, Paul":
                name.setText(pLopez.getName());
                eml.setText(pLopez.getEmail());
                rm.setText(pLopez.getRoom());
                des.setText(pLopez.getDesc());
                break;
            case "Lozano, Luz":
                name.setText(lLozano.getName());
                eml.setText(lLozano.getEmail());
                rm.setText(lLozano.getRoom());
                des.setText(lLozano.getDesc());
                break;
            case "Manalo, Lucy":
                name.setText(lManalo.getName());
                eml.setText(lManalo.getEmail());
                rm.setText(lManalo.getRoom());
                des.setText(lManalo.getDesc());
                break;
            case "Martinez, Janie":
                name.setText(jaMartinez.getName());
                eml.setText(jaMartinez.getEmail());
                rm.setText(jaMartinez.getRoom());
                des.setText(jaMartinez.getDesc());
                break;
            case "Martinez, Jennifer":
                name.setText(jeMartinez.getName());
                eml.setText(jeMartinez.getEmail());
                rm.setText(jeMartinez.getRoom());
                des.setText(jeMartinez.getDesc());
                break;
            case "Mason, Dillon":
                name.setText(dMason.getName());
                eml.setText(dMason.getEmail());
                rm.setText(dMason.getRoom());
                des.setText(dMason.getDesc());
                break;
            case "Merrick, Ian":
                name.setText(iMerrick.getName());
                eml.setText(iMerrick.getEmail());
                rm.setText(iMerrick.getRoom());
                des.setText(iMerrick.getDesc());
                break;
            case "Mobley, Janet":
                name.setText(jMobley.getName());
                eml.setText(jMobley.getEmail());
                rm.setText(jMobley.getRoom());
                des.setText(jMobley.getDesc());
                break;
            case "Moltoni, Johnathan":
                name.setText(jMoltoni.getName());
                eml.setText(jMoltoni.getEmail());
                rm.setText(jMoltoni.getRoom());
                des.setText(jMoltoni.getDesc());
                break;
            case "Montgomery, Steve":
                name.setText(sMontgomery.getName());
                eml.setText(sMontgomery.getEmail());
                rm.setText(sMontgomery.getRoom());
                des.setText(sMontgomery.getDesc());
                break;
            case "Nakata, Greg":
                name.setText(gNakata.getName());
                eml.setText(gNakata.getEmail());
                rm.setText(gNakata.getRoom());
                des.setText(gNakata.getDesc());
                break;
            case "Nelson, Michael":
                name.setText(mNelson.getName());
                eml.setText(mNelson.getEmail());
                rm.setText(mNelson.getRoom());
                des.setText(mNelson.getDesc());
                break;
            case "Norell, Jamie":
                name.setText(jNorell.getName());
                eml.setText(jNorell.getEmail());
                rm.setText(jNorell.getRoom());
                des.setText(jNorell.getDesc());
                break;
            case "O’Neal, Jason":
                name.setText(jONeal.getName());
                eml.setText(jONeal.getEmail());
                rm.setText(jONeal.getRoom());
                des.setText(jONeal.getDesc());
                break;
            case "Orosz, Ann":
                name.setText(aOrosz.getName());
                eml.setText(aOrosz.getEmail());
                rm.setText(aOrosz.getRoom());
                des.setText(aOrosz.getDesc());
                break;
            case "Pazos, Amy":
                name.setText(aPazos.getName());
                eml.setText(aPazos.getEmail());
                rm.setText(aPazos.getRoom());
                des.setText(aPazos.getDesc());
                break;
            case "Perez, Robin":
                name.setText(rPerez.getName());
                eml.setText(rPerez.getEmail());
                rm.setText(rPerez.getRoom());
                des.setText(rPerez.getDesc());
                break;
            case "Pierce, Laura":
                name.setText(lPierce.getName());
                eml.setText(lPierce.getEmail());
                rm.setText(lPierce.getRoom());
                des.setText(lPierce.getDesc());
                break;
            case "Reigstad, Michelle":
                name.setText(mReigstad.getName());
                eml.setText(mReigstad.getEmail());
                rm.setText(mReigstad.getRoom());
                des.setText(mReigstad.getDesc());
                break;
            case "Riihimaki, Lor":
                name.setText(lRiihimaki.getName());
                eml.setText(lRiihimaki.getEmail());
                rm.setText(lRiihimaki.getRoom());
                des.setText(lRiihimaki.getDesc());
                break;
            case "Riley, Jennifer":
                name.setText(jRiley.getName());
                eml.setText(jRiley.getEmail());
                rm.setText(jRiley.getRoom());
                des.setText(jRiley.getDesc());
                break;
            case "Robles, Jashua":
                name.setText(jRobles.getName());
                eml.setText(jRobles.getEmail());
                rm.setText(jRobles.getRoom());
                des.setText(jRobles.getDesc());
                break;
            case "Rohrer, Brandon":
                name.setText(bRohrer.getName());
                eml.setText(bRohrer.getEmail());
                rm.setText(bRohrer.getRoom());
                des.setText(bRohrer.getDesc());
                break;
            case "Rollon, Laura":
                name.setText(lRollon.getName());
                eml.setText(lRollon.getEmail());
                rm.setText(lRollon.getRoom());
                des.setText(lRollon.getDesc());
                break;
            case "Ruiz, Aaron":
                name.setText(aRuiz.getName());
                eml.setText(aRuiz.getEmail());
                rm.setText(aRuiz.getRoom());
                des.setText(aRuiz.getDesc());
                break;
            case "Salle, Kathy":
                name.setText(kSalle.getName());
                eml.setText(kSalle.getEmail());
                rm.setText(kSalle.getRoom());
                des.setText(kSalle.getDesc());
                break;
            case "Schwarz, Scott":
                name.setText(sSchwarz.getName());
                eml.setText(sSchwarz.getEmail());
                rm.setText(sSchwarz.getRoom());
                des.setText(sSchwarz.getDesc());
                break;
            case "Shier, Julie":
                name.setText(jShier.getName());
                eml.setText(jShier.getEmail());
                rm.setText(jShier.getRoom());
                des.setText(jShier.getDesc());
                break;
            case "Shires, Deric":
                name.setText(dShires.getName());
                eml.setText(dShires.getEmail());
                rm.setText(dShires.getRoom());
                des.setText(dShires.getDesc());
                break;
            case "Smith, Eric":
                name.setText(eSmith.getName());
                eml.setText(eSmith.getEmail());
                rm.setText(eSmith.getRoom());
                des.setText(eSmith.getDesc());
                break;
            case "Spengler, Lee":
                name.setText(lSpengler.getName());
                eml.setText(lSpengler.getEmail());
                rm.setText(lSpengler.getRoom());
                des.setText(lSpengler.getDesc());
                break;
            case "Stowell, Erin":
                name.setText(eStowell.getName());
                eml.setText(eStowell.getEmail());
                rm.setText(eStowell.getRoom());
                des.setText(eStowell.getDesc());
                break;
            case "Sullivan, John":
                name.setText(jSullivan.getName());
                eml.setText(jSullivan.getEmail());
                rm.setText(jSullivan.getRoom());
                des.setText(jSullivan.getDesc());
                break;
            case "Sullivan, Reid":
                name.setText(rSullivan.getName());
                eml.setText(rSullivan.getEmail());
                rm.setText(rSullivan.getRoom());
                des.setText(rSullivan.getDesc());
                break;
            case "Summers, Kathy":
                name.setText(kSummers.getName());
                eml.setText(kSummers.getEmail());
                rm.setText(kSummers.getRoom());
                des.setText(kSummers.getDesc());
                break;
            case "Tanzillo, Jen":
                name.setText(jTanzillo.getName());
                eml.setText(jTanzillo.getEmail());
                rm.setText(jTanzillo.getRoom());
                des.setText(jTanzillo.getDesc());
                break;
            case "Tilton, Rod":
                name.setText(rTilton.getName());
                eml.setText(rTilton.getEmail());
                rm.setText(rTilton.getRoom());
                des.setText(rTilton.getDesc());
                break;
            case "Trevor, Brian":
                name.setText(bTrevor.getName());
                eml.setText(bTrevor.getEmail());
                rm.setText(bTrevor.getRoom());
                des.setText(bTrevor.getDesc());
                break;
            case "Turner, Scott":
                name.setText(sTurner.getName());
                eml.setText(sTurner.getEmail());
                rm.setText(sTurner.getRoom());
                des.setText(sTurner.getDesc());
                break;
            case "Wall, Terry":
                name.setText(tWall.getName());
                eml.setText(tWall.getEmail());
                rm.setText(tWall.getRoom());
                des.setText(tWall.getDesc());
                break;
            case "Waters, Luke":
                name.setText(lWaters.getName());
                eml.setText(lWaters.getEmail());
                rm.setText(lWaters.getRoom());
                des.setText(lWaters.getDesc());
                break;
            case "White, Rik":
                name.setText(rWhite.getName());
                eml.setText(rWhite.getEmail());
                rm.setText(rWhite.getRoom());
                des.setText(rWhite.getDesc());
                break;
            case "Lindsay, Christie":
                name.setText(cLindsay.getName());
                eml.setText(cLindsay.getEmail());
                rm.setText(cLindsay.getRoom());
                des.setText(cLindsay.getDesc());
                break;
            case "Williams, Kim":
                name.setText(kWilliams.getName());
                eml.setText(kWilliams.getEmail());
                rm.setText(kWilliams.getRoom());
                des.setText(kWilliams.getDesc());
                break;
            case "Wingerd, Loren":
                name.setText(lWingerd.getName());
                eml.setText(lWingerd.getEmail());
                rm.setText(lWingerd.getRoom());
                des.setText(lWingerd.getDesc());
                break;
            case "Winslow, Ben":
                name.setText(bWinslow.getName());
                eml.setText(bWinslow.getEmail());
                rm.setText(bWinslow.getRoom());
                des.setText(bWinslow.getDesc());
                break;
            case "Wooldridge, Brittany":
                name.setText(bWooldridge.getName());
                eml.setText(bWooldridge.getEmail());
                rm.setText(bWooldridge.getRoom());
                des.setText(bWooldridge.getDesc());
                break;
            case "Zabel, Darin":
                name.setText(dZabel.getName());
                eml.setText(dZabel.getEmail());
                rm.setText(dZabel.getRoom());
                des.setText(dZabel.getDesc());
                break;
            case "Bouman, Sam":
                name.setText(sBouman.getName());
                eml.setText(sBouman.getEmail());
                rm.setText(sBouman.getRoom());
                des.setText(sBouman.getDesc());
                break;
            case "Fernandez, Lucia":
                name.setText(lFernandez.getName());
                eml.setText(lFernandez.getEmail());
                rm.setText(lFernandez.getRoom());
                des.setText(lFernandez.getDesc());
                break;
            case "Hill, Todd":
                name.setText(tHill.getName());
                eml.setText(tHill.getEmail());
                rm.setText(tHill.getRoom());
                des.setText(tHill.getDesc());
                break;
            case "Khadem, Tanyia":
                name.setText(tKhadem.getName());
                eml.setText(tKhadem.getEmail());
                rm.setText(tKhadem.getRoom());
                des.setText(tKhadem.getDesc());
                break;
            case "Bink, Dagmar ":
                name.setText(dBink.getName());
                eml.setText(dBink.getEmail());
                rm.setText(dBink.getRoom());
                des.setText(dBink.getDesc());
                break;
            case "Ziliotto, Cynthia":
                name.setText(cZiliotto.getName());
                eml.setText(cZiliotto.getEmail());
                rm.setText(cZiliotto.getRoom());
                des.setText(cZiliotto.getDesc());
                break;
            case "Aguilar, Corina":
                name.setText(cAguilar.getName());
                eml.setText(cAguilar.getEmail());
                rm.setText(cAguilar.getRoom());
                des.setText(cAguilar.getDesc());
                break;
            case "Crandall, Jodi":
                name.setText(jCrandall.getName());
                eml.setText(jCrandall.getEmail());
                rm.setText(jCrandall.getRoom());
                des.setText(jCrandall.getDesc());
                break;
            case "O’Connell, Joanne":
                name.setText(jOConnell.getName());
                eml.setText(jOConnell.getEmail());
                rm.setText(jOConnell.getRoom());
                des.setText(jOConnell.getDesc());
                break;
            case "Pearce, Winnie":
                name.setText(wPearce.getName());
                eml.setText(wPearce.getEmail());
                rm.setText(wPearce.getRoom());
                des.setText(wPearce.getDesc());
                break;
            case "Nichols, Marianne":
                name.setText(mNichols.getName());
                eml.setText(mNichols.getEmail());
                rm.setText(mNichols.getRoom());
                des.setText(mNichols.getDesc());
                break;
            case "Acuna, Lorena":
                name.setText(lAcuna.getName());
                eml.setText(lAcuna.getEmail());
                rm.setText(lAcuna.getRoom());
                des.setText(lAcuna.getDesc());
                break;
            case "Bedo, Laurie":
                name.setText(lBedo.getName());
                eml.setText(lBedo.getEmail());
                rm.setText(lBedo.getRoom());
                des.setText(lBedo.getDesc());
                break;
            case "Cruse, Kim":
                name.setText(kCruse.getName());
                eml.setText(kCruse.getEmail());
                rm.setText(kCruse.getRoom());
                des.setText(kCruse.getDesc());
                break;
            case "Reichert, Joy":
                name.setText(jReichert.getName());
                eml.setText(jReichert.getEmail());
                rm.setText(jReichert.getRoom());
                des.setText(jReichert.getDesc());
                break;
            case "Kerr, Dion":
                name.setText(dKerr.getName());
                eml.setText(dKerr.getEmail());
                rm.setText(dKerr.getRoom());
                des.setText(dKerr.getDesc());
                break;
            case "Molina, Danielle":
                name.setText(dMolina.getName());
                eml.setText(dMolina.getEmail());
                rm.setText(dMolina.getRoom());
                des.setText(dMolina.getDesc());
                break;
            case "Silvestre, Kellie":
                name.setText(kSilvestre.getName());
                eml.setText(kSilvestre.getEmail());
                rm.setText(kSilvestre.getRoom());
                des.setText(kSilvestre.getDesc());
                break;
            case "Bryant, Katie":
                name.setText(kBryant.getName());
                eml.setText(kBryant.getEmail());
                rm.setText(kBryant.getRoom());
                des.setText(kBryant.getDesc());
                break;
            case "Johnson, Amy":
                name.setText(aJohnson.getName());
                eml.setText(aJohnson.getEmail());
                rm.setText(aJohnson.getRoom());
                des.setText(aJohnson.getDesc());
                break;
            case "Bran, Norma":
                name.setText(nBran.getName());
                eml.setText(nBran.getEmail());
                rm.setText(nBran.getRoom());
                des.setText(nBran.getDesc());
                break;
            case "Gerber, Julie":
                name.setText(jGerber.getName());
                eml.setText(jGerber.getEmail());
                rm.setText(jGerber.getRoom());
                des.setText(jGerber.getDesc());
                break;
            case "Summers, Janette":
                name.setText(jSummers.getName());
                eml.setText(jSummers.getEmail());
                rm.setText(jSummers.getRoom());
                des.setText(jSummers.getDesc());
                break;
            case "Matsudo, Stuart":
                name.setText(sMatsudo.getName());
                eml.setText(sMatsudo.getEmail());
                rm.setText(sMatsudo.getRoom());
                des.setText(sMatsudo.getDesc());
                break;
            case "Castellanos, Lisa":
                name.setText(lCastellanos.getName());
                eml.setText(lCastellanos.getEmail());
                rm.setText(lCastellanos.getRoom());
                des.setText(lCastellanos.getDesc());
                break;
            case "Poillucci, Gina":
                name.setText(gPoillucci.getName());
                eml.setText(gPoillucci.getEmail());
                rm.setText(gPoillucci.getRoom());
                des.setText(gPoillucci.getDesc());
                break;
            case "Brown, Paul":
                name.setText(pBrown.getName());
                eml.setText(pBrown.getEmail());
                rm.setText(pBrown.getRoom());
                des.setText(pBrown.getDesc());
                break;
            case "Browning, Jason":
                name.setText(jBrowning.getName());
                eml.setText(jBrowning.getEmail());
                rm.setText(jBrowning.getRoom());
                des.setText(jBrowning.getDesc());
                break;
            case "Dunn, Joy":
                name.setText(jDunn.getName());
                eml.setText(jDunn.getEmail());
                rm.setText(jDunn.getRoom());
                des.setText(jDunn.getDesc());
                break;
            case "Hamlow, Gordon":
                name.setText(gHamlow.getName());
                eml.setText(gHamlow.getEmail());
                rm.setText(gHamlow.getRoom());
                des.setText(gHamlow.getDesc());
                break;
            case "Johnson, Kyle":
                name.setText(kJohnson.getName());
                eml.setText(kJohnson.getEmail());
                rm.setText(kJohnson.getRoom());
                des.setText(kJohnson.getDesc());
                break;
            case "Kirkendall, Lauren":
                name.setText(lKirkendall.getName());
                eml.setText(lKirkendall.getEmail());
                rm.setText(lKirkendall.getRoom());
                des.setText(lKirkendall.getDesc());
                break;
            case "Trevor, Patty":
                name.setText(pTrevor.getName());
                eml.setText(pTrevor.getEmail());
                rm.setText(pTrevor.getRoom());
                des.setText(pTrevor.getDesc());
                break;
            case "Tulcan, Teresa":
                name.setText(tTulcan.getName());
                eml.setText(tTulcan.getEmail());
                rm.setText(tTulcan.getRoom());
                des.setText(tTulcan.getDesc());
                break;


            default:
                    name.setText("Error");
                    break;

        }

        //textview

        //back button


        //theme


    }
}
