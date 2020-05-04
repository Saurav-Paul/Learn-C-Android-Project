package com.example.asus.learnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RecursiveProblems extends AppCompatActivity {
    ListView listView;
    Global global=Global.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recursive_problems);
        final String[] catagorylist={"Problem E1", "Problem E2","Problem E3"};
        listView=findViewById(R.id.recursionlist);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(RecursiveProblems.this,R.layout.sampletext,
                R.id.idtextview,catagorylist);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    global.setProblemId("E1");
                    startActivity(new Intent(RecursiveProblems.this,Problems.class));
                }
                else if(i==1)
                {
                    global.setProblemId("E2");
                    startActivity(new Intent(RecursiveProblems.this,Problems.class));
                }
                else if(i==2)
                {
                    global.setProblemId("E3");
                    startActivity(new Intent(RecursiveProblems.this,Problems.class));
                }
            }
        });
    }
}
