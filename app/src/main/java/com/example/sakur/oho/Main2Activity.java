package com.example.sakur.oho;

import android.content.DialogInterface;
import android.content.Intent;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent();
                intent.setClass(Main2Activity.this , MainActivity.class);
                startActivity(intent);
                Main2Activity.this.finish();
            }
        });

        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);

                builder.setMessage("確定前往二次元?")
                        .setPositiveButton("確定", new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int which)
                            {
                                EditText editText = (EditText)findViewById(R.id.editText);
                                String name = editText.getText().toString();
                                Toast.makeText(Main2Activity.this, name + " 已購買地獄單程車票*1",Toast.LENGTH_SHORT ).show();
                                Toast.makeText(Main2Activity.this, "即將發車 祝好運(´・ω・｀)",Toast.LENGTH_SHORT ).show();

                                TextView textView4 = (TextView)findViewById(R.id.textView4);
                                textView4.setText("地獄住民 " + name + "\r\n" + "其他的還在摸索中 (?" + "\r\n" + "硬體夠給力了話希望連Linux都做出來(´；ω；｀)");
                            }
                        })
                        .setNegativeButton("不要", new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int which)
                            {
                                Toast.makeText(Main2Activity.this, "不想去二次元?",Toast.LENGTH_SHORT ).show();
                                Toast.makeText(Main2Activity.this, "那就掰掰吧(´・ω・｀)",Toast.LENGTH_SHORT ).show();

                                EditText editText = (EditText)findViewById(R.id.editText);
                                String name = editText.getText().toString();
                                TextView textView4 = (TextView)findViewById(R.id.textView4);
                                textView4.setText("死者 " + name + "\r\n" + "其他的還在摸索中 (?" + "\r\n" + "硬體夠給力了話希望連Linux都做出來(´；ω；｀)");
                            }
                        });
                AlertDialog about_dialog = builder.create();
                about_dialog.show();
            }
        });
    }




}
