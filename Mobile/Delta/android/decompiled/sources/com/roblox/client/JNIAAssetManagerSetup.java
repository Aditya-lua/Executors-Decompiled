package com.roblox.client;

import android.content.Context;
import android.content.res.AssetManager;
import ek.q;

/* JADX INFO: loaded from: classes2.dex */
public class JNIAAssetManagerSetup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f8965a = "JNIAAssetManagerSetup";

    public static void a(Context context) {
        q.b(f8965a, "Initialize Android AssetReader");
        initNative(context.getAssets());
    }

    private static native void initNative(AssetManager assetManager);
}
