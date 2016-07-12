package com.example.test02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Acy extends AppCompatActivity {

    private TextView tv;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acy);
        tv = (TextView) findViewById(R.id.tv);
        Intent i = getIntent();
        Td td = (Td) i.getSerializableExtra("just_test");
        tv.setText(String.format("%s,%d",td.getName(),td.getAge()));
        editText = (EditText)findViewById(R.id.editText);
        findViewById(R.id.butt2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("data",editText.getText().toString());
                setResult(1,i);
                finish();
            }
        });
    }
}
