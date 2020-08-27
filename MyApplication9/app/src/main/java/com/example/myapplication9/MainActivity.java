package com.example.myapplication9;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.Button;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    static Button button1_0,button1_1,button1_2,button1_3,button1_4,button1_5,button1_6,button1_7;
    static Button button2_0,button2_1,button2_2,button2_3,button2_4,button2_5,button2_6,button2_7;
    static Button button3_0,button3_1,button3_2,button3_3,button3_4,button3_5,button3_6,button3_7;
    static Button button4_0,button4_1,button4_2,button4_3,button4_4,button4_5,button4_6,button4_7;
    static Button button5_0,button5_1,button5_2,button5_3,button5_4,button5_5,button5_6,button5_7;
    static  String[][] timedata = new String[5][];
    static String[] data = new String[100000];
    public void reader(Context context) {
        AssetManager assetManager = context.getResources().getAssets();
        try {
            // CSVファイルの読み込み

            InputStream inputStream = assetManager.open("data.csv");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferReader = new BufferedReader(inputStreamReader);
            String line;
            int count=-1,i;
            while ((line = bufferReader.readLine()) != null) {

                //カンマ区切りで１つづつ配列に入れる
                String[] RowData = line.split(",");
                //CSVの左([0]番目)から順番にセット
                            data[0]=RowData[0];
                            data[1]=RowData[1];
                            data[2]=RowData[2];
                            data[3]=RowData[3];
                            data[4]=RowData[4];
                            data[5]=RowData[5];
                            data[6]=RowData[6];
                            data[7]=RowData[7];
                            data[8]=RowData[8];
                            data[9]=RowData[9];
                            data[10]=RowData[10];
                            data[11]=RowData[11];
                            data[12]=RowData[12];
                            data[13]=RowData[13];
                            data[14]=RowData[14];
                            data[15]=RowData[15];
                            data[16]=RowData[16];
                            data[17]=RowData[17];
                            data[18]=RowData[18];
                            data[19]=RowData[19];
                            data[20]=RowData[20];
                            data[21]=RowData[21];
                            data[22]=RowData[22];
                            data[23]=RowData[23];
                            data[24]=RowData[24];
                            data[25]=RowData[25];
                            data[26]=RowData[26];
                            data[27]=RowData[27];
                            data[28]=RowData[28];
                            data[29]=RowData[29];
                            data[30]=RowData[30];
                            data[31]=RowData[31];
                            data[32]=RowData[32];
                            data[33]=RowData[33];
                            data[34]=RowData[34];
                            data[35]=RowData[35];
                            data[36]=RowData[36];
                            data[37]=RowData[37];
                            data[38]=RowData[38];
                            data[39]=RowData[39];


                        //timedata[count][i]=RowData[i];


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainActivity parser = new MainActivity();
        parser.reader(getApplicationContext());
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
        button1_0.setText(data[0]);
        button1_1.setText(data[1]);
        button1_2.setText(data[2]);
        button1_3.setText(data[3]);
        button1_4.setText(data[4]);
        button1_5.setText(data[5]);
        button1_6.setText(data[6]);
        button1_7.setText(data[7]);
        button2_0.setText(data[8]);
        button2_1.setText(data[9]);
        button2_2.setText(data[10]);
        button2_3.setText(data[11]);
        button2_4.setText(data[12]);
        button2_5.setText(data[13]);
        button2_6.setText(data[14]);
        button2_7.setText(data[15]);
        button3_0.setText(data[16]);
        button3_1.setText(data[17]);
        button3_2.setText(data[18]);
        button3_3.setText(data[19]);
        button3_4.setText(data[20]);
        button3_5.setText(data[21]);
        button3_6.setText(data[22]);
        button3_7.setText(data[23]);
        button4_0.setText(data[24]);
        button4_1.setText(data[25]);
        button4_2.setText(data[26]);
        button4_3.setText(data[27]);
        button4_4.setText(data[28]);
        button4_5.setText(data[29]);
        button4_6.setText(data[30]);
        button4_7.setText(data[31]);
        button5_0.setText(data[32]);
        button5_1.setText(data[33]);
        button5_2.setText(data[34]);
        button5_3.setText(data[35]);
        button5_4.setText(data[36]);
        button5_5.setText(data[37]);
        button5_6.setText(data[38]);
        button5_7.setText(data[39]);
    }
}

