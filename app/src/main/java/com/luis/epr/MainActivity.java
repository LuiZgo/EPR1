package com.luis.epr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sig(View view){


        Intent sig = new Intent( this , nota.class);
        startActivity(sig);

        Toast bie = Toast.makeText(getApplicationContext(), "Bienvenido ", Toast.LENGTH_SHORT);

        bie.show();

    }

    public void noso (View view) {

        Intent noso = new Intent(this, nosotros.class);
        startActivity(noso);
    }

}
