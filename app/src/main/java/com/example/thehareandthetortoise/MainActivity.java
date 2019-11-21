package com.example.thehareandthetortoise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =  findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"button",Toast.LENGTH_SHORT).show();
                openMain2Activity();
            }
        });
    }
    public void  openMain2Activity(){
        Intent intent = new Intent(this, com.example.thehareandthetortoise.Main2Activity.class);
        startActivity(intent);
    }
}
