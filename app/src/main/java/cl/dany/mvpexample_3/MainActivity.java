package cl.dany.mvpexample_3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PasswordCallback{
    private TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.validationTv);
        final EditText editText = findViewById(R.id.inputEt);
        Button button = findViewById(R.id.resultBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();
                new PasswordVerificator(MainActivity.this).checkPassString(value);
            }
        });


    }

    @Override
    public void checkPass(String value) {
       textView.setText(value);
    }

    @Override
    public void blankInput() {
        Toast.makeText(this, "rellene los formularios", Toast.LENGTH_SHORT).show();
    }
}
