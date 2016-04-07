package com.example.mahmutye.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String EXTRA_MESSAGE ="name" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button gonder = (Button)findViewById(R.id.mesajGonder);

        gonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MesajGoster.class);
                EditText editText = (EditText) findViewById(R.id.editText_mesaj);
                String mesaj = editText.getText().toString();
                intent.putExtra(EXTRA_MESSAGE, mesaj);
                startActivity(intent);
            }
        });


    }
    }

