package com.example.sharedpreferences;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
    Button save;
    TextView username;
    SharedPreferences mySharedPreferences;
    SharedPreferences.Editor editor;
    String prefName="mylocaldatabase";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.text);
        save=(Button)findViewById(R.id.button);
        mySharedPreferences=getSharedPreferences(prefName,MODE_PRIVATE);
        editor=mySharedPreferences.edit();

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernamestr=username.getText().toString();
                editor.putString("myusernamesaveday",usernamestr);
                editor.commit();

            }
        });


    }
}
