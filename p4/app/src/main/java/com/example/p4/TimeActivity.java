package com.example.p4;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import static android.graphics.Color.BLUE;
import static android.graphics.Color.CYAN;
import static android.graphics.Color.GRAY;
import static android.graphics.Color.GREEN;
import static android.graphics.Color.MAGENTA;
import static android.graphics.Color.RED;
import static android.graphics.Color.TRANSPARENT;
import static android.graphics.Color.YELLOW;

public class TimeActivity extends AppCompatActivity {
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
    LinearLayout line_0,line_1,line_2,line_3,line_4,line_5;
    LinearLayout line_0_0,line_0_1,line_0_2,line_0_3,line_0_4,line_0_5;
    LinearLayout.LayoutParams T1,T2,T3,T4,T5,T6,T7,T8,T0;
    Calendar cal=Calendar.getInstance();
    int week=cal.get(Calendar.DAY_OF_WEEK);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        line_0=findViewById(R.id.line1);
        line_1=findViewById(R.id.line2);
        line_2=findViewById(R.id.line3);
        line_3=findViewById(R.id.line4);
        line_4=findViewById(R.id.line5);
        line_5=findViewById(R.id.line6);
        line_0_1=findViewById(R.id.line2);line_0_2=findViewById(R.id.line3);
        line_0_3=findViewById(R.id.line4);line_0_4=findViewById(R.id.line5);line_0_5=findViewById(R.id.line6);
        switch (week){
            case Calendar.MONDAY:
                break;
            case Calendar.TUESDAY:
                line_1.setGravity(line_5.FOCUS_RIGHT);
                line_2.setGravity(line_0.FOCUS_RIGHT);
                line_3.setGravity(line_2.FOCUS_RIGHT);
                line_4.setGravity(line_3.FOCUS_RIGHT);
                line_5.setGravity(line_4.FOCUS_RIGHT);

                break;
            case Calendar.WEDNESDAY:
                line_1=line_0_3;line_2=line_0_4;
                line_3=line_0_5;line_4=line_0_1;line_5=line_0_2;
                break;
            case Calendar.THURSDAY:
                line_1=line_0_4;line_2=line_0_5;
                line_3=line_0_1;line_4=line_0_2;line_5=line_0_3;


                break;
            case Calendar.FRIDAY:
                line_1=line_0_5;line_2=line_0_1;
                line_3=line_0_2;line_4=line_0_3;line_5=line_0_4;
                break;
            case Calendar.SATURDAY:
                line_1=line_0_1;line_2=line_0_2;
                line_3=line_0_3;line_4=line_0_4;line_5=line_0_5;
                break;
            case Calendar.SUNDAY:

                break;
        }

        button1_0 = findViewById(R.id.button1);
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
        button1_0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent1, TIME_1);
            }

        });

        button1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1_1 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent1_1, TIME_1_1);
            }
        });
        button1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1_2 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent1_2, TIME_1_2);
            }
        });
        button1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1_3 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent1_3, TIME_1_3);
            }
        });
        button1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1_4 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent1_4, TIME_1_4);
            }
        });
        button1_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1_5 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent1_5, TIME_1_5);
            }
        });
        button1_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1_6 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent1_6, TIME_1_6);
            }
        });
        button1_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1_7 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent1_7, TIME_1_7);
            }
        });
        button2_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent2, TIME_2);
            }
        });
        button2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2_1 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent2_1, TIME_2_1);
            }
        });
        button2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2_2 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent2_2, TIME_2_2);
            }
        });
        button2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2_3 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent2_3, TIME_2_3);
            }
        });
        button2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2_4 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent2_4, TIME_2_4);
            }
        });

        button2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2_5 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent2_5, TIME_2_5);
            }
        });
        button2_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2_6 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent2_6, TIME_2_6);
            }
        });
        button2_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2_7 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent2_7, TIME_2_7);
            }
        });
        button3_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent3, TIME_3);
            }
        });
        button3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3_1 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent3_1, TIME_3_1);
            }
        });
        button3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3_2 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent3_2, TIME_3_2);
            }
        });
        button3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3_3 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent3_3, TIME_3_3);
            }
        });
        button3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3_4 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent3_4, TIME_3_4);
            }
        });
        button3_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3_5 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent3_5, TIME_3_5);
            }
        });
        button3_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3_6 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent3_6, TIME_3_6);
            }
        });
        button3_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3_7 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent3_7, TIME_3_7);
            }
        });
        button4_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent4, TIME_4);
            }
        });
        button4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4_1 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent4_1, TIME_4_1);
            }
        });
        button4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4_2 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent4_2, TIME_4_2);
            }
        });
        button4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4_3 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent4_3, TIME_4_3);
            }
        });
        button4_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4_4 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent4_4, TIME_4_4);
            }
        });
        button4_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4_5 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent4_5, TIME_4_5);
            }
        });
        button4_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4_6 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent4_6, TIME_4_6);
            }
        });
        button4_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4_7 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent4_7, TIME_4_7);
            }
        });
        button5_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent5, TIME_5);
            }
        });
        button5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5_1 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent5_1, TIME_5_1);
            }
        });
        button5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5_2 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent5_2, TIME_5_2);
            }
        });
        button5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5_3 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent5_3, TIME_5_3);
            }
        });
        button5_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5_4 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent5_4, TIME_5_4);
            }
        });
        button5_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5_5 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent5_5, TIME_5_5);
            }
        });
        button5_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5_6 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent5_6, TIME_5_6);
            }
        });
        button5_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5_7 = new Intent(getApplication(), SubActivity.class);
                startActivityForResult(intent5_7, TIME_5_7);
            }
        });



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
        if (resultcode == Activity.RESULT_OK) {
            switch (requestcode) {
                case TIME_1:
                    if (null != backdata) {
                        String TIMES_1 = backdata.getStringExtra("backtimename");
                        String TIME_count_1 = backdata.getStringExtra("backtimenumber");
                        button1_0.setText(TIMES_1);
                        int TC_1 = Integer.parseInt(TIME_count_1);
                        switch(TC_1){
                            case 2:
                                button1_0.setLayoutParams(T2);button1_1.setLayoutParams(T1);
                                button1_2.setLayoutParams(T0);button1_3.setLayoutParams(T0);
                                button1_4.setLayoutParams(T0);button1_5.setLayoutParams(T0);
                                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);
                                button1_0.setBackgroundColor(GREEN);
                                break;
                            case 3:
                                button1_0.setLayoutParams(T3);button1_1.setLayoutParams(T1);
                                button1_2.setLayoutParams(T1);button1_3.setLayoutParams(T0);
                                button1_4.setLayoutParams(T0);button1_5.setLayoutParams(T0);
                                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);
                                button1_0.setBackgroundColor(GREEN);
                                break;
                            case 4:
                                button1_0.setLayoutParams(T4);button1_1.setLayoutParams(T1);
                                button1_2.setLayoutParams(T1);button1_3.setLayoutParams(T1);
                                button1_4.setLayoutParams(T0);button1_5.setLayoutParams(T0);
                                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);
                                button1_0.setBackgroundColor(GREEN);
                                break;
                            case 5:
                                button1_0.setLayoutParams(T5);button1_1.setLayoutParams(T1);
                                button1_2.setLayoutParams(T1);button1_3.setLayoutParams(T1);
                                button1_4.setLayoutParams(T1);button1_5.setLayoutParams(T0);
                                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);
                                button1_0.setBackgroundColor(GREEN);
                                break;
                            case 6:
                                button1_0.setLayoutParams(T6);button1_1.setLayoutParams(T1);
                                button1_2.setLayoutParams(T1);button1_3.setLayoutParams(T1);
                                button1_4.setLayoutParams(T1);button1_5.setLayoutParams(T1);
                                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);
                                button1_0.setBackgroundColor(GREEN);
                                break;
                            case 7:
                                button1_0.setLayoutParams(T7);button1_1.setLayoutParams(T1);
                                button1_2.setLayoutParams(T1);button1_3.setLayoutParams(T1);
                                button1_4.setLayoutParams(T1);button1_5.setLayoutParams(T1);
                                button1_6.setLayoutParams(T1);button1_7.setLayoutParams(T0);
                                button1_0.setBackgroundColor(GREEN);
                                break;
                            case 8:
                                button1_1.setLayoutParams(T1);button1_2.setLayoutParams(T1);
                                button1_3.setLayoutParams(T1);button1_4.setLayoutParams(T1);
                                button1_5.setLayoutParams(T1);button1_6.setLayoutParams(T1);
                                button1_7.setLayoutParams(T1);button1_0.setLayoutParams(T8);
                                button1_0.setBackgroundColor(GREEN);
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
                        switch(TC_1_1){
                            case 2:
                                button1_1.setLayoutParams(T2);button1_2.setLayoutParams(T1);
                                button1_3.setLayoutParams(T0);button1_4.setLayoutParams(T0);
                                button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                                button1_7.setLayoutParams(T0);
                                button1_1.setBackgroundColor(MAGENTA);
                                break;
                            case 3:
                                button1_1.setLayoutParams(T3);button1_2.setLayoutParams(T1);
                                button1_3.setLayoutParams(T1);button1_4.setLayoutParams(T0);
                                button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                                button1_7.setLayoutParams(T0);
                                button1_1.setBackgroundColor(MAGENTA);
                                break;
                            case 4:
                                button1_1.setLayoutParams(T4);button1_2.setLayoutParams(T1);
                                button1_3.setLayoutParams(T1);button1_4.setLayoutParams(T1);
                                button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                                button1_7.setLayoutParams(T0);
                                button1_1.setBackgroundColor(MAGENTA);
                                break;
                            case 5:
                                button1_1.setLayoutParams(T5);button1_2.setLayoutParams(T1);
                                button1_3.setLayoutParams(T1);button1_4.setLayoutParams(T1);
                                button1_5.setLayoutParams(T1);button1_6.setLayoutParams(T0);
                                button1_7.setLayoutParams(T0);
                                button1_1.setBackgroundColor(MAGENTA);
                                break;
                            case 6:
                                button1_1.setLayoutParams(T6);button1_2.setLayoutParams(T1);
                                button1_3.setLayoutParams(T1);button1_4.setLayoutParams(T1);
                                button1_5.setLayoutParams(T1);button1_6.setLayoutParams(T1);
                                button1_7.setLayoutParams(T0);
                                button1_1.setBackgroundColor(MAGENTA);
                                break;
                            case 7:
                                button1_1.setLayoutParams(T7);button1_2.setLayoutParams(T1);
                                button1_3.setLayoutParams(T1);button1_4.setLayoutParams(T1);
                                button1_5.setLayoutParams(T1);button1_6.setLayoutParams(T1);
                                button1_7.setLayoutParams(T1);
                                button1_1.setBackgroundColor(MAGENTA);
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
                        switch(TC_1_2){
                            case 2:
                                button1_2.setLayoutParams(T2);button1_3.setLayoutParams(T1);
                                button1_4.setLayoutParams(T0);button1_5.setLayoutParams(T0);
                                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);
                                button1_2.setBackgroundColor(CYAN);
                                break;
                            case 3:
                                button1_2.setLayoutParams(T3);button1_3.setLayoutParams(T1);
                                button1_4.setLayoutParams(T1);button1_5.setLayoutParams(T0);
                                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);
                                button1_2.setBackgroundColor(CYAN);
                                break;
                            case 4:
                                button1_2.setLayoutParams(T4);button1_3.setLayoutParams(T1);
                                button1_4.setLayoutParams(T1);button1_5.setLayoutParams(T1);
                                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);
                                button1_2.setBackgroundColor(CYAN);
                                break;
                            case 5:
                                button1_2.setLayoutParams(T5);button1_3.setLayoutParams(T1);
                                button1_4.setLayoutParams(T1);button1_5.setLayoutParams(T1);
                                button1_6.setLayoutParams(T1);button1_7.setLayoutParams(T0);
                                button1_2.setBackgroundColor(CYAN);
                                break;
                            case 6:
                                button1_2.setLayoutParams(T6);button1_3.setLayoutParams(T1);
                                button1_4.setLayoutParams(T1);button1_5.setLayoutParams(T1);
                                button1_6.setLayoutParams(T1);button1_7.setLayoutParams(T1);
                                button1_2.setBackgroundColor(CYAN);
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
                        switch(TC_1_3){
                            case 2:
                                button1_3.setLayoutParams(T2);button1_4.setLayoutParams(T1);
                                button1_5.setLayoutParams(T0);button1_6.setLayoutParams(T0);
                                button1_7.setLayoutParams(T0);
                                button1_3.setBackgroundColor(YELLOW);
                                break;
                            case 3:
                                button1_3.setLayoutParams(T3);button1_4.setLayoutParams(T1);
                                button1_5.setLayoutParams(T1);button1_6.setLayoutParams(T0);
                                button1_7.setLayoutParams(T0);
                                button1_3.setBackgroundColor(YELLOW);
                                break;
                            case 4:
                                button1_3.setLayoutParams(T4);button1_4.setLayoutParams(T1);
                                button1_5.setLayoutParams(T1);button1_6.setLayoutParams(T1);
                                button1_7.setLayoutParams(T0);
                                button1_3.setBackgroundColor(YELLOW);
                                break;
                            case 5:
                                button1_3.setLayoutParams(T5);button1_4.setLayoutParams(T1);
                                button1_5.setLayoutParams(T1);button1_6.setLayoutParams(T1);
                                button1_7.setLayoutParams(T1);
                                button1_3.setBackgroundColor(YELLOW);
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
                        switch(TC_1_4){
                            case 2:
                                button1_4.setLayoutParams(T2);button1_5.setLayoutParams(T1);
                                button1_6.setLayoutParams(T0);button1_7.setLayoutParams(T0);
                                button1_4.setBackgroundColor(GRAY);
                                break;
                            case 3:
                                button1_4.setLayoutParams(T3);button1_5.setLayoutParams(T1);
                                button1_6.setLayoutParams(T1);button1_7.setLayoutParams(T0);
                                button1_4.setBackgroundColor(GRAY);
                                break;
                            case 4:
                                button1_4.setLayoutParams(T4);button1_5.setLayoutParams(T1);
                                button1_6.setLayoutParams(T1);button1_7.setLayoutParams(T1);
                                button1_4.setBackgroundColor(GRAY);
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
                        switch(TC_1_5){
                            case 2:
                                button1_5.setLayoutParams(T2);button1_6.setLayoutParams(T1);
                                button1_7.setLayoutParams(T0);
                                button1_5.setBackgroundColor(RED);
                                break;
                            case 3:
                                button1_5.setLayoutParams(T3);button1_6.setLayoutParams(T1);
                                button1_7.setLayoutParams(T1);
                                button1_5.setBackgroundColor(RED);
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
                        switch(TC_1_6) {
                            case 2:
                                button1_6.setLayoutParams(T2);button1_7.setLayoutParams(T1);
                                button1_6.setBackgroundColor(BLUE);
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
                        button1_7.setBackgroundColor(TRANSPARENT);
                    }
                    break;
                case TIME_2:
                    if (null != backdata) {
                        String TIMES_2 = backdata.getStringExtra("backtimename");
                        String TIME_count_2 = backdata.getStringExtra("backtimenumber");
                        button2_0.setText(TIMES_2);
                        int TC_2=Integer.parseInt(TIME_count_2);
                        switch(TC_2){
                            case 2:
                                button2_0.setLayoutParams(T2);button2_1.setLayoutParams(T1);
                                button2_2.setLayoutParams(T0);button2_3.setLayoutParams(T0);
                                button2_4.setLayoutParams(T0);button2_5.setLayoutParams(T0);
                                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                                button2_0.setBackgroundColor(GREEN);
                                break;
                            case 3:
                                button2_0.setLayoutParams(T3);button2_1.setLayoutParams(T1);
                                button2_2.setLayoutParams(T1);button2_3.setLayoutParams(T0);
                                button2_4.setLayoutParams(T0);button2_5.setLayoutParams(T0);
                                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                                button2_0.setBackgroundColor(GREEN);
                                break;
                            case 4:
                                button2_0.setLayoutParams(T4);button2_1.setLayoutParams(T1);
                                button2_2.setLayoutParams(T1);button2_3.setLayoutParams(T1);
                                button2_4.setLayoutParams(T0);button2_5.setLayoutParams(T0);
                                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                                button2_0.setBackgroundColor(GREEN);
                                break;
                            case 5:
                                button2_0.setLayoutParams(T5);button2_1.setLayoutParams(T1);
                                button2_2.setLayoutParams(T1);button2_3.setLayoutParams(T1);
                                button2_4.setLayoutParams(T1);button2_5.setLayoutParams(T0);
                                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                                button2_0.setBackgroundColor(GREEN);
                                break;
                            case 6:
                                button2_0.setLayoutParams(T6);button2_1.setLayoutParams(T1);
                                button2_2.setLayoutParams(T1);button2_3.setLayoutParams(T1);
                                button2_4.setLayoutParams(T1);button2_5.setLayoutParams(T1);
                                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                                button2_0.setBackgroundColor(GREEN);
                                break;
                            case 7:
                                button2_0.setLayoutParams(T7);button2_1.setLayoutParams(T1);
                                button2_2.setLayoutParams(T1);button2_3.setLayoutParams(T1);
                                button2_4.setLayoutParams(T1);button2_5.setLayoutParams(T1);
                                button2_6.setLayoutParams(T1);button2_7.setLayoutParams(T0);
                                button2_0.setBackgroundColor(GREEN);
                                break;
                            case 8:
                                button2_1.setLayoutParams(T1);button2_2.setLayoutParams(T1);
                                button2_3.setLayoutParams(T1);button2_4.setLayoutParams(T1);
                                button2_5.setLayoutParams(T1);button2_6.setLayoutParams(T1);
                                button2_7.setLayoutParams(T1);button2_0.setLayoutParams(T8);
                                button2_0.setBackgroundColor(GREEN);
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
                        switch(TC_2_1){
                            case 2:
                                button2_1.setLayoutParams(T2);button2_2.setLayoutParams(T1);
                                button2_3.setLayoutParams(T0);button2_4.setLayoutParams(T0);
                                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                                button2_7.setLayoutParams(T0);
                                button2_1.setBackgroundColor(MAGENTA);
                                break;
                            case 3:
                                button2_1.setLayoutParams(T3);button2_2.setLayoutParams(T1);
                                button2_3.setLayoutParams(T1);button2_4.setLayoutParams(T0);
                                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                                button2_7.setLayoutParams(T0);
                                button2_1.setBackgroundColor(MAGENTA);
                                break;
                            case 4:
                                button2_1.setLayoutParams(T4);button2_2.setLayoutParams(T1);
                                button2_3.setLayoutParams(T1);button2_4.setLayoutParams(T1);
                                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                                button2_7.setLayoutParams(T0);
                                button2_1.setBackgroundColor(MAGENTA);
                                break;
                            case 5:
                                button2_1.setLayoutParams(T5);button2_2.setLayoutParams(T1);
                                button2_3.setLayoutParams(T1);button2_4.setLayoutParams(T1);
                                button2_5.setLayoutParams(T1);button2_6.setLayoutParams(T0);
                                button2_7.setLayoutParams(T0);
                                button2_1.setBackgroundColor(MAGENTA);
                                break;
                            case 6:
                                button2_1.setLayoutParams(T6);button2_2.setLayoutParams(T1);
                                button2_3.setLayoutParams(T1);button2_4.setLayoutParams(T1);
                                button2_5.setLayoutParams(T1);button2_6.setLayoutParams(T1);
                                button2_7.setLayoutParams(T0);
                                button2_1.setBackgroundColor(MAGENTA);
                                break;
                            case 7:
                                button2_1.setLayoutParams(T7);button2_6.setLayoutParams(T1);
                                button2_3.setLayoutParams(T1);button2_2.setLayoutParams(T1);
                                button2_5.setLayoutParams(T1);button2_4.setLayoutParams(T1);
                                button2_7.setLayoutParams(T1);
                                button2_1.setBackgroundColor(MAGENTA);
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
                        switch(TC_2_2){
                            case 2:
                                button2_2.setLayoutParams(T2);button2_3.setLayoutParams(T1);
                                button2_4.setLayoutParams(T0);button2_5.setLayoutParams(T0);
                                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                                button2_2.setBackgroundColor(CYAN);
                                break;
                            case 3:
                                button2_2.setLayoutParams(T3);button2_3.setLayoutParams(T1);
                                button2_4.setLayoutParams(T1);button2_5.setLayoutParams(T0);
                                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                                button2_2.setBackgroundColor(CYAN);
                                break;
                            case 4:
                                button2_2.setLayoutParams(T4);button2_3.setLayoutParams(T1);
                                button2_4.setLayoutParams(T1);button2_5.setLayoutParams(T1);
                                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                                button2_2.setBackgroundColor(CYAN);
                                break;
                            case 5:
                                button2_2.setLayoutParams(T5);button2_3.setLayoutParams(T1);
                                button2_4.setLayoutParams(T1);button2_5.setLayoutParams(T1);
                                button2_6.setLayoutParams(T1);button2_7.setLayoutParams(T0);
                                button2_2.setBackgroundColor(CYAN);
                                break;
                            case 6:
                                button2_2.setLayoutParams(T6);button2_3.setLayoutParams(T1);
                                button2_4.setLayoutParams(T1);button2_5.setLayoutParams(T1);
                                button2_6.setLayoutParams(T1);button2_7.setLayoutParams(T1);
                                button2_2.setBackgroundColor(CYAN);
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
                        switch(TC_2_3) {
                            case 2:
                                button2_3.setLayoutParams(T2);button2_4.setLayoutParams(T1);
                                button2_5.setLayoutParams(T0);button2_6.setLayoutParams(T0);
                                button2_7.setLayoutParams(T0);
                                button2_3.setBackgroundColor(YELLOW);
                                break;
                            case 3:
                                button2_3.setLayoutParams(T3);button2_4.setLayoutParams(T1);
                                button2_5.setLayoutParams(T1);button2_6.setLayoutParams(T0);
                                button2_7.setLayoutParams(T0);
                                button2_3.setBackgroundColor(YELLOW);
                                break;
                            case 4:
                                button2_3.setLayoutParams(T4);button2_4.setLayoutParams(T1);
                                button2_5.setLayoutParams(T1);button2_6.setLayoutParams(T1);
                                button2_7.setLayoutParams(T0);
                                button2_3.setBackgroundColor(YELLOW);
                                break;
                            case 5:
                                button2_3.setLayoutParams(T5);button2_4.setLayoutParams(T1);
                                button2_5.setLayoutParams(T1);button2_6.setLayoutParams(T1);
                                button2_7.setLayoutParams(T1);
                                button2_3.setBackgroundColor(YELLOW);
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
                        switch(TC_2_4){
                            case 2:
                                button2_4.setLayoutParams(T2);button2_5.setLayoutParams(T1);
                                button2_6.setLayoutParams(T0);button2_7.setLayoutParams(T0);
                                button2_4.setBackgroundColor(GRAY);
                                break;
                            case 3:
                                button2_4.setLayoutParams(T3);button2_5.setLayoutParams(T1);
                                button2_6.setLayoutParams(T1);button2_7.setLayoutParams(T0);
                                button2_4.setBackgroundColor(GRAY);
                                break;
                            case 4:
                                button2_4.setLayoutParams(T4);button2_5.setLayoutParams(T1);
                                button2_6.setLayoutParams(T1);button2_7.setLayoutParams(T1);
                                button2_4.setBackgroundColor(GRAY);
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
                        switch(TC_2_5){
                            case 2:
                                button2_5.setLayoutParams(T2);button2_6.setLayoutParams(T1);
                                button2_7.setLayoutParams(T0);
                                button2_5.setBackgroundColor(RED);
                                break;
                            case 3:
                                button2_5.setLayoutParams(T3);button2_6.setLayoutParams(T1);
                                button2_7.setLayoutParams(T1);
                                button2_5.setBackgroundColor(RED);
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
                        switch(TC_2_6){
                            case 2:
                                button2_6.setLayoutParams(T2);button2_7.setLayoutParams(T1);
                                button2_6.setBackgroundColor(BLUE);
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
                        button2_7.setBackgroundColor(TRANSPARENT);
                    }
                    break;
                case TIME_3:
                    if (null != backdata) {
                        String TIMES_3 = backdata.getStringExtra("backtimename");
                        String TIME_count_3 = backdata.getStringExtra("backtimenumber");
                        button3_0.setText(TIMES_3);
                        int TC_3=Integer.parseInt(TIME_count_3);
                        switch(TC_3){
                            case 2:
                                button3_0.setLayoutParams(T2);button3_1.setLayoutParams(T1);
                                button3_2.setLayoutParams(T0);button3_3.setLayoutParams(T0);
                                button3_4.setLayoutParams(T0);button3_5.setLayoutParams(T0);
                                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                                button3_0.setBackgroundColor(GREEN);
                                break;
                            case 3:
                                button3_0.setLayoutParams(T3);button3_1.setLayoutParams(T1);
                                button3_2.setLayoutParams(T1);button3_3.setLayoutParams(T0);
                                button3_4.setLayoutParams(T0);button3_5.setLayoutParams(T0);
                                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                                button3_0.setBackgroundColor(GREEN);
                                break;
                            case 4:
                                button3_0.setLayoutParams(T4);button3_1.setLayoutParams(T1);
                                button3_2.setLayoutParams(T1);button3_3.setLayoutParams(T1);
                                button3_4.setLayoutParams(T0);button3_5.setLayoutParams(T0);
                                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                                button3_0.setBackgroundColor(GREEN);
                                break;
                            case 5:
                                button3_0.setLayoutParams(T5);button3_1.setLayoutParams(T1);
                                button3_2.setLayoutParams(T1);button3_3.setLayoutParams(T1);
                                button3_4.setLayoutParams(T1);button3_5.setLayoutParams(T0);
                                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                                button3_0.setBackgroundColor(GREEN);
                                break;
                            case 6:
                                button3_0.setLayoutParams(T6);button3_1.setLayoutParams(T1);
                                button3_2.setLayoutParams(T1);button3_3.setLayoutParams(T1);
                                button3_4.setLayoutParams(T1);button3_5.setLayoutParams(T1);
                                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                                button3_0.setBackgroundColor(GREEN);
                                break;
                            case 7:
                                button3_0.setLayoutParams(T7);button3_1.setLayoutParams(T1);
                                button3_2.setLayoutParams(T1);button3_3.setLayoutParams(T1);
                                button3_4.setLayoutParams(T1);button3_5.setLayoutParams(T1);
                                button3_6.setLayoutParams(T1);button3_7.setLayoutParams(T0);
                                button3_0.setBackgroundColor(GREEN);
                                break;
                            case 8:
                                button3_1.setLayoutParams(T1);button3_2.setLayoutParams(T1);
                                button3_3.setLayoutParams(T1);button3_4.setLayoutParams(T1);
                                button3_5.setLayoutParams(T1);button3_6.setLayoutParams(T1);
                                button3_7.setLayoutParams(T1);button3_0.setLayoutParams(T8);
                                button3_0.setBackgroundColor(GREEN);
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
                        switch(TC_3_1){
                            case 2:
                                button3_1.setLayoutParams(T2);button3_2.setLayoutParams(T1);
                                button3_3.setLayoutParams(T0);button3_4.setLayoutParams(T0);
                                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                                button3_7.setLayoutParams(T0);
                                button3_1.setBackgroundColor(MAGENTA);
                                break;
                            case 3:
                                button3_1.setLayoutParams(T3);button3_2.setLayoutParams(T1);
                                button3_3.setLayoutParams(T1);button3_4.setLayoutParams(T0);
                                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                                button3_7.setLayoutParams(T0);
                                button3_1.setBackgroundColor(MAGENTA);
                                break;
                            case 4:
                                button3_1.setLayoutParams(T4);button3_2.setLayoutParams(T1);
                                button3_3.setLayoutParams(T1);button3_4.setLayoutParams(T1);
                                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                                button3_7.setLayoutParams(T0);
                                button3_1.setBackgroundColor(MAGENTA);
                                break;
                            case 5:
                                button3_1.setLayoutParams(T5);button3_2.setLayoutParams(T1);
                                button3_3.setLayoutParams(T1);button3_4.setLayoutParams(T1);
                                button3_5.setLayoutParams(T1);button3_6.setLayoutParams(T0);
                                button3_1.setBackgroundColor(MAGENTA);
                                break;
                            case 6:
                                button3_1.setLayoutParams(T6);button3_2.setLayoutParams(T1);
                                button3_3.setLayoutParams(T1);button3_4.setLayoutParams(T1);
                                button3_5.setLayoutParams(T1);button3_6.setLayoutParams(T1);
                                button3_7.setLayoutParams(T0);
                                button3_1.setBackgroundColor(MAGENTA);
                                break;
                            case 7:
                                button3_1.setLayoutParams(T7);button3_2.setLayoutParams(T1);
                                button3_3.setLayoutParams(T1);button3_4.setLayoutParams(T1);
                                button3_5.setLayoutParams(T1);button3_6.setLayoutParams(T1);
                                button3_7.setLayoutParams(T1);
                                button3_1.setBackgroundColor(MAGENTA);
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
                        switch(TC_3_2){
                            case 2:
                                button3_2.setLayoutParams(T2);button3_3.setLayoutParams(T1);
                                button3_4.setLayoutParams(T0);button3_5.setLayoutParams(T0);
                                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                                button3_2.setBackgroundColor(CYAN);
                                break;
                            case 3:
                                button3_2.setLayoutParams(T3);button3_3.setLayoutParams(T1);
                                button3_4.setLayoutParams(T1);button3_5.setLayoutParams(T0);
                                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                                button3_2.setBackgroundColor(CYAN);
                                break;
                            case 4:
                                button3_2.setLayoutParams(T4);button3_3.setLayoutParams(T1);
                                button3_4.setLayoutParams(T1);button3_5.setLayoutParams(T1);
                                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                                button3_2.setBackgroundColor(CYAN);
                                break;
                            case 5:
                                button3_2.setLayoutParams(T5);button3_3.setLayoutParams(T1);
                                button3_4.setLayoutParams(T1);button3_5.setLayoutParams(T1);
                                button3_6.setLayoutParams(T1);button3_7.setLayoutParams(T0);
                                button3_2.setBackgroundColor(CYAN);
                                break;
                            case 6:
                                button3_2.setLayoutParams(T6);button3_3.setLayoutParams(T1);
                                button3_4.setLayoutParams(T1);button3_5.setLayoutParams(T1);
                                button3_6.setLayoutParams(T1);button3_7.setLayoutParams(T1);
                                button3_2.setBackgroundColor(CYAN);
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
                        switch(TC_3_3){
                            case 2:
                                button3_3.setLayoutParams(T2);button3_4.setLayoutParams(T1);
                                button3_5.setLayoutParams(T0);button3_6.setLayoutParams(T0);
                                button3_7.setLayoutParams(T0);
                                button3_3.setBackgroundColor(YELLOW);
                                break;
                            case 3:
                                button3_3.setLayoutParams(T3);button3_4.setLayoutParams(T1);
                                button3_5.setLayoutParams(T1);button3_6.setLayoutParams(T0);
                                button3_7.setLayoutParams(T0);
                                button3_3.setBackgroundColor(YELLOW);
                                break;
                            case 4:
                                button3_3.setLayoutParams(T4);button3_4.setLayoutParams(T1);
                                button3_5.setLayoutParams(T1);button3_6.setLayoutParams(T1);
                                button3_7.setLayoutParams(T0);
                                button3_3.setBackgroundColor(YELLOW);
                                break;
                            case 5:
                                button3_3.setLayoutParams(T5);button3_4.setLayoutParams(T1);
                                button3_5.setLayoutParams(T1);button3_6.setLayoutParams(T1);
                                button3_7.setLayoutParams(T1);
                                button3_3.setBackgroundColor(YELLOW);
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
                        switch(TC_3_4){
                            case 2:
                                button3_4.setLayoutParams(T2);button3_5.setLayoutParams(T1);
                                button3_6.setLayoutParams(T0);button3_7.setLayoutParams(T0);
                                button3_4.setBackgroundColor(GRAY);
                                break;
                            case 3:
                                button3_4.setLayoutParams(T3);button3_5.setLayoutParams(T1);
                                button3_6.setLayoutParams(T1);button3_7.setLayoutParams(T0);
                                button3_4.setBackgroundColor(GRAY);
                                break;
                            case 4:
                                button3_4.setLayoutParams(T4);button3_5.setLayoutParams(T1);
                                button3_6.setLayoutParams(T1);button3_7.setLayoutParams(T1);
                                button3_4.setBackgroundColor(GRAY);
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
                        switch(TC_3_5){
                            case 2:
                                button3_5.setLayoutParams(T2);button3_6.setLayoutParams(T1);
                                button3_7.setLayoutParams(T0);
                                button3_5.setBackgroundColor(RED);
                                break;
                            case 3:
                                button3_5.setLayoutParams(T3);button3_6.setLayoutParams(T1);
                                button3_7.setLayoutParams(T1);
                                button3_5.setBackgroundColor(RED);
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
                        switch(TC_3_6){
                            case 2:
                                button3_6.setLayoutParams(T2);button3_7.setLayoutParams(T1);
                                button3_6.setBackgroundColor(BLUE);
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
                        button3_7.setBackgroundColor(TRANSPARENT);
                    }
                    break;
                case TIME_4:
                    if (null != backdata) {
                        String TIMES_4 = backdata.getStringExtra("backtimename");
                        String TIME_count_4 = backdata.getStringExtra("backtimenumber");
                        button4_0.setText(TIMES_4);
                        int TC_4=Integer.parseInt(TIME_count_4);
                        switch(TC_4){
                            case 2:
                                button4_0.setLayoutParams(T2);button4_1.setLayoutParams(T1);
                                button4_2.setLayoutParams(T0);button4_3.setLayoutParams(T0);
                                button4_4.setLayoutParams(T0);button4_5.setLayoutParams(T0);
                                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                                button4_0.setBackgroundColor(GREEN);
                                break;
                            case 3:
                                button4_0.setLayoutParams(T3);button4_1.setLayoutParams(T1);
                                button4_2.setLayoutParams(T1);button4_3.setLayoutParams(T0);
                                button4_4.setLayoutParams(T0);button4_5.setLayoutParams(T0);
                                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                                button4_0.setBackgroundColor(GREEN);
                                break;
                            case 4:
                                button4_0.setLayoutParams(T4);button4_1.setLayoutParams(T1);
                                button4_2.setLayoutParams(T1);button4_3.setLayoutParams(T1);
                                button4_4.setLayoutParams(T0);button4_5.setLayoutParams(T0);
                                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                                button4_0.setBackgroundColor(GREEN);
                                break;
                            case 5:
                                button4_0.setLayoutParams(T5);button4_1.setLayoutParams(T1);
                                button4_2.setLayoutParams(T1);button4_3.setLayoutParams(T1);
                                button4_4.setLayoutParams(T1);button4_5.setLayoutParams(T0);
                                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                                button4_0.setBackgroundColor(GREEN);
                                break;
                            case 6:
                                button4_0.setLayoutParams(T6);button4_1.setLayoutParams(T1);
                                button4_2.setLayoutParams(T1);button4_3.setLayoutParams(T1);
                                button4_4.setLayoutParams(T1);button4_5.setLayoutParams(T1);
                                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                                button4_0.setBackgroundColor(GREEN);
                                break;
                            case 7:
                                button4_0.setLayoutParams(T7);button4_1.setLayoutParams(T1);
                                button4_2.setLayoutParams(T1);button4_3.setLayoutParams(T1);
                                button4_4.setLayoutParams(T1);button4_5.setLayoutParams(T1);
                                button4_6.setLayoutParams(T1);button4_7.setLayoutParams(T0);
                                button4_0.setBackgroundColor(GREEN);
                                break;
                            case 8:
                                button4_1.setLayoutParams(T1);button4_2.setLayoutParams(T1);
                                button4_3.setLayoutParams(T1);button4_4.setLayoutParams(T1);
                                button4_5.setLayoutParams(T1);button4_6.setLayoutParams(T1);
                                button4_7.setLayoutParams(T1);button4_0.setLayoutParams(T8);
                                button4_0.setBackgroundColor(GREEN);
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
                        switch(TC_4_1){
                            case 2:
                                button4_1.setLayoutParams(T2);button4_2.setLayoutParams(T1);
                                button4_3.setLayoutParams(T0);button4_4.setLayoutParams(T0);
                                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                                button4_7.setLayoutParams(T0);
                                button4_1.setBackgroundColor(MAGENTA);
                                break;
                            case 3:
                                button4_1.setLayoutParams(T3);button4_2.setLayoutParams(T1);
                                button4_3.setLayoutParams(T1);button4_4.setLayoutParams(T0);
                                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                                button4_7.setLayoutParams(T0);
                                button4_1.setBackgroundColor(MAGENTA);
                                break;
                            case 4:
                                button4_1.setLayoutParams(T4);button4_2.setLayoutParams(T1);
                                button4_3.setLayoutParams(T1);button4_4.setLayoutParams(T1);
                                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                                button4_7.setLayoutParams(T0);
                                button4_1.setBackgroundColor(MAGENTA);
                                break;
                            case 5:
                                button4_1.setLayoutParams(T5);button4_2.setLayoutParams(T1);
                                button4_3.setLayoutParams(T1);button4_4.setLayoutParams(T1);
                                button4_5.setLayoutParams(T1);button4_6.setLayoutParams(T0);
                                button4_7.setLayoutParams(T0);
                                button4_1.setBackgroundColor(MAGENTA);
                                break;
                            case 6:
                                button4_1.setLayoutParams(T6);button4_2.setLayoutParams(T1);
                                button4_3.setLayoutParams(T1);button4_4.setLayoutParams(T1);
                                button4_5.setLayoutParams(T1);button4_6.setLayoutParams(T1);
                                button4_7.setLayoutParams(T0);
                                button4_1.setBackgroundColor(MAGENTA);
                                break;
                            case 7:
                                button4_1.setLayoutParams(T7);button4_2.setLayoutParams(T1);
                                button4_3.setLayoutParams(T1);button4_4.setLayoutParams(T1);
                                button4_5.setLayoutParams(T1);button4_6.setLayoutParams(T1);
                                button4_7.setLayoutParams(T1);
                                button4_1.setBackgroundColor(MAGENTA);
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
                        switch(TC_4_2){
                            case 2:
                                button4_2.setLayoutParams(T2);button4_3.setLayoutParams(T1);
                                button4_4.setLayoutParams(T0);button4_5.setLayoutParams(T0);
                                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                                button4_2.setBackgroundColor(CYAN);
                                break;
                            case 3:
                                button4_2.setLayoutParams(T3);button4_3.setLayoutParams(T1);
                                button4_4.setLayoutParams(T1);button4_5.setLayoutParams(T0);
                                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                                button4_2.setBackgroundColor(CYAN);
                                break;
                            case 4:
                                button4_2.setLayoutParams(T4);button4_3.setLayoutParams(T1);
                                button4_4.setLayoutParams(T1);button4_5.setLayoutParams(T1);
                                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                                button4_2.setBackgroundColor(CYAN);
                                break;
                            case 5:
                                button4_2.setLayoutParams(T5);button4_3.setLayoutParams(T1);
                                button4_4.setLayoutParams(T1);button4_5.setLayoutParams(T1);
                                button4_6.setLayoutParams(T1);button4_7.setLayoutParams(T0);
                                button4_2.setBackgroundColor(CYAN);
                                break;
                            case 6:
                                button4_2.setLayoutParams(T6);button4_3.setLayoutParams(T1);
                                button4_4.setLayoutParams(T1);button4_5.setLayoutParams(T1);
                                button4_6.setLayoutParams(T1);button4_7.setLayoutParams(T1);
                                button4_2.setBackgroundColor(CYAN);
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
                        switch(TC_4_3){
                            case 2:
                                button4_3.setLayoutParams(T2);button4_4.setLayoutParams(T1);
                                button4_5.setLayoutParams(T0);button4_6.setLayoutParams(T0);
                                button4_7.setLayoutParams(T0);
                                button4_3.setBackgroundColor(YELLOW);
                                break;
                            case 3:
                                button4_3.setLayoutParams(T3);button4_4.setLayoutParams(T1);
                                button4_5.setLayoutParams(T1);button4_6.setLayoutParams(T0);
                                button4_7.setLayoutParams(T0);
                                button4_3.setBackgroundColor(YELLOW);
                                break;
                            case 4:
                                button4_3.setLayoutParams(T4);button4_4.setLayoutParams(T1);
                                button4_5.setLayoutParams(T1);button4_6.setLayoutParams(T1);
                                button4_7.setLayoutParams(T0);
                                button4_3.setBackgroundColor(YELLOW);
                                break;
                            case 5:
                                button4_3.setLayoutParams(T5);button4_4.setLayoutParams(T1);
                                button4_5.setLayoutParams(T1);button4_6.setLayoutParams(T1);
                                button4_7.setLayoutParams(T1);
                                button4_3.setBackgroundColor(YELLOW);
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
                        switch(TC_4_4){
                            case 2:
                                button4_4.setLayoutParams(T2);button4_5.setLayoutParams(T1);
                                button4_6.setLayoutParams(T0);button4_7.setLayoutParams(T0);
                                button4_4.setBackgroundColor(GRAY);
                                break;
                            case 3:
                                button4_4.setLayoutParams(T3);button4_5.setLayoutParams(T1);
                                button4_6.setLayoutParams(T1);button4_7.setLayoutParams(T0);
                                button4_4.setBackgroundColor(GRAY);
                                break;
                            case 4:
                                button4_4.setLayoutParams(T4);button4_5.setLayoutParams(T1);
                                button4_6.setLayoutParams(T1);button4_7.setLayoutParams(T1);
                                button4_4.setBackgroundColor(GRAY);
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
                        switch(TC_4_5){
                            case 2:
                                button4_5.setLayoutParams(T2);button4_6.setLayoutParams(T1);
                                button4_7.setLayoutParams(T0);
                                button4_5.setBackgroundColor(RED);
                                break;
                            case 3:
                                button4_5.setLayoutParams(T3);button4_6.setLayoutParams(T1);
                                button4_7.setLayoutParams(T1);
                                button4_5.setBackgroundColor(RED);
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
                        switch(TC_4_6){
                            case 2:
                                button4_6.setLayoutParams(T2);button4_7.setLayoutParams(T1);
                                button4_6.setBackgroundColor(BLUE);
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
                        button4_7.setBackgroundColor(TRANSPARENT);
                    }
                    break;
                case TIME_5:
                    if (null != backdata) {
                        String TIMES_5 = backdata.getStringExtra("backtimename");
                        String TIME_count_5 = backdata.getStringExtra("backtimenumber");
                        button5_0.setText(TIMES_5);
                        int TC_5=Integer.parseInt(TIME_count_5);
                        switch(TC_5){
                            case 2:
                                button5_0.setLayoutParams(T2);button5_1.setLayoutParams(T1);
                                button5_2.setLayoutParams(T0);button5_3.setLayoutParams(T0);
                                button5_4.setLayoutParams(T0);button5_5.setLayoutParams(T0);
                                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                                button5_0.setBackgroundColor(GREEN);
                                break;
                            case 3:
                                button5_0.setLayoutParams(T3);button5_1.setLayoutParams(T1);
                                button5_2.setLayoutParams(T1);button5_3.setLayoutParams(T0);
                                button5_4.setLayoutParams(T0);button5_5.setLayoutParams(T0);
                                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                                button5_0.setBackgroundColor(GREEN);
                                break;
                            case 4:
                                button5_0.setLayoutParams(T4);button5_1.setLayoutParams(T1);
                                button5_2.setLayoutParams(T1);button5_3.setLayoutParams(T1);
                                button5_4.setLayoutParams(T0);button5_5.setLayoutParams(T0);
                                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                                button5_0.setBackgroundColor(GREEN);
                                break;
                            case 5:
                                button5_0.setLayoutParams(T5);button5_1.setLayoutParams(T1);
                                button5_2.setLayoutParams(T1);button5_3.setLayoutParams(T1);
                                button5_4.setLayoutParams(T1);button5_5.setLayoutParams(T0);
                                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                                button5_0.setBackgroundColor(GREEN);
                                break;
                            case 6:
                                button5_0.setLayoutParams(T6);button5_1.setLayoutParams(T1);
                                button5_2.setLayoutParams(T1);button5_3.setLayoutParams(T1);
                                button5_4.setLayoutParams(T1);button5_5.setLayoutParams(T1);
                                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                                button5_0.setBackgroundColor(GREEN);
                                break;
                            case 7:
                                button5_0.setLayoutParams(T7);button5_1.setLayoutParams(T1);
                                button5_2.setLayoutParams(T1);button5_3.setLayoutParams(T1);
                                button5_4.setLayoutParams(T1);button5_5.setLayoutParams(T1);
                                button5_6.setLayoutParams(T1);button5_7.setLayoutParams(T0);
                                button5_0.setBackgroundColor(GREEN);
                                break;
                            case 8:
                                button5_1.setLayoutParams(T1);button5_2.setLayoutParams(T1);
                                button5_3.setLayoutParams(T1);button5_4.setLayoutParams(T1);
                                button5_5.setLayoutParams(T1);button5_6.setLayoutParams(T1);
                                button5_7.setLayoutParams(T1);button5_0.setLayoutParams(T8);
                                button5_0.setBackgroundColor(GREEN);
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
                        switch(TC_5_1){
                            case 2:
                                button5_1.setLayoutParams(T2);button5_2.setLayoutParams(T1);
                                button5_3.setLayoutParams(T0);button5_4.setLayoutParams(T0);
                                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                                button5_7.setLayoutParams(T0);
                                button5_1.setBackgroundColor(MAGENTA);
                                break;
                            case 3:
                                button5_1.setLayoutParams(T3);button5_2.setLayoutParams(T1);
                                button5_3.setLayoutParams(T1);button5_4.setLayoutParams(T0);
                                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                                button5_7.setLayoutParams(T0);
                                button5_1.setBackgroundColor(MAGENTA);
                                break;
                            case 4:
                                button5_1.setLayoutParams(T4);button5_2.setLayoutParams(T1);
                                button5_3.setLayoutParams(T1);button5_4.setLayoutParams(T1);
                                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                                button5_7.setLayoutParams(T0);
                                button5_1.setBackgroundColor(MAGENTA);
                                break;
                            case 5:
                                button5_1.setLayoutParams(T5);button5_2.setLayoutParams(T1);
                                button5_3.setLayoutParams(T1);button5_4.setLayoutParams(T1);
                                button5_5.setLayoutParams(T1);button5_6.setLayoutParams(T0);
                                button5_7.setLayoutParams(T0);
                                button5_1.setBackgroundColor(MAGENTA);
                                break;
                            case 6:
                                button5_1.setLayoutParams(T6);button5_2.setLayoutParams(T1);
                                button5_3.setLayoutParams(T1);button5_4.setLayoutParams(T1);
                                button5_5.setLayoutParams(T1);button5_6.setLayoutParams(T1);
                                button5_7.setLayoutParams(T0);
                                button5_1.setBackgroundColor(MAGENTA);
                                break;
                            case 7:
                                button5_1.setLayoutParams(T7);button5_2.setLayoutParams(T1);
                                button5_3.setLayoutParams(T1);button5_4.setLayoutParams(T1);
                                button5_5.setLayoutParams(T1);button5_6.setLayoutParams(T1);
                                button5_7.setLayoutParams(T1);
                                button5_1.setBackgroundColor(MAGENTA);
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
                        switch(TC_5_2){
                            case 2:
                                button5_2.setLayoutParams(T2);button5_3.setLayoutParams(T1);
                                button5_4.setLayoutParams(T0);button5_5.setLayoutParams(T0);
                                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                                button5_2.setBackgroundColor(CYAN);
                                break;
                            case 3:
                                button5_2.setLayoutParams(T3);button5_3.setLayoutParams(T1);
                                button5_4.setLayoutParams(T1);button5_5.setLayoutParams(T0);
                                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                                button5_2.setBackgroundColor(CYAN);
                                break;
                            case 4:
                                button5_2.setLayoutParams(T4);button5_3.setLayoutParams(T1);
                                button5_4.setLayoutParams(T1);button5_5.setLayoutParams(T1);
                                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                                button5_2.setBackgroundColor(CYAN);
                                break;
                            case 5:
                                button5_2.setLayoutParams(T5);button5_3.setLayoutParams(T1);
                                button5_4.setLayoutParams(T1);button5_5.setLayoutParams(T1);
                                button5_6.setLayoutParams(T1);button5_7.setLayoutParams(T0);
                                button5_2.setBackgroundColor(CYAN);
                                break;
                            case 6:
                                button5_2.setLayoutParams(T6);button5_3.setLayoutParams(T1);
                                button5_4.setLayoutParams(T1);button5_5.setLayoutParams(T1);
                                button5_6.setLayoutParams(T1);button5_7.setLayoutParams(T1);
                                button5_2.setBackgroundColor(CYAN);
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
                        switch(TC_5_3){
                            case 2:
                                button5_3.setLayoutParams(T2);button5_4.setLayoutParams(T1);
                                button5_5.setLayoutParams(T0);button5_6.setLayoutParams(T0);
                                button5_7.setLayoutParams(T0);
                                button5_3.setBackgroundColor(YELLOW);
                                break;
                            case 3:
                                button5_3.setLayoutParams(T3);button5_4.setLayoutParams(T1);
                                button5_5.setLayoutParams(T1);button5_6.setLayoutParams(T0);
                                button5_7.setLayoutParams(T0);
                                button5_3.setBackgroundColor(YELLOW);
                                break;
                            case 4:
                                button5_3.setLayoutParams(T4);button5_4.setLayoutParams(T1);
                                button5_5.setLayoutParams(T1);button5_6.setLayoutParams(T1);
                                button5_7.setLayoutParams(T0);
                                button5_3.setBackgroundColor(YELLOW);
                                break;
                            case 5:
                                button5_3.setLayoutParams(T5);button5_4.setLayoutParams(T1);
                                button5_5.setLayoutParams(T1);button5_6.setLayoutParams(T1);
                                button5_7.setLayoutParams(T1);
                                button5_3.setBackgroundColor(YELLOW);
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
                        switch(TC_5_4){
                            case 2:
                                button5_4.setLayoutParams(T2);button5_5.setLayoutParams(T1);
                                button5_6.setLayoutParams(T0);button5_7.setLayoutParams(T0);
                                button5_4.setBackgroundColor(GRAY);
                                break;
                            case 3:
                                button5_4.setLayoutParams(T3);button5_5.setLayoutParams(T1);
                                button5_6.setLayoutParams(T1);button5_7.setLayoutParams(T0);
                                button5_4.setBackgroundColor(GRAY);
                                break;
                            case 4:
                                button5_4.setLayoutParams(T4);button5_5.setLayoutParams(T1);
                                button5_6.setLayoutParams(T1);button5_7.setLayoutParams(T1);
                                button5_4.setBackgroundColor(GRAY);
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
                        switch(TC_5_5){
                            case 2:
                                button5_5.setLayoutParams(T2);button5_6.setLayoutParams(T1);
                                button5_7.setLayoutParams(T0);
                                button5_5.setBackgroundColor(RED);
                                break;
                            case 3:
                                button5_5.setLayoutParams(T3);button5_6.setLayoutParams(T1);
                                button5_7.setLayoutParams(T1);
                                button5_5.setBackgroundColor(RED);
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
                        switch(TC_5_6){
                            case 2:
                                button5_6.setLayoutParams(T2);button5_7.setLayoutParams(T1);
                                button5_6.setBackgroundColor(BLUE);
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
                        button5_7.setBackgroundColor(TRANSPARENT);
                    }
            }
        }
    }

}
