package com.example.admin.lab_5;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button bn = (Button)findViewById(R.id.button);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText et =(EditText)findViewById(R.id.url);
                String url=et.getText().toString();
                Intent intent=new Intent();
                Uri uri = Uri .parse(url);
                intent.setData(uri);
                intent.setAction(Intent.ACTION_VIEW);
               intent.putExtra("url",url);//相当于BUNDLE,传递数据给mybrowser
                startActivity(intent);
            }
        });
    }


}
