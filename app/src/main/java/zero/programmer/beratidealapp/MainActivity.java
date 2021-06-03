    package zero.programmer.beratidealapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void countBmi(View view){
        EditText editTextWeight = findViewById(R.id.edit_text_weight);
        EditText editTextHeight = findViewById(R.id.edit_text_height);
        RadioButton radioButtonMan = findViewById(R.id.radio_man);
        RadioButton radioButtonWoman = findViewById(R.id.radio_woman);
        TextView textViewBmi = findViewById(R.id.text_view_bmi);
        TextView textViewCategory = findViewById(R.id.text_view_category);

        double weight   = Double.parseDouble(editTextWeight.getText().toString());
        double height   = Double.parseDouble(editTextHeight.getText().toString()) / 100;
        double bmi      = weight / Math.pow(height, 2);

        String category = null;

        if (radioButtonMan.isChecked()){
            if (bmi >= 0 && bmi <18){
                category = "Kurus";
            } else if (bmi >= 18 && bmi < 25){
                category = "Normal";
            } else if (bmi >= 25 && bmi < 27){
                category = "Gemuk";
            } else {
                category = "Obesitas";
            }
        } else if (radioButtonWoman.isChecked()){
            if (bmi >= 0 && bmi <17){
                category = "Kurus";
            } else if (bmi >= 17 && bmi < 23){
                category = "Normal";
            } else if (bmi >= 23 && bmi < 27){
                category = "Gemuk";
            } else {
                category = "Obesitas";
            }
        }

        textViewBmi.setText(String.valueOf(bmi));
        textViewCategory.setText(category);
    }
}