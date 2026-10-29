package p151gk;

import android.content.Context;
import android.content.SharedPreferences;
import p308nh.C9476b;
import sg.C11295a1;

/* JADX INFO: renamed from: gk.z */
/* JADX INFO: loaded from: classes2.dex */
public class C6133z {

    /* JADX INFO: renamed from: b */
    public static C6133z f23464b;

    /* JADX INFO: renamed from: a */
    public Context f23465a;

    public C6133z(Context context) {
        this.f23465a = context;
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static SharedPreferences m27104a(Context context, String str) {
        return m27105b(context, str, false);
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static SharedPreferences m27105b(Context context, String str, boolean z10) {
        if (!z10 && C9476b.m37333a() && C11295a1.m42475s0()) {
            str = C11295a1.m42410O() + "_" + str;
            C6124q.m27057b("rbx.prefs", "Using SharedPreference file:" + str);
        }
        return context.getSharedPreferences(str, 0);
    }

    /* JADX INFO: renamed from: e */
    public static C6133z m27106e(Context context) {
        if (f23464b == null) {
            synchronized (C6133z.class) {
                try {
                    if (f23464b == null) {
                        f23464b = new C6133z(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f23464b;
    }

    /* JADX INFO: renamed from: c */
    public SharedPreferences m27107c(String str) {
        return m27108d(str, false);
    }

    /* JADX INFO: renamed from: d */
    public SharedPreferences m27108d(String str, boolean z10) {
        String strM27110g = m27110g(str, z10);
        C6124q.m27057b("rbx.prefs", "Using SharedPreference file:" + strM27110g);
        return this.f23465a.getSharedPreferences(strM27110g, 0);
    }

    /* JADX INFO: renamed from: f */
    public String m27109f() {
        return m27110g("prefs", false);
    }

    /* JADX INFO: renamed from: g */
    public String m27110g(String str, boolean z10) {
        if (z10 || !C9476b.m37333a() || !C11295a1.m42475s0()) {
            return str;
        }
        return C11295a1.m42410O() + "_" + str;
    }
}
