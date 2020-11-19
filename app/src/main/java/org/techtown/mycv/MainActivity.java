package org.techtown.mycv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MainFragment mainFragment;
    ProfileFragment profileFragment;
    EducationFragment educationFragment;
    ActivitiesFragment activitiesFragment;
    CertificateFragment certificateFragment;
    AwardFragment awardFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profileFragment = new ProfileFragment();
        mainFragment = new MainFragment();
        educationFragment = new EducationFragment();
        activitiesFragment = new ActivitiesFragment();
        certificateFragment = new CertificateFragment();
        awardFragment = new AwardFragment();

        Button profile_button = findViewById(R.id.button);
        profile_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFragmentChanged(1);
            }
        });

        Button education_button = findViewById(R.id.button2);
        education_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFragmentChanged(2);
            }
        });

        Button activities_button = findViewById(R.id.button3);
        activities_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFragmentChanged(3);
            }
        });

        Button certificate_button = findViewById(R.id.button4);
        certificate_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFragmentChanged(4);
            }
        });

        Button award_button = findViewById(R.id.button5);
        award_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFragmentChanged(5);
            }
        });
    }

    public void onFragmentChanged(int index)
    {
        if(index == 1)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, profileFragment).commit();
        }
        else if(index == 2)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, educationFragment).commit();
        }
        else if(index == 3)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, activitiesFragment).commit();
        }
        else if(index == 4)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, certificateFragment).commit();
        }
        else if(index == 5)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, awardFragment).commit();
        }
    }
}