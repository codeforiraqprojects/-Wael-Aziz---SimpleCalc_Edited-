package com.wael.simplecalc;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtFN1, txtSN1;
    private  TextView lblResult1;
    private Button btnAdd1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFN1 = (EditText) findViewById(R.id.txtFN);
        txtSN1 = (EditText) findViewById(R.id.txtSN);
        lblResult1 = (TextView) findViewById(R.id.lbResult);


    }


    public  void addMethod(View v){

        int result= Integer.parseInt(txtFN1.getText().toString()) + Integer.parseInt(txtSN1.getText().toString()) ;

        lblResult1.setText( "The Result: " + result );
    }


    public  void subMethod(View v){

        int result= Integer.parseInt(txtFN1.getText().toString()) - Integer.parseInt(txtSN1.getText().toString()) ;

        lblResult1.setText( "The Result: " + result );
    }

    public  void mulMethod(View v){

        int result= Integer.parseInt(txtFN1.getText().toString()) * Integer.parseInt(txtSN1.getText().toString()) ;

        lblResult1.setText( "The Result: " + result );
    }

    public  void divMethod(View v){

        if (Double.parseDouble(txtSN1.getText().toString()) !=  0 )
        {

        double result= Double.parseDouble(txtFN1.getText().toString()) / Double.parseDouble(txtSN1.getText().toString()) ;

        lblResult1.setText( "The Result: " + result );
    }else
        lblResult1.setText( "divide by zero");
    }

    public void exitMethod(View v)
    {
        System.exit(0);
    }

    public void cleartMethod(View v)
    {
        txtFN1.setText("");
        txtSN1.setText("");
    }
}
