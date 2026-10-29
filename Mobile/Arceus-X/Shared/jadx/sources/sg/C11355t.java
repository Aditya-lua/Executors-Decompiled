package sg;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.roblox.engine.jni.NativeSettingsInterface;
import mk.C8569c;

/* JADX INFO: renamed from: sg.t */
/* JADX INFO: loaded from: classes2.dex */
public class C11355t {

    /* JADX INFO: renamed from: a */
    public static String f40156a;

    /* JADX INFO: renamed from: a */
    public static String m42525a(Context context) {
        if (f40156a == null) {
            m42528d(context);
        }
        return f40156a;
    }

    /* JADX INFO: renamed from: b */
    public static String m42526b(Context context) {
        m42527c(context);
        return NativeSettingsInterface.nativeGetDevRpcConfiguration();
    }

    /* JADX INFO: renamed from: c */
    public static void m42527c(Context context) {
        String str;
        if (NativeSettingsInterface.nativeIsDevRpcEnabled()) {
            String strM34520r = C8569c.m34512p().m34520r();
            if (TextUtils.isEmpty(strM34520r)) {
                str = "";
            } else {
                str = strM34520r + "/bundles/ip.txt";
            }
            NativeSettingsInterface.nativeConfigureDevRpc(str, m42525a(context));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m42528d(Context context) {
        f40156a = C11295a1.m42422U(context).getString("dev_rpc_ip_port_override", "");
    }

    /* JADX INFO: renamed from: e */
    public static void m42529e(Context context, String str) {
        if (str == null) {
            str = "";
        }
        f40156a = str;
        SharedPreferences.Editor editorEdit = C11295a1.m42422U(context).edit();
        editorEdit.putString("dev_rpc_ip_port_override", str);
        editorEdit.apply();
        m42527c(context);
    }
}
