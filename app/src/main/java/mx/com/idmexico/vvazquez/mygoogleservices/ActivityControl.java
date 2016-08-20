package mx.com.idmexico.vvazquez.mygoogleservices;

import android.content.Intent;
import android.support.annotation.IntRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.location.places.ui.PlacePicker;

public class ActivityControl extends AppCompatActivity {
    private static final int PLACE_PICKER_REQUEST = 1 ;
    Button btnMap, btnPicker, btnMob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_control);
        btnMap = (Button)findViewById(R.id.btnMap);
        btnPicker =(Button) findViewById(R.id.btnPicker);
        btnMob = (Button) findViewById(R.id.btnMob);
       /* btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityControl.this, MapsActivity.class));
            }
        });
        btnPicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    startActivityForResult(new PlacePicker.IntentBuilder().build(ActivityControl.this), PLACE_PICKER_REQUEST);
                }catch (GooglePlayServicesNotAvailableException e)
                {
                    e.printStackTrace();
                }

            }
        });
        btnMob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityControl.this, AddMobActivity.class));
            }
        });*/
    }
}
