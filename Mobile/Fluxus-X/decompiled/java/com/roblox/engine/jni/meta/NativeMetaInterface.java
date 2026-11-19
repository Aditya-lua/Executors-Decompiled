package com.roblox.engine.jni.meta;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class NativeMetaInterface {
    public static native void getDeviceAttestationToken(String str, DeviceAttestationCallback deviceAttestationCallback);
}
