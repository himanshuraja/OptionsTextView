package com.himanshusharmahs974gmail.optionstextview;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    @Override
    private Context mContext;
    private Activity mActivity;

    private RelativeLayout mRelativeLayout;
    private TextView mTextView;
    private Toolbar mToolbar;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the application context
        mContext = getApplicationContext();
        // Get the activity
        mActivity = MainActivity.this;

        // Get the widgets reference from XML layout
        mRelativeLayout = (RelativeLayout) findViewById(R.id.rl);
        mTextView = (TextView) findViewById(R.id.tv);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        // Set a title for toolbar
        mToolbar.setTitle("Android Options Menu Example");
        mToolbar.setTitleTextColor(Color.WHITE);

        /*
            public void setSupportActionBar (Toolbar toolbar)
                Set a Toolbar to act as the ActionBar for this Activity window.

                When set to a non-null value the getActionBar() method will return an ActionBar
                object that can be used to control the given toolbar as if it were a traditional
                window decor action bar. The toolbar's menu will be populated with the Activity's
                options menu and the navigation button will be wired through the standard
                home menu select action.

                In order to use a Toolbar within the Activity's window content the application
                must not request the window feature FEATURE_SUPPORT_ACTION_BAR.

            Parameters
                toolbar : Toolbar to set as the Activity's action bar

        */
        // Set support actionbar with toolbar
        setSupportActionBar(mToolbar);

        // Change the toolbar background color
        mToolbar.setBackgroundColor(Color.parseColor("#FF80D7FF"));
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private void setSupportActionBar(Toolbar mToolbar) {
    }


    /*
        public boolean onCreateOptionsMenu (Menu menu)
            Initialize the contents of the Activity's standard options menu. You should place
            your menu items in to menu.

            This is only called once, the first time the options menu is displayed. To update the
            menu every time it is displayed, see onPrepareOptionsMenu(Menu).

            The default implementation populates the menu with standard system menu items. These are
            placed in the CATEGORY_SYSTEM group so that they will be correctly ordered with
            application-defined menu items. Deriving classes should always call through to the
            base implementation.

            You can safely hold on to menu (and any items created from it), making modifications
            to it as desired, until the next time onCreateOptionsMenu() is called.

            When you add items to the menu, you can implement the Activity's
            onOptionsItemSelected(MenuItem) method to handle them there.

        Parameters
            menu : The options menu in which you place your items.
        Returns
            You must return true for the menu to be displayed;
            if you return false it will not be shown.
    */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /*
            MenuInflater
                This class is used to instantiate menu XML files into Menu objects.

                For performance reasons, menu inflation relies heavily on pre-processing of XML
                files that is done at build time.
        */
        /*
            public MenuInflater getMenuInflater ()
                Returns a MenuInflater with this context.
        */
        MenuInflater inflater = getMenuInflater();

        /*
            public void inflate (int menuRes, Menu menu)
                Inflate a menu hierarchy from the specified XML resource. Throws InflateException if there is an error.

            Parameters
                menuRes : Resource ID for an XML layout resource to load (e.g., R.menu.main_activity)
                menu : The Menu to inflate into. The items and submenus will be added to this Menu.

        */
        inflater.inflate(R.menu.toolbar_options_menu, menu);
        return true;
    }


    /*
        public boolean onOptionsItemSelected (MenuItem item)
            This hook is called whenever an item in your options menu is selected. The default
            implementation simply returns false to have the normal processing happen (calling the
            item's Runnable or sending a message to its Handler as appropriate). You can use this
            method for any items for which you would like to do processing without
            those other facilities.

            Derived classes should call through to the base class for it to perform
            the default menu handling.

        Parameters
            item : The menu item that was selected.
        Returns
            boolean : Return false to allow normal menu processing to proceed,
                      true to consume it here.
    */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.red:
                // Set the text color to red
                mTextView.setTextColor(Color.RED);
                return true;
            case R.id.green:
                // Set the text color to green
                mTextView.setTextColor(Color.GREEN);
                return true;
            case R.id.blue:
                // Set the text color to blue
                mTextView.setTextColor(Color.BLUE);
                return true;
            case R.id.maroon:
                // Set the text color to maroon
                mTextView.setTextColor(Color.parseColor("#800000"));
                return true;
            case R.id.orange:
                // Set the text color to orange
                mTextView.setTextColor(Color.parseColor("#FFA500"));
                return true;
            case R.id.purple:
                // Set the text color to purple
                mTextView.setTextColor(Color.parseColor("#800080"));
                return true;
            case R.id.black:
                // Set the text color to black
                mTextView.setTextColor(Color.BLACK);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.himanshusharmahs974gmail.optionstextview/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.himanshusharmahs974gmail.optionstextview/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}