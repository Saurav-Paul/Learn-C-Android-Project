package com.example.asus.learnc;

import android.content.DialogInterface;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Credit extends AppCompatActivity {
    FloatingActionButton credit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);
        credit=findViewById(R.id.floatingCredits);
        credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCredits();

            }

            private void showCredits() {



                AlertDialog.Builder builder = new AlertDialog.Builder(Credit.this);
                LayoutInflater inflater = Credit.this.getLayoutInflater();
                View layout = inflater.inflate(R.layout.creditsalert    /*my layout here*/, null);
                builder.setView(layout);

                builder.show();


            }
        });
    }
}
