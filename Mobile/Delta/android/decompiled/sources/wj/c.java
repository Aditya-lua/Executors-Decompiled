package wj;

import com.roblox.engine.jni.NativeSettingsInterface;
import gk.s;

/* JADX INFO: loaded from: classes2.dex */
public class c {
    public static boolean a() {
        return b() || s.j();
    }

    public static boolean b() {
        return NativeSettingsInterface.nativeIsLuaLoginEnabled();
    }
}
