/*
 * SPDX-FileCopyrightText: The MXeneOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.android.settings.deviceinfo.firmwareversion;

import android.content.Context;
import android.os.SystemProperties;

import com.android.settings.R;
import com.android.settings.core.BasePreferenceController;

/**
 * About phone, "Based on": the upstream project and its version. The version is the one LineageOS
 * puts in ro.lineage.build.version (for example 23.2).
 */
public class MxeneosBasedOnPreferenceController extends BasePreferenceController {

    private static final String KEY_UPSTREAM_VERSION_PROP = "ro.lineage.build.version";

    public MxeneosBasedOnPreferenceController(Context context, String key) {
        super(context, key);
    }

    @Override
    public int getAvailabilityStatus() {
        return AVAILABLE;
    }

    @Override
    public CharSequence getSummary() {
        return mContext.getString(R.string.mxeneos_based_on_summary,
                SystemProperties.get(KEY_UPSTREAM_VERSION_PROP, mContext.getString(R.string.unknown)));
    }
}
