package com.samichankesor.coffeeorderapp;

import android.content.Context;
import android.content.Intent;

public class NavbarActivity {

    private Context context;

    public NavbarActivity(Context context) {
        this.context = context;
    }

    public boolean handleNavigation(int itemId) {
        if (itemId == R.id.home) {
            navigateToHome();
            return true;
        } else if (itemId == R.id.favorite) {
            navigateToFavorite();
            return true;
        } else if (itemId == R.id.menu) {
            navigateToNotification();
            return true;
        } else if (itemId == R.id.setting) {
            navigateToSetting();
            return true;
        } else {
            return false;
        }
    }

    private void navigateToHome() {
        Intent notificationIntent = new Intent(context, HomeActivity.class);
        context.startActivity(notificationIntent);
    }

    private void navigateToFavorite() {
        Intent notificationIntent = new Intent(context, FavouriteActivity.class);
        context.startActivity(notificationIntent);
    }

    private void navigateToNotification() {
        Intent notificationIntent = new Intent(context, MenuActivity.class);
        context.startActivity(notificationIntent);
    }

    private void navigateToSetting() {
        Intent notificationIntent = new Intent(context, ProfileActivity.class);
        context.startActivity(notificationIntent);
    }
}
