package com.roblox.client;

import android.util.Log;
import androidx.annotation.Keep;
import sg.C11295a1;

/* JADX INFO: loaded from: classes2.dex */
public class JNIBaseUrlSetter {

    /* JADX INFO: renamed from: a */
    public static final String f11436a = "JNIBaseUrlSetter";

    @Keep
    public static void setBaseUrl(String str) {
        Log.d(f11436a, "setBaseUrl(" + str + ")");
        C11295a1.m42401J0(str);
    }
}
