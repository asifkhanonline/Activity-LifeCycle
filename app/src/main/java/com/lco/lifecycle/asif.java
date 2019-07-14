package com.lco.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class asif extends AppCompatActivity {
    Button btn,btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asif);
        btn=findViewById(R.id.button);
        Toast.makeText(this,"onCreate1",Toast.LENGTH_SHORT).show();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),MainActivity.class);

            }
        });


    }
}
