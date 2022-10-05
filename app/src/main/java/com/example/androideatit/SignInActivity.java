package com.example.androideatit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SignInActivity extends AppCompatActivity {

    //Init Firebase
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    final DatabaseReference table_user = database.getReference("User");

    private TextInputEditText edtPhone, edtPassword;
    private MaterialButton btnSignIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        edtPassword = (TextInputEditText) findViewById(R.id.edtPassword_edit_text);
        edtPhone  = (TextInputEditText) findViewById(R.id.edtPhone_edit_text);
        btnSignIn = (MaterialButton) findViewById(R.id.btnSignIn_activity_sign_in);

        btnSignIn.setOnClickListener(view -> {
//            signIn();
        });

    }



    private void signIn(){

        table_user.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                /// Get User Information
                /// Because we will get user phone by get Key , but data we need write Model class to get data
                //
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        /*if(!isValid(userNameEditText.getText()) && !isValid(phoneNumberEditText.getText())){
            userNameTextInput.setError("Required");
            phoneNumberTextInput.setError("Required");
        }else{
            if(UtilsVE.verifyEditText(userNameEditText)&& UtilsVE.verifyEditTextNumber(phoneNumberEditText)  ) {
                sharedPreferences = getSharedPreferences(NAME_FILE, MODE_PRIVATE);
                SharedPreferences.Editor editorConfig = sharedPreferences.edit();
                editorConfig.putString("USER", userNameEditText.getText().toString() );
                editorConfig.putString("PHN", phoneNumberEditText.getText().toString() );
                editorConfig.commit();
                Intent intent = new Intent(this, ContactVE_ListActivity.class);
                startActivity(intent); // Inicia Activity
                String user = sharedPreferences.getString("USER", "");
                Toast.makeText(
                        SignInActivity.this,
                        "Hello "+user+"!",
                        Toast.LENGTH_SHORT
                ).show();
            }
        }*/
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