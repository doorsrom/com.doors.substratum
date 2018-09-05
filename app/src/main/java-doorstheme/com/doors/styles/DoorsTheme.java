package com.doors.styles;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.widget.Toast;

import com.doors.substratum.R;

import java.io.File;

@SuppressWarnings("ALL")
public class DoorsTheme {

    private static SharedPreferences getPrefs(Context context) {
        SharedPreferences prefs = context.getSharedPreferences("theme", Context.MODE_PRIVATE);
        try {
            context = context.createPackageContext("com.doors.styles", 0);
            prefs = context.getSharedPreferences(
                    "theme", Context.MODE_PRIVATE);
            File prefsFile = new File(context.getApplicationInfo().dataDir + "/shared_prefs/theme.xml");
            if (prefsFile.exists() && !prefsFile.canRead()) {
                Log.e("DoorsTheme", "No permission to read theme settings! Please contact the developer!");
                Toast.makeText
                        (context, "No permission to read theme settings! Please contact the developer!", Toast.LENGTH_LONG).show();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.i("DoorsTheme", "Application package com.doors.styles not found. Using preferences from this application package instead.");
        }
        return prefs;
    }

    public static boolean isDarkMode(Context context){
        return getPrefs(context).getBoolean("dark_mode", false);
    }

    public static String getColorAccent(Context context){
        return getPrefs(context).getString("color_accent", "default_blue");
    }

    public static void checkTheme(Context context) {
        if (isDarkMode(context)) {
            context.setTheme(R.style.DoorsTheme_Dark);
            recent(context, R.color.DoorsTheme_black);
        }else {
            context.setTheme(R.style.DoorsTheme_Light);
            recent(context, R.color.DoorsTheme_white);
        }
        setColor(context);
        Log.i("DoorsTheme", "Applied theme with color accent " + getColorAccent(context) + " and dark mode set to " + isDarkMode(context));
    }

    public static void checkDialogTheme(Context context) {
        if (isDarkMode(context)) {
            context.setTheme(R.style.DoorsTheme_Dark_DialogTheme);
            recent(context, R.color.DoorsTheme_black);
        }else {
            context.setTheme(R.style.DoorsTheme_Light_DialogTheme);
            recent(context, R.color.DoorsTheme_white);
        }
        setColor(context);
        Log.i("DoorsTheme", "Applied theme with color accent " + getColorAccent(context) + " and dark mode set to " + isDarkMode(context));
    }

    public static void checkNoActionBarTheme(Context context) {
        if (isDarkMode(context)) {
            context.setTheme(R.style.DoorsTheme_Dark_NoActionBar);
            recent(context, R.color.DoorsTheme_black);
        }else {
            context.setTheme(R.style.DoorsTheme_Light_NoActionBar);
            recent(context, R.color.DoorsTheme_white);
        }
        setColor(context);
        Log.i("DoorsTheme", "Applied theme with color accent " + getColorAccent(context) + " and dark mode set to " + isDarkMode(context));
    }

    private static void recent(Context context, int color){
        ActivityManager.TaskDescription taskDescription = new ActivityManager.TaskDescription(
                context.getString(R.string.app_name),
                BitmapFactory.decodeResource(context.getResources(), R.mipmap.ic_launcher),
                ContextCompat.getColor(context, color)
        );
        ((Activity)context).setTaskDescription(taskDescription);
    }

    private static void setColor(Context context){
        switch (getColorAccent(context)) {
            case "yellow_gold":
                context.setTheme(R.style.DoorsTheme_yellow_gold);
                break;
            case "gold":
                context.setTheme(R.style.DoorsTheme_gold);
                break;
            case "orange_bright":
                context.setTheme(R.style.DoorsTheme_orange_bright);
                break;
            case "orange_dark":
                context.setTheme(R.style.DoorsTheme_orange_dark);
                break;
            case "rust":
                context.setTheme(R.style.DoorsTheme_rust);
                break;
            case "pale_rust":
                context.setTheme(R.style.DoorsTheme_pale_rust);
                break;
            case "brick_red":
                context.setTheme(R.style.DoorsTheme_brick_red);
                break;
            case "mod_red":
                context.setTheme(R.style.DoorsTheme_mod_red);
                break;
            case "pale_red":
                context.setTheme(R.style.DoorsTheme_pale_red);
                break;
            case "red":
                context.setTheme(R.style.DoorsTheme_red);
                break;
            case "rose_bright":
                context.setTheme(R.style.DoorsTheme_rose_bright);
                break;
            case "rose":
                context.setTheme(R.style.DoorsTheme_rose);
                break;
            case "plum_light":
                context.setTheme(R.style.DoorsTheme_plum_light);
                break;
            case "plum":
                context.setTheme(R.style.DoorsTheme_plum);
                break;
            case "orchid_light":
                context.setTheme(R.style.DoorsTheme_orchid_light);
                break;
            case "orchid":
                context.setTheme(R.style.DoorsTheme_orchid);
                break;
            case "default_blue":
                context.setTheme(R.style.DoorsTheme_default_blue);
                break;
            case "navy_blue":
                context.setTheme(R.style.DoorsTheme_navy_blue);
                break;
            case "purple_shadow":
                context.setTheme(R.style.DoorsTheme_purple_shadow);
                break;
            case "purple_shadow_dark":
                context.setTheme(R.style.DoorsTheme_purple_shadow_dark);
                break;
            case "iris_pastel":
                context.setTheme(R.style.DoorsTheme_iris_pastel);
                break;
            case "iris_spring":
                context.setTheme(R.style.DoorsTheme_iris_spring);
                break;
            case "violet_red_light":
                context.setTheme(R.style.DoorsTheme_violet_red_light);
                break;
            case "violet_red":
                context.setTheme(R.style.DoorsTheme_violet_red);
                break;
            case "cool_blue_bright":
                context.setTheme(R.style.DoorsTheme_cool_blue_bright);
                break;
            case "cool_blue":
                context.setTheme(R.style.DoorsTheme_cool_blue);
                break;
            case "seafoam":
                context.setTheme(R.style.DoorsTheme_seafoam);
                break;
            case "seafoam_teal":
                context.setTheme(R.style.DoorsTheme_seafoam_teal);
                break;
            case "mint_light":
                context.setTheme(R.style.DoorsTheme_mint_light);
                break;
            case "mint_dark":
                context.setTheme(R.style.DoorsTheme_mint_dark);
                break;
            case "turf_green":
                context.setTheme(R.style.DoorsTheme_turf_green);
                break;
            case "sport_green":
                context.setTheme(R.style.DoorsTheme_sport_green);
                break;
            case "gray":
                context.setTheme(R.style.DoorsTheme_gray);
                break;
            case "gray_brown":
                context.setTheme(R.style.DoorsTheme_gray_brown);
                break;
            case "steel_blue":
                context.setTheme(R.style.DoorsTheme_steel_blue);
                break;
            case "metal_blue":
                context.setTheme(R.style.DoorsTheme_metal_blue);
                break;
            case "pale_moss":
                context.setTheme(R.style.DoorsTheme_pale_moss);
                break;
            case "moss":
                context.setTheme(R.style.DoorsTheme_moss);
                break;
            case "meadow_green":
                context.setTheme(R.style.DoorsTheme_meadow_green);
                break;
            case "green":
                context.setTheme(R.style.DoorsTheme_green);
                break;
            case "overcast":
                context.setTheme(R.style.DoorsTheme_overcast);
                break;
            case "storm":
                context.setTheme(R.style.DoorsTheme_storm);
                break;
            case "blue_gray":
                context.setTheme(R.style.DoorsTheme_blue_gray);
                break;
            case "gray_dark":
                context.setTheme(R.style.DoorsTheme_gray_dark);
                break;
            case "liddy_green":
                context.setTheme(R.style.DoorsTheme_liddy_green);
                break;
            case "sage":
                context.setTheme(R.style.DoorsTheme_sage);
                break;
            case "camouflage_desert":
                context.setTheme(R.style.DoorsTheme_camouflage_desert);
                break;
            case "camouflage":
                context.setTheme(R.style.DoorsTheme_camouflage);
                break;
        }
    }
}
