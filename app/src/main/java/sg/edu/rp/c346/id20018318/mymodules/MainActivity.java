package sg.edu.rp.c346.id20018318.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView C203;
    TextView C228;
    TextView C328;
    TextView C331;
    TextView C346;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        C203 = findViewById(R.id.C203);
        C228 = findViewById(R.id.C228);
        C328 = findViewById(R.id.C328);
        C331 = findViewById(R.id.C331);
        C346 = findViewById(R.id.C346);

        C203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Code", "C203");
                intent.putExtra("Name", "Web Appln Development in php");
                intent.putExtra("Year", "2021");
                intent.putExtra("Semester", "1");
                intent.putExtra("Credit", "4");
                intent.putExtra("Venue", "W67L");
                startActivity(intent);
            }
        });

        C228.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Code", "C228");
                intent.putExtra("Name", "Operating Systems Security");
                intent.putExtra("Year", "2021");
                intent.putExtra("Semester", "1");
                intent.putExtra("Credit", "4");
                intent.putExtra("Venue", "E62L");
                startActivity(intent);
            }
        });

        C328.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Code", "C328");
                intent.putExtra("Name", "Intelligent Networks");
                intent.putExtra("Year", "2021");
                intent.putExtra("Semester", "1");
                intent.putExtra("Credit", "4");
                intent.putExtra("Venue", "E62C");
                startActivity(intent);
            }
        });

        C331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Code", "C331");
                intent.putExtra("Name", "Digital Security and Forensics");
                intent.putExtra("Year", "2021");
                intent.putExtra("Semester", "1");
                intent.putExtra("Credit", "4");
                intent.putExtra("Venue", "E61J");
                startActivity(intent);
            }
        });

        C346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Code", "C346");
                intent.putExtra("Name", "Mobile App Development");
                intent.putExtra("Year", "2021");
                intent.putExtra("Semester", "1");
                intent.putExtra("Credit", "4");
                intent.putExtra("Venue", "E62E");
                startActivity(intent);
            }
        });
    }
}