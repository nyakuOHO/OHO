package com.example.sakur.oho;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button)findViewById(R.id.button);
        button1.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this , Main2Activity.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
    }



}
