package com.example.deepu.dogwiteration1;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.deepu.dogwiteration1.drawerFragment.Body;
import com.example.deepu.dogwiteration1.drawerFragment.Hometreat;
import com.example.deepu.dogwiteration1.drawerFragment.Plant;
import com.example.deepu.dogwiteration1.drawerFragment.Vet;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Body bodyFragment;
    private Plant plantFragment;
    private Vet vetFragment;
    private Hometreat hometreatFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        bodyFragment = new Body();
        getSupportFragmentManager().beginTransaction().add(R.id.content_main, bodyFragment).commit();
        plantFragment = new Plant();
        getSupportFragmentManager().beginTransaction().add(R.id.content_main, plantFragment).commit();
        vetFragment = new Vet();
        getSupportFragmentManager().beginTransaction().add(R.id.content_main, vetFragment).commit();
        hometreatFragment = new Hometreat();
        getSupportFragmentManager().beginTransaction().add(R.id.content_main, hometreatFragment).commit();

        //hide all fragment when home page start
        getSupportFragmentManager().beginTransaction().hide(plantFragment).commit();
        getSupportFragmentManager().beginTransaction().hide(bodyFragment).commit();
        getSupportFragmentManager().beginTransaction().hide(hometreatFragment).commit();
        getSupportFragmentManager().beginTransaction().hide(vetFragment).commit();
    }

    //once go to the mainActivity, set the toolbar title to UPET
    @Override
    protected void onResume() {
        super.onResume();
        setTitle("UPET");
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_plant_fragment, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_search) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();


        if (id == R.id.nav_toxic) {
            showFragment(plantFragment, bodyFragment, hometreatFragment, vetFragment);
            setTitle("Plant To Dog");
        } else if (id == R.id.nav_body) {
            showFragment(bodyFragment, plantFragment, hometreatFragment, vetFragment);
            setTitle("Body Language");
        } else if (id == R.id.nav_home) {
            showFragment(hometreatFragment, plantFragment, bodyFragment, vetFragment);
            setTitle("Home Treatment");
        } else if (id == R.id.nav_vet) {
            showFragment(vetFragment, plantFragment, bodyFragment, hometreatFragment);
            setTitle("Vet");
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void showFragment(Fragment fragmentShow, Fragment fragmentHide1, Fragment fragmentHide2, Fragment fragmentHide3) {
        getSupportFragmentManager().beginTransaction().show(fragmentShow).commit();
        getSupportFragmentManager().beginTransaction().hide(fragmentHide1).commit();
        getSupportFragmentManager().beginTransaction().hide(fragmentHide2).commit();
        getSupportFragmentManager().beginTransaction().hide(fragmentHide3).commit();
    }
}