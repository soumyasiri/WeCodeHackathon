package info.wecode;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import info.wecode.activities.LoginActivity;
import info.wecode.database.UserDatabase;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public DrawerLayout mDrawer;

    public static String mTitle = AppConstants.USER_TITLE_DONOR;
    public static boolean mLoginFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        UserDatabase.fillUsers();

        Intent intent = getIntent();
        if (null != intent) { //Null Checking
            mTitle = intent.getStringExtra(AppConstants.USER_TITLE);
            mLoginFlag = intent.getBooleanExtra(AppConstants.LOGIN_FLAG, false);
        } else {
            mTitle = AppConstants.USER_TITLE_DONOR;
            mLoginFlag = false;
        }

        //mFrameLayout = (FrameLayout)findViewById(R.id.content_frame);

        // FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mDrawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (mTitle != null && mTitle.equals(AppConstants.USER_TITLE_ADMIN)) {
            navigationView.inflateMenu(R.menu.activity_admin_drawer);
        } else if (mTitle != null && mTitle.equals(AppConstants.USER_TITLE_DONOR)) {
            navigationView.inflateMenu(R.menu.activity_donor_drawer);
        }
        if (mLoginFlag) {
            Menu menu = navigationView.getMenu();

            // find MenuItem you want to change
            MenuItem nav_camara = menu.findItem(R.id.nav_login);

            // set new title to the MenuItem
            nav_camara.setTitle("Account");
        }

        navigationView.setNavigationItemSelectedListener(this);
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
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_login) {
            Intent loginActivityIntent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(loginActivityIntent);
        } else if (id == R.id.nav_donor_form) {
            //  startActivity(new Intent(this, Item1Activity.class));
        } else if (id == R.id.nav_status) {

        } else if (id == R.id.nav_faq) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_contact_info) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
