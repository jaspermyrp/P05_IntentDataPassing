package sg.edu.rp.c346.intentdatapassingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvOut = findViewById(R.id.textView);

        Intent getIntent = getIntent();
        double value = getIntent.getDoubleExtra("value", 0.0);
        tvOut.setText("Double Value Received: " + value);

    }
}
