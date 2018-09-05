package com.doors.styles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.doors.substratum.R;

public class ExampleDialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DoorsTheme.checkDialogTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_dialog);

        findViewById(R.id.ok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ExampleDialog.this, "User clicked ok!", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ExampleDialog.this, "User clicked cancel!", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}
