package com.example.asus.learnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView basic,intermidiate,about,practice,creditcardbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        basic=findViewById(R.id.basicCard);
        intermidiate=findViewById(R.id.intermidiateCard);
        practice=findViewById(R.id.practiceCard);
        about=findViewById(R.id.aboutCard);
        about.setOnClickListener(this);
        creditcardbutton=findViewById(R.id.creditCard);
        creditcardbutton.setOnClickListener(this);
        practice.setOnClickListener(this);
        basic.setOnClickListener(this);
        intermidiate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==basic.getId())
            startActivity(new Intent(MainActivity.this,basics.class));
        else if(view.getId()==intermidiate.getId())
            startActivity(new Intent(MainActivity.this,Intermidiate.class));
        else if(view.getId()==practice.getId())
            startActivity(new Intent(MainActivity.this,PracticeList.class));
        else if(view.getId()==creditcardbutton.getId())
            startActivity(new Intent(MainActivity.this,Credit.class));
        else if(view.getId()==about.getId())
            startActivity(new Intent(MainActivity.this,AboutC.class));
    }
}
