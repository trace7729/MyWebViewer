package com.example.hole1.mywebviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button buttonUCSD, buttonAmazon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAmazon=(Button) findViewById(R.id.buttonAmazon);
        buttonAmazon.setOnClickListener(this);
        buttonUCSD=(Button) findViewById(R.id.buttonUCSD);
        buttonUCSD.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.buttonAmazon:
                Intent a;
                a=new Intent(this, AmazonActivity.class);
                startActivity(a);
                break;
            case R.id.buttonUCSD:
                Intent u;
                u=new Intent(this, ucsdActivity.class);
                startActivity(u);
                break;
        }
    }
}
