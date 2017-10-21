package com.company.nicolay.mytone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Home extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button button = (Button)findViewById(R.id.BtR);
        button.setOnClickListener(this);
    }


    private int myRandom(){
        Random m = new Random();
        return m.nextInt(10)+1;
    }

    @Override
    public void onClick(View view) {
        TextView text = (TextView) findViewById(R.id.Dev);
        String value = String.valueOf(myRandom());
        Log.i("Nico!!!!!!->",value);
        text.setText(value);
    }

}
