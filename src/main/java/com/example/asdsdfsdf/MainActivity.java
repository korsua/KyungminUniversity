package com.example.asdsdfsdf;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button loveBtn;
    RadioGroup rGroup;
    RadioButton catBtn;
    RadioButton dogBtn;
    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.middle);

        loveBtn = findViewById(R.id.loveBtn);
        rGroup = findViewById(R.id.rGroup);
        catBtn = findViewById(R.id.catBtn);
        dogBtn = findViewById(R.id.dogBtn);
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);

        loveBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        switch (rGroup.getCheckedRadioButtonId()){
                            case R.id.catBtn :
                                setArticle(catBtn, R.drawable.cat, "사랑하는 고양이");
                                break;
                            case R.id.dogBtn :
                                setArticle(dogBtn, R.drawable.dog, "사랑하는 강아지");
                                break;
                            default:
                                textView.setText(R.string.human_text);
                                Toast.makeText(getApplicationContext(),"사랑을 선택해주세요",Toast.LENGTH_SHORT).show();
                                break;

                        }
                    }

                    private void setArticle(RadioButton catBtn, int p, String s) {
                        textView.setText("사랑하는 " + catBtn.getText());
                        imageView.setImageResource(p);
                        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
                    }
                }
        );
        rGroup.setOnCheckedChangeListener((RadioGroup group, int checkedId) -> {
        });
    }
}