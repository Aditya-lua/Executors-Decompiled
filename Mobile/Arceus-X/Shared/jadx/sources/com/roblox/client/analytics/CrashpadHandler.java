package com.roblox.client.analytics;

import com.roblox.engine.jni.NativeSettingsInterface;
import p151gk.C6124q;

/* JADX INFO: loaded from: classes2.dex */
public class CrashpadHandler {
    private static final String[] CRASHPAD_LIBS = {"libroblox.so", "libtrampoline.so"};
    private static final String TAG = "CrashpadHandler";

    public static void main(String[] strArr) {
        String str = System.getenv("LIBRARYPATH");
        for (String str2 : CRASHPAD_LIBS) {
            if (!str2.equals("libtrampoline.so")) {
                System.load(str + "/" + str2);
            }
        }
        StringBuilder sb2 = new StringBuilder("Crash handling ");
        int iNativeRunCrashpadHandler = NativeSettingsInterface.nativeRunCrashpadHandler(strArr);
        if (iNativeRunCrashpadHandler == 0) {
            sb2.append("succeed");
            C6124q.m27063h(TAG, sb2.toString());
        } else {
            sb2.append("failed with result ");
            sb2.append(iNativeRunCrashpadHandler);
            C6124q.m27060e(TAG, sb2.toString());
        }
    }
}
