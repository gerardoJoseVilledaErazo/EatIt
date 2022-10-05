package com.example.androideatit;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSignIn, btnSignUp;

    TextView txtSlogan;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ******************* Instancias a los componentes graficos *********************

        btnSignIn = (Button) findViewById (R. id.btnSignIn);
        btnSignIn.setOnClickListener(this);
        btnSignUp = (Button) findViewById (R. id.btnSignUp);
        btnSignUp.setOnClickListener(this);

        txtSlogan = (TextView) findViewById (R. id. txtSlogan);

        Typeface face = Typeface.createFromAsset(getAssets(),"fonts/NABILA.TTF");
        txtSlogan.setTypeface(face);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSignIn: {
                startActivity(new Intent(MainActivity.this,SignInActivity.class));

            }break;
            case R.id.btnSignUp: {
            }break;
        }
    }
}