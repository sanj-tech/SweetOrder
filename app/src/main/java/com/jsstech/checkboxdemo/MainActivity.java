package com.jsstech.checkboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CheckBox ras,kajukat,gulabjamun,pedasweet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ras=(CheckBox)findViewById(R.id.rasgulla);
        kajukat=(CheckBox)findViewById(R.id.kaju);
        gulabjamun=(CheckBox)findViewById(R.id.gulab);
        pedasweet=(CheckBox)findViewById(R.id.peda);

    }

    public void Placeorder(View view) {

        int total=0;
        if (ras.isChecked()){
            total+=100;
            //Toast.makeText(this,"",+total().L).show();
        }
        if (kajukat.isChecked()) {
            total+=400;

        }
        if (gulabjamun.isChecked()) {
            total+=500;

        }
        if (pedasweet.isChecked()) {
            total+=500;

        }

        Toast.makeText(this,"" +total ,Toast.LENGTH_LONG).show();






    }
}