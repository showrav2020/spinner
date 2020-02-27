package com.example.spinnersymple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] countryNames;
    private Spinner spinner;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames = getResources().getStringArray(R.array.country_name);



        spinner =(Spinner) findViewById(R.id.spnID);
        textView = (TextView) findViewById(R.id.txtID);
        button = (Button) findViewById(R.id.btnID);


        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.symple_view,R.id.txtID2,countryNames);
        spinner.setAdapter(adapter);


        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                String value= spinner.getSelectedItem().toString();
                textView.setText(value);

            }
        });
    }

}
