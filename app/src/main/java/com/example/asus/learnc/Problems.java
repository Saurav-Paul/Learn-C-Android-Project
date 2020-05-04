package com.example.asus.learnc;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Problems extends AppCompatActivity {
    Global global=Global.getInstance();
    TextView Title,desc,input,output;
    FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems);
        desc=findViewById(R.id.problemdesc);
        input=findViewById(R.id.sampleinputid);
        output=findViewById(R.id.sampleoutputid);
        Title=findViewById(R.id.problemTitle);
        floatingActionButton=findViewById(R.id.floatingbutton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Problems.this,Compiler.class));
            }
        });
        checking();
    }

    private void checking() {
        String temp=global.getProblemId();
        if(temp=="A1")
        {
            Title.setText("-Problem A1-");

            desc.setText(R.string.problemA1desc);
            input.setText(R.string.problemA1input);
            output.setText(R.string.problemA1output);
        }
        else if(temp=="A2")
        {
            Title.setText("-Problem A2-");

            desc.setText(R.string.problemA2desc);
            input.setText(R.string.problemA2input);
            output.setText(R.string.problemA2output);
        }
        else if(temp=="A3")
        {
            Title.setText("-Problem A3-");

            desc.setText(R.string.problemA3desc);
            input.setText(R.string.problemA3input);
            output.setText(R.string.problemA3output);
        }
        else if(temp=="B1")
        {
            Title.setText("-Problem B1-");

            desc.setText(R.string.problemB1desc);
            input.setText(R.string.problemB1input);
            output.setText(R.string.problemB1output);
        }
        else if(temp=="B2")
        {
            Title.setText("-Problem B2-");

            desc.setText(R.string.problemB2desc);
            input.setText(R.string.problemB2input);
            output.setText(R.string.problemB2output);
        }
        else if(temp=="B3")
        {
            Title.setText("-Problem B3-");

            desc.setText(R.string.problemB3desc);
            input.setText(R.string.problemB3input);
            output.setText(R.string.problemB3output);
        }
        else if(temp=="B4")
        {
            Title.setText("-Problem B4-");

            desc.setText(R.string.problemB4desc);
            input.setText(R.string.problemB4input);
            output.setText(R.string.problemB4output);
        }
        else if(temp=="C1")
        {
            Title.setText("-Problem C1-");

            desc.setText(R.string.problemC1desc);
            input.setText(R.string.problemC1input);
            output.setText(R.string.problemC1output);
        }
        else if(temp=="C2")
        {
            Title.setText("-Problem C2-");

            desc.setText(R.string.problemC2desc);
            input.setText(R.string.problemC2input);
            output.setText(R.string.problemC2output);
        }
        else if(temp=="C3")
        {
            Title.setText("-Problem C3-");

            desc.setText(R.string.problemC3desc);
            input.setText(R.string.problemC3input);
            output.setText(R.string.problemC3output);
        }
        else if(temp=="C4")
        {
            Title.setText("-Problem C4-");

            desc.setText(R.string.problemC4desc);
            input.setText(R.string.problemC4input);
            output.setText(R.string.problemC4output);
        }
        else if(temp=="D1")
        {
            Title.setText("-Problem D1-");

            desc.setText(R.string.problemD1desc);
            input.setText(R.string.problemD1input);
            output.setText(R.string.problemD1output);
        }
        else if(temp=="D2")
        {
            Title.setText("-Problem D2-");

            desc.setText(R.string.problemD2desc);
            input.setText(R.string.problemD2input);
            output.setText(R.string.problemD2output);
        }
        else if(temp=="D3")
        {
            Title.setText("-Problem D3-");

            desc.setText(R.string.problemD3desc);
            input.setText(R.string.problemD3input);
            output.setText(R.string.problemD3output);
        }
        else if(temp=="D4")
        {
            Title.setText("-Problem D4-");

            desc.setText(R.string.problemD4desc);
            input.setText(R.string.problemD4input);
            output.setText(R.string.problemD4output);
        }

        else if(temp=="E1")
        {
            Title.setText("-Problem E1-");

            desc.setText(R.string.problemE1desc);
            input.setText(R.string.problemE1input);
            output.setText(R.string.problemE1output);
        }
        else if(temp=="E2")
        {
            Title.setText("-Problem E2-");

            desc.setText(R.string.problemE2desc);
            input.setText(R.string.problemE2input);
            output.setText(R.string.problemE2output);
        }
        else if(temp=="E3")
        {
            Title.setText("-Problem E3-");

            desc.setText(R.string.problemE3desc);
            input.setText(R.string.problemE3input);
            output.setText(R.string.problemE3output);
        }

    }

}
