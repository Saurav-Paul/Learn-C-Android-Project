package com.example.asus.learnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PracticeList extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_list);
        final String[] catagorylist={"ইনপুট ও আউটপুট", "কন্ডিশনাল লজিক","লুপ","অ্যারে ও স্ট্রিং","রিকার্শন"};
        listView=findViewById(R.id.listviewid);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(PracticeList.this,R.layout.sampletext,
                R.id.idtextview,catagorylist);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    startActivity(new Intent(PracticeList.this,InputOutputProblems.class));
                }
                else if(i==1)
                {
                    startActivity(new Intent(PracticeList.this,ConditonalProblems.class));
                }
                else if(i==2)
                {
                    startActivity(new Intent(PracticeList.this,LoopProblems.class));
                }
                else if(i==3)
                {
                    startActivity(new Intent(PracticeList.this,ArrayProblems.class));
                }
                else if(i==4)
                {
                    startActivity(new Intent(PracticeList.this,RecursiveProblems.class));
                }

            }
        });
    }
}
