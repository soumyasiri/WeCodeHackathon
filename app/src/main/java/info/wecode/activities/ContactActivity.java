package info.wecode.activities;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import info.wecode.MainActivity;
import info.wecode.R;

public class ContactActivity extends MainActivity {


    Button dialBtn;
    TextView contactTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_contact, null, false);
        mDrawer.addView(contentView, 0);
        contactTv = (TextView) findViewById(R.id.contactTV);
        dialBtn = (Button) findViewById(R.id.dialBtn);
        //5034690955

        contactTv.setText("Office\n" +
                "417 SW 117th Ave, Suite 120\n" +
                "Portland, OR 97225\n" +
                "p: 503.469.0955\n" +
                "\n" +
                "\n" +
                "[3:48] \n" +
                "Hours\n" +
                "Monday - Thursday: 8:00am - 4:30pm\n" +
                "Friday: 9:00am - 3:00pm\n" +
                "Saturday & Sunday: Closed");
        dialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number = Uri.parse("5034690955");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
            }
        });


    }
}
