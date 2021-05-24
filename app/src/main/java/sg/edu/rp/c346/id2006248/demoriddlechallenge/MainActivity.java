package sg.edu.rp.c346.id2006248.demoriddlechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvQ1, tvQ2;
    Button btnReveal1Q1;
    Button btnReveal1Q2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvQ1 = findViewById(R.id.textViewQ1);
        tvQ2 = findViewById(R.id.textViewQ2);
        btnReveal1Q1 = findViewById(R.id.buttonRevealQ1);
        btnReveal1Q2 = findViewById(R.id.button2RevealQ2);

        btnReveal1Q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AnswerActivity.class);
                intent.putExtra("Question","Q1");
                startActivity(intent);

            }
        });

        btnReveal1Q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,AnswerActivity.class);
                intent2.putExtra("Question","Q2");
                startActivity(intent2);
            }
        });
    }
}