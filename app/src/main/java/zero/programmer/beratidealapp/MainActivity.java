package zero.programmer.beratidealapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private EditText editTextWeight, editTextHeight;
    private TextView textViewBmi, textViewCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void countBmi(View view){
        editTextWeight  = findViewById(R.id.edit_text_weight);
        editTextHeight  = findViewById(R.id.edit_text_height);
        textViewBmi     = findViewById(R.id.text_view_bmi);
        textViewCategory= findViewById(R.id.text_view_category);

        String category;

        double weight   = Double.parseDouble(editTextWeight.getText().toString());
        double height   = Double.parseDouble(editTextHeight.getText().toString()) / 100;
        double bmi      = weight / Math.pow(height, 2);
    }
}