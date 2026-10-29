package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.text.C7797x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1qSDK implements AFi1tSDK {
    @Override // com.appsflyer.internal.AFi1tSDK
    @Nullable
    public final String AFLogger(@Nullable Activity activity) {
        Uri uriM8743g_ = AFb1uSDK.m8743g_(activity != null ? activity.getIntent() : null);
        String string = uriM8743g_ != null ? uriM8743g_.toString() : null;
        if (string == null) {
            string = "";
        }
        if (C7797x.m32309T(string, "android-app://", false, 2, null)) {
            return null;
        }
        return string;
    }

    @Override // com.appsflyer.internal.AFi1tSDK
    @NotNull
    public final String registerClient(@Nullable Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String string = referrer != null ? referrer.toString() : null;
        return string == null ? "" : string;
    }
}
