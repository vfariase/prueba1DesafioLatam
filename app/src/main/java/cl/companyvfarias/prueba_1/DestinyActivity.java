package cl.companyvfarias.prueba_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class DestinyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("E2", "Activity: ForwardActivity");

        setContentView(R.layout.activity_destiny);
    }
}
