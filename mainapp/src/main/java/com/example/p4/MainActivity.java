package com.example.p4;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import com.google.android.material.navigation.NavigationView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import java.util.Calendar;
import static android.graphics.Color.GRAY;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    //シラバスのURL
    String kousenStr = "http://www.asahikawa-nct.ac.jp/class/syllabus/";
    //Google classroomのURL
    String googleclassroomStr = "https://classroom.google.com/u/0/h";
    //MoodleのURL
    String MoodleStr = "http://202.231.11.77/~cai/moodle/my";
    //String MoodleStr = "http://202.231.11.77/~cai/moodle/login/index.php";
    //英語e-LearningのURL
    String ALCStr = "http://nac02.asahikawa-nct.ac.jp/anet2/";
    String c1, c1_1, c1_2, c1_3, c1_4, c1_5, c1_6, c1_7, c2, c2_1, c2_2, c2_3, c2_4, c2_5, c2_6, c2_7, c3, c3_1, c3_2, c3_3, c3_4, c3_5, c3_6, c3_7,
            c4, c4_1, c4_2, c4_3, c4_4, c4_5, c4_6, c4_7, c5, c5_1, c5_2, c5_3, c5_4, c5_5, c5_6, c5_7;
    static final int TIME_1=100,TIME_1_1=110,TIME_1_2=120,TIME_1_3=130,TIME_1_4=140,TIME_1_5=150,TIME_1_6=160,TIME_1_7=170;
    static final int TIME_2=200,TIME_2_1=210,TIME_2_2=220,TIME_2_3=230,TIME_2_4=900,TIME_2_5=250,TIME_2_6=260,TIME_2_7=270;
    static final int TIME_3=300,TIME_3_1=310,TIME_3_2=320,TIME_3_3=330,TIME_3_4=340,TIME_3_5=350,TIME_3_6=360,TIME_3_7=370;
    static final int TIME_4=400,TIME_4_1=410,TIME_4_2=420,TIME_4_3=430,TIME_4_4=440,TIME_4_5=450,TIME_4_6=460,TIME_4_7=470;
    static final int TIME_5=500,TIME_5_1=510,TIME_5_2=520,TIME_5_3=530,TIME_5_4=540,TIME_5_5=550,TIME_5_6=560,TIME_5_7=570;
    Button button1_0,button1_1,button1_2,button1_3,button1_4,button1_5,button1_6,button1_7;
    Button button2_0,button2_1,button2_2,button2_3,button2_4,button2_5,button2_6,button2_7;
    Button button3_0,button3_1,button3_2,button3_3,button3_4,button3_5,button3_6,button3_7;
    Button button4_0,button4_1,button4_2,button4_3,button4_4,button4_5,button4_6,button4_7;
    Button button5_0,button5_1,button5_2,button5_3,button5_4,button5_5,button5_6,button5_7;
    Button textview1,textview2,textview3,textview4,textview5;
    LinearLayout line_0,line_1,line_2,line_3,line_4,line_5;//パーツを縦か横に並べるレイアウト
    LinearLayout line_0_1,line_0_2,line_0_3,line_0_4,line_0_5;
    LinearLayout.LayoutParams T1,T2,T3,T4,T5,T6,T7,T8,T0;
    Calendar cal=Calendar.getInstance();
    int week=cal.get(Calendar.DAY_OF_WEEK);
    SharedPreferences share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        line_0 = findViewById(R.id.line1);
        line_1 = findViewById(R.id.line2);
        line_2 = findViewById(R.id.line3);
        line_3 = findViewById(R.id.line4);
        line_4 = findViewById(R.id.line5);
        line_5 = findViewById(R.id.line6);
        line_0_1 = findViewById(R.id.line2);
        line_0_2 = findViewById(R.id.line3);
        line_0_3 = findViewById(R.id.line4);
        line_0_4 = findViewById(R.id.line5);
        line_0_5 = findViewById(R.id.line6);
        //マスの大きさ0
        T1 = new LinearLayout.LayoutParams(0, 0);
        //マスの大きさ2
        T2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 2);
        //マスの大きさ3
        T3 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 3);
        //マスの大きさ4
        T4 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 4);
        //マスの大きさ5
        T5 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 5);
        //マスの大きさ6
        T6 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 6);
        //マスの大きさ7
        T7 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 7);
        //マスの大きさ8
        T8 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 8);
        //マスの大きさ1
        T0 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 1);
        textview1 = findViewById(R.id.textView9);
        textview2 = findViewById(R.id.textView10);
        textview3 = findViewById(R.id.textView11);
        textview4 = findViewById(R.id.textView12);
        textview5 = findViewById(R.id.textView13);
        //曜日ごとの表示変更
        switch (week) {
            //月曜日
            case Calendar.MONDAY:
                textview1.setBackgroundColor(GRAY);
                break;
            //火曜日
            case Calendar.TUESDAY:
                textview2.setBackgroundColor(GRAY);
                break;
            //水曜日
            case Calendar.WEDNESDAY:
                textview3.setBackgroundColor(GRAY);
                break;
             //木曜日
            case Calendar.THURSDAY:
                textview4.setBackgroundColor(GRAY);
                break;
            //金曜日
            case Calendar.FRIDAY:
                textview5.setBackgroundColor(GRAY);
                break;
            case Calendar.SATURDAY:
                break;
            case Calendar.SUNDAY:
                break;
        }

        button1_0 = findViewById(R.id.button1);//xmlファイルでボタンに割り当てられたIDを代入している
        button1_1 = findViewById(R.id.button1_1);
        button1_2 = findViewById(R.id.button1_2);
        button1_3 = findViewById(R.id.button1_3);
        button1_4 = findViewById(R.id.button1_4);
        button1_5 = findViewById(R.id.button1_5);
        button1_6 = findViewById(R.id.button1_6);
        button1_7 = findViewById(R.id.button1_7);
        button2_0 = findViewById(R.id.button2);
        button2_1 = findViewById(R.id.button2_1);
        button2_2 = findViewById(R.id.button2_2);
        button2_3 = findViewById(R.id.button2_3);
        button2_4 = findViewById(R.id.button2_4);
        button2_5 = findViewById(R.id.button2_5);
        button2_6 = findViewById(R.id.button2_6);
        button2_7 = findViewById(R.id.button2_7);
        button3_0 = findViewById(R.id.button3);
        button3_1 = findViewById(R.id.button3_1);
        button3_2 = findViewById(R.id.button3_2);
        button3_3 = findViewById(R.id.button3_3);
        button3_4 = findViewById(R.id.button3_4);
        button3_5 = findViewById(R.id.button3_5);
        button3_6 = findViewById(R.id.button3_6);
        button3_7 = findViewById(R.id.button3_7);
        button4_0 = findViewById(R.id.button4);
        button4_1 = findViewById(R.id.button4_1);
        button4_2 = findViewById(R.id.button4_2);
        button4_3 = findViewById(R.id.button4_3);
        button4_4 = findViewById(R.id.button4_4);
        button4_5 = findViewById(R.id.button4_5);
        button4_6 = findViewById(R.id.button4_6);
        button4_7 = findViewById(R.id.button4_7);
        button5_0 = findViewById(R.id.button5);
        button5_1 = findViewById(R.id.button5_1);
        button5_2 = findViewById(R.id.button5_2);
        button5_3 = findViewById(R.id.button5_3);
        button5_4 = findViewById(R.id.button5_4);
        button5_5 = findViewById(R.id.button5_5);
        button5_6 = findViewById(R.id.button5_6);
        button5_7 = findViewById(R.id.button5_7);
        share = PreferenceManager.getDefaultSharedPreferences(this);
        //アプリ起動時に前回の学習支援サイトのURLを受け取る（CheckBoxで指定したもの）
        c1 = share.getString("uri1", "");
        c1_1 = share.getString("uri1_1", "");
        c1_2 = share.getString("uri1_2", "");
        c1_3 = share.getString("uri1_3", "");
        c1_4 = share.getString("uri1_4", "");
        c1_5 = share.getString("uri1_5", "");
        c1_6 = share.getString("uri1_6", "");
        c1_7 = share.getString("uri1_7", "");
        c2 = share.getString("uri2", "");
        c2_1 = share.getString("uri2_1", "");
        c2_2 = share.getString("uri2_2", "");
        c2_3 = share.getString("uri2_3", "");
        c2_4 = share.getString("uri2_4", "");
        c2_5 = share.getString("uri2_5", "");
        c2_6 = share.getString("uri2_6", "");
        c2_7 = share.getString("uri2_7", "");
        c3 = share.getString("uri3", "");
        c3_1 = share.getString("uri3_1", "");
        c3_2 = share.getString("uri3_2", "");
        c3_3 = share.getString("uri3_3", "");
        c3_4 = share.getString("uri3_4", "");
        c3_5 = share.getString("uri3_5", "");
        c3_6 = share.getString("uri3_6", "");
        c3_7 = share.getString("uri3_7", "");
        c4 = share.getString("uri4", "");
        c4_1 = share.getString("uri4_1", "");
        c4_2 = share.getString("uri4_2", "");
        c4_3 = share.getString("uri4_3", "");
        c4_4 = share.getString("uri4_4", "");
        c4_5 = share.getString("uri4_5", "");
        c4_6 = share.getString("uri4_6", "");
        c4_7 = share.getString("uri4_7", "");
        c5 = share.getString("uri5", "");
        c5_1 = share.getString("uri5_1", "");
        c5_2 = share.getString("uri5_2", "");
        c5_3 = share.getString("uri5_3", "");
        c5_4 = share.getString("uri5_4", "");
        c5_5 = share.getString("uri5_5", "");
        c5_6 = share.getString("uri5_6", "");
        c5_7 = share.getString("uri5_7", "");
        //時間割のマスクリック時の処理
        button1_0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplication(), SubActivity.class);
               //科目入力画面への移動
                startActivityForResult(intent1, TIME_1);
            }
        });
        //時間割マスの長押し時の処理
        button1_0.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                //科目入力画面から受け取った値がGの時
                if (c1.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    //Google classroomへの移動
                    startActivity(ur);
                    //科目入力画面から受け取った値がMの時
                } else if (c1.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    //Moodleへの移動
                    startActivity(ur);
                    //科目入力画面から受け取った値がEの時
                }else if(c1.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    //ALC e-Learningへの移動
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });
        //以下同様
        button1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1_1 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent1_1, TIME_1_1);
            }
        });
        button1_1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c1_1.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c1_1.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c1_1.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1_2 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent1_2, TIME_1_2);
            }
        });
        button1_2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c1_2.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if(c1_2.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c1_2.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1_3 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent1_3, TIME_1_3);
            }
        });
        button1_3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c1_3.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c1_3.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c1_3.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1_4 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent1_4, TIME_1_4);
            }
        });
        button1_4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c1_4.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c1_4.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c1_4.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button1_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1_5 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent1_5, TIME_1_5);
            }
        });
        button1_5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c1_5.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c1_5.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c1_5.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button1_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1_6 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent1_6, TIME_1_6);
            }
        });
        button1_6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c1_6.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c1_6.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c1_6.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button1_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1_7 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent1_7, TIME_1_7);
            }
        });
        button1_7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c1_7.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c1_7.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c1_7.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button2_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent2, TIME_2);
            }
        });
        button2_0.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c2.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c2.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c2.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2_1 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent2_1, TIME_2_1);
            }
        });
        button2_1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c2_1.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c2_1.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c2_1.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2_2 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent2_2, TIME_2_2);
            }
        });
        button2_2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c2_2.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c2_2.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c2_2.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2_3 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent2_3, TIME_2_3);
            }
        });
        button2_3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c2_3.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c2_3.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c2_3.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2_4 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent2_4, TIME_2_4);
            }
        });
        button2_4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c2_4.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c2_4.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c2_4.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2_5 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent2_5, TIME_2_5);
            }
        });
        button2_5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c2_5.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c2_5.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c2_5.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button2_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2_6 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent2_6, TIME_2_6);
            }
        });
        button2_6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c2_6.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c2_6.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c2_6.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button2_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2_7 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent2_7, TIME_2_7);
            }
        });
        button2_7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c2_7.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c2_7.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c2_7.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button3_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent3, TIME_3);
            }
        });
        button3_0.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c3.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c3.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c3.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3_1 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent3_1, TIME_3_1);
            }
        });
        button3_1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c3_1.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c3_1.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c3_1.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3_2 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent3_2, TIME_3_2);
            }
        });
        button3_2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c3_2.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c3_2.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c3_2.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3_3 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent3_3, TIME_3_3);
            }
        });
        button3_3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c3_3.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c3_3.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c3_3.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3_4 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent3_4, TIME_3_4);
            }
        });
        button3_4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c3_4.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c3_4.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c3_4.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button3_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3_5 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent3_5, TIME_3_5);
            }
        });
        button3_5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c3_5.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c3_5.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c3_5.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button3_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3_6 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent3_6, TIME_3_6);
            }
        });
        button3_6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c3_6.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c3_6.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c3_6.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button3_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3_7 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent3_7, TIME_3_7);
            }
        });
        button3_7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c3_7.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c3_7.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c3_7.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button4_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent4, TIME_4);
            }
        });
        button4_0.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c4.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c4.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c4.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4_1 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent4_1, TIME_4_1);
            }
        });
        button4_1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c4_1.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c4_1.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c4_1.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4_2 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent4_2, TIME_4_2);
            }
        });
        button4_2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c4_2.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c4_2.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c4_2.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4_3 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent4_3, TIME_4_3);
            }
        });
        button4_3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c4_3.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c4_3.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c4_3.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button4_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4_4 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent4_4, TIME_4_4);
            }
        });
        button4_4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c4_4.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c4_4.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c4_4.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button4_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4_5 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent4_5, TIME_4_5);
            }
        });
        button4_5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c4_5.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c4_5.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c4_5.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button4_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4_6 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent4_6, TIME_4_6);
            }
        });
        button4_6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c4_6.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c4_6.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c4_6.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button4_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4_7 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent4_7, TIME_4_7);
            }
        });
        button4_7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c4_7.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c4_7.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c4_7.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button5_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent5, TIME_5);
            }
        });
        button5_0.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c5.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c5.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c5.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5_1 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent5_1, TIME_5_1);
            }
        });
        button5_1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c5_1.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c5_1.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c5_1.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5_2 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent5_2, TIME_5_2);
            }
        });
        button5_2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c5_2.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c5_2.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c5_2.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5_3 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent5_3, TIME_5_3);
            }
        });
        button5_3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c5_3.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c5_3.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c5_3.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button5_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5_4 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent5_4, TIME_5_4);
            }
        });
        button5_4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c5_4.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c5_4.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c5_4.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button5_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5_5 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent5_5, TIME_5_5);
            }
        });
        button5_5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c5_5.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c5_5.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c5_5.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button5_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5_6 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent5_6, TIME_5_6);
            }
        });
        button5_6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c5_6.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c5_6.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c5_6.equals("E"))
                {
                    Uri ur1 = Uri.parse(ALCStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else{
                }
                return true;
            }
        });

        button5_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5_7 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent5_7, TIME_5_7);
            }
        });
        button5_7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (c5_7.equals("G")) {
                    Uri ur1 = Uri.parse(googleclassroomStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                } else if (c5_7.equals("M")){
                    Uri ur1 = Uri.parse(MoodleStr);
                    Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                    startActivity(ur);
                }else if(c5_7.equals("E")){
                    Uri ur1 = Uri.parse(ALCStr);
                Intent ur = new Intent(Intent.ACTION_VIEW, ur1);
                startActivity(ur);

                }else{
                }
                return true;
            }
        });
        int i_1,i_1_1,i_1_2,i_1_3,i_1_4,i_1_5,i_1_6,i_1_7;
        int i_2,i_2_1,i_2_2,i_2_3,i_2_4,i_2_5,i_2_6,i_2_7;
        int i_3,i_3_1,i_3_2,i_3_3,i_3_4,i_3_5,i_3_6,i_3_7;
        int i_4,i_4_1,i_4_2,i_4_3,i_4_4,i_4_5,i_4_6,i_4_7;
        int i_5,i_5_1,i_5_2,i_5_3,i_5_4,i_5_5,i_5_6,i_5_7;
        //アプリ起動時に前回の科目名を受け取り表示
        button5_7.setText(share.getString("data5_7",""));
        //アプリ起動時に前回の科目マスのサイズ受け取り
        i_5_7= share.getInt("number5_7",0);
        //マスのサイズが0の場合
        if(i_5_7==0){
            button5_7.setLayoutParams(T0);
        }else {
            button5_7.setLayoutParams(T0);
        }
        button5_6.setText(share.getString("data5_6",""));
        i_5_6= share.getInt("number5_6",0);
        switch(i_5_6){
            case 2:
                button5_6.setLayoutParams(T2);button5_7.setLayoutParams(T1);
                break;
            default:
                button5_6.setLayoutParams(T0);/*button5_1.setLayoutParams(T0);
                button5_2.setLayoutParams(T0);button5_3.setLayoutParams(T0);
                button5_4.setLayoutParams(T0);button5_5.setLayoutParams(T0);
                button5_7.setLayoutParams(T0);button5_0.setLayoutParams(T0);*/
                break;
        }
        button5_5.setText(share.getString("data5_5",""));
        i_5_5= share.getInt("number5_5",0);
        switch(i_5_5){
            case 2:
                button5_5.setLayoutParams(T2);button5_6.setLayoutParams(T1);
                //button5_7.setLayoutParams(T0);
                break;
            case 3:
                button5_5.setLayoutParams(T3);button5_6.setLayoutParams(T1);
                button5_7.setLayoutParams(T1);
                break;
            default:
                button5_5.setLayoutParams(T0);/*button5_1.setLayoutParams(T0);
                button5_2.setLayoutParams(T0);button5_3.setLayoutParams(T0);
                button5_4.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                button5_7.setLayoutParams(T0);button5_0.setLayoutParams(T0);*/
                break;
        }
        button5_4.setText(share.getString("data5_4",""));
        i_5_4= share.getInt("number5_4",0);
        switch(i_5_4){
            case 2:
                button5_4.setLayoutParams(T2);button5_5.setLayoutParams(T1);
                //button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                break;
            case 3:
                button5_4.setLayoutParams(T3);button5_5.setLayoutParams(T1);
                button5_6.setLayoutParams(T1);//button5_7.setLayoutParams(T0);
                break;
            case 4:
                button5_4.setLayoutParams(T4);button5_5.setLayoutParams(T1);
                button5_6.setLayoutParams(T1);button5_7.setLayoutParams(T1);
                break;
            default:
                button5_4.setLayoutParams(T0);/*button5_1.setLayoutParams(T0);
                button5_2.setLayoutParams(T0);button5_3.setLayoutParams(T0);
                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                button5_7.setLayoutParams(T0);button5_0.setLayoutParams(T0);*/
                break;
        }
        button5_3.setText(share.getString("data5_3",""));
        i_5_3= share.getInt("number5_3",0);
        switch(i_5_3){
            case 2:
                button5_3.setLayoutParams(T2);button5_4.setLayoutParams(T1);
                /*button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                button5_7.setLayoutParams(T0);*/
                break;
            case 3:
                button5_3.setLayoutParams(T3);button5_4.setLayoutParams(T1);
                button5_5.setLayoutParams(T1);
                //button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                break;
            case 4:
                button5_3.setLayoutParams(T4);button5_4.setLayoutParams(T1);
                button5_5.setLayoutParams(T1);button5_6.setLayoutParams(T1);
                //button5_7.setLayoutParams(T0);
                break;
            case 5:
                button5_3.setLayoutParams(T5);button5_4.setLayoutParams(T1);
                button5_5.setLayoutParams(T1);button5_6.setLayoutParams(T1);
                button5_7.setLayoutParams(T1);
                break;
            default:
                button5_3.setLayoutParams(T0);/*button5_1.setLayoutParams(T0);
                button5_2.setLayoutParams(T0);button5_4.setLayoutParams(T0);
                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                button5_7.setLayoutParams(T0);button5_0.setLayoutParams(T0);*/
                break;
        }
        button5_2.setText(share.getString("data5_2",""));
        i_5_2= share.getInt("number5_2",0);
        switch(i_5_2){
            case 2:
                button5_2.setLayoutParams(T2);button5_3.setLayoutParams(T1);
                /*button5_4.setLayoutParams(T0);button5_5.setLayoutParams(T0);
                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);*/
                break;
            case 3:
                button5_2.setLayoutParams(T3);button5_3.setLayoutParams(T1);
                button5_4.setLayoutParams(T1);/*button5_5.setLayoutParams(T0);
                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);*/
                break;
            case 4:
                button5_2.setLayoutParams(T4);button5_3.setLayoutParams(T1);
                button5_4.setLayoutParams(T1);button5_5.setLayoutParams(T1);
                //button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                break;
            case 5:
                button5_2.setLayoutParams(T5);button5_3.setLayoutParams(T1);
                button5_4.setLayoutParams(T1);button5_5.setLayoutParams(T1);
                button5_6.setLayoutParams(T1);//button5_7.setLayoutParams(T0);
                break;
            case 6:
                button5_2.setLayoutParams(T6);button5_3.setLayoutParams(T1);
                button5_4.setLayoutParams(T1);button5_5.setLayoutParams(T1);
                button5_6.setLayoutParams(T1);button5_7.setLayoutParams(T1);
                break;
            default:
                button5_2.setLayoutParams(T0);/*button5_1.setLayoutParams(T0);
                button5_3.setLayoutParams(T0);button5_4.setLayoutParams(T0);
                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                button5_7.setLayoutParams(T0);button5_0.setLayoutParams(T0);*/
                break;
        }
        button5_1.setText(share.getString("data5_1",""));
        i_5_1= share.getInt("number5_1",0);
        switch(i_5_1){
            case 2:
                button5_1.setLayoutParams(T2);button5_2.setLayoutParams(T1);
                /*button5_3.setLayoutParams(T0);button5_4.setLayoutParams(T0);
                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                button5_7.setLayoutParams(T0);*/
                break;
            case 3:
                button5_1.setLayoutParams(T3);button5_2.setLayoutParams(T1);
                button5_3.setLayoutParams(T1);/*button5_4.setLayoutParams(T0);
                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                button5_7.setLayoutParams(T0);*/
                break;
            case 4:
                button5_1.setLayoutParams(T4);button5_2.setLayoutParams(T1);
                button5_3.setLayoutParams(T1);button5_4.setLayoutParams(T1);
                /*button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                button5_7.setLayoutParams(T0);*/
                break;
            case 5:
                button5_1.setLayoutParams(T5);button5_2.setLayoutParams(T1);
                button5_3.setLayoutParams(T1);button5_4.setLayoutParams(T1);
                button5_5.setLayoutParams(T1);
                //button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                break;
            case 6:
                button5_1.setLayoutParams(T6);button5_2.setLayoutParams(T1);
                button5_3.setLayoutParams(T1);button5_4.setLayoutParams(T1);
                button5_5.setLayoutParams(T1);button5_6.setLayoutParams(T1);
                //button5_7.setLayoutParams(T0);
                break;
            case 7:
                button5_1.setLayoutParams(T7);button5_2.setLayoutParams(T1);
                button5_3.setLayoutParams(T1);button5_4.setLayoutParams(T1);
                button5_5.setLayoutParams(T1);button5_6.setLayoutParams(T1);
                button5_7.setLayoutParams(T1);
                break;
            default:
                button5_1.setLayoutParams(T0);/*button5_2.setLayoutParams(T0);
                button5_3.setLayoutParams(T0);button5_4.setLayoutParams(T0);
                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                button5_7.setLayoutParams(T0);button5_0.setLayoutParams(T0);*/
                break;
        }
        button5_0.setText(share.getString("data5",""));
        i_5= share.getInt("number5",0);
        switch(i_5){
            case 2:
                button5_0.setLayoutParams(T2);button5_1.setLayoutParams(T1);
                /*button5_2.setLayoutParams(T0);button5_3.setLayoutParams(T0);
                button5_4.setLayoutParams(T0);button5_5.setLayoutParams(T0);
                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);*/
                break;
            case 3:
                button5_0.setLayoutParams(T3);button5_1.setLayoutParams(T1);
                button5_2.setLayoutParams(T1);/*button5_3.setLayoutParams(T0);
                button5_4.setLayoutParams(T0);button5_5.setLayoutParams(T0);
                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);*/
                break;
            case 4:
                button5_0.setLayoutParams(T4);button5_1.setLayoutParams(T1);
                button5_2.setLayoutParams(T1);button5_3.setLayoutParams(T1);
                /*button5_4.setLayoutParams(T0);button5_5.setLayoutParams(T0);
                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);*/
                break;
            case 5:
                button5_0.setLayoutParams(T5);button5_1.setLayoutParams(T1);
                button5_2.setLayoutParams(T1);button5_3.setLayoutParams(T1);
                button5_4.setLayoutParams(T1);/*button5_5.setLayoutParams(T0);
                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);*/
                break;
            case 6:
                button5_0.setLayoutParams(T6);button5_1.setLayoutParams(T1);
                button5_2.setLayoutParams(T1);button5_3.setLayoutParams(T1);
                button5_4.setLayoutParams(T1);button5_5.setLayoutParams(T1);
                //button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                break;
            case 7:
                button5_0.setLayoutParams(T7);button5_1.setLayoutParams(T1);
                button5_2.setLayoutParams(T1);button5_3.setLayoutParams(T1);
                button5_4.setLayoutParams(T1);button5_5.setLayoutParams(T1);
                button5_6.setLayoutParams(T1);//button5_7.setLayoutParams(T0);
                break;
            case 8:
                button5_1.setLayoutParams(T1);button5_2.setLayoutParams(T1);
                button5_3.setLayoutParams(T1);button5_4.setLayoutParams(T1);
                button5_5.setLayoutParams(T1);button5_6.setLayoutParams(T1);
                button5_7.setLayoutParams(T1);button5_0.setLayoutParams(T8);
                break;
            default:
                /*button5_1.setLayoutParams(T0);button5_2.setLayoutParams(T0);
                button5_3.setLayoutParams(T0);button5_4.setLayoutParams(T0);
                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                button5_7.setLayoutParams(T0);*/button5_0.setLayoutParams(T0);
                break;
        }
        button4_7.setText(share.getString("data4_7",""));
        i_4_7= share.getInt("number4_7",0);
        if(i_4_7==0){
            button4_7.setLayoutParams(T0);
        }else {
            button4_7.setLayoutParams(T0);
        }
        button4_6.setText(share.getString("data4_6",""));
        i_4_6= share.getInt("number4_6",0);
        switch(i_4_6){
            case 2:
                button4_6.setLayoutParams(T2);button4_7.setLayoutParams(T1);
                break;
            default:
                button4_6.setLayoutParams(T0);/*button4_1.setLayoutParams(T0);
                button4_2.setLayoutParams(T0);button4_3.setLayoutParams(T0);
                button4_4.setLayoutParams(T0);button4_5.setLayoutParams(T0);
                button4_7.setLayoutParams(T0);button4_0.setLayoutParams(T0);*/
                break;
        }
        button4_5.setText(share.getString("data4_5",""));
        i_4_5= share.getInt("number4_5",0);
        switch(i_4_5){
            case 2:
                button4_5.setLayoutParams(T2);button4_6.setLayoutParams(T1);
                //button4_7.setLayoutParams(T0);
                break;
            case 3:
                button4_5.setLayoutParams(T3);button4_6.setLayoutParams(T1);
                button4_7.setLayoutParams(T1);
                break;
            default:
                button4_5.setLayoutParams(T0);/*button4_1.setLayoutParams(T0);
                button4_2.setLayoutParams(T0);button4_3.setLayoutParams(T0);
                button4_4.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                button4_7.setLayoutParams(T0);button4_0.setLayoutParams(T0);*/
                break;
        }
        button4_4.setText(share.getString("data4_4",""));
        i_4_4= share.getInt("number4_4",0);
        switch(i_4_4){
            case 2:
                button4_4.setLayoutParams(T2);button4_5.setLayoutParams(T1);
                //button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                break;
            case 3:
                button4_4.setLayoutParams(T3);button4_5.setLayoutParams(T1);
                button4_6.setLayoutParams(T1);//button4_7.setLayoutParams(T0);
                break;
            case 4:
                button4_4.setLayoutParams(T4);button4_5.setLayoutParams(T1);
                button4_6.setLayoutParams(T1);button4_7.setLayoutParams(T1);
                break;
            default:
                button4_4.setLayoutParams(T0);/*button4_1.setLayoutParams(T0);
                button4_2.setLayoutParams(T0);button4_3.setLayoutParams(T0);
                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                button4_7.setLayoutParams(T0);button4_0.setLayoutParams(T0);*/
                break;
        }
        button4_3.setText(share.getString("data4_3",""));
        i_4_3= share.getInt("number4_3",0);
        switch(i_4_3){
            case 2:
                button4_3.setLayoutParams(T2);button4_4.setLayoutParams(T1);
                /*button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                button4_7.setLayoutParams(T0);*/
                break;
            case 3:
                button4_3.setLayoutParams(T3);button4_4.setLayoutParams(T1);
                button4_5.setLayoutParams(T1);
                //button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                break;
            case 4:
                button4_3.setLayoutParams(T4);button4_4.setLayoutParams(T1);
                button4_5.setLayoutParams(T1);button4_6.setLayoutParams(T1);
                //button4_7.setLayoutParams(T0);
                break;
            case 5:
                button4_3.setLayoutParams(T5);button4_4.setLayoutParams(T1);
                button4_5.setLayoutParams(T1);button4_6.setLayoutParams(T1);
                button4_7.setLayoutParams(T1);
                break;
            default:
                button4_3.setLayoutParams(T0);/*button4_1.setLayoutParams(T0);
                button4_2.setLayoutParams(T0);button4_4.setLayoutParams(T0);
                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                button4_7.setLayoutParams(T0);button4_0.setLayoutParams(T0);*/
                break;
        }
        button4_2.setText(share.getString("data4_2",""));
        i_4_2= share.getInt("number4_2",0);
        switch(i_4_2){
            case 2:
                button4_2.setLayoutParams(T2);button4_3.setLayoutParams(T1);
                /*button4_4.setLayoutParams(T0);button4_5.setLayoutParams(T0);
                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);*/
                break;
            case 3:
                button4_2.setLayoutParams(T3);button4_3.setLayoutParams(T1);
                button4_4.setLayoutParams(T1);/*button4_5.setLayoutParams(T0);
                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);*/
                break;
            case 4:
                button4_2.setLayoutParams(T4);button4_3.setLayoutParams(T1);
                button4_4.setLayoutParams(T1);button4_5.setLayoutParams(T1);
                //button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                break;
            case 5:
                button4_2.setLayoutParams(T5);button4_3.setLayoutParams(T1);
                button4_4.setLayoutParams(T1);button4_5.setLayoutParams(T1);
                button4_6.setLayoutParams(T1);//button4_7.setLayoutParams(T0);
                break;
            case 6:
                button4_2.setLayoutParams(T6);button4_3.setLayoutParams(T1);
                button4_4.setLayoutParams(T1);button4_5.setLayoutParams(T1);
                button4_6.setLayoutParams(T1);button4_7.setLayoutParams(T1);
                break;
            default:
                button4_2.setLayoutParams(T0);/*button4_1.setLayoutParams(T0);
                button4_3.setLayoutParams(T0);button4_4.setLayoutParams(T0);
                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                button4_7.setLayoutParams(T0);button4_0.setLayoutParams(T0);*/
                break;
        }
        button4_1.setText(share.getString("data4_1",""));
        i_4_1= share.getInt("number4_1",0);
        switch(i_4_1){
            case 2:
                button4_1.setLayoutParams(T2);button4_2.setLayoutParams(T1);
                /*button4_3.setLayoutParams(T0);button4_4.setLayoutParams(T0);
                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                button4_7.setLayoutParams(T0);*/
                break;
            case 3:
                button4_1.setLayoutParams(T3);button4_2.setLayoutParams(T1);
                button4_3.setLayoutParams(T1);/*button4_4.setLayoutParams(T0);
                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                button4_7.setLayoutParams(T0);*/
                break;
            case 4:
                button4_1.setLayoutParams(T4);button4_2.setLayoutParams(T1);
                button4_3.setLayoutParams(T1);button4_4.setLayoutParams(T1);
                /*button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                button4_7.setLayoutParams(T0);*/
                break;
            case 5:
                button4_1.setLayoutParams(T5);button4_2.setLayoutParams(T1);
                button4_3.setLayoutParams(T1);button4_4.setLayoutParams(T1);
                button4_5.setLayoutParams(T1);
                //button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                break;
            case 6:
                button4_1.setLayoutParams(T6);button4_2.setLayoutParams(T1);
                button4_3.setLayoutParams(T1);button4_4.setLayoutParams(T1);
                button4_5.setLayoutParams(T1);button4_6.setLayoutParams(T1);
                //button4_7.setLayoutParams(T0);
                break;
            case 7:
                button4_1.setLayoutParams(T7);button4_2.setLayoutParams(T1);
                button4_3.setLayoutParams(T1);button4_4.setLayoutParams(T1);
                button4_5.setLayoutParams(T1);button4_6.setLayoutParams(T1);
                button4_7.setLayoutParams(T1);
                break;
            default:
                button4_1.setLayoutParams(T0);/*button4_2.setLayoutParams(T0);
                button4_3.setLayoutParams(T0);button4_4.setLayoutParams(T0);
                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                button4_7.setLayoutParams(T0);button4_0.setLayoutParams(T0);*/
                break;
        }
        button4_0.setText(share.getString("data4",""));
        i_4= share.getInt("number4",0);
        switch(i_4){
            case 2:
                button4_0.setLayoutParams(T2);button4_1.setLayoutParams(T1);
                /*button4_2.setLayoutParams(T0);button4_3.setLayoutParams(T0);
                button4_4.setLayoutParams(T0);button4_5.setLayoutParams(T0);
                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);*/
                break;
            case 3:
                button4_0.setLayoutParams(T3);button4_1.setLayoutParams(T1);
                button4_2.setLayoutParams(T1);/*button4_3.setLayoutParams(T0);
                button4_4.setLayoutParams(T0);button4_5.setLayoutParams(T0);
                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);*/
                break;
            case 4:
                button4_0.setLayoutParams(T4);button4_1.setLayoutParams(T1);
                button4_2.setLayoutParams(T1);button4_3.setLayoutParams(T1);
                /*button4_4.setLayoutParams(T0);button4_5.setLayoutParams(T0);
                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);*/
                break;
            case 5:
                button4_0.setLayoutParams(T5);button4_1.setLayoutParams(T1);
                button4_2.setLayoutParams(T1);button4_3.setLayoutParams(T1);
                button4_4.setLayoutParams(T1);/*button4_5.setLayoutParams(T0);
                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);*/
                break;
            case 6:
                button4_0.setLayoutParams(T6);button4_1.setLayoutParams(T1);
                button4_2.setLayoutParams(T1);button4_3.setLayoutParams(T1);
                button4_4.setLayoutParams(T1);button4_5.setLayoutParams(T1);
                //button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                break;
            case 7:
                button4_0.setLayoutParams(T7);button4_1.setLayoutParams(T1);
                button4_2.setLayoutParams(T1);button4_3.setLayoutParams(T1);
                button4_4.setLayoutParams(T1);button4_5.setLayoutParams(T1);
                button4_6.setLayoutParams(T1);//button4_7.setLayoutParams(T0);
                break;
            case 8:
                button4_1.setLayoutParams(T1);button4_2.setLayoutParams(T1);
                button4_3.setLayoutParams(T1);button4_4.setLayoutParams(T1);
                button4_5.setLayoutParams(T1);button4_6.setLayoutParams(T1);
                button4_7.setLayoutParams(T1);button4_0.setLayoutParams(T8);
                break;
            default:
                /*button4_1.setLayoutParams(T0);button4_2.setLayoutParams(T0);
                button4_3.setLayoutParams(T0);button4_4.setLayoutParams(T0);
                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                button4_7.setLayoutParams(T0);*/button4_0.setLayoutParams(T0);
                break;
        }
        button3_7.setText(share.getString("data3_7",""));
        i_3_7= share.getInt("number3_7",0);
        if(i_3_7==0){
            button3_7.setLayoutParams(T0);
        }else {
            button3_7.setLayoutParams(T0);
        }
        button3_6.setText(share.getString("data3_6",""));
        i_3_6= share.getInt("number3_6",0);
        switch(i_3_6){
            case 2:
                button3_6.setLayoutParams(T2);button3_7.setLayoutParams(T1);
                break;
            default:
                button3_6.setLayoutParams(T0);button3_1.setLayoutParams(T0);
                button3_2.setLayoutParams(T0);button3_3.setLayoutParams(T0);
                button3_4.setLayoutParams(T0);button3_5.setLayoutParams(T0);
                button3_7.setLayoutParams(T0);button3_0.setLayoutParams(T0);
                break;
        }
        button3_5.setText(share.getString("data3_5",""));
        i_3_5= share.getInt("number3_5",0);
        switch(i_3_5){
            case 2:
                button3_5.setLayoutParams(T2);button3_6.setLayoutParams(T1);
                //button3_7.setLayoutParams(T0);
                break;
            case 3:
                button3_5.setLayoutParams(T3);button3_6.setLayoutParams(T1);
                button3_7.setLayoutParams(T1);
                break;
            default:
                button3_5.setLayoutParams(T0);/*button3_1.setLayoutParams(T0);
                button3_2.setLayoutParams(T0);button3_3.setLayoutParams(T0);
                button3_4.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                button3_7.setLayoutParams(T0);button3_0.setLayoutParams(T0);*/
                break;
        }
        button3_4.setText(share.getString("data3_4",""));
        i_3_4= share.getInt("number3_4",0);
        switch(i_3_4){
            case 2:
                button3_4.setLayoutParams(T2);button3_5.setLayoutParams(T1);
                //button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                break;
            case 3:
                button3_4.setLayoutParams(T3);button3_5.setLayoutParams(T1);
                button3_6.setLayoutParams(T1);//button3_7.setLayoutParams(T0);
                break;
            case 4:
                button3_4.setLayoutParams(T4);button3_5.setLayoutParams(T1);
                button3_6.setLayoutParams(T1);button3_7.setLayoutParams(T1);
                break;
            default:
                button3_4.setLayoutParams(T0);/*button3_1.setLayoutParams(T0);
                button3_2.setLayoutParams(T0);button3_3.setLayoutParams(T0);
                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                button3_7.setLayoutParams(T0);button3_0.setLayoutParams(T0);*/
                break;
        }
        button3_3.setText(share.getString("data3_3",""));
        i_3_3= share.getInt("number3_3",0);
        switch(i_3_3){
            case 2:
                button3_3.setLayoutParams(T2);button3_4.setLayoutParams(T1);
                /*button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                button3_7.setLayoutParams(T0);*/
                break;
            case 3:
                button3_3.setLayoutParams(T3);button3_4.setLayoutParams(T1);
                button3_5.setLayoutParams(T1);
                //button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                break;
            case 4:
                button3_3.setLayoutParams(T4);button3_4.setLayoutParams(T1);
                button3_5.setLayoutParams(T1);button3_6.setLayoutParams(T1);
                //button3_7.setLayoutParams(T0);
                break;
            case 5:
                button3_3.setLayoutParams(T5);button3_4.setLayoutParams(T1);
                button3_5.setLayoutParams(T1);button3_6.setLayoutParams(T1);
                button3_7.setLayoutParams(T1);
                break;
            default:
                button3_3.setLayoutParams(T0);/*button3_1.setLayoutParams(T0);
                button3_2.setLayoutParams(T0);button3_4.setLayoutParams(T0);
                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                button3_7.setLayoutParams(T0);button3_0.setLayoutParams(T0);*/
                break;
        }
        button3_2.setText(share.getString("data3_2",""));
        i_3_2= share.getInt("number3_2",0);
        switch(i_3_2){
            case 2:
                button3_2.setLayoutParams(T2);button3_3.setLayoutParams(T1);
                /*button3_4.setLayoutParams(T0);button3_5.setLayoutParams(T0);
                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);*/
                break;
            case 3:
                button3_2.setLayoutParams(T3);button3_3.setLayoutParams(T1);
                button3_4.setLayoutParams(T1);/*button3_5.setLayoutParams(T0);
                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);*/
                break;
            case 4:
                button3_2.setLayoutParams(T4);button3_3.setLayoutParams(T1);
                button3_4.setLayoutParams(T1);button3_5.setLayoutParams(T1);
                //button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                break;
            case 5:
                button3_2.setLayoutParams(T5);button3_3.setLayoutParams(T1);
                button3_4.setLayoutParams(T1);button3_5.setLayoutParams(T1);
                button3_6.setLayoutParams(T1);//button3_7.setLayoutParams(T0);
                break;
            case 6:
                button3_2.setLayoutParams(T6);button3_3.setLayoutParams(T1);
                button3_4.setLayoutParams(T1);button3_5.setLayoutParams(T1);
                button3_6.setLayoutParams(T1);button3_7.setLayoutParams(T1);
                break;
            default:
                button3_2.setLayoutParams(T0);/*button3_1.setLayoutParams(T0);
                button3_3.setLayoutParams(T0);button3_4.setLayoutParams(T0);
                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                button3_7.setLayoutParams(T0);button3_0.setLayoutParams(T0);*/
                break;
        }
        button3_1.setText(share.getString("data3_1",""));
        i_3_1= share.getInt("number3_1",0);
        switch(i_3_1){
            case 2:
                button3_1.setLayoutParams(T2);button3_2.setLayoutParams(T1);
                /*button3_3.setLayoutParams(T0);button3_4.setLayoutParams(T0);
                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                button3_7.setLayoutParams(T0);*/
                break;
            case 3:
                button3_1.setLayoutParams(T3);button3_2.setLayoutParams(T1);
                button3_3.setLayoutParams(T1);/*button3_4.setLayoutParams(T0);
                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                button3_7.setLayoutParams(T0);*/
                break;
            case 4:
                button3_1.setLayoutParams(T4);button3_2.setLayoutParams(T1);
                button3_3.setLayoutParams(T1);button3_4.setLayoutParams(T1);
                /*button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                button3_7.setLayoutParams(T0);*/
                break;
            case 5:
                button3_1.setLayoutParams(T5);button3_2.setLayoutParams(T1);
                button3_3.setLayoutParams(T1);button3_4.setLayoutParams(T1);
                button3_5.setLayoutParams(T1);
                //button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                break;
            case 6:
                button3_1.setLayoutParams(T6);button3_2.setLayoutParams(T1);
                button3_3.setLayoutParams(T1);button3_4.setLayoutParams(T1);
                button3_5.setLayoutParams(T1);button3_6.setLayoutParams(T1);
                //button3_7.setLayoutParams(T0);
                break;
            case 7:
                button3_1.setLayoutParams(T7);button3_2.setLayoutParams(T1);
                button3_3.setLayoutParams(T1);button3_4.setLayoutParams(T1);
                button3_5.setLayoutParams(T1);button3_6.setLayoutParams(T1);
                button3_7.setLayoutParams(T1);
                break;
            default:
                button3_1.setLayoutParams(T0);/*button3_2.setLayoutParams(T0);
                button3_3.setLayoutParams(T0);button3_4.setLayoutParams(T0);
                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                button3_7.setLayoutParams(T0);button3_0.setLayoutParams(T0);*/
                break;
        }
        button3_0.setText(share.getString("data3",""));
        i_3= share.getInt("number3",0);
        switch(i_3){
            case 2:
                button3_0.setLayoutParams(T2);button3_1.setLayoutParams(T1);
                /*button3_2.setLayoutParams(T0);button3_3.setLayoutParams(T0);
                button3_4.setLayoutParams(T0);button3_5.setLayoutParams(T0);
                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);*/
                break;
            case 3:
                button3_0.setLayoutParams(T3);button3_1.setLayoutParams(T1);
                button3_2.setLayoutParams(T1);/*button3_3.setLayoutParams(T0);
                button3_4.setLayoutParams(T0);button3_5.setLayoutParams(T0);
                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);*/
                break;
            case 4:
                button3_0.setLayoutParams(T4);button3_1.setLayoutParams(T1);
                button3_2.setLayoutParams(T1);button3_3.setLayoutParams(T1);
                /*button3_4.setLayoutParams(T0);button3_5.setLayoutParams(T0);
                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);*/
                break;
            case 5:
                button3_0.setLayoutParams(T5);button3_1.setLayoutParams(T1);
                button3_2.setLayoutParams(T1);button3_3.setLayoutParams(T1);
                button3_4.setLayoutParams(T1);/*button3_5.setLayoutParams(T0);
                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);*/
                break;
            case 6:
                button3_0.setLayoutParams(T6);button3_1.setLayoutParams(T1);
                button3_2.setLayoutParams(T1);button3_3.setLayoutParams(T1);
                button3_4.setLayoutParams(T1);button3_5.setLayoutParams(T1);
                //button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                break;
            case 7:
                button3_0.setLayoutParams(T7);button3_1.setLayoutParams(T1);
                button3_2.setLayoutParams(T1);button3_3.setLayoutParams(T1);
                button3_4.setLayoutParams(T1);button3_5.setLayoutParams(T1);
                button3_6.setLayoutParams(T1);//button3_7.setLayoutParams(T0);
                break;
            case 8:
                button3_1.setLayoutParams(T1);button3_2.setLayoutParams(T1);
                button3_3.setLayoutParams(T1);button3_4.setLayoutParams(T1);
                button3_5.setLayoutParams(T1);button3_6.setLayoutParams(T1);
                button3_7.setLayoutParams(T1);button3_0.setLayoutParams(T8);
                break;
            default:
                /*button3_1.setLayoutParams(T0);button3_2.setLayoutParams(T0);
                button3_3.setLayoutParams(T0);button3_4.setLayoutParams(T0);
                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                button3_7.setLayoutParams(T0);*/button3_0.setLayoutParams(T0);
                break;
        }
        button2_7.setText(share.getString("data2_7",""));
        i_2_7= share.getInt("number2_7",0);
        if(i_2_7==0){
            button2_7.setLayoutParams(T0);
        }else {
            button2_7.setLayoutParams(T0);
        }
        button2_6.setText(share.getString("data2_6",""));
        i_2_6= share.getInt("number2_6",0);
        switch(i_2_6){
            case 2:
                button2_6.setLayoutParams(T2);button2_7.setLayoutParams(T1);
                break;
            default:
                button2_6.setLayoutParams(T0);/*button2_1.setLayoutParams(T0);
                button2_2.setLayoutParams(T0);button2_3.setLayoutParams(T0);
                button2_4.setLayoutParams(T0);button2_5.setLayoutParams(T0);
                button2_7.setLayoutParams(T0);button2_0.setLayoutParams(T0);*/
                break;
        }
        button2_5.setText(share.getString("data2_5",""));
        i_2_5= share.getInt("number2_5",0);
        switch(i_2_5){
            case 2:
                button2_5.setLayoutParams(T2);button2_6.setLayoutParams(T1);
                //button2_7.setLayoutParams(T0);
                break;
            case 3:
                button2_5.setLayoutParams(T3);button2_6.setLayoutParams(T1);
                button2_7.setLayoutParams(T1);
                break;
            default:
                button2_5.setLayoutParams(T0);/*button2_1.setLayoutParams(T0);
                button2_2.setLayoutParams(T0);button2_3.setLayoutParams(T0);
                button2_4.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                button2_7.setLayoutParams(T0);button2_0.setLayoutParams(T0);*/
                break;
        }
        button2_4.setText(share.getString("data2_4",""));
        i_2_4= share.getInt("number2_4",0);
        switch(i_2_4){
            case 2:
                button2_4.setLayoutParams(T2);button2_5.setLayoutParams(T1);
                //button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                break;
            case 3:
                button2_4.setLayoutParams(T3);button2_5.setLayoutParams(T1);
                button2_6.setLayoutParams(T1);//button2_7.setLayoutParams(T0);
                break;
            case 4:
                button2_4.setLayoutParams(T4);button2_5.setLayoutParams(T1);
                button2_6.setLayoutParams(T1);button2_7.setLayoutParams(T1);
                break;
            default:
                button2_4.setLayoutParams(T0);/*button2_1.setLayoutParams(T0);
                button2_2.setLayoutParams(T0);button2_3.setLayoutParams(T0);
                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                button2_7.setLayoutParams(T0);button2_0.setLayoutParams(T0);*/
                break;
        }
        button2_3.setText(share.getString("data2_3",""));
        i_2_3= share.getInt("number2_3",0);
        switch(i_2_3) {
            case 2:
                button2_3.setLayoutParams(T2);button2_4.setLayoutParams(T1);
                /*button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                button2_7.setLayoutParams(T0);*/
                break;
            case 3:
                button2_3.setLayoutParams(T3);button2_4.setLayoutParams(T1);
                button2_5.setLayoutParams(T1);
                //button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                break;
            case 4:
                button2_3.setLayoutParams(T4);button2_4.setLayoutParams(T1);
                button2_5.setLayoutParams(T1);button2_6.setLayoutParams(T1);
                //button2_7.setLayoutParams(T0);
                break;
            case 5:
                button2_3.setLayoutParams(T5);button2_4.setLayoutParams(T1);
                button2_5.setLayoutParams(T1);button2_6.setLayoutParams(T1);
                button2_7.setLayoutParams(T1);
                break;
            default:
                button2_3.setLayoutParams(T0);/*button2_1.setLayoutParams(T0);
                button2_2.setLayoutParams(T0);button2_4.setLayoutParams(T0);
                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                button2_7.setLayoutParams(T0);button2_0.setLayoutParams(T0);*/
                break;
        }
        button2_2.setText(share.getString("data2_2",""));
        i_2_2= share.getInt("number2_2",0);
        switch(i_2_2){
            case 2:
                button2_2.setLayoutParams(T2);button2_3.setLayoutParams(T1);
                /*button2_4.setLayoutParams(T0);button2_5.setLayoutParams(T0);
                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);*/
                break;
            case 3:
                button2_2.setLayoutParams(T3);button2_3.setLayoutParams(T1);
                button2_4.setLayoutParams(T1);/*button2_5.setLayoutParams(T0);
                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);*/
                break;
            case 4:
                button2_2.setLayoutParams(T4);button2_3.setLayoutParams(T1);
                button2_4.setLayoutParams(T1);button2_5.setLayoutParams(T1);
                //button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                break;
            case 5:
                button2_2.setLayoutParams(T5);button2_3.setLayoutParams(T1);
                button2_4.setLayoutParams(T1);button2_5.setLayoutParams(T1);
                button2_6.setLayoutParams(T1);//button2_7.setLayoutParams(T0);
                break;
            case 6:
                button2_2.setLayoutParams(T6);button2_3.setLayoutParams(T1);
                button2_4.setLayoutParams(T1);button2_5.setLayoutParams(T1);
                button2_6.setLayoutParams(T1);button2_7.setLayoutParams(T1);
                break;
            default:
                button2_2.setLayoutParams(T0);/*button2_1.setLayoutParams(T0);
                button2_3.setLayoutParams(T0);button2_4.setLayoutParams(T0);
                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                button2_7.setLayoutParams(T0);button2_0.setLayoutParams(T0);*/
                break;
        }
        button2_1.setText(share.getString("data2_1",""));
        i_2_1= share.getInt("number2_1",0);
        switch(i_2_1){
            case 2:
                button2_1.setLayoutParams(T2);button2_2.setLayoutParams(T1);
                /*button2_3.setLayoutParams(T0);button2_4.setLayoutParams(T0);
                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                button2_7.setLayoutParams(T0);*/
                break;
            case 3:
                button2_1.setLayoutParams(T3);button2_2.setLayoutParams(T1);
                button2_3.setLayoutParams(T1);/*button2_4.setLayoutParams(T0);
                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                button2_7.setLayoutParams(T0);*/
                break;
            case 4:
                button2_1.setLayoutParams(T4);button2_2.setLayoutParams(T1);
                button2_3.setLayoutParams(T1);button2_4.setLayoutParams(T1);
                /*button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                button2_7.setLayoutParams(T0);*/
                break;
            case 5:
                button2_1.setLayoutParams(T5);button2_2.setLayoutParams(T1);
                button2_3.setLayoutParams(T1);button2_4.setLayoutParams(T1);
                button2_5.setLayoutParams(T1);
                //button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                break;
            case 6:
                button2_1.setLayoutParams(T6);button2_2.setLayoutParams(T1);
                button2_3.setLayoutParams(T1);button2_4.setLayoutParams(T1);
                button2_5.setLayoutParams(T1);button2_6.setLayoutParams(T1);
                //button2_7.setLayoutParams(T0);
                break;
            case 7:
                button2_1.setLayoutParams(T7);button2_6.setLayoutParams(T1);
                button2_3.setLayoutParams(T1);button2_2.setLayoutParams(T1);
                button2_5.setLayoutParams(T1);button2_4.setLayoutParams(T1);
                button2_7.setLayoutParams(T1);
                break;
            default:
                button2_1.setLayoutParams(T0);/*button2_2.setLayoutParams(T0);
                button2_3.setLayoutParams(T0);button2_4.setLayoutParams(T0);
                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                button2_7.setLayoutParams(T0);button2_0.setLayoutParams(T0);*/
                break;
        }
        button2_0.setText(share.getString("data2",""));
        i_2= share.getInt("number2",0);
        switch(i_2){
            case 2:
                button2_0.setLayoutParams(T2);button2_1.setLayoutParams(T1);
                /*button2_2.setLayoutParams(T0);button2_3.setLayoutParams(T0);
                button2_4.setLayoutParams(T0);button2_5.setLayoutParams(T0);
                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);*/
                break;
            case 3:
                button2_0.setLayoutParams(T3);button2_1.setLayoutParams(T1);
                button2_2.setLayoutParams(T1);/*button2_3.setLayoutParams(T0);
                button2_4.setLayoutParams(T0);button2_5.setLayoutParams(T0);
                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);*/
                break;
            case 4:
                button2_0.setLayoutParams(T4);button2_1.setLayoutParams(T1);
                button2_2.setLayoutParams(T1);button2_3.setLayoutParams(T1);
                /*button2_4.setLayoutParams(T0);button2_5.setLayoutParams(T0);
                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);*/
                break;
            case 5:
                button2_0.setLayoutParams(T5);button2_1.setLayoutParams(T1);
                button2_2.setLayoutParams(T1);button2_3.setLayoutParams(T1);
                button2_4.setLayoutParams(T1);/*button2_5.setLayoutParams(T0);
                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);*/
                break;
            case 6:
                button2_0.setLayoutParams(T6);button2_1.setLayoutParams(T1);
                button2_2.setLayoutParams(T1);button2_3.setLayoutParams(T1);
                button2_4.setLayoutParams(T1);button2_5.setLayoutParams(T1);
                //button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                break;
            case 7:
                button2_0.setLayoutParams(T7);button2_1.setLayoutParams(T1);
                button2_2.setLayoutParams(T1);button2_3.setLayoutParams(T1);
                button2_4.setLayoutParams(T1);button2_5.setLayoutParams(T1);
                button2_6.setLayoutParams(T1);//button2_7.setLayoutParams(T0);
                break;
            case 8:
                button2_1.setLayoutParams(T1);button2_2.setLayoutParams(T1);
                button2_3.setLayoutParams(T1);button2_4.setLayoutParams(T1);
                button2_5.setLayoutParams(T1);button2_6.setLayoutParams(T1);
                button2_7.setLayoutParams(T1);button2_0.setLayoutParams(T8);
                break;
            default:
                /*button2_1.setLayoutParams(T0);button2_2.setLayoutParams(T0);
                button2_3.setLayoutParams(T0);button2_4.setLayoutParams(T0);
                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                button2_7.setLayoutParams(T0);*/button2_0.setLayoutParams(T0);
                break;
        }
        button1_7.setText(share.getString("data1_7",""));
        i_1_7= share.getInt("number1_7",0);
        if(i_1_7==1){
            button1_7.setLayoutParams(T0);
        }else{
            button1_7.setLayoutParams(T0);
        }
        button1_6.setText(share.getString("data1_6",""));
        i_1_6= share.getInt("number1_6",0);
        switch(i_1_6) {
            case 2:
                button1_6.setLayoutParams(T2);button1_7.setLayoutParams(T1);
                break;
            default:
                button1_6.setLayoutParams(T0);/*button1_1.setLayoutParams(T0);
                button1_2.setLayoutParams(T0);button1_3.setLayoutParams(T0);
                button1_4.setLayoutParams(T0);button1_5.setLayoutParams(T0);
                button1_7.setLayoutParams(T0);button1_0.setLayoutParams(T0);*/
                break;
        }
        button1_5.setText(share.getString("data1_5",""));
        i_1_5= share.getInt("number1_5",0);
        switch(i_1_5){
            case 2:
                button1_5.setLayoutParams(T2);button1_6.setLayoutParams(T1);
                //button1_7.setLayoutParams(T0);
                break;
            case 3:
                button1_5.setLayoutParams(T3);button1_6.setLayoutParams(T1);
                button1_7.setLayoutParams(T1);
                break;
            default:
                button1_5.setLayoutParams(T0);/*button1_1.setLayoutParams(T0);
                button1_2.setLayoutParams(T0);button1_3.setLayoutParams(T0);
                button1_4.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                button1_7.setLayoutParams(T0);button1_0.setLayoutParams(T0);*/
                break;
        }
        button1_4.setText(share.getString("data1_4",""));
        i_1_4= share.getInt("number1_4",0);
        switch(i_1_4){
            case 2:
                button1_4.setLayoutParams(T2);button1_5.setLayoutParams(T1);
               // button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);
                break;
            case 3:
                button1_4.setLayoutParams(T3);button1_5.setLayoutParams(T1);
                button1_6.setLayoutParams(T1);//button1_7.setLayoutParams(T0);
                break;
            case 4:
                button1_4.setLayoutParams(T4);button1_5.setLayoutParams(T1);
                button1_6.setLayoutParams(T1);button1_7.setLayoutParams(T1);
                break;
            default:
                button1_4.setLayoutParams(T0);/*button1_1.setLayoutParams(T0);
                button1_2.setLayoutParams(T0);button1_3.setLayoutParams(T0);
                button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                button1_7.setLayoutParams(T0);button1_0.setLayoutParams(T0);*/
                break;
        }
        button1_3.setText(share.getString("data1_3",""));
        i_1_3= share.getInt("number1_3",0);
        switch(i_1_3){
            case 2:
                button1_3.setLayoutParams(T2);button1_4.setLayoutParams(T1);
               /* button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                button1_7.setLayoutParams(T0);*/
                break;
            case 3:
                button1_3.setLayoutParams(T3);button1_4.setLayoutParams(T1);
                button1_5.setLayoutParams(T1);
                //button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);
                break;
            case 4:
                button1_3.setLayoutParams(T4);button1_4.setLayoutParams(T1);
                button1_5.setLayoutParams(T1);button1_6.setLayoutParams(T1);
                //button1_7.setLayoutParams(T0);
                break;
            case 5:
                button1_3.setLayoutParams(T5);button1_4.setLayoutParams(T1);
                button1_5.setLayoutParams(T1);button1_6.setLayoutParams(T1);
                button1_7.setLayoutParams(T1);
                break;
            default:
                button1_3.setLayoutParams(T0);/*button1_1.setLayoutParams(T0);
                button1_2.setLayoutParams(T0);button1_4.setLayoutParams(T0);
                button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                button1_7.setLayoutParams(T0);button1_0.setLayoutParams(T0);*/
                break;
        }
        button1_2.setText(share.getString("data1_2",""));
        i_1_2= share.getInt("number1_2",0);
        switch(i_1_2){
            case 2:
                button1_2.setLayoutParams(T2);button1_3.setLayoutParams(T1);
               /* button1_4.setLayoutParams(T0);button1_5.setLayoutParams(T0);
                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);*/
                break;
            case 3:
                button1_2.setLayoutParams(T3);button1_3.setLayoutParams(T1);
                button1_4.setLayoutParams(T1);/*button1_5.setLayoutParams(T0);
                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);*/
                break;
            case 4:
                button1_2.setLayoutParams(T4);button1_3.setLayoutParams(T1);
                button1_4.setLayoutParams(T1);button1_5.setLayoutParams(T1);
               // button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);
                break;
            case 5:
                button1_2.setLayoutParams(T5);button1_3.setLayoutParams(T1);
                button1_4.setLayoutParams(T1);button1_5.setLayoutParams(T1);
                button1_6.setLayoutParams(T1);//button1_7.setLayoutParams(T0);
                break;
            case 6:
                button1_2.setLayoutParams(T6);button1_3.setLayoutParams(T1);
                button1_4.setLayoutParams(T1);button1_5.setLayoutParams(T1);
                button1_6.setLayoutParams(T1);button1_7.setLayoutParams(T1);
                break;
            default:
                button1_2.setLayoutParams(T0);/*button1_1.setLayoutParams(T0);
                button1_3.setLayoutParams(T0);button1_4.setLayoutParams(T0);
                button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                button1_7.setLayoutParams(T0);button1_0.setLayoutParams(T0);*/
                break;
        }
        button1_1.setText(share.getString("data1_1",""));
        i_1_1= share.getInt("number1_1",0);
        switch(i_1_1){
            case 2:
                button1_1.setLayoutParams(T2);button1_2.setLayoutParams(T1);
               /* button1_3.setLayoutParams(T0);button1_4.setLayoutParams(T0);
                button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                button1_7.setLayoutParams(T0);*/
                break;
            case 3:
                button1_1.setLayoutParams(T3);button1_2.setLayoutParams(T1);
                button1_3.setLayoutParams(T1);/*button1_4.setLayoutParams(T0);
                button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                button1_7.setLayoutParams(T0);*/
                break;
            case 4:
                button1_1.setLayoutParams(T4);button1_2.setLayoutParams(T1);
                button1_3.setLayoutParams(T1);button1_4.setLayoutParams(T1);
               /* button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                button1_7.setLayoutParams(T0);*/
                break;
            case 5:
                button1_1.setLayoutParams(T5);button1_2.setLayoutParams(T1);
                button1_3.setLayoutParams(T1);button1_4.setLayoutParams(T1);
                button1_5.setLayoutParams(T1);/*button1_6.setLayoutParams(T0);
                button1_7.setLayoutParams(T0);*/
                break;
            case 6:
                button1_1.setLayoutParams(T6);button1_2.setLayoutParams(T1);
                button1_3.setLayoutParams(T1);button1_4.setLayoutParams(T1);
                button1_5.setLayoutParams(T1);button1_6.setLayoutParams(T1);
               // button1_7.setLayoutParams(T0);
                break;
            case 7:
                button1_1.setLayoutParams(T7);button1_2.setLayoutParams(T1);
                button1_3.setLayoutParams(T1);button1_4.setLayoutParams(T1);
                button1_5.setLayoutParams(T1);button1_6.setLayoutParams(T1);
                button1_7.setLayoutParams(T1);
                break;
            default:
                button1_1.setLayoutParams(T0);/*button1_2.setLayoutParams(T0);
                button1_3.setLayoutParams(T0);button1_4.setLayoutParams(T0);
                button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                button1_7.setLayoutParams(T0);button1_0.setLayoutParams(T0);*/
                break;
        }
        button1_0.setText(share.getString("data1",""));
        i_1= share.getInt("number1",0);
        switch(i_1){

            case 1:
                button1_0.setLayoutParams(T0);
                //button1_1.setBackgroundColor(GREEN);
                break;
            case 2:
                button1_0.setLayoutParams(T2);button1_1.setLayoutParams(T1);
               /* button1_2.setLayoutParams(T0);button1_3.setLayoutParams(T0);
                button1_4.setLayoutParams(T0);button1_5.setLayoutParams(T0);
                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);*/
                break;
            case 3:
                button1_0.setLayoutParams(T3);button1_1.setLayoutParams(T1);
                button1_2.setLayoutParams(T1);/*button1_3.setLayoutParams(T0);
                button1_4.setLayoutParams(T0);button1_5.setLayoutParams(T0);
                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);*/
                break;
            case 4:
                button1_0.setLayoutParams(T4);button1_1.setLayoutParams(T1);
                button1_2.setLayoutParams(T1);button1_3.setLayoutParams(T1);
                /*button1_4.setLayoutParams(T0);button1_5.setLayoutParams(T0);
                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);*/
                break;
            case 5:
                button1_0.setLayoutParams(T5);button1_1.setLayoutParams(T1);
                button1_2.setLayoutParams(T1);button1_3.setLayoutParams(T1);
                button1_4.setLayoutParams(T1);/*button1_5.setLayoutParams(T0);
                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);*/
                break;
            case 6:
                button1_0.setLayoutParams(T6);button1_1.setLayoutParams(T1);
                button1_2.setLayoutParams(T1);button1_3.setLayoutParams(T1);
                button1_4.setLayoutParams(T1);button1_5.setLayoutParams(T1);
               /* button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);*/
                break;
            case 7:
                button1_0.setLayoutParams(T7);button1_1.setLayoutParams(T1);
                button1_2.setLayoutParams(T1);button1_3.setLayoutParams(T1);
                button1_4.setLayoutParams(T1);button1_5.setLayoutParams(T1);
                button1_6.setLayoutParams(T1);//button1_7.setLayoutParams(T0);
                break;
            case 8:
                button1_1.setLayoutParams(T1);button1_2.setLayoutParams(T1);
                button1_3.setLayoutParams(T1);button1_4.setLayoutParams(T1);
                button1_5.setLayoutParams(T1);button1_6.setLayoutParams(T1);
                button1_7.setLayoutParams(T1);button1_0.setLayoutParams(T8);
                break;
            default:
                /*button1_1.setLayoutParams(T0);button1_2.setLayoutParams(T0);
                button1_3.setLayoutParams(T0);button1_4.setLayoutParams(T0);
                button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                button1_7.setLayoutParams(T0);*/button1_0.setLayoutParams(T0);
        }
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        {
        }

       /*FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        //Action Barのボタン（シラバス移動用）
        if (id == R.id.kousen_link) {
            // Handle the camera action
            Uri uri = Uri.parse(kousenStr);
            Intent syllabus = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(syllabus);
            //Action Barのボタン（Google classroom移動用）
        } else if (id == R.id.googleclassroom_link) {
            Uri uri = Uri.parse(googleclassroomStr);
            Intent classroom = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(classroom);
            //Action Barのボタン（Moodle移動用）
        } else if (id == R.id.moodle_link) {
            Uri uri = Uri.parse(MoodleStr);
            Intent Moodle = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(Moodle);
            //Action Barのボタン（課題リスト移動用）
        } else if (id == R.id.kadai_list) {
            Intent kadai_list = new Intent(getApplication(), kadaiActivity.class);
            startActivity(kadai_list);
            //Action Barのボタン（ALC e-Learning移動用）
        }else if (id == R.id.ALC_link) {
            Uri uri = Uri.parse(ALCStr);
            Intent ALC = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(ALC);
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    protected void onActivityResult ( int requestcode, int resultcode, Intent backdata){
        super.onActivityResult(resultcode, requestcode, backdata);
        T1=new LinearLayout.LayoutParams(0,0);
        T2=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,0,2);
        T3=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,0,3);
        T4=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,0,4);
        T5=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,0,5);
        T6=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,0,6);
        T7=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,0,7);
        T8=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,0,8);
        T0=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,0,1);
        Editor editor1 = share.edit();
        Editor editor_n1=share.edit();
        Editor editorU1 =share.edit();
        Editor editor2 = share.edit();
        //結果コードがRESULT_OKの場合（科目名入力画面から問題なく戻ってこれた場合）
        if (resultcode == Activity.RESULT_OK) {
            //要求コードの値による分岐
            switch (requestcode) {
                case TIME_1:
                    //結果データに値が入ってる場合
                    if (null != backdata) {
                        //科目入力画面から値を受け取る（科目名）
                        String TIMES_1 = backdata.getStringExtra("backtimename");
                        //科目入力画面から値を受け取る（時間数）
                        String TIME_count_1 = backdata.getStringExtra("backtimenumber");
                        button1_0.setText(TIMES_1);
                        int TC_1 = Integer.parseInt(TIME_count_1);
                        //科目入力画面から値を受け取る（CheckBoxで指定した学習支援サイトのURL）
                        String ur_1=backdata.getStringExtra("URL");
                        c1=ur_1;
                        if(TC_1>8){
                            TC_1=2;
                        }
                        //エディタにデータを渡す
                        editor1.putString("data1",TIMES_1);
                        editor1.putInt("number1",TC_1);
                        editorU1.putString("uri1",ur_1);
                        editor1.commit();editor_n1.commit();editorU1.commit();

                        switch(TC_1){
                            case 2:
                                button1_0.setLayoutParams(T2);button1_1.setLayoutParams(T1);
                                button1_2.setLayoutParams(T0);button1_3.setLayoutParams(T0);
                                button1_4.setLayoutParams(T0);button1_5.setLayoutParams(T0);
                                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button1_0.setLayoutParams(T3);button1_1.setLayoutParams(T1);
                                button1_2.setLayoutParams(T1);button1_3.setLayoutParams(T0);
                                button1_4.setLayoutParams(T0);button1_5.setLayoutParams(T0);
                                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button1_0.setLayoutParams(T4);button1_1.setLayoutParams(T1);
                                button1_2.setLayoutParams(T1);button1_3.setLayoutParams(T1);
                                button1_4.setLayoutParams(T0);button1_5.setLayoutParams(T0);
                                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);
                                break;
                            case 5:
                                button1_0.setLayoutParams(T5);button1_1.setLayoutParams(T1);
                                button1_2.setLayoutParams(T1);button1_3.setLayoutParams(T1);
                                button1_4.setLayoutParams(T1);button1_5.setLayoutParams(T0);
                                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);
                                break;
                            case 6:
                                button1_0.setLayoutParams(T6);button1_1.setLayoutParams(T1);
                                button1_2.setLayoutParams(T1);button1_3.setLayoutParams(T1);
                                button1_4.setLayoutParams(T1);button1_5.setLayoutParams(T1);
                                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);
                                break;
                            case 7:
                                button1_0.setLayoutParams(T7);button1_1.setLayoutParams(T1);
                                button1_2.setLayoutParams(T1);button1_3.setLayoutParams(T1);
                                button1_4.setLayoutParams(T1);button1_5.setLayoutParams(T1);
                                button1_6.setLayoutParams(T1);button1_7.setLayoutParams(T0);
                                break;
                            case 8:
                                button1_1.setLayoutParams(T1);button1_2.setLayoutParams(T1);
                                button1_3.setLayoutParams(T1);button1_4.setLayoutParams(T1);
                                button1_5.setLayoutParams(T1);button1_6.setLayoutParams(T1);
                                button1_7.setLayoutParams(T1);button1_0.setLayoutParams(T8);
                                break;
                             default:
                                 button1_1.setLayoutParams(T0);button1_2.setLayoutParams(T0);
                                 button1_3.setLayoutParams(T0);button1_4.setLayoutParams(T0);
                                 button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                                 button1_7.setLayoutParams(T0);button1_0.setLayoutParams(T0);
                                 break;
                        }
                    }
                    break;
                case TIME_1_1:
                    if (null != backdata) {
                        String TIMES_1_1 = backdata.getStringExtra("backtimename");
                        String TIME_count_1_1 = backdata.getStringExtra("backtimenumber");
                        button1_1.setText(TIMES_1_1);
                        int TC_1_1=Integer.parseInt(TIME_count_1_1);
                        String ur_1_1=backdata.getStringExtra("URL");
                        c1_1=ur_1_1;
                        editor1.putString("data1_1",TIMES_1_1);
                        editor_n1.putInt("number1_1",TC_1_1);
                        editorU1.putString("uri1_1",ur_1_1);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_1_1){
                            case 2:
                                button1_1.setLayoutParams(T2);button1_2.setLayoutParams(T1);
                                button1_3.setLayoutParams(T0);button1_4.setLayoutParams(T0);
                                button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                                button1_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button1_1.setLayoutParams(T3);button1_2.setLayoutParams(T1);
                                button1_3.setLayoutParams(T1);button1_4.setLayoutParams(T0);
                                button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                                button1_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button1_1.setLayoutParams(T4);button1_2.setLayoutParams(T1);
                                button1_3.setLayoutParams(T1);button1_4.setLayoutParams(T1);
                                button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                                button1_7.setLayoutParams(T0);
                                break;
                            case 5:
                                button1_1.setLayoutParams(T5);button1_2.setLayoutParams(T1);
                                button1_3.setLayoutParams(T1);button1_4.setLayoutParams(T1);
                                button1_5.setLayoutParams(T1);button1_6.setLayoutParams(T0);
                                button1_7.setLayoutParams(T0);
                                break;
                            case 6:
                                button1_1.setLayoutParams(T6);button1_2.setLayoutParams(T1);
                                button1_3.setLayoutParams(T1);button1_4.setLayoutParams(T1);
                                button1_5.setLayoutParams(T1);button1_6.setLayoutParams(T1);
                                button1_7.setLayoutParams(T0);
                                break;
                            case 7:
                                button1_1.setLayoutParams(T7);button1_2.setLayoutParams(T1);
                                button1_3.setLayoutParams(T1);button1_4.setLayoutParams(T1);
                                button1_5.setLayoutParams(T1);button1_6.setLayoutParams(T1);
                                button1_7.setLayoutParams(T1);
                                break;
                            default:
                                button1_1.setLayoutParams(T0);button1_2.setLayoutParams(T0);
                                button1_3.setLayoutParams(T0);button1_4.setLayoutParams(T0);
                                button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                                button1_7.setLayoutParams(T0);button1_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_1_2:
                    if (null != backdata) {
                        String TIMES_1_2 = backdata.getStringExtra("backtimename");
                        String TIME_coiunt_1_2 = backdata.getStringExtra("backtimenumber");
                        button1_2.setText(TIMES_1_2);
                        int TC_1_2=Integer.parseInt(TIME_coiunt_1_2);
                        String ur_1_2=backdata.getStringExtra("URL");
                        c1_2=ur_1_2;
                        if(TC_1_2>8){
                            TC_1_2=2;
                        }
                        editor1.putString("data1_2",TIMES_1_2);
                        editor_n1.putInt("number1_2",TC_1_2);
                        editorU1.putString("uri1_2",ur_1_2);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_1_2){
                            case 2:
                                button1_2.setLayoutParams(T2);button1_3.setLayoutParams(T1);
                                button1_4.setLayoutParams(T0);button1_5.setLayoutParams(T0);
                                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button1_2.setLayoutParams(T3);button1_3.setLayoutParams(T1);
                                button1_4.setLayoutParams(T1);button1_5.setLayoutParams(T0);
                                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button1_2.setLayoutParams(T4);button1_3.setLayoutParams(T1);
                                button1_4.setLayoutParams(T1);button1_5.setLayoutParams(T1);
                                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);
                                break;
                            case 5:
                                button1_2.setLayoutParams(T5);button1_3.setLayoutParams(T1);
                                button1_4.setLayoutParams(T1);button1_5.setLayoutParams(T1);
                                button1_6.setLayoutParams(T1);button1_7.setLayoutParams(T0);
                                break;
                            case 6:
                                button1_2.setLayoutParams(T6);button1_3.setLayoutParams(T1);
                                button1_4.setLayoutParams(T1);button1_5.setLayoutParams(T1);
                                button1_6.setLayoutParams(T1);button1_7.setLayoutParams(T1);
                                break;
                            default:
                                button1_1.setLayoutParams(T0);button1_2.setLayoutParams(T0);
                                button1_3.setLayoutParams(T0);button1_4.setLayoutParams(T0);
                                button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                                button1_7.setLayoutParams(T0);button1_0.setLayoutParams(T0);
                                break;

                        }
                    }
                    break;
                case TIME_1_3:
                    if (null != backdata) {
                        String TIMES_1_3 = backdata.getStringExtra("backtimename");
                        String TIME_count_1_3 = backdata.getStringExtra("backtimenumber");
                        button1_3.setText(TIMES_1_3);
                        int TC_1_3=Integer.parseInt(TIME_count_1_3);
                        String ur_1_3=backdata.getStringExtra("URL");
                        c1_3=ur_1_3;
                        editor1.putString("data1_3",TIMES_1_3);
                        editor_n1.putInt("number1_3",TC_1_3);
                        editorU1.putString("uri1_3",ur_1_3);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_1_3){
                            case 2:
                                button1_3.setLayoutParams(T2);button1_4.setLayoutParams(T1);
                                button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                                button1_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button1_3.setLayoutParams(T3);button1_4.setLayoutParams(T1);
                                button1_5.setLayoutParams(T1);button1_6.setLayoutParams(T0);
                                button1_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button1_3.setLayoutParams(T4);button1_4.setLayoutParams(T1);
                                button1_5.setLayoutParams(T1);button1_6.setLayoutParams(T1);
                                button1_7.setLayoutParams(T0);
                                break;
                            case 5:
                                button1_3.setLayoutParams(T5);button1_4.setLayoutParams(T1);
                                button1_5.setLayoutParams(T1);button1_6.setLayoutParams(T1);
                                button1_7.setLayoutParams(T1);
                                break;
                            default:
                                button1_1.setLayoutParams(T0);button1_2.setLayoutParams(T0);
                                button1_3.setLayoutParams(T0);button1_4.setLayoutParams(T0);
                                button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                                button1_7.setLayoutParams(T0);button1_0.setLayoutParams(T0);
                                break;

                        }
                    }
                    break;
                case TIME_1_4:
                    if (null != backdata) {
                        String TIMES_1_4 = backdata.getStringExtra("backtimename");
                        String TIME_count_1_4 = backdata.getStringExtra("backtimenumber");
                        button1_4.setText(TIMES_1_4);
                        int TC_1_4=Integer.parseInt(TIME_count_1_4);
                        String ur_1_4=backdata.getStringExtra("URL");
                        c1_4=ur_1_4;
                        if(TC_1_4>8){
                            TC_1_4=2;
                        }
                        editor1.putString("data1_4",TIMES_1_4);
                        editor_n1.putInt("number1_4",TC_1_4);
                        editorU1.putString("uri1_4",ur_1_4);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_1_4){
                            case 2:
                                button1_4.setLayoutParams(T2);button1_5.setLayoutParams(T1);
                                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button1_4.setLayoutParams(T3);button1_5.setLayoutParams(T1);
                                button1_6.setLayoutParams(T1);button1_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button1_4.setLayoutParams(T4);button1_5.setLayoutParams(T1);
                                button1_6.setLayoutParams(T1);button1_7.setLayoutParams(T1);
                                break;
                            default:
                                button1_1.setLayoutParams(T0);button1_2.setLayoutParams(T0);
                                button1_3.setLayoutParams(T0);button1_4.setLayoutParams(T0);
                                button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                                button1_7.setLayoutParams(T0);button1_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_1_5:
                    if (null != backdata) {
                        String TIMES_1_5 = backdata.getStringExtra("backtimename");
                        String TIME_count_1_5 = backdata.getStringExtra("backtimenumber");
                        button1_5.setText(TIMES_1_5);
                        int TC_1_5=Integer.parseInt(TIME_count_1_5);
                        String ur_1_5=backdata.getStringExtra("URL");
                        c1_5=ur_1_5;
                        editor1.putString("data1_5",TIMES_1_5);
                        editor_n1.putInt("number1_5",TC_1_5);
                        editorU1.putString("uri1_5",ur_1_5);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_1_5){
                            case 2:
                                button1_5.setLayoutParams(T2);button1_6.setLayoutParams(T1);
                                button1_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button1_5.setLayoutParams(T3);button1_6.setLayoutParams(T1);
                                button1_7.setLayoutParams(T1);
                                break;
                            default:
                                button1_1.setLayoutParams(T0);button1_2.setLayoutParams(T0);
                                button1_3.setLayoutParams(T0);button1_4.setLayoutParams(T0);
                                button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                                button1_7.setLayoutParams(T0);button1_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_1_6:
                    if (null != backdata) {
                        String TIMES_1_6 = backdata.getStringExtra("backtimename");
                        String TIME_count_1_6 = backdata.getStringExtra("backtimenumber");
                        button1_6.setText(TIMES_1_6);
                        int TC_1_6=Integer.parseInt(TIME_count_1_6);
                        String ur_1_6=backdata.getStringExtra("URL");
                        c1_6=ur_1_6;
                        if(TC_1_6>8){
                            TC_1_6=2;
                        }
                        editor1.putString("data1_6",TIMES_1_6);
                        editor_n1.putInt("number1_6",TC_1_6);
                        editorU1.putString("uri1_6",ur_1_6);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_1_6) {
                            case 2:
                                button1_6.setLayoutParams(T2);button1_7.setLayoutParams(T1);
                                break;
                            default:
                                button1_1.setLayoutParams(T0);button1_2.setLayoutParams(T0);
                                button1_3.setLayoutParams(T0);button1_4.setLayoutParams(T0);
                                button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                                button1_7.setLayoutParams(T0);button1_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_1_7:
                    if (null != backdata) {
                        String TIMES_1_7 = backdata.getStringExtra("backtimename");
                        String TIME_count_1_7 = backdata.getStringExtra("backtimenumber");
                        button1_7.setText(TIMES_1_7);
                        int TC_1_7=Integer.parseInt(TIME_count_1_7);
                        String ur_1_7=backdata.getStringExtra("URL");
                        c1_7=ur_1_7;
                        editor1.putString("data1_7",TIMES_1_7);
                        editor_n1.putInt("number1_7",TC_1_7);
                        editorU1.putString("uri1_7",ur_1_7);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                    }
                    break;
                case TIME_2:
                    if (null != backdata) {
                        String TIMES_2 = backdata.getStringExtra("backtimename");
                        String TIME_count_2 = backdata.getStringExtra("backtimenumber");
                        button2_0.setText(TIMES_2);
                        int TC_2=Integer.parseInt(TIME_count_2);
                        String ur_2=backdata.getStringExtra("URL");
                        c2=ur_2;
                        if(TC_2>8){
                            TC_2=2;
                        }
                        editor1.putString("data2",TIMES_2);
                        editor_n1.putInt("number2",TC_2);
                        editorU1.putString("uri2",ur_2);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_2){
                            case 2:
                                button2_0.setLayoutParams(T2);button2_1.setLayoutParams(T1);
                                button2_2.setLayoutParams(T0);button2_3.setLayoutParams(T0);
                                button2_4.setLayoutParams(T0);button2_5.setLayoutParams(T0);
                                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button2_0.setLayoutParams(T3);button2_1.setLayoutParams(T1);
                                button2_2.setLayoutParams(T1);button2_3.setLayoutParams(T0);
                                button2_4.setLayoutParams(T0);button2_5.setLayoutParams(T0);
                                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button2_0.setLayoutParams(T4);button2_1.setLayoutParams(T1);
                                button2_2.setLayoutParams(T1);button2_3.setLayoutParams(T1);
                                button2_4.setLayoutParams(T0);button2_5.setLayoutParams(T0);
                                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                                break;
                            case 5:
                                button2_0.setLayoutParams(T5);button2_1.setLayoutParams(T1);
                                button2_2.setLayoutParams(T1);button2_3.setLayoutParams(T1);
                                button2_4.setLayoutParams(T1);button2_5.setLayoutParams(T0);
                                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                                break;
                            case 6:
                                button2_0.setLayoutParams(T6);button2_1.setLayoutParams(T1);
                                button2_2.setLayoutParams(T1);button2_3.setLayoutParams(T1);
                                button2_4.setLayoutParams(T1);button2_5.setLayoutParams(T1);
                                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                                break;
                            case 7:
                                button2_0.setLayoutParams(T7);button2_1.setLayoutParams(T1);
                                button2_2.setLayoutParams(T1);button2_3.setLayoutParams(T1);
                                button2_4.setLayoutParams(T1);button2_5.setLayoutParams(T1);
                                button2_6.setLayoutParams(T1);button2_7.setLayoutParams(T0);
                                break;
                            case 8:
                                button2_1.setLayoutParams(T1);button2_2.setLayoutParams(T1);
                                button2_3.setLayoutParams(T1);button2_4.setLayoutParams(T1);
                                button2_5.setLayoutParams(T1);button2_6.setLayoutParams(T1);
                                button2_7.setLayoutParams(T1);button2_0.setLayoutParams(T8);
                                break;
                            default:
                                button2_1.setLayoutParams(T0);button2_2.setLayoutParams(T0);
                                button2_3.setLayoutParams(T0);button2_4.setLayoutParams(T0);
                                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                                button2_7.setLayoutParams(T0);button2_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_2_1:
                    if (null != backdata) {
                        String TIMES_2_1 = backdata.getStringExtra("backtimename");
                        String TIME_count_2_1 = backdata.getStringExtra("backtimenumber");
                        button2_1.setText(TIMES_2_1);
                        int TC_2_1=Integer.parseInt(TIME_count_2_1);
                        String ur_2_1=backdata.getStringExtra("URL");
                        c2_1=ur_2_1;
                        editor1.putString("data2_1",TIMES_2_1);
                        editor_n1.putInt("number2_1",TC_2_1);
                        editorU1.putString("uri2_1",ur_2_1);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_2_1){
                            case 2:
                                button2_1.setLayoutParams(T2);button2_2.setLayoutParams(T1);
                                button2_3.setLayoutParams(T0);button2_4.setLayoutParams(T0);
                                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                                button2_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button2_1.setLayoutParams(T3);button2_2.setLayoutParams(T1);
                                button2_3.setLayoutParams(T1);button2_4.setLayoutParams(T0);
                                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                                button2_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button2_1.setLayoutParams(T4);button2_2.setLayoutParams(T1);
                                button2_3.setLayoutParams(T1);button2_4.setLayoutParams(T1);
                                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                                button2_7.setLayoutParams(T0);
                                break;
                            case 5:
                                button2_1.setLayoutParams(T5);button2_2.setLayoutParams(T1);
                                button2_3.setLayoutParams(T1);button2_4.setLayoutParams(T1);
                                button2_5.setLayoutParams(T1);button2_6.setLayoutParams(T0);
                                button2_7.setLayoutParams(T0);
                                break;
                            case 6:
                                button2_1.setLayoutParams(T6);button2_2.setLayoutParams(T1);
                                button2_3.setLayoutParams(T1);button2_4.setLayoutParams(T1);
                                button2_5.setLayoutParams(T1);button2_6.setLayoutParams(T1);
                                button2_7.setLayoutParams(T0);
                                break;
                            case 7:
                                button2_1.setLayoutParams(T7);button2_6.setLayoutParams(T1);
                                button2_3.setLayoutParams(T1);button2_2.setLayoutParams(T1);
                                button2_5.setLayoutParams(T1);button2_4.setLayoutParams(T1);
                                button2_7.setLayoutParams(T1);
                                break;

                            default:
                                button2_1.setLayoutParams(T0);button2_2.setLayoutParams(T0);
                                button2_3.setLayoutParams(T0);button2_4.setLayoutParams(T0);
                                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                                button2_7.setLayoutParams(T0);button2_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_2_2:
                    if (null != backdata) {
                        String TIMES_2_2 = backdata.getStringExtra("backtimename");
                        String TIME_count_2_2 = backdata.getStringExtra("backtimenumber");
                        button2_2.setText(TIMES_2_2);
                        int TC_2_2=Integer.parseInt(TIME_count_2_2);
                        String ur_2_2=backdata.getStringExtra("URL");
                        c2_2=ur_2_2;
                        if(TC_2_2>8){
                            TC_2_2=2;
                        }
                        editor1.putString("data2_2",TIMES_2_2);
                        editor_n1.putInt("number2_2",TC_2_2);
                        editorU1.putString("uri2_2",ur_2_2);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_2_2){
                            case 2:
                                button2_2.setLayoutParams(T2);button2_3.setLayoutParams(T1);
                                button2_4.setLayoutParams(T0);button2_5.setLayoutParams(T0);
                                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button2_2.setLayoutParams(T3);button2_3.setLayoutParams(T1);
                                button2_4.setLayoutParams(T1);button2_5.setLayoutParams(T0);
                                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button2_2.setLayoutParams(T4);button2_3.setLayoutParams(T1);
                                button2_4.setLayoutParams(T1);button2_5.setLayoutParams(T1);
                                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                                break;
                            case 5:
                                button2_2.setLayoutParams(T5);button2_3.setLayoutParams(T1);
                                button2_4.setLayoutParams(T1);button2_5.setLayoutParams(T1);
                                button2_6.setLayoutParams(T1);button2_7.setLayoutParams(T0);
                                break;
                            case 6:
                                button2_2.setLayoutParams(T6);button2_3.setLayoutParams(T1);
                                button2_4.setLayoutParams(T1);button2_5.setLayoutParams(T1);
                                button2_6.setLayoutParams(T1);button2_7.setLayoutParams(T1);
                                break;
                            default:
                                button2_1.setLayoutParams(T0);button2_2.setLayoutParams(T0);
                                button2_3.setLayoutParams(T0);button2_4.setLayoutParams(T0);
                                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                                button2_7.setLayoutParams(T0);button2_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_2_3:
                    if (null != backdata) {
                        String TIMES_2_3 = backdata.getStringExtra("backtimename");
                        String TIME_count_2_3 = backdata.getStringExtra("backtimenumber");
                        button2_3.setText(TIMES_2_3);
                        int TC_2_3=Integer.parseInt(TIME_count_2_3);
                        String ur_2_3=backdata.getStringExtra("URL");
                        c2_3=ur_2_3;
                        editor1.putString("data2_3",TIMES_2_3);
                        editor_n1.putInt("number2_3",TC_2_3);
                        editorU1.putString("uri2_3",ur_2_3);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_2_3) {
                            case 2:
                                button2_3.setLayoutParams(T2);button2_4.setLayoutParams(T1);
                                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                                button2_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button2_3.setLayoutParams(T3);button2_4.setLayoutParams(T1);
                                button2_5.setLayoutParams(T1);button2_6.setLayoutParams(T0);
                                button2_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button2_3.setLayoutParams(T4);button2_4.setLayoutParams(T1);
                                button2_5.setLayoutParams(T1);button2_6.setLayoutParams(T1);
                                button2_7.setLayoutParams(T0);
                                break;
                            case 5:
                                button2_3.setLayoutParams(T5);button2_4.setLayoutParams(T1);
                                button2_5.setLayoutParams(T1);button2_6.setLayoutParams(T1);
                                button2_7.setLayoutParams(T1);
                                break;
                            default:
                                button2_1.setLayoutParams(T0);button2_2.setLayoutParams(T0);
                                button2_3.setLayoutParams(T0);button2_4.setLayoutParams(T0);
                                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                                button2_7.setLayoutParams(T0);button2_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_2_4:
                    if (null != backdata) {
                        String TIMES_2_4 = backdata.getStringExtra("backtimename");
                        String TIME_count_2_4 = backdata.getStringExtra("backtimenumber");
                        button2_4.setText(TIMES_2_4);
                        int TC_2_4=Integer.parseInt(TIME_count_2_4);
                        String ur_2_4=backdata.getStringExtra("URL");
                        c2_4=ur_2_4;
                        if(TC_2_4>8){
                            TC_2_4=2;
                        }
                        editor1.putString("data2_4",TIMES_2_4);
                        editor_n1.putInt("number2_4",TC_2_4);
                        editorU1.putString("uri2_4",ur_2_4);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_2_4){
                            case 2:
                                button2_4.setLayoutParams(T2);button2_5.setLayoutParams(T1);
                                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button2_4.setLayoutParams(T3);button2_5.setLayoutParams(T1);
                                button2_6.setLayoutParams(T1);button2_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button2_4.setLayoutParams(T4);button2_5.setLayoutParams(T1);
                                button2_6.setLayoutParams(T1);button2_7.setLayoutParams(T1);
                                break;
                            default:
                                button2_1.setLayoutParams(T0);button2_2.setLayoutParams(T0);
                                button2_3.setLayoutParams(T0);button2_4.setLayoutParams(T0);
                                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                                button2_7.setLayoutParams(T0);button2_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_2_5:
                    if (null != backdata) {
                        String TIMES_2_5 = backdata.getStringExtra("backtimename");
                        String TIME_count_2_5 = backdata.getStringExtra("backtimenumber");
                        button2_5.setText(TIMES_2_5);
                        int TC_2_5=Integer.parseInt(TIME_count_2_5);
                        String ur_2_5=backdata.getStringExtra("URL");
                        c2_5=ur_2_5;
                        editor1.putString("data2_5",TIMES_2_5);
                        editor_n1.putInt("number2_5",TC_2_5);
                        editorU1.putString("uri2_5",ur_2_5);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_2_5){
                            case 2:
                                button2_5.setLayoutParams(T2);button2_6.setLayoutParams(T1);
                                button2_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button2_5.setLayoutParams(T3);button2_6.setLayoutParams(T1);
                                button2_7.setLayoutParams(T1);
                                break;
                            default:
                                button2_1.setLayoutParams(T0);button2_2.setLayoutParams(T0);
                                button2_3.setLayoutParams(T0);button2_4.setLayoutParams(T0);
                                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                                button2_7.setLayoutParams(T0);button2_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_2_6:
                    if (null != backdata) {
                        String TIMES_2_6 = backdata.getStringExtra("backtimename");
                        String TIME_count_2_6 = backdata.getStringExtra("backtimenumber");
                        button2_6.setText(TIMES_2_6);
                        int TC_2_6=Integer.parseInt(TIME_count_2_6);
                        String ur_2_6=backdata.getStringExtra("URL");
                        c2_6=ur_2_6;
                        if(TC_2_6>8){
                            TC_2_6=2;
                        }
                        editor1.putString("data2_6",TIMES_2_6);
                        editor_n1.putInt("number2_6",TC_2_6);
                        editorU1.putString("uri2_6",ur_2_6);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_2_6){
                            case 2:
                                button2_6.setLayoutParams(T2);button2_7.setLayoutParams(T1);
                                break;
                            default:
                                button2_1.setLayoutParams(T0);button2_2.setLayoutParams(T0);
                                button2_3.setLayoutParams(T0);button2_4.setLayoutParams(T0);
                                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                                button2_7.setLayoutParams(T0);button2_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_2_7:
                    if (null != backdata) {
                        String TIMES_2_7 = backdata.getStringExtra("backtimename");
                        String TIME_count_2_7 = backdata.getStringExtra("backtimenumber");
                        button2_7.setText(TIMES_2_7);
                        int TC_2_7=Integer.parseInt(TIME_count_2_7);
                        String ur_2_7=backdata.getStringExtra("URL");
                        c2_7=ur_2_7;
                        editor1.putString("data2_7",TIMES_2_7);
                        editor_n1.putInt("number2_7",TC_2_7);
                        editorU1.putString("uri2_7",ur_2_7);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                    }
                    break;
                case TIME_3:
                    if (null != backdata) {
                        String TIMES_3 = backdata.getStringExtra("backtimename");
                        String TIME_count_3 = backdata.getStringExtra("backtimenumber");
                        button3_0.setText(TIMES_3);
                        int TC_3=Integer.parseInt(TIME_count_3);
                        String ur_3=backdata.getStringExtra("URL");
                        c3=ur_3;
                        if(TC_3>8){
                            TC_3=2;
                        }
                        editor1.putString("data3",TIMES_3);
                        editor_n1.putInt("number3",TC_3);
                        editorU1.putString("uri3",ur_3);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_3){
                            case 2:
                                button3_0.setLayoutParams(T2);button3_1.setLayoutParams(T1);
                                button3_2.setLayoutParams(T0);button3_3.setLayoutParams(T0);
                                button3_4.setLayoutParams(T0);button3_5.setLayoutParams(T0);
                                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button3_0.setLayoutParams(T3);button3_1.setLayoutParams(T1);
                                button3_2.setLayoutParams(T1);button3_3.setLayoutParams(T0);
                                button3_4.setLayoutParams(T0);button3_5.setLayoutParams(T0);
                                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button3_0.setLayoutParams(T4);button3_1.setLayoutParams(T1);
                                button3_2.setLayoutParams(T1);button3_3.setLayoutParams(T1);
                                button3_4.setLayoutParams(T0);button3_5.setLayoutParams(T0);
                                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                                break;
                            case 5:
                                button3_0.setLayoutParams(T5);button3_1.setLayoutParams(T1);
                                button3_2.setLayoutParams(T1);button3_3.setLayoutParams(T1);
                                button3_4.setLayoutParams(T1);button3_5.setLayoutParams(T0);
                                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                                break;
                            case 6:
                                button3_0.setLayoutParams(T6);button3_1.setLayoutParams(T1);
                                button3_2.setLayoutParams(T1);button3_3.setLayoutParams(T1);
                                button3_4.setLayoutParams(T1);button3_5.setLayoutParams(T1);
                                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                                break;
                            case 7:
                                button3_0.setLayoutParams(T7);button3_1.setLayoutParams(T1);
                                button3_2.setLayoutParams(T1);button3_3.setLayoutParams(T1);
                                button3_4.setLayoutParams(T1);button3_5.setLayoutParams(T1);
                                button3_6.setLayoutParams(T1);button3_7.setLayoutParams(T0);
                                break;
                            case 8:
                                button3_1.setLayoutParams(T1);button3_2.setLayoutParams(T1);
                                button3_3.setLayoutParams(T1);button3_4.setLayoutParams(T1);
                                button3_5.setLayoutParams(T1);button3_6.setLayoutParams(T1);
                                button3_7.setLayoutParams(T1);button3_0.setLayoutParams(T8);
                                break;
                            default:
                                button3_1.setLayoutParams(T0);button3_2.setLayoutParams(T0);
                                button3_3.setLayoutParams(T0);button3_4.setLayoutParams(T0);
                                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                                button3_7.setLayoutParams(T0);button3_0.setLayoutParams(T0);
                                break;
                        }

                    }
                    break;
                case TIME_3_1:
                    if (null != backdata) {
                        String TIMES_3_1 = backdata.getStringExtra("backtimename");
                        String TIME_count_3_1 = backdata.getStringExtra("backtimenumber");
                        button3_1.setText(TIMES_3_1);
                        int TC_3_1=Integer.parseInt(TIME_count_3_1);
                        String ur_3_1=backdata.getStringExtra("URL");
                        c3_1=ur_3_1;
                        editor1.putString("data3_1",TIMES_3_1);
                        editor_n1.putInt("number3_1",TC_3_1);
                        editorU1.putString("uri3_1",ur_3_1);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_3_1){
                            case 2:
                                button3_1.setLayoutParams(T2);button3_2.setLayoutParams(T1);
                                button3_3.setLayoutParams(T0);button3_4.setLayoutParams(T0);
                                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                                button3_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button3_1.setLayoutParams(T3);button3_2.setLayoutParams(T1);
                                button3_3.setLayoutParams(T1);button3_4.setLayoutParams(T0);
                                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                                button3_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button3_1.setLayoutParams(T4);button3_2.setLayoutParams(T1);
                                button3_3.setLayoutParams(T1);button3_4.setLayoutParams(T1);
                                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                                button3_7.setLayoutParams(T0);
                                break;
                            case 5:
                                button3_1.setLayoutParams(T5);button3_2.setLayoutParams(T1);
                                button3_3.setLayoutParams(T1);button3_4.setLayoutParams(T1);
                                button3_5.setLayoutParams(T1);button3_6.setLayoutParams(T0);
                                button3_7.setLayoutParams(T0);
                                break;
                            case 6:
                                button3_1.setLayoutParams(T6);button3_2.setLayoutParams(T1);
                                button3_3.setLayoutParams(T1);button3_4.setLayoutParams(T1);
                                button3_5.setLayoutParams(T1);button3_6.setLayoutParams(T1);
                                button3_7.setLayoutParams(T0);
                                break;
                            case 7:
                                button3_1.setLayoutParams(T7);button3_2.setLayoutParams(T1);
                                button3_3.setLayoutParams(T1);button3_4.setLayoutParams(T1);
                                button3_5.setLayoutParams(T1);button3_6.setLayoutParams(T1);
                                button3_7.setLayoutParams(T1);
                                break;
                            default:
                                button3_1.setLayoutParams(T0);button3_2.setLayoutParams(T0);
                                button3_3.setLayoutParams(T0);button3_4.setLayoutParams(T0);
                                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                                button3_7.setLayoutParams(T0);button3_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_3_2:
                    if (null != backdata) {
                        String TIMES_3_2 = backdata.getStringExtra("backtimename");
                        String TIME_count_3_2 = backdata.getStringExtra("backtimenumber");
                        button3_2.setText(TIMES_3_2);
                        int TC_3_2=Integer.parseInt(TIME_count_3_2);
                        String ur_3_2=backdata.getStringExtra("URL");
                        c3_2=ur_3_2;
                        if(TC_3_2>8){
                            TC_3_2=2;
                        }
                        editor1.putString("data3_2",TIMES_3_2);
                        editor_n1.putInt("number3_2",TC_3_2);
                        editorU1.putString("uri3_2",ur_3_2);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_3_2){
                            case 2:
                                button3_2.setLayoutParams(T2);button3_3.setLayoutParams(T1);
                                button3_4.setLayoutParams(T0);button3_5.setLayoutParams(T0);
                                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button3_2.setLayoutParams(T3);button3_3.setLayoutParams(T1);
                                button3_4.setLayoutParams(T1);button3_5.setLayoutParams(T0);
                                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button3_2.setLayoutParams(T4);button3_3.setLayoutParams(T1);
                                button3_4.setLayoutParams(T1);button3_5.setLayoutParams(T1);
                                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                                break;
                            case 5:
                                button3_2.setLayoutParams(T5);button3_3.setLayoutParams(T1);
                                button3_4.setLayoutParams(T1);button3_5.setLayoutParams(T1);
                                button3_6.setLayoutParams(T1);button3_7.setLayoutParams(T0);
                                break;
                            case 6:
                                button3_2.setLayoutParams(T6);button3_3.setLayoutParams(T1);
                                button3_4.setLayoutParams(T1);button3_5.setLayoutParams(T1);
                                button3_6.setLayoutParams(T1);button3_7.setLayoutParams(T1);
                                break;
                            default:
                                button3_1.setLayoutParams(T0);button3_2.setLayoutParams(T0);
                                button3_3.setLayoutParams(T0);button3_4.setLayoutParams(T0);
                                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                                button3_7.setLayoutParams(T0);button3_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_3_3:
                    if (null != backdata) {
                        String TIMES_3_3 = backdata.getStringExtra("backtimename");
                        String TIME_count_3_3 = backdata.getStringExtra("backtimenumber");
                        button3_3.setText(TIMES_3_3);
                        int TC_3_3=Integer.parseInt(TIME_count_3_3);
                        String ur_3_3=backdata.getStringExtra("URL");
                        c3_3=ur_3_3;
                        editor1.putString("data3_3",TIMES_3_3);
                        editor_n1.putInt("number3_3",TC_3_3);
                        editorU1.putString("uri3_3",ur_3_3);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_3_3){
                            case 2:
                                button3_3.setLayoutParams(T2);button3_4.setLayoutParams(T1);
                                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                                button3_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button3_3.setLayoutParams(T3);button3_4.setLayoutParams(T1);
                                button3_5.setLayoutParams(T1);button3_6.setLayoutParams(T0);
                                button3_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button3_3.setLayoutParams(T4);button3_4.setLayoutParams(T1);
                                button3_5.setLayoutParams(T1);button3_6.setLayoutParams(T1);
                                button3_7.setLayoutParams(T0);
                                break;
                            case 5:
                                button3_3.setLayoutParams(T5);button3_4.setLayoutParams(T1);
                                button3_5.setLayoutParams(T1);button3_6.setLayoutParams(T1);
                                button3_7.setLayoutParams(T1);
                                break;
                            default:
                                button3_1.setLayoutParams(T0);button3_2.setLayoutParams(T0);
                                button3_3.setLayoutParams(T0);button3_4.setLayoutParams(T0);
                                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                                button3_7.setLayoutParams(T0);button3_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_3_4:
                    if (null != backdata) {
                        String TIMES_3_4 = backdata.getStringExtra("backtimename");
                        String TIME_count_3_4 = backdata.getStringExtra("backtimenumber");
                        button3_4.setText(TIMES_3_4);
                        int TC_3_4=Integer.parseInt(TIME_count_3_4);
                        String ur_3_4=backdata.getStringExtra("URL");
                        c3_4=ur_3_4;
                        if(TC_3_4>8){
                            TC_3_4=2;
                        }
                        editor1.putString("data3_4",TIMES_3_4);
                        editor_n1.putInt("number3_4",TC_3_4);
                        editorU1.putString("uri3_4",ur_3_4);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_3_4){
                            case 2:
                                button3_4.setLayoutParams(T2);button3_5.setLayoutParams(T1);
                                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button3_4.setLayoutParams(T3);button3_5.setLayoutParams(T1);
                                button3_6.setLayoutParams(T1);button3_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button3_4.setLayoutParams(T4);button3_5.setLayoutParams(T1);
                                button3_6.setLayoutParams(T1);button3_7.setLayoutParams(T1);
                                break;
                            default:
                                button3_1.setLayoutParams(T0);button3_2.setLayoutParams(T0);
                                button3_3.setLayoutParams(T0);button3_4.setLayoutParams(T0);
                                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                                button3_7.setLayoutParams(T0);button3_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_3_5:
                    if (null != backdata) {
                        String TIMES_3_5 = backdata.getStringExtra("backtimename");
                        String TIME_count_3_5 = backdata.getStringExtra("backtimenumber");
                        button3_5.setText(TIMES_3_5);
                        int TC_3_5=Integer.parseInt(TIME_count_3_5);
                        String ur_3_5=backdata.getStringExtra("URL");
                        c3_5=ur_3_5;
                        editor1.putString("data3_5",TIMES_3_5);
                        editor_n1.putInt("number3_5",TC_3_5);
                        editorU1.putString("uri3_5",ur_3_5);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_3_5){
                            case 2:
                                button3_5.setLayoutParams(T2);button3_6.setLayoutParams(T1);
                                button3_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button3_5.setLayoutParams(T3);button3_6.setLayoutParams(T1);
                                button3_7.setLayoutParams(T1);
                                break;
                            default:
                                button3_1.setLayoutParams(T0);button3_2.setLayoutParams(T0);
                                button3_3.setLayoutParams(T0);button3_4.setLayoutParams(T0);
                                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                                button3_7.setLayoutParams(T0);button3_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_3_6:
                    if (null != backdata) {
                        String TIMES_3_6 = backdata.getStringExtra("backtimename");
                        String TIME_count_3_6 = backdata.getStringExtra("backtimenumber");
                        button3_6.setText(TIMES_3_6);
                        int TC_3_6=Integer.parseInt(TIME_count_3_6);
                        String ur_3_6=backdata.getStringExtra("URL");
                        c3_6=ur_3_6;
                        if(TC_3_6>8){
                            TC_3_6=2;
                        }
                        editor1.putString("data3_6",TIMES_3_6);
                        editor_n1.putInt("number3_6",TC_3_6);
                        editorU1.putString("uri3_6",ur_3_6);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_3_6){
                            case 2:
                                button3_6.setLayoutParams(T2);button3_7.setLayoutParams(T1);
                                break;
                            default:
                                button3_1.setLayoutParams(T0);button3_2.setLayoutParams(T0);
                                button3_3.setLayoutParams(T0);button3_4.setLayoutParams(T0);
                                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                                button3_7.setLayoutParams(T0);button3_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_3_7:
                    if (null != backdata) {
                        String TIMES_3_7 = backdata.getStringExtra("backtimename");
                        String TIME_count_3_7 = backdata.getStringExtra("backtimenumber");
                        button3_7.setText(TIMES_3_7);
                        int TC_3_7=Integer.parseInt(TIME_count_3_7);
                        String ur_3_7=backdata.getStringExtra("URL");
                        c3_7=ur_3_7;
                        editor1.putString("data3_7",TIMES_3_7);
                        editor_n1.putInt("number3_7",TC_3_7);
                        editorU1.putString("uri3_7",ur_3_7);
                        editor1.commit();editor_n1.commit();
                    }
                    break;
                case TIME_4:
                    if (null != backdata) {
                        String TIMES_4 = backdata.getStringExtra("backtimename");
                        String TIME_count_4 = backdata.getStringExtra("backtimenumber");
                        button4_0.setText(TIMES_4);
                        int TC_4=Integer.parseInt(TIME_count_4);
                        String ur_4=backdata.getStringExtra("URL");
                        c4=ur_4;
                        if(TC_4>8){
                            TC_4=2;
                        }
                        editor1.putString("data4",TIMES_4);
                        editor_n1.putInt("number4",TC_4);
                        editorU1.putString("uri4",ur_4);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_4){
                            case 2:
                                button4_0.setLayoutParams(T2);button4_1.setLayoutParams(T1);
                                button4_2.setLayoutParams(T0);button4_3.setLayoutParams(T0);
                                button4_4.setLayoutParams(T0);button4_5.setLayoutParams(T0);
                                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button4_0.setLayoutParams(T3);button4_1.setLayoutParams(T1);
                                button4_2.setLayoutParams(T1);button4_3.setLayoutParams(T0);
                                button4_4.setLayoutParams(T0);button4_5.setLayoutParams(T0);
                                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button4_0.setLayoutParams(T4);button4_1.setLayoutParams(T1);
                                button4_2.setLayoutParams(T1);button4_3.setLayoutParams(T1);
                                button4_4.setLayoutParams(T0);button4_5.setLayoutParams(T0);
                                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                                break;
                            case 5:
                                button4_0.setLayoutParams(T5);button4_1.setLayoutParams(T1);
                                button4_2.setLayoutParams(T1);button4_3.setLayoutParams(T1);
                                button4_4.setLayoutParams(T1);button4_5.setLayoutParams(T0);
                                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                                break;
                            case 6:
                                button4_0.setLayoutParams(T6);button4_1.setLayoutParams(T1);
                                button4_2.setLayoutParams(T1);button4_3.setLayoutParams(T1);
                                button4_4.setLayoutParams(T1);button4_5.setLayoutParams(T1);
                                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                                break;
                            case 7:
                                button4_0.setLayoutParams(T7);button4_1.setLayoutParams(T1);
                                button4_2.setLayoutParams(T1);button4_3.setLayoutParams(T1);
                                button4_4.setLayoutParams(T1);button4_5.setLayoutParams(T1);
                                button4_6.setLayoutParams(T1);button4_7.setLayoutParams(T0);
                                break;
                            case 8:
                                button4_1.setLayoutParams(T1);button4_2.setLayoutParams(T1);
                                button4_3.setLayoutParams(T1);button4_4.setLayoutParams(T1);
                                button4_5.setLayoutParams(T1);button4_6.setLayoutParams(T1);
                                button4_7.setLayoutParams(T1);button4_0.setLayoutParams(T8);
                                break;
                            default:
                                button4_1.setLayoutParams(T0);button4_2.setLayoutParams(T0);
                                button4_3.setLayoutParams(T0);button4_4.setLayoutParams(T0);
                                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                                button4_7.setLayoutParams(T0);button4_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_4_1:
                    if (null != backdata) {
                        String TIMES_4_1 = backdata.getStringExtra("backtimename");
                        String TIME_count_4_1 = backdata.getStringExtra("backtimenumber");
                        button4_1.setText(TIMES_4_1);
                        int TC_4_1=Integer.parseInt(TIME_count_4_1);
                        String ur_4_1=backdata.getStringExtra("URL");
                        c4_1=ur_4_1;
                        editor1.putString("data4_1",TIMES_4_1);
                        editor_n1.putInt("number4_1",TC_4_1);
                        editorU1.putString("uri4_1",ur_4_1);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_4_1){
                            case 2:
                                button4_1.setLayoutParams(T2);button4_2.setLayoutParams(T1);
                                button4_3.setLayoutParams(T0);button4_4.setLayoutParams(T0);
                                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                                button4_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button4_1.setLayoutParams(T3);button4_2.setLayoutParams(T1);
                                button4_3.setLayoutParams(T1);button4_4.setLayoutParams(T0);
                                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                                button4_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button4_1.setLayoutParams(T4);button4_2.setLayoutParams(T1);
                                button4_3.setLayoutParams(T1);button4_4.setLayoutParams(T1);
                                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                                button4_7.setLayoutParams(T0);
                                break;
                            case 5:
                                button4_1.setLayoutParams(T5);button4_2.setLayoutParams(T1);
                                button4_3.setLayoutParams(T1);button4_4.setLayoutParams(T1);
                                button4_5.setLayoutParams(T1);button4_6.setLayoutParams(T0);
                                button4_7.setLayoutParams(T0);
                                break;
                            case 6:
                                button4_1.setLayoutParams(T6);button4_2.setLayoutParams(T1);
                                button4_3.setLayoutParams(T1);button4_4.setLayoutParams(T1);
                                button4_5.setLayoutParams(T1);button4_6.setLayoutParams(T1);
                                button4_7.setLayoutParams(T0);
                                break;
                            case 7:
                                button4_1.setLayoutParams(T7);button4_2.setLayoutParams(T1);
                                button4_3.setLayoutParams(T1);button4_4.setLayoutParams(T1);
                                button4_5.setLayoutParams(T1);button4_6.setLayoutParams(T1);
                                button4_7.setLayoutParams(T1);
                                break;
                            default:
                                button4_1.setLayoutParams(T0);button4_2.setLayoutParams(T0);
                                button4_3.setLayoutParams(T0);button4_4.setLayoutParams(T0);
                                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                                button4_7.setLayoutParams(T0);button4_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_4_2:
                    if (null != backdata) {
                        String TIMES_4_2 = backdata.getStringExtra("backtimename");
                        String TIME_count_4_2 = backdata.getStringExtra("backtimenumber");
                        button4_2.setText(TIMES_4_2);
                        int TC_4_2=Integer.parseInt(TIME_count_4_2);
                        String ur_4_2=backdata.getStringExtra("URL");
                        c4_2=ur_4_2;
                        if(TC_4_2>8){
                            TC_4_2=2;
                        }
                        editor1.putString("data4_2",TIMES_4_2);
                        editor_n1.putInt("number4_2",TC_4_2);
                        editorU1.putString("uri4_2",ur_4_2);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_4_2){
                            case 2:
                                button4_2.setLayoutParams(T2);button4_3.setLayoutParams(T1);
                                button4_4.setLayoutParams(T0);button4_5.setLayoutParams(T0);
                                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button4_2.setLayoutParams(T3);button4_3.setLayoutParams(T1);
                                button4_4.setLayoutParams(T1);button4_5.setLayoutParams(T0);
                                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button4_2.setLayoutParams(T4);button4_3.setLayoutParams(T1);
                                button4_4.setLayoutParams(T1);button4_5.setLayoutParams(T1);
                                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                                break;
                            case 5:
                                button4_2.setLayoutParams(T5);button4_3.setLayoutParams(T1);
                                button4_4.setLayoutParams(T1);button4_5.setLayoutParams(T1);
                                button4_6.setLayoutParams(T1);button4_7.setLayoutParams(T0);
                                break;
                            case 6:
                                button4_2.setLayoutParams(T6);button4_3.setLayoutParams(T1);
                                button4_4.setLayoutParams(T1);button4_5.setLayoutParams(T1);
                                button4_6.setLayoutParams(T1);button4_7.setLayoutParams(T1);
                                break;
                            default:
                                button4_1.setLayoutParams(T0);button4_2.setLayoutParams(T0);
                                button4_3.setLayoutParams(T0);button4_4.setLayoutParams(T0);
                                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                                button4_7.setLayoutParams(T0);button4_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_4_3:
                    if (null != backdata) {
                        String TIMES_4_3 = backdata.getStringExtra("backtimename");
                        String TIME_count_4_3 = backdata.getStringExtra("backtimenumber");
                        button4_3.setText(TIMES_4_3);
                        int TC_4_3=Integer.parseInt(TIME_count_4_3);
                        String ur_4_3=backdata.getStringExtra("URL");
                        c4_3=ur_4_3;
                        editor1.putString("data4_3",TIMES_4_3);
                        editor_n1.putInt("number4_3",TC_4_3);
                        editorU1.putString("uri4_3",ur_4_3);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_4_3){
                            case 2:
                                button4_3.setLayoutParams(T2);button4_4.setLayoutParams(T1);
                                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                                button4_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button4_3.setLayoutParams(T3);button4_4.setLayoutParams(T1);
                                button4_5.setLayoutParams(T1);button4_6.setLayoutParams(T0);
                                button4_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button4_3.setLayoutParams(T4);button4_4.setLayoutParams(T1);
                                button4_5.setLayoutParams(T1);button4_6.setLayoutParams(T1);
                                button4_7.setLayoutParams(T0);
                                break;
                            case 5:
                                button4_3.setLayoutParams(T5);button4_4.setLayoutParams(T1);
                                button4_5.setLayoutParams(T1);button4_6.setLayoutParams(T1);
                                button4_7.setLayoutParams(T1);
                                break;
                            default:
                                button4_1.setLayoutParams(T0);button4_2.setLayoutParams(T0);
                                button4_3.setLayoutParams(T0);button4_4.setLayoutParams(T0);
                                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                                button4_7.setLayoutParams(T0);button4_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_4_4:
                    if (null != backdata) {
                        String TIMES_4_4 = backdata.getStringExtra("backtimename");
                        String TIME_count_4_4 = backdata.getStringExtra("backtimenumber");
                        button4_4.setText(TIMES_4_4);
                        int TC_4_4=Integer.parseInt(TIME_count_4_4);
                        String ur_4_4=backdata.getStringExtra("URL");
                        c4_4=ur_4_4;
                        if(TC_4_4>8){
                            TC_4_4=2;
                        }
                        editor1.putString("data4_4",TIMES_4_4);
                        editor_n1.putInt("number4_4",TC_4_4);
                        editorU1.putString("uri4_4",ur_4_4);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_4_4){
                            case 2:
                                button4_4.setLayoutParams(T2);button4_5.setLayoutParams(T1);
                                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button4_4.setLayoutParams(T3);button4_5.setLayoutParams(T1);
                                button4_6.setLayoutParams(T1);button4_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button4_4.setLayoutParams(T4);button4_5.setLayoutParams(T1);
                                button4_6.setLayoutParams(T1);button4_7.setLayoutParams(T1);
                                break;
                            default:
                                button4_1.setLayoutParams(T0);button4_2.setLayoutParams(T0);
                                button4_3.setLayoutParams(T0);button4_4.setLayoutParams(T0);
                                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                                button4_7.setLayoutParams(T0);button4_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_4_5:
                    if (null != backdata) {
                        String TIMES_4_5 = backdata.getStringExtra("backtimename");
                        String TIME_count_4_5 = backdata.getStringExtra("backtimenumber");
                        button4_5.setText(TIMES_4_5);
                        int TC_4_5=Integer.parseInt(TIME_count_4_5);
                        String ur_4_5=backdata.getStringExtra("URL");
                        c4_5=ur_4_5;
                        editor1.putString("data4_5",TIMES_4_5);
                        editor_n1.putInt("number4_5",TC_4_5);
                        editorU1.putString("uri4_5",ur_4_5);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_4_5){
                            case 2:
                                button4_5.setLayoutParams(T2);button4_6.setLayoutParams(T1);
                                button4_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button4_5.setLayoutParams(T3);button4_6.setLayoutParams(T1);
                                button4_7.setLayoutParams(T1);
                                break;
                            default:
                                button4_1.setLayoutParams(T0);button4_2.setLayoutParams(T0);
                                button4_3.setLayoutParams(T0);button4_4.setLayoutParams(T0);
                                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                                button4_7.setLayoutParams(T0);button4_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_4_6:
                    if (null != backdata) {
                        String TIMES_4_6 = backdata.getStringExtra("backtimename");
                        String TIME_count_4_6 = backdata.getStringExtra("backtimenumber");
                        button4_6.setText(TIMES_4_6);
                        int TC_4_6=Integer.parseInt(TIME_count_4_6);
                        String ur_4_6=backdata.getStringExtra("URL");
                        c4_6=ur_4_6;
                        if(TC_4_6>8){
                            TC_4_6=2;
                        }
                        editor1.putString("data4_6",TIMES_4_6);
                        editor_n1.putInt("number4_6",TC_4_6);
                        editorU1.putString("uri4_6",ur_4_6);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_4_6){
                            case 2:
                                button4_6.setLayoutParams(T2);button4_7.setLayoutParams(T1);
                                break;
                            default:
                                button4_1.setLayoutParams(T0);button4_2.setLayoutParams(T0);
                                button4_3.setLayoutParams(T0);button4_4.setLayoutParams(T0);
                                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                                button4_7.setLayoutParams(T0);button4_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_4_7:
                    if (null != backdata) {
                        String TIMES_4_7 = backdata.getStringExtra("backtimename");
                        String TIME_count_4_7 = backdata.getStringExtra("backtimenumber");
                        button4_7.setText(TIMES_4_7);
                        int TC_4_7=Integer.parseInt(TIME_count_4_7);
                        String ur_4_7=backdata.getStringExtra("URL");
                        c4_7=ur_4_7;
                        editor1.putString("data4_7",TIMES_4_7);
                        editor_n1.putInt("number4_7",TC_4_7);
                        editorU1.putString("uri4_7",ur_4_7);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                    }
                    break;
                case TIME_5:
                    if (null != backdata) {
                        String TIMES_5 = backdata.getStringExtra("backtimename");
                        String TIME_count_5 = backdata.getStringExtra("backtimenumber");
                        button5_0.setText(TIMES_5);
                        int TC_5=Integer.parseInt(TIME_count_5);
                        String ur_5=backdata.getStringExtra("URL");
                        c5=ur_5;
                        if(TC_5>8){
                            TC_5=2;
                        }
                        editor1.putString("data5",TIMES_5);
                        editor_n1.putInt("number5",TC_5);
                        editorU1.putString("uri5",ur_5);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_5){
                            case 2:
                                button5_0.setLayoutParams(T2);button5_1.setLayoutParams(T1);
                                button5_2.setLayoutParams(T0);button5_3.setLayoutParams(T0);
                                button5_4.setLayoutParams(T0);button5_5.setLayoutParams(T0);
                                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button5_0.setLayoutParams(T3);button5_1.setLayoutParams(T1);
                                button5_2.setLayoutParams(T1);button5_3.setLayoutParams(T0);
                                button5_4.setLayoutParams(T0);button5_5.setLayoutParams(T0);
                                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button5_0.setLayoutParams(T4);button5_1.setLayoutParams(T1);
                                button5_2.setLayoutParams(T1);button5_3.setLayoutParams(T1);
                                button5_4.setLayoutParams(T0);button5_5.setLayoutParams(T0);
                                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                                break;
                            case 5:
                                button5_0.setLayoutParams(T5);button5_1.setLayoutParams(T1);
                                button5_2.setLayoutParams(T1);button5_3.setLayoutParams(T1);
                                button5_4.setLayoutParams(T1);button5_5.setLayoutParams(T0);
                                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                                break;
                            case 6:
                                button5_0.setLayoutParams(T6);button5_1.setLayoutParams(T1);
                                button5_2.setLayoutParams(T1);button5_3.setLayoutParams(T1);
                                button5_4.setLayoutParams(T1);button5_5.setLayoutParams(T1);
                                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                                break;
                            case 7:
                                button5_0.setLayoutParams(T7);button5_1.setLayoutParams(T1);
                                button5_2.setLayoutParams(T1);button5_3.setLayoutParams(T1);
                                button5_4.setLayoutParams(T1);button5_5.setLayoutParams(T1);
                                button5_6.setLayoutParams(T1);button5_7.setLayoutParams(T0);
                                break;
                            case 8:
                                button5_1.setLayoutParams(T1);button5_2.setLayoutParams(T1);
                                button5_3.setLayoutParams(T1);button5_4.setLayoutParams(T1);
                                button5_5.setLayoutParams(T1);button5_6.setLayoutParams(T1);
                                button5_7.setLayoutParams(T1);button5_0.setLayoutParams(T8);
                                break;
                            default:
                                button5_1.setLayoutParams(T0);button5_2.setLayoutParams(T0);
                                button5_3.setLayoutParams(T0);button5_4.setLayoutParams(T0);
                                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                                button5_7.setLayoutParams(T0);button5_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_5_1:
                    if (null != backdata) {
                        String TIMES_5_1 = backdata.getStringExtra("backtimename");
                        String TIME_count_5_1 = backdata.getStringExtra("backtimenumber");
                        button5_1.setText(TIMES_5_1);
                        int TC_5_1=Integer.parseInt(TIME_count_5_1);
                        String ur_5_1=backdata.getStringExtra("URL");
                        c5_1=ur_5_1;
                        editor1.putString("data5_1",TIMES_5_1);
                        editor_n1.putInt("number5_1",TC_5_1);
                        editorU1.putString("uri5_1",ur_5_1);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_5_1){
                            case 2:
                                button5_1.setLayoutParams(T2);button5_2.setLayoutParams(T1);
                                button5_3.setLayoutParams(T0);button5_4.setLayoutParams(T0);
                                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                                button5_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button5_1.setLayoutParams(T3);button5_2.setLayoutParams(T1);
                                button5_3.setLayoutParams(T1);button5_4.setLayoutParams(T0);
                                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                                button5_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button5_1.setLayoutParams(T4);button5_2.setLayoutParams(T1);
                                button5_3.setLayoutParams(T1);button5_4.setLayoutParams(T1);
                                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                                button5_7.setLayoutParams(T0);
                                break;
                            case 5:
                                button5_1.setLayoutParams(T5);button5_2.setLayoutParams(T1);
                                button5_3.setLayoutParams(T1);button5_4.setLayoutParams(T1);
                                button5_5.setLayoutParams(T1);button5_6.setLayoutParams(T0);
                                button5_7.setLayoutParams(T0);
                                break;
                            case 6:
                                button5_1.setLayoutParams(T6);button5_2.setLayoutParams(T1);
                                button5_3.setLayoutParams(T1);button5_4.setLayoutParams(T1);
                                button5_5.setLayoutParams(T1);button5_6.setLayoutParams(T1);
                                button5_7.setLayoutParams(T0);
                                break;
                            case 7:
                                button5_1.setLayoutParams(T7);button5_2.setLayoutParams(T1);
                                button5_3.setLayoutParams(T1);button5_4.setLayoutParams(T1);
                                button5_5.setLayoutParams(T1);button5_6.setLayoutParams(T1);
                                button5_7.setLayoutParams(T1);
                                break;
                            default:
                                button5_1.setLayoutParams(T0);button5_2.setLayoutParams(T0);
                                button5_3.setLayoutParams(T0);button5_4.setLayoutParams(T0);
                                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                                button5_7.setLayoutParams(T0);button5_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_5_2:
                    if (null != backdata) {
                        String TIMES_5_2 = backdata.getStringExtra("backtimename");
                        String TIME_count_5_2 = backdata.getStringExtra("backtimenumber");
                        button5_2.setText(TIMES_5_2);
                        int TC_5_2=Integer.parseInt(TIME_count_5_2);
                        String ur_5_2=backdata.getStringExtra("URL");
                        c5_2=ur_5_2;
                        if(TC_5_2>8){
                            TC_5_2=2;
                        }
                        editor1.putString("data5_2",TIMES_5_2);
                        editor_n1.putInt("number5_2",TC_5_2);
                        editorU1.putString("uri5_2",ur_5_2);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_5_2){
                            case 2:
                                button5_2.setLayoutParams(T2);button5_3.setLayoutParams(T1);
                                button5_4.setLayoutParams(T0);button5_5.setLayoutParams(T0);
                                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button5_2.setLayoutParams(T3);button5_3.setLayoutParams(T1);
                                button5_4.setLayoutParams(T1);button5_5.setLayoutParams(T0);
                                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button5_2.setLayoutParams(T4);button5_3.setLayoutParams(T1);
                                button5_4.setLayoutParams(T1);button5_5.setLayoutParams(T1);
                                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                                break;
                            case 5:
                                button5_2.setLayoutParams(T5);button5_3.setLayoutParams(T1);
                                button5_4.setLayoutParams(T1);button5_5.setLayoutParams(T1);
                                button5_6.setLayoutParams(T1);button5_7.setLayoutParams(T0);
                                break;
                            case 6:
                                button5_2.setLayoutParams(T6);button5_3.setLayoutParams(T1);
                                button5_4.setLayoutParams(T1);button5_5.setLayoutParams(T1);
                                button5_6.setLayoutParams(T1);button5_7.setLayoutParams(T1);
                                break;
                            default:
                                button5_1.setLayoutParams(T0);button5_2.setLayoutParams(T0);
                                button5_3.setLayoutParams(T0);button5_4.setLayoutParams(T0);
                                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                                button5_7.setLayoutParams(T0);button5_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_5_3:
                    if (null != backdata) {
                        String TIMES_5_3 = backdata.getStringExtra("backtimename");
                        String TIME_count_5_3 = backdata.getStringExtra("backtimenumber");
                        button5_3.setText(TIMES_5_3);
                        int TC_5_3=Integer.parseInt(TIME_count_5_3);
                        String ur_5_3=backdata.getStringExtra("URL");
                        c5_3=ur_5_3;
                        editor1.putString("data5_3",TIMES_5_3);
                        editor_n1.putInt("number5_3",TC_5_3);
                        editorU1.putString("uri5_3",ur_5_3);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_5_3){
                            case 2:
                                button5_3.setLayoutParams(T2);button5_4.setLayoutParams(T1);
                                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                                button5_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button5_3.setLayoutParams(T3);button5_4.setLayoutParams(T1);
                                button5_5.setLayoutParams(T1);button5_6.setLayoutParams(T0);
                                button5_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button5_3.setLayoutParams(T4);button5_4.setLayoutParams(T1);
                                button5_5.setLayoutParams(T1);button5_6.setLayoutParams(T1);
                                button5_7.setLayoutParams(T0);
                                break;
                            case 5:
                                button5_3.setLayoutParams(T5);button5_4.setLayoutParams(T1);
                                button5_5.setLayoutParams(T1);button5_6.setLayoutParams(T1);
                                button5_7.setLayoutParams(T1);
                                break;
                            default:
                                button5_1.setLayoutParams(T0);button5_2.setLayoutParams(T0);
                                button5_3.setLayoutParams(T0);button5_4.setLayoutParams(T0);
                                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                                button5_7.setLayoutParams(T0);button5_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_5_4:
                    if (null != backdata) {
                        String TIMES_5_4 = backdata.getStringExtra("backtimename");
                        String TIME_count_5_4 = backdata.getStringExtra("backtimenumber");
                        button5_4.setText(TIMES_5_4);
                        int TC_5_4=Integer.parseInt(TIME_count_5_4);
                        String ur_5_4=backdata.getStringExtra("URL");
                        c5_4=ur_5_4;
                        if(TC_5_4>8){
                            TC_5_4=2;
                        }
                        editor1.putString("data5_4",TIMES_5_4);
                        editor_n1.putInt("number5_4",TC_5_4);
                        editorU1.putString("uri5_4",ur_5_4);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_5_4){
                            case 2:
                                button5_4.setLayoutParams(T2);button5_5.setLayoutParams(T1);
                                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button5_4.setLayoutParams(T3);button5_5.setLayoutParams(T1);
                                button5_6.setLayoutParams(T1);button5_7.setLayoutParams(T0);
                                break;
                            case 4:
                                button5_4.setLayoutParams(T4);button5_5.setLayoutParams(T1);
                                button5_6.setLayoutParams(T1);button5_7.setLayoutParams(T1);
                                break;
                            default:
                                button5_1.setLayoutParams(T0);button5_2.setLayoutParams(T0);
                                button5_3.setLayoutParams(T0);button5_4.setLayoutParams(T0);
                                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                                button5_7.setLayoutParams(T0);button5_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_5_5:
                    if (null != backdata) {
                        String TIMES_5_5 = backdata.getStringExtra("backtimename");
                        String TIME_count_5_5 = backdata.getStringExtra("backtimenumber");
                        button5_5.setText(TIMES_5_5);
                        int TC_5_5=Integer.parseInt(TIME_count_5_5);
                        String ur_5_5=backdata.getStringExtra("URL");
                        c5_5=ur_5_5;
                        editor1.putString("data5_5",TIMES_5_5);
                        editor_n1.putInt("number5_5",TC_5_5);
                        editorU1.putString("uri5_5",ur_5_5);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_5_5){
                            case 2:
                                button5_5.setLayoutParams(T2);button5_6.setLayoutParams(T1);
                                button5_7.setLayoutParams(T0);
                                break;
                            case 3:
                                button5_5.setLayoutParams(T3);button5_6.setLayoutParams(T1);
                                button5_7.setLayoutParams(T1);
                                break;
                            default:
                                button5_1.setLayoutParams(T0);button5_2.setLayoutParams(T0);
                                button5_3.setLayoutParams(T0);button5_4.setLayoutParams(T0);
                                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                                button5_7.setLayoutParams(T0);button5_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_5_6:
                    if (null != backdata) {
                        String TIMES_5_6 = backdata.getStringExtra("backtimename");
                        String TIME_count_5_6 = backdata.getStringExtra("backtimenumber");
                        button5_6.setText(TIMES_5_6);
                        int TC_5_6=Integer.parseInt(TIME_count_5_6);
                        String ur_5_6=backdata.getStringExtra("URL");
                        c5_6=ur_5_6;
                        if(TC_5_6>8){
                            TC_5_6=2;
                        }
                        editor1.putString("data5_6",TIMES_5_6);
                        editor_n1.putInt("number5_6",TC_5_6);
                        editorU1.putString("uri5_6",ur_5_6);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                        switch(TC_5_6){
                            case 2:
                                button5_6.setLayoutParams(T2);button5_7.setLayoutParams(T1);
                                break;
                            default:
                                button5_1.setLayoutParams(T0);button5_2.setLayoutParams(T0);
                                button5_3.setLayoutParams(T0);button5_4.setLayoutParams(T0);
                                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                                button5_7.setLayoutParams(T0);button5_0.setLayoutParams(T0);
                                break;
                        }
                    }
                    break;
                case TIME_5_7:
                    if (null != backdata) {
                        String TIMES_5_7 = backdata.getStringExtra("backtimename");
                        String TIME_count_5_7 = backdata.getStringExtra("backtimenumber");
                        button5_7.setText(TIMES_5_7);
                        int TC_5_7=Integer.parseInt(TIME_count_5_7);
                        String ur_5_7=backdata.getStringExtra("URL");
                        c5_7=ur_5_7;
                        editor1.putString("data5_7",TIMES_5_7);
                        editor_n1.putInt("number5_7",TC_5_7);
                        editorU1.putString("uri5_7",ur_5_7);
                        editor1.commit();editor_n1.commit();editorU1.commit();
                    }
            }
        }
    }

}
