package alexguid.custum.com.alexguid;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Alex Guide");
/*
        TextView atraction = (TextView)findViewById(R.id.atrraction);
        atraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent atractionIntent = new Intent(MainActivity.this,AtrractionActivity.class);
                startActivity(atractionIntent);
            }
        });


        TextView resturant = (TextView)findViewById(R.id.resturant);
        resturant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ResturantIntent = new Intent(MainActivity.this,ResturantActivity.class);
                startActivity(ResturantIntent);
            }
        });


        TextView places = (TextView)findViewById(R.id.places);
        places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PlacesIntent = new Intent(MainActivity.this,PlacesActivity.class);
                startActivity(PlacesIntent);
            }
        });*/

        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(viewPager);


    }
}
