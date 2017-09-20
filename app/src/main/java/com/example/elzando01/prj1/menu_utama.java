package com.example.elzando01.prj1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class menu_utama extends AppCompatActivity {

    TextView txtText;
    EditText editText;
    Button button;

    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        editText = (EditText) findViewById(R.id.edEditText);
        button = (Button) findViewById((R.id.button));

        final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        Button btnTambahEditText = (Button) findViewById(R.id.button);
        btnTambahEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        LinearLayout.LayoutParams linearParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                        TextView bh = new TextView(menu_utama.this);
                        bh.setText(editText.getText());
                        bh.setLayoutParams(linearParams);
                        linearLayout.addView(bh);
                        editText.setText("");
                    }
                });
            }
        });
    }
}
