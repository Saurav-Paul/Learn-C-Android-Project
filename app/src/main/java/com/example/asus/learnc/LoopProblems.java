package com.example.asus.learnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LoopProblems extends AppCompatActivity {
    ListView listView;
    Global global=Global.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop_problems);
        final String[] catagorylist={"Problem C1", "Problem C2","Problem C3","Problem C4"};
        listView=findViewById(R.id.loopList);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(LoopProblems.this,R.layout.sampletext,
                R.id.idtextview,catagorylist);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    global.setProblemId("C1");
                    startActivity(new Intent(LoopProblems.this,Problems.class));
                }
                else if(i==1)
                {
                    global.setProblemId("C2");
                    startActivity(new Intent(LoopProblems.this,Problems.class));
                }
                else if(i==2)
                {
                    global.setProblemId("C3");
                    startActivity(new Intent(LoopProblems.this,Problems.class));
                }
                else if(i==3)
                {
                    global.setProblemId("C4");
                    startActivity(new Intent(LoopProblems.this,Problems.class));
                }
            }
        });
    }
}
