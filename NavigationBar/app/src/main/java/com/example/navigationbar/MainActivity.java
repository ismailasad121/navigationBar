package com.example.navigationbar;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import com.google.android.material.navigation.NavigationView;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationView = findViewById(R.id.nav_view);
        drawerLayout = findViewById(R.id.drawer_layout);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        Toast.makeText(getApplicationContext(), "Home is Clicked", Toast.LENGTH_LONG).show();
                        break;

                    case R.id.share:
                        Toast.makeText(getApplicationContext(), "History is Clicked", Toast.LENGTH_LONG).show();
                        //drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.book1:
                        Toast.makeText(getApplicationContext(), "Book1 is clicked", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(MainActivity.this, Book1Activity.class);
                        startActivity(intent);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.book2:
                        Toast.makeText(getApplicationContext(), "Book2 is clicked", Toast.LENGTH_LONG).show();
                        Intent intent2 = new Intent(MainActivity.this, Book2Activity.class);
                        startActivity(intent2);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }
                return true;
            }
        });
    }
}

//    @Override
//    public void onBackPressed(){
//        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
//            drawerLayout.closeDrawer(GravityCompat.START);
//            Toast.makeText(getApplicationContext(),"Start",Toast.LENGTH_LONG).show();
//
//        }
//        else
//        {
//            Toast.makeText(getApplicationContext(),"End",Toast.LENGTH_LONG).show();
//        }
//    }
