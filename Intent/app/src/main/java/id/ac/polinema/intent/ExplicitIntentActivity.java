package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {

    TextView txtOutput;
    EditText inputName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        txtOutput = findViewById(R.id.text_output);
        inputName = findViewById(R.id.input_name);

    }


    public void submitBtn(View view) {
        txtOutput.setText(inputName.getText().toString());
    }
}
