package com.example.asus.learnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ArrayProblems extends AppCompatActivity {
    ListView listView;
    Global global=Global.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_problems);
        final String[] catagorylist={"Problem D1", "Problem D2","Problem D3","Problem D4"};
        listView=findViewById(R.id.arraylist);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(ArrayProblems.this,R.layout.sampletext,
                R.id.idtextview,catagorylist);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    global.setProblemId("D1");
                    startActivity(new Intent(ArrayProblems.this,Problems.class));
                }
                else if(i==1)
                {
                    global.setProblemId("D2");
                    startActivity(new Intent(ArrayProblems.this,Problems.class));
                }
                else if(i==2)
                {
                    global.setProblemId("D3");
                    startActivity(new Intent(ArrayProblems.this,Problems.class));
                }
                else if(i==3)
                {
                    global.setProblemId("D4");
                    startActivity(new Intent(ArrayProblems.this,Problems.class));
                }
            }
        });
    }
}
