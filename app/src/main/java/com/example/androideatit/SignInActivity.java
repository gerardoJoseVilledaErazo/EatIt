package com.example.androideatit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignInActivity extends AppCompatActivity {

    private TextInputEditText edtPhone, edtPassword;
    private MaterialButton btnSignIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Init Firebase
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference table_user = database.getReference("User");


        edtPassword = (TextInputEditText) findViewById(R.id.edtPassword_edit_text);
        edtPhone  = (TextInputEditText) findViewById(R.id.edtPhone_edit_text);
        btnSignIn = (MaterialButton) findViewById(R.id.btnSignIn_activity_sign_in);

        btnSignIn.setOnClickListener(view -> {
//            addUser();
        });

    }



    private boolean isValid(@Nullable Editable text) {
        return text != null;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }
}