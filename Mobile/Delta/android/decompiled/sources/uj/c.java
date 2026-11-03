package uj;

import com.roblox.engine.jni.NativeSettingsInterface;
import ek.t;

/* JADX INFO: loaded from: classes2.dex */
public class c {
    public static boolean a() {
        return b() || t.j();
    }

    public static boolean b() {
        return NativeSettingsInterface.nativeIsLuaLoginEnabled();
    }
}
