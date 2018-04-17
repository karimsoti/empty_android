package com.example.kabdelbaki.empty;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Context mContext;
    private Activity mActivity;

    private RelativeLayout mRelativeLayout;
    private Button mButton;

    private PopupWindow mPopupWindow;
    private static final String TAG = "MyVerboseLog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


     /*   final Button button = findViewById(R.id.button1);                       //instantiate a button which finds a view using the Id of the button declared in activity_main.xml
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Paul is awesome", Toast.LENGTH_LONG).show();

            }
        });*/

//        final Button popup = findViewById(R.id.popupBtn);                       //instantiate a button which finds a view using the Id of the button declared in activity_main.xml
//        popup.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
////
//                Intent myIntent = new Intent(getApplicationContext(), LoginActvitity.class);
//                startActivity(myIntent);
//
//
//
//
//            }
//        });

        LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);


        final Button locationData = findViewById(R.id.locationBtn);                       //instantiate a button which finds a view using the Id of the button declared in activity_main.xml
        locationData.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
//
                Log.v(TAG, "hello");


            }
        });

    }

    public void getLocation() {


//    return"string";
    }


}
