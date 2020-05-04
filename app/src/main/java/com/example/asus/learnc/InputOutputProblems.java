package com.example.asus.learnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class InputOutputProblems extends AppCompatActivity {
    ListView listView;
    Global global=Global.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_output_problems);
        final String[] catagorylist={"Problem A1", "Problem A2","Problem A3"};
        listView=findViewById(R.id.inputoutputlist);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(InputOutputProblems.this,R.layout.sampletext,
                R.id.idtextview,catagorylist);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    global.setProblemId("A1");
                    startActivity(new Intent(InputOutputProblems.this,Problems.class));
                }
                else if(i==1)
                {
                    global.setProblemId("A2");
                    startActivity(new Intent(InputOutputProblems.this,Problems.class));
                }
                else if(i==2)
                {
                    global.setProblemId("A3");
                    startActivity(new Intent(InputOutputProblems.this,Problems.class));
                }
            }
        });
    }
}
