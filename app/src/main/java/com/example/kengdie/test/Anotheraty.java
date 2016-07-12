package com.example.kengdie.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.sql.SQLOutput;

public class Anotheraty extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anotheraty);
//        System.out.println("B oncreate");
        tv = (TextView) findViewById(R.id.tv);
        Intent i = getIntent();
//        Bundle data = new Bundle();
//        data = i.getExtras();
//        data = i.getBundleExtra("bdl");
//        tv.setText(i.getStringExtra("data"));
//        tv.setText(String.format("%s,%d,%s",data.getString("data"),data.getInt("one"),data.getString("ok","!!")));
//        User user = (User) i.getSerializableExtra("data");
        User user = (User) i.getParcelableExtra("data");
        tv.setText(String.format("%s,%d",user.getName(),user.getSco()));
    }
//    @Override
//    protected void onStart() {
//        super.onStart();
//        System.out.println("B onStart");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        System.out.println("B onResume");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        System.out.println("B onPause");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        System.out.println("B onStop");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        System.out.println("B onDestroy");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        System.out.println("B onRestart");
//    }
}
