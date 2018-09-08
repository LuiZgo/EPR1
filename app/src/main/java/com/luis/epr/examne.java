package com.luis.epr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class examne extends AppCompatActivity {

    private EditText etp;
    private TextView nn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examne);

        etp = (EditText)findViewById(R.id.editTextNN);
        nn = (TextView)findViewById(R.id.textViewNNC);



    }


    public void home (View view){

        Intent home = new Intent( this , MainActivity.class);
        startActivity(home);


    }

    public void examen (View view){


        String np_string = etp.getText().toString();
        int np = Integer.parseInt(np_string);

       double ante = np * 0.70;
       double exmp = 40 - ante;
       double nota = exmp/3;

        nn.setText(""+ nota);



    }


}
