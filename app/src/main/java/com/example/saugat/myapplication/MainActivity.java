package com.example.saugat.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username ;
    EditText pass ;
    Button submit ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        pass = findViewById(R.id.pass);
        submit = findViewById(R.id.button);

    }

    public void move(View view)
    {
      String user = username.getText().toString();
      String password = pass.getText().toString();

      if (user.equals("Saugat") && password.equals("saugat253"))
      {
          Intent intent = new Intent(this, Activity2.class);
          Bundle bundle = new Bundle();
          bundle.putString("username",user);
          bundle.putString("pass",password);
          intent.putExtras(bundle);
          startActivity(intent);


      }
      else if (user.equals("") || password.equals(""))
      {

          Toast.makeText(this, "Enter Username and Password", Toast.LENGTH_SHORT).show();

      }
      else
      {
          Toast.makeText(this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
      }
    }
}
