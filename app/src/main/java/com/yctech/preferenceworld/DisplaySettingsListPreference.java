package com.yctech.preferenceworld;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;

public class DisplaySettingsListPreference extends ListPreference
{
        public DisplaySettingsListPreference(Context context, AttributeSet attrs) {
                super(context, attrs);
        }

        @Override
        protected void onPrepareDialogBuilder(Builder builder) {
                setValueIndex(3);
                super.onPrepareDialogBuilder(builder);
        }
}