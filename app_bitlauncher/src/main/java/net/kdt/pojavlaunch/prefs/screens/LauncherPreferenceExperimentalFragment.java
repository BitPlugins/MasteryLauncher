package net.kdt.pojavlaunch.prefs.screens;

import android.os.Bundle;

import com.choice.launcher.R;

public class LauncherPreferenceExperimentalFragment extends LauncherPreferenceFragment {

    @Override
    public void onCreatePreferences(Bundle b, String str) {
        addPreferencesFromResource(R.xml.pref_experimental);
    }
}
