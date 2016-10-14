package science.ksp.buttonchecker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonSetColor;
    private Button buttonSetImage;
    private TextView colorField;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSetColor = (Button) findViewById(R.id.buttonSetColor);
        buttonSetImage = (Button) findViewById(R.id.buttonSetImage);
        colorField = (TextView) findViewById(R.id.colorField);
        imageView = (ImageView) findViewById(R.id.imageView);
        setClickListeners();
    }

    private void setClickListeners() {
        buttonSetImage.setOnClickListener(this);
        buttonSetColor.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonSetColor:
                colorField.setText(R.string.errorMessage);
                colorField.setBackgroundColor(getResources().getColor(R.color.colorRed));
                colorField.setTextColor(getResources().getColor(R.color.colorYellow));
                break;
            case R.id.buttonSetImage:
                if (imageView.getVisibility() == View.VISIBLE) {
                    imageView.setVisibility(View.INVISIBLE);
                } else {
                    imageView.setVisibility(View.VISIBLE);
                }
                break;
        }
    }
}