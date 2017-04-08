package com.gmbdesign.android.main;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText cajaEmail = (EditText) findViewById(R.id.cajaEmail);
        FocusListener fl = new FocusListener(this);

        cajaEmail.setOnFocusChangeListener(fl);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText cajamail = (EditText) findViewById(R.id.cajaEmail);
                EditText cajaTel = (EditText) findViewById(R.id.cajaTelefono);
                TextInputLayout til = (TextInputLayout) findViewById(R.id.til_email);
                til.setErrorEnabled(false);

                cajamail.setText("");
                cajaTel.setText("");
            }
        });

    }
}
