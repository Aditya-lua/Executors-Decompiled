package com.roblox.engine.jni.meta;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public interface DeviceAttestationCallback {
    void onFailure();

    void onSuccess(String str);
}
