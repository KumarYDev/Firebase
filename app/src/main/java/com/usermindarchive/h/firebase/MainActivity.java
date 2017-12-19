package com.usermindarchive.h.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
@BindView(R.id.get)
    Button send;
@BindView(R.id.show)
    EditText show;
firebase fire;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fire=new firebase();
    }

    @OnClick(R.id.get)
    public void send(){
        fire.sendData();
        fire.sendData();

    }
}
