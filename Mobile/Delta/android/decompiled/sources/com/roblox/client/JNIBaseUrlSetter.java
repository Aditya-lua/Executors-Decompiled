package com.roblox.client;

import android.util.Log;
import androidx.annotation.Keep;
import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class JNIBaseUrlSetter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f8899a = "JNIBaseUrlSetter";

    @Keep
    public static void setBaseUrl(String str) {
        Log.d(f8899a, "setBaseUrl(" + str + ")");
        a1.J0(str);
    }
}
