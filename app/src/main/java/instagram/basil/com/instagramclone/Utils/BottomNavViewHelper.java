package instagram.basil.com.instagramclone.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import instagram.basil.com.instagramclone.Home.HomeActivity;
import instagram.basil.com.instagramclone.Likes.LikesActivity;
import instagram.basil.com.instagramclone.Profile.ProfileActivity;
import instagram.basil.com.instagramclone.R;
import instagram.basil.com.instagramclone.Search.SearchActivity;
import instagram.basil.com.instagramclone.Share.ShareActivity;

/**
 * Created by apple on 1/28/18.
 */

public class BottomNavViewHelper {

    private static final String TAG = "BottomNavViewHelper";

    public static void setupBottomNavView(BottomNavigationViewEx bottomNavigationViewEx) {
        Log.d(TAG, "setupBottomNavView: setting up BottomNavViewHelper");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view) {

        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Intent intent;

                switch (item.getItemId()) {

                    case R.id.ic_house:
                        intent = new Intent(context, HomeActivity.class);
                        break;

                    case R.id.ic_search:
                        intent = new Intent(context, SearchActivity.class);
                        break;

                    case R.id.ic_alert:
                        intent = new Intent(context, LikesActivity.class);
                        break;

                    case R.id.ic_circle:
                        intent = new Intent(context, ShareActivity.class);
                        break;

                    case R.id.ic_android:
                        intent = new Intent(context, ProfileActivity.class);
                        break;

                    default:
                        intent = new Intent(context, HomeActivity.class);
                        break;

                }

                context.startActivity(intent);

                return false;
            }
        });
    }



}
