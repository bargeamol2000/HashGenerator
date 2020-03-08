package com.codebelow.hashgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText msget=findViewById(R.id.et_msg);
        msget.setText(getIntent().getStringExtra("hash"));

    }
}
