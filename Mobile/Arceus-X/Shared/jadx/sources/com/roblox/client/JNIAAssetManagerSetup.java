package com.roblox.client;

import android.content.Context;
import android.content.res.AssetManager;
import p151gk.C6124q;

/* JADX INFO: loaded from: classes2.dex */
public class JNIAAssetManagerSetup {

    /* JADX INFO: renamed from: a */
    public static final String f11434a = "JNIAAssetManagerSetup";

    /* JADX INFO: renamed from: a */
    public static void m14817a(Context context) {
        C6124q.m27057b(f11434a, "Initialize Android AssetReader");
        initNative(context.getAssets());
    }

    private static native void initNative(AssetManager assetManager);
}
