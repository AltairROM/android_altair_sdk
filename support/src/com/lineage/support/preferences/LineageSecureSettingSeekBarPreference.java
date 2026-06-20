/*
 * SPDX-FileCopyrightText: crDroid Android Project
 * SPDX-FileCopyrightText: Altair ROM Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.lineage.support.preferences;

import android.content.Context;
import android.util.AttributeSet;

public class LineageSecureSettingSeekBarPreference extends CustomSeekBarPreference {

    public LineageSecureSettingSeekBarPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        setPreferenceDataStore(new LineageSecureSettingsStore(context.getContentResolver()));
    }

    public LineageSecureSettingSeekBarPreference(Context context) {
        super(context, null);
        setPreferenceDataStore(new LineageSecureSettingsStore(context.getContentResolver()));
    }
}
