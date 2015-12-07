package com.yctech.preferenceworld;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.widget.Toast;

//DisplaySettings
public class PreferencesFragment extends PreferenceFragment implements Preference.OnPreferenceChangeListener {
    private DisplaySettingsListPreference mOutputmode;
    private static final String KEY_OUTPUTMODE = "output_mode";
    private int sel_index;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.display_settings);
        mOutputmode = (DisplaySettingsListPreference) findPreference(KEY_OUTPUTMODE);
        mOutputmode.setOnPreferenceChangeListener(this);
    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        final String key = preference.getKey();
        if (KEY_OUTPUTMODE.equals(key)){
            sel_index = Integer.parseInt((String) newValue);
            String[] array = getActivity().getResources().getStringArray(R.array.outputmode_entries_display);
            Toast.makeText(this.getActivity(),array[sel_index]+"----look bitch!",Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}
