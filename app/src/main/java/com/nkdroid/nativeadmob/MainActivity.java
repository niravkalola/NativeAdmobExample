package com.nkdroid.nativeadmob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnNativeAppInstall,btnNativeContent,btnNativeExpress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNativeAppInstall= (Button) findViewById(R.id.btnNativeAppInstall);
        btnNativeContent= (Button) findViewById(R.id.btnNativeContent);
        btnNativeExpress= (Button) findViewById(R.id.btnNativeExpress);

        btnNativeAppInstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,NativeAppInstallAdActivity.class);
                startActivity(i);
            }
        });

        btnNativeContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,NativeContentAdActivity.class);
                startActivity(i);
            }
        });

        btnNativeExpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,NativeExpressActivity.class);
                startActivity(i);
            }
        });


    }
}
