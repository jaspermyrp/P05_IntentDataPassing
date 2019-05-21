package sg.edu.rp.c346.intentdatapassingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Event Handling Step 1 //
    Button btnPassInteger, btnPassChar;
    TextView tvPassDouble;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Event Handling Step 2 //
        btnPassInteger = findViewById(R.id.buttonPassInteger);
        btnPassChar = findViewById(R.id.buttonPassChar);
        tvPassDouble = findViewById(R.id.thirdActivity);



        // Event Handling Step 3 //
        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });

        btnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), ThirdActivity.class);
                intent.putExtra("value", 'a');
                startActivity(intent);
            }
        });

        tvPassDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), FourthActivity.class);
                intent.putExtra("value", 99.99);
                startActivity(intent);
            }
        });
    }
}
