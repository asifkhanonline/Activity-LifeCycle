package com.lco.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt,bt1;
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this,"start",Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this,"Resume",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"onCreate",Toast.LENGTH_SHORT).show();

        bt=findViewById(R.id.button01);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),asif.class);
                startActivity(i);

            }
        });






    }
}


