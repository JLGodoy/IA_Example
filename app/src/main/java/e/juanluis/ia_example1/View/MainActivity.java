package e.juanluis.ia_example1.View;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import e.juanluis.ia_example1.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    Fragment selectedfragment = null;

                    switch (menuItem.getItemId()){

                        case R.id.nav_home:
                            selectedfragment = new HomeFragment();
                            break;

                        case R.id.nav_map:
                            selectedfragment = new HomeFragment();
                            break;

                        case R.id.nav_user:
                            selectedfragment = new HomeFragment();
                            break;


                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentsLayout, selectedfragment).commit();
                    return true;
                }
            };
}
