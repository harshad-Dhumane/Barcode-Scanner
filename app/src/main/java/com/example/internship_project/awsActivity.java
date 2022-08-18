package com.example.internship_project;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.internship_project.Adaptor.awsAdaptor;

import java.util.ArrayList;

public class awsActivity extends AppCompatActivity {
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aws);
        context = context;
        initFun();


    }

    private void initFun() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(awsActivity.this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        awsAdaptor adapter = new awsAdaptor(arrayList,this);

        recyclerView.setAdapter(adapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }


}