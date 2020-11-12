package com.example.customcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox cb1;
    private CheckBox cb2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1=findViewById(R.id.checkbox3);
        cb2=findViewById(R.id.checkbox4);
        button=findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb=new StringBuilder("");

                if(cb1.isChecked()){
                    String s1=cb1.getText().toString();
                    sb.append(s1);
                }
                if(cb2.isChecked()){
                    String s2=cb2.getText().toString();
                    sb.append("\n"+s2);
                }
                if(sb!=null && !sb.toString().equals("")){
                    Toast.makeText(getApplicationContext(),sb,Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Nothing selected",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}