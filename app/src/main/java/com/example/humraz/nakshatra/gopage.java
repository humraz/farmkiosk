package com.example.humraz.nakshatra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class gopage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gopage);
    }
    public void s(View view)
    {
        Intent in  = new Intent(this, Main2Activity.class);
        startActivity(in);


    }
}
