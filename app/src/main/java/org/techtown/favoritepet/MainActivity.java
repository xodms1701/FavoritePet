package org.techtown.favoritepet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener{
    CheckBox checkSelect;
    TextView textQuest;
    RadioGroup rg;
    RadioButton radioCat, radioCat2, radioCat3;
    Button butOk;
    ImageView imgvPet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkSelect = (CheckBox)findViewById(R.id.Check_select);
        textQuest = (TextView)findViewById(R.id.text_quest);
        rg = (RadioGroup)findViewById(R.id.rg);
        radioCat = (RadioButton)findViewById(R.id.radio_cat);
        radioCat2 = (RadioButton)findViewById(R.id.radio_cat2);
        radioCat3= (RadioButton)findViewById(R.id.radio_cat3);
        butOk = (Button)findViewById(R.id.but_OK);
        imgvPet = (ImageView)findViewById(R.id.imgv_pet);
        checkSelect.setOnCheckedChangeListener(this);
        butOk.setOnClickListener(this);
    }//end onCreate

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(checkSelect.isChecked()){
            textQuest.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            butOk.setVisibility(View.VISIBLE);
            imgvPet.setVisibility(View.VISIBLE);
        }else {
            textQuest.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.INVISIBLE);
            butOk.setVisibility(View.INVISIBLE);
            imgvPet.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onClick(View view) {
        switch (rg.getCheckedRadioButtonId()){
            case R.id.radio_cat:
                imgvPet.setImageResource(R.drawable.cat);
                break;
            case R.id.radio_cat2:
                imgvPet.setImageResource(R.drawable.cat2);
                break;
            case R.id.radio_cat3:
                imgvPet.setImageResource(R.drawable.cat3);
                break;
            default:
                Toast.makeText(this,"라디오 버튼이 하나도 선택이 안되었네요.",Toast.LENGTH_SHORT).show();
        }
    }
}
