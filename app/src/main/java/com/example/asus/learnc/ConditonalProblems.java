package com.example.asus.learnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ConditonalProblems extends AppCompatActivity {
    ListView listView;
    Global global=Global.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conditonal_problems);
        final String[] catagorylist={"Problem B1", "Problem B2","Problem B3","Problem B4"};
        listView=findViewById(R.id.conditonalList);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(ConditonalProblems.this,R.layout.sampletext,
                R.id.idtextview,catagorylist);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    global.setProblemId("B1");
                    startActivity(new Intent(ConditonalProblems.this,Problems.class));
                }
                else if(i==1)
                {
                    global.setProblemId("B2");
                    startActivity(new Intent(ConditonalProblems.this,Problems.class));
                }
                else if(i==2)
                {
                    global.setProblemId("B3");
                    startActivity(new Intent(ConditonalProblems.this,Problems.class));
                }
                else if(i==3)
                {
                    global.setProblemId("B4");
                    startActivity(new Intent(ConditonalProblems.this,Problems.class));
                }
            }
        });
    }
}
