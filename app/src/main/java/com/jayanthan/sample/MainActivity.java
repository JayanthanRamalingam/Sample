package com.jayanthan.sample;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.*;


public class MainActivity extends AppCompatActivity {
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Login=(Button)findViewById(R.id.button);
        assert Login != null;
        assert Login != null;
        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText Username=(EditText)findViewById(R.id.uname);
                EditText Password=(EditText)findViewById(R.id.pwd);
                String user=Username.getText().toString();
                String pass=Password.getText().toString();
                if(user.equals(""))
                {
                    Toast.makeText(view.getContext(),"Enterusername",Toast.LENGTH_LONG).show();
                }
                else if (pass.equals(""))
                {
                    Toast.makeText(view.getContext(),"Enterpassword",Toast.LENGTH_LONG).show();
                }
                else if(user.equals("admin")&&(pass.equals("sam123")))
                {
                    Toast.makeText(view.getContext(),"LoginSuccess",Toast.LENGTH_LONG).show();
                    Intent myIntent=new Intent(MainActivity.this,Second.class);
                    myIntent.putExtra("user",user);
                    MainActivity.this.startActivity(myIntent);
                }
                else
                {
                    Toast.makeText(view.getContext(),"Login Failed",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}