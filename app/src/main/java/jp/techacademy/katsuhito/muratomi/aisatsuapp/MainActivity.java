package jp.techacademy.katsuhito.muratomi.aisatsuapp;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(this);

        textView=(TextView)findViewById(R.id.textView);


    }

    @Override
    public void onClick(View v) {
showTimePickerDialog();
    }

    private void showTimePickerDialog(){
            TimePickerDialog td=new TimePickerDialog(this,
             new TimePickerDialog.OnTimeSetListener(){
                 @Override
                 public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                     //textViewにテキストを表示させる
                     if(hourOfDay >=18){
                         textView.setText("こんばんは");
                     }else if(hourOfDay >=10){
                         textView.setText("こんにちは");
                     }else if(hourOfDay >=2){
                         textView.setText("おはよう");
                     }else {
                         textView.setText("こんばんは");
                     }


                     Log.d("test",String.valueOf(hourOfDay)+":"+String.valueOf(minute));



                 }
             },
             13,
              0,
              true);
            td.show();
        }


    }

