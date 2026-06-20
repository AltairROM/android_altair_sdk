/*
 * SPDX-FileCopyrightText: crDroid Android Project
 * SPDX-FileCopyrightText: Altair ROM Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.lineage.support.preferences;

import android.content.Context;
import android.util.AttributeSet;

public class GlobalSettingSeekBarPreference extends CustomSeekBarPreference {

    public GlobalSettingSeekBarPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        setPreferenceDataStore(new GlobalSettingsStore(context.getContentResolver()));
    }

    public GlobalSettingSeekBarPreference(Context context) {
        super(context, null);
        setPreferenceDataStore(new GlobalSettingsStore(context.getContentResolver()));
    }
}
