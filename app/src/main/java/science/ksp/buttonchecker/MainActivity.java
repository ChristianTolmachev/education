package science.ksp.buttonchecker;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonSetColor;
    Button buttonSetImage;
    TextView colorField;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSetColor = (Button) findViewById(R.id.buttonSetColor);
        buttonSetImage = (Button) findViewById(R.id.buttonSetImage);
        colorField = (TextView) findViewById(R.id.colorField);
        imageView = (ImageView) findViewById(R.id.imageView);

        buttonSetColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorField.setText(R.string.errorMessage);
                colorField.setBackgroundColor(R.color.colorRed);
                colorField.setTextColor(R.color.colorYellow);
            }
        });
        buttonSetImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setContentView(imageView.VISIBLE);
            }
        });
    }


}
