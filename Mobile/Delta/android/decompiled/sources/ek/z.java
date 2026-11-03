package ek;

import android.content.Context;
import android.content.SharedPreferences;
import rg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class z {
    public static z b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f16143a;

    public z(Context context) {
        this.f16143a = context;
    }

    @Deprecated
    public static SharedPreferences a(Context context, String str) {
        return b(context, str, false);
    }

    @Deprecated
    public static SharedPreferences b(Context context, String str, boolean z10) {
        if (!z10 && mh.b.a() && a1.s0()) {
            str = a1.O() + "_" + str;
            q.b("rbx.prefs", "Using SharedPreference file:" + str);
        }
        return context.getSharedPreferences(str, 0);
    }

    public static z e(Context context) {
        if (b == null) {
            synchronized (z.class) {
                try {
                    if (b == null) {
                        b = new z(context);
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
        q.b("rbx.prefs", "Using SharedPreference file:" + strG);
        return this.f16143a.getSharedPreferences(strG, 0);
    }

    public String f() {
        return g("prefs", false);
    }

    public String g(String str, boolean z10) {
        if (z10 || !mh.b.a() || !a1.s0()) {
            return str;
        }
        return a1.O() + "_" + str;
    }
}
