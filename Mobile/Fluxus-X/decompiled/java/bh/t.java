package bh;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.github.luben.zstd.BuildConfig;
import com.roblox.engine.jni.NativeSettingsInterface;

/* JADX INFO: loaded from: classes2.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f4364a;

    public static String a(Context context) {
        if (f4364a == null) {
            d(context);
        }
        return f4364a;
    }

    public static String b(Context context) {
        c(context);
        return NativeSettingsInterface.nativeGetDevRpcConfiguration();
    }

    public static void c(Context context) {
        String str;
        if (NativeSettingsInterface.nativeIsDevRpcEnabled()) {
            String strR = uk.c.p().r();
            if (TextUtils.isEmpty(strR)) {
                str = BuildConfig.FLAVOR;
            } else {
                str = strR + "/bundles/ip.txt";
            }
            NativeSettingsInterface.nativeConfigureDevRpc(str, a(context));
        }
    }

    public static void d(Context context) {
        f4364a = a1.U(context).getString("dev_rpc_ip_port_override", BuildConfig.FLAVOR);
    }

    public static void e(Context context, String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        f4364a = str;
        SharedPreferences.Editor editorEdit = a1.U(context).edit();
        editorEdit.putString("dev_rpc_ip_port_override", str);
        editorEdit.apply();
        c(context);
    }
}
