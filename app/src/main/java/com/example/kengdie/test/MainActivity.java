package com.example.kengdie.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private static final String[] strs = new String[]{
            "first","second","third","fourth","fifth"
    };//定义一个String数组用来显示ListView的内容private ListView lv;/** Called when the activity is first created. */
    private Button _b;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById (R.id.lv);
        lv.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,strs));

        initview();
    }

    public void initview(){
        _b = (Button)findViewById(R.id.button3);
        _b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent _i = new Intent(MainActivity.this,EX01.class);
                startActivity(_i);
            }
        });
    }
}
