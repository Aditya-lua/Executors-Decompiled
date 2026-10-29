package com.appsflyer.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1iSDK {
    public static boolean registerClient(Context context) {
        return context.getPackageManager().isInstantApp();
    }
}
