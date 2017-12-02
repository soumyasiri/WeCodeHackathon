package info.wecode.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import info.wecode.MainActivity;
import info.wecode.R;

public class ShareActivity extends MainActivity {

    Button shareBtn;
    EditText messageET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_share, null, false);
        mDrawer.addView(contentView, 0);
        shareBtn = (Button) findViewById(R.id.shareBtn);
        messageET = (EditText) findViewById(R.id.messageET);

        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = messageET.getText().toString();
                if (shareBody == null || shareBody.isEmpty()) {
                    shareBody = "North West Milk Donation";
                }
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Milk Donated");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));

            }
        });
    }

}
