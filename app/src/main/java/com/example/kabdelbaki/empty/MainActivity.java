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
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Toast;

import javax.xml.datatype.Duration;

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
//
//                Intent myIntent = new Intent(getApplicationContext(), LoginActvitity.class);
//                startActivity(myIntent);
//
//
//
//
//            }
//        });


        final Button locationData = findViewById(R.id.locationBtn);                       //instantiate a button which finds a view using the Id of the button declared in activity_main.xml
        locationData.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
//
//                Log.v(TAG, "hello");
                getLocationEngine();

            }
        });

    }


    public void getLocationEngine() {

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.ACCESS_FINE_LOCATION)) {

            } else {

                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);

            }
        } else {


            LocationManager lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            Location location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            final double[] longitude = {location.getLongitude()};
            final double[] latitude = {location.getLatitude()};

            final LocationListener locationListener = new LocationListener() {
                public void onLocationChanged(Location location) {
                    longitude[0] = location.getLongitude();
                    latitude[0] = location.getLatitude();
                }

                @Override
                public void onStatusChanged(String provider, int status, Bundle extras) {

                }

                @Override
                public void onProviderEnabled(String provider) {

                }

                @Override
                public void onProviderDisabled(String provider) {

                }


            };

            lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 2000, 10, locationListener);
//            Toast.makeText(getApplicationContext(), longitude[0] + " " + latitude[0], Toast.LENGTH_SHORT).show();


            Log.v(TAG, longitude[0] + " " + latitude[0]);
        }
//    return"string";
    }


}
