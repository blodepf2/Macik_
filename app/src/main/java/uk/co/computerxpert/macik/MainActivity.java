package uk.co.computerxpert.macik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.app.Activity;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private static final String TAG_muv = "TAG: Muvelet:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton btn1 = (ImageButton) findViewById(R.id.btn_1);
        ImageButton btn2 = (ImageButton) findViewById(R.id.btn_2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }


    public void onClick(final android.view.View v) {
        switch (v.getId()) {
            case R.id.btn_1:
                Log.i(TAG_muv,"btn_1");
                Intent Maci_1 = new Intent(MainActivity.this, Maci_1.class);
                startActivity(Maci_1);
                break;
            case R.id.btn_2:
                Log.i(TAG_muv,"btn_2");
                Intent Maci_2 = new Intent(MainActivity.this, Maci_2.class);
                startActivity(Maci_2);
                break;
        }
    }
}