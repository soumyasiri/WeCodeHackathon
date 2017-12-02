package info.wecode.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import info.wecode.MainActivity;
import info.wecode.R;

/**
 * Created by soumyasiricilla on 12/2/17.
 */

public class DonationActivity extends MainActivity {

    EditText dateET;
    EditText milkVolET;
    EditText locationET;
    Button submitBtn;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        LayoutInflater inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_donateform, null, false);
        mDrawer.addView(contentView, 0);
        dateET = (EditText) findViewById(R.id.dateET);
        milkVolET = (EditText) findViewById(R.id.milkVolumeET);
        locationET = (EditText) findViewById(R.id.locationTV);
        submitBtn = (Button) findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Thank You!, Submitted the Donation", Toast.LENGTH_LONG).show();
            }
        });

    }


}
