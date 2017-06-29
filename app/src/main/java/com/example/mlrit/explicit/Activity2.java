package com.example.mlrit.explicit;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity  {

Button b;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        b=(Button) findViewById(R.id.b);
        tv1=(TextView)findViewById(R.id.tv1);
        Intent i=getIntent();
        Bundle text=i.getExtras();
        String s=text.getString("k");
        tv1.setText("" +s);
       /* b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Activity2.this, MainActivity.class);
                startActivity(i);

            }
        });*/
    }


}
