package sg.edu.rp.c346.id18004536.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView tvAnswer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvAnswer2 = findViewById(R.id.textView2);
        //tvAnswer.setText("Q1 answer is: Queue");
        Intent intentReceived = getIntent();
        String questionSelected = intentReceived.getStringExtra("Question");
        tvAnswer2.setText(questionSelected + " Answer is: Gone");
    }
}
