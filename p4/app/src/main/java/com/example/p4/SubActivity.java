package com.example.p4;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {
    private CheckBox[] Check = new CheckBox[4];
    int i=0;
    int a=0,b=0,c=0,d=0;
    String URL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        final EditText TIME_C1=findViewById(R.id.editText);
        final EditText TIME_COST=findViewById(R.id.editText2);
        final TextView TIME_URL=findViewById(R.id.textView15);
        Button returnButton = findViewById(R.id.return_button);
        Check[0]=findViewById(R.id.checkBox);
        Check[1]=findViewById(R.id.checkBox2);
        Check[2]=findViewById(R.id.checkBox3);
        Check[3]=findViewById(R.id.checkBox4);
        Check[0].setChecked(false);
        Check[1].setChecked(false);
        Check[2].setChecked(false);
        Check[3].setChecked(false);
        Check[0].setOnClickListener(new View.OnClickListener() {
            // タップされると呼び出される
            @Override
            public void onClick(View v) {
                // チェックステータス取得
                boolean click = Check[0].isChecked();
                if(click){
                        i=i+1;
                        TIME_URL.setText("G");
                }
                else{
                        i=i-1;
                }
            }
        });
        Check[1].setOnClickListener(new View.OnClickListener() {
            // タップされると呼び出される
            @Override
            public void onClick(View v) {
                // チェックステータス取得
                boolean click = Check[1].isChecked();
                if(click){
                    i=i+1;
                    TIME_URL.setText("M");
                }
                else{
                    i=i-1;
                }
            }
        });
        Check[2].setOnClickListener(new View.OnClickListener() {
            // タップされると呼び出される
            @Override
            public void onClick(View v) {
                // チェックステータス取得
                boolean click = Check[2].isChecked();
                if(click){
                    i=i+1;
                    TIME_URL.setText("E");
                }
                else{
                    i=i-1;
                }
            }
        });
        Check[3].setOnClickListener(new View.OnClickListener() {
            // タップされると呼び出される
            @Override
            public void onClick(View v) {
                // チェックステータス取得
                boolean click = Check[3].isChecked();
                if(click){
                    i=i+1;
                    TIME_URL.setText("No");
                }
                else{
                    i=i-1;
                }
            }
        });

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==1) {
                    Intent back = new Intent(getApplication(), MainActivity.class);
                    back.putExtra("backtimename", TIME_C1.getText().toString());
                    back.putExtra("backtimenumber", TIME_COST.getText().toString());
                    back.putExtra("URL",TIME_URL.getText().toString());
                    setResult(RESULT_OK, back);
                    finish();
                }

            }
        });
    }
}
