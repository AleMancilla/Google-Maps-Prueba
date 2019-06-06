package com.example.googlemapprueba;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity1 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps1);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
//        LatLng sydney = new LatLng(-34, 151);
//        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        LatLng LaPaz = new LatLng(-16.4824723, -68.1216728);
        MarkerOptions marker = new MarkerOptions().position(LaPaz).title("prueba 1");
        marker.snippet("descripcion 2 prueba ");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.tres));
        marker.title("el titulo amo");
        mMap.addMarker(marker);

        LatLng LaPaz2 = new LatLng(-16.485250026968032,-68.12180858683244);
        mMap.addMarker(new MarkerOptions().position(LaPaz2).title("prueba 2")).setSnippet("prueba descripcion");
        LatLng LaPaz3 = new LatLng(-16.48061252314386,-68.1211912859956);
        mMap.addMarker(new MarkerOptions().position(LaPaz3).title("prueba 3"))
                .setIcon(BitmapDescriptorFactory.fromResource(R.drawable.mexico));



        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LaPaz,15));
    }
}
