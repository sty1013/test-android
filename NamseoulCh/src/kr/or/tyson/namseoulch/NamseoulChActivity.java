package kr.or.tyson.namseoulch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NamseoulChActivity extends Activity {

    public static final String TAG = "ContactManager";

    private Button mIntroChurchButton;

    /** Called when the activity is first created. */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mIntroChurchButton = (Button) findViewById(R.id.introduceChurchButton);
        
        mIntroChurchButton.setOnClickListener(new OnClickListener() {
            
            public void onClick(View v) {
                Log.d(TAG, "button_introduce_church button clicked.");
                launchChurchIntroduction();
            }
        });
    }

    protected void launchChurchIntroduction() {
        Intent i = new Intent(this, ChurchIntroduction.class);
        startActivity(i);
    }
}