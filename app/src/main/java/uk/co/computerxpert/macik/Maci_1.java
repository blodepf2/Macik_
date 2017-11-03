package uk.co.computerxpert.macik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.util.Log;

import org.w3c.dom.Text;

import static android.widget.Toast.*;

public class Maci_1 extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioGroup radioGroup2;
    private static final String TAG_ertek = "TAG: Ertek:";
    private CharSequence mackokep;
    private CharSequence mackonev;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maci_1);



/* Initialize Radio Group and attach click handler */
        radioGroup = (RadioGroup) findViewById(R.id.radioMacikep);
        radioGroup.clearCheck();
        radioGroup2 = (RadioGroup) findViewById(R.id.radioMacinev);
        radioGroup2.clearCheck();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if (null != rb && checkedId > -1) {
                    mackokep=rb.getText();
                    Log.i(TAG_ertek,"btn_1"+mackokep);
//                    Toast.makeText(Maci_1.this, mackokep, Toast.LENGTH_SHORT).show();
                }

            }
        });


   /* Attach CheckedChangeListener to radio group */
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if (null != rb && checkedId > -1) {
                    mackonev=rb.getText();
                    Log.i(TAG_ertek,"btn_1"+mackonev);
                    if (mackonev != mackokep) {
                        Toast.makeText(Maci_1.this, "Nem jó!", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(Maci_1.this, "Helyes!", Toast.LENGTH_SHORT).show();
                    }


                }

            }
        });


    }


    public void onClear(View v) {
        /* Clears all selected radio buttons to default */
        radioGroup.clearCheck();
    }

    public void onSubmit(View v) {
        RadioButton rb = (RadioButton) radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
        Log.i(TAG_ertek,"btn_1"+rb.getText());
        mackonev=rb.getText();
    //    Toast.makeText(Maci_1.this, mackonev, Toast.LENGTH_SHORT).show();


    }

}