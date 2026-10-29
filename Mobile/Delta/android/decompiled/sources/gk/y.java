package gk;

import android.content.Context;
import android.content.SharedPreferences;
import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class y {
    public static y b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f18245a;

    public y(Context context) {
        this.f18245a = context;
    }

    @Deprecated
    public static SharedPreferences a(Context context, String str) {
        return b(context, str, false);
    }

    @Deprecated
    public static SharedPreferences b(Context context, String str, boolean z10) {
        if (!z10 && nh.b.a() && a1.s0()) {
            str = a1.O() + "_" + str;
            p.b("rbx.prefs", "Using SharedPreference file:" + str);
        }
        return context.getSharedPreferences(str, 0);
    }

    public static y e(Context context) {
        if (b == null) {
            synchronized (y.class) {
                try {
                    if (b == null) {
                        b = new y(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return b;
    }

    public SharedPreferences c(String str) {
        return d(str, false);
    }

    public SharedPreferences d(String str, boolean z10) {
        String strG = g(str, z10);
        p.b("rbx.prefs", "Using SharedPreference file:" + strG);
        return this.f18245a.getSharedPreferences(strG, 0);
    }

    public String f() {
        return g("prefs", false);
    }

    public String g(String str, boolean z10) {
        if (z10 || !nh.b.a() || !a1.s0()) {
            return str;
        }
        return a1.O() + "_" + str;
    }
}
