package sg.edu.rp.c346.intentdatapassingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvOut = findViewById(R.id.textView);

        Intent getIntent = getIntent();
        char value = getIntent.getCharExtra("value", '0');
        tvOut.setText("Char Value Received: " + value);
    }
}
