package sg.edu.rp.c346.id20018318.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode = findViewById(R.id.textViewCode);
        tvName = findViewById(R.id.textViewName);
        tvYear = findViewById(R.id.textViewYear);
        tvSem = findViewById(R.id.textViewSem);
        tvCredit = findViewById(R.id.textViewCredit);
        tvVenue = findViewById(R.id.textViewVenue);
        btnBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String codeSelected = intentReceived.getStringExtra("Code");
        String nameSelected = intentReceived.getStringExtra("Name");
        String yearSelected = intentReceived.getStringExtra("Year");
        String semesterSelected = intentReceived.getStringExtra("Semester");
        String creditSelected = intentReceived.getStringExtra("Credit");
        String venueSelected = intentReceived.getStringExtra("Venue");

        if (codeSelected.equalsIgnoreCase("c203")) {
            tvCode.setText("Module Code: " + codeSelected);
            tvName.setText("Module Name: " + nameSelected);
            tvYear.setText("Academic Year: " + yearSelected);
            tvSem.setText("Semester: " + semesterSelected);
            tvCredit.setText("Module Credit: " + creditSelected);
            tvVenue.setText("Venue: " + venueSelected);

        } else if (codeSelected.equalsIgnoreCase("c228")) {
            tvCode.setText("Module Code: " + codeSelected);
            tvName.setText("Module Name: " + nameSelected);
            tvYear.setText("Academic Year: " + yearSelected);
            tvSem.setText("Semester: " + semesterSelected);
            tvCredit.setText("Module Credit: " + creditSelected);
            tvVenue.setText("Venue: " + venueSelected);

        } else if (codeSelected.equalsIgnoreCase("c328")) {
            tvCode.setText("Module Code: " + codeSelected);
            tvName.setText("Module Name: " + nameSelected);
            tvYear.setText("Academic Year: " + yearSelected);
            tvSem.setText("Semester: " + semesterSelected);
            tvCredit.setText("Module Credit: " + creditSelected);
            tvVenue.setText("Venue: " + venueSelected);

        } else if (codeSelected.equalsIgnoreCase("c331")) {
            tvCode.setText("Module Code: " + codeSelected);
            tvName.setText("Module Name: " + nameSelected);
            tvYear.setText("Academic Year: " + yearSelected);
            tvSem.setText("Semester: " + semesterSelected);
            tvCredit.setText("Module Credit: " + creditSelected);
            tvVenue.setText("Venue: " + venueSelected);

        } else if (codeSelected.equalsIgnoreCase("c346")) {
            tvCode.setText("Module Code: " + codeSelected);
            tvName.setText("Module Name: " + nameSelected);
            tvYear.setText("Academic Year: " + yearSelected);
            tvSem.setText("Semester: " + semesterSelected);
            tvCredit.setText("Module Credit: " + creditSelected);
            tvVenue.setText("Venue: " + venueSelected);

        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}