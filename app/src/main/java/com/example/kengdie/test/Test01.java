package com.example.kengdie.test;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Test01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test01);
//        System.out.println("A onCreate");
        findViewById(R.id.btnstartact).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Test01.this,Anotheraty.class);
//                startActivity(new Intent(Test01.this,Anotheraty.class));
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://baidu.com")));
//                i.putExtra("data","I love you");
//                Bundle b = new Bundle();
//                b.putString("data","zero");
//                b.putInt("one",1);
//                i.putExtras(b);
//                i.putExtra("bdl",b);

                i.putExtra("data",new User("one",22));
                startActivity(i);
            }
        });
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        System.out.println("A onStart");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        System.out.println("A onResume");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        System.out.println("A onPause");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        System.out.println("A onStop");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        System.out.println("A onDestroy");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        System.out.println("A onRestart");
//    }
}
