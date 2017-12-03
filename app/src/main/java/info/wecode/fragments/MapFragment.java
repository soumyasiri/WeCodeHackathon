package info.wecode.fragments;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

import info.wecode.R;

public class MapFragment extends Fragment implements OnMapReadyCallback {

    public static final String ADDRESS = "address";
    private GoogleMap mMap;
    private String mAddress;

    public MapFragment() {
        // Required empty public constructor
    }

    public static MapFragment newInstance(String address) {
        MapFragment fragment = new MapFragment();
        Bundle extras = new Bundle();
        extras.putString(ADDRESS, address);
        fragment.setArguments(extras);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_map, container, false);
        mAddress = getArguments().getString(ADDRESS);
//        FragmentManager fragmentManager = getChildFragmentManager();
//        SupportMapFragment supportMapFragment = (SupportMapFragment) fragmentManager
//                .findFragmentById(R.id.map);
//        supportMapFragment.getMapAsync(this);

        return view;
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * If Google Play services is not installed on the device, the user will be prompted
     * to install
     * it inside the SupportMapFragment. This method will only be triggered once the user
     * has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {

        Geocoder geocoder = new Geocoder(getActivity());
        double latitude = 0;
        double longitude = 0;

        try {
            List<Address> geoResults = geocoder.getFromLocationName("<address goes here>", 1);
            while (geoResults.size()==0) {
                geoResults = geocoder.getFromLocationName(mAddress, 1);
            }
            if (geoResults.size()>0) {
                Address addr = geoResults.get(0);
                latitude = addr.getLatitude();
                longitude = addr.getLongitude();
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }

        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng hackathon = new LatLng(latitude, longitude);
       // mMap.addMarker(new MarkerOptions().position(hackathon).title(getResources()
//                .getString(R.string.map_marker)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hackathon));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(12));
    }
}
