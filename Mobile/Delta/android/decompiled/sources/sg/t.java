package sg;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.roblox.engine.jni.NativeSettingsInterface;

/* JADX INFO: loaded from: classes2.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f31058a;

    public static String a(Context context) {
        if (f31058a == null) {
            d(context);
        }
        return f31058a;
    }

    public static String b(Context context) {
        c(context);
        return NativeSettingsInterface.nativeGetDevRpcConfiguration();
    }

    public static void c(Context context) {
        String str;
        if (NativeSettingsInterface.nativeIsDevRpcEnabled()) {
            String strR = mk.c.p().r();
            if (TextUtils.isEmpty(strR)) {
                str = "";
            } else {
                str = strR + "/bundles/ip.txt";
            }
            NativeSettingsInterface.nativeConfigureDevRpc(str, a(context));
        }
    }

    public static void d(Context context) {
        f31058a = a1.U(context).getString("dev_rpc_ip_port_override", "");
    }

    public static void e(Context context, String str) {
        if (str == null) {
            str = "";
        }
        f31058a = str;
        SharedPreferences.Editor editorEdit = a1.U(context).edit();
        editorEdit.putString("dev_rpc_ip_port_override", str);
        editorEdit.apply();
        c(context);
    }
}
