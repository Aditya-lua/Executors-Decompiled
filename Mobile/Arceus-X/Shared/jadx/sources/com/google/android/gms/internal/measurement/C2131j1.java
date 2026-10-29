package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import p169he.C6384n;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2131j1 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f8329a = new C2114i1();

    /* JADX INFO: renamed from: a */
    public static SharedPreferences m10298a(Context context, String str, int i10, AbstractC2038e1 abstractC2038e1) {
        C2400y0.m10991a();
        SharedPreferencesC2095h1 sharedPreferencesC2095h1 = str.equals("") ? new SharedPreferencesC2095h1() : null;
        if (sharedPreferencesC2095h1 != null) {
            return sharedPreferencesC2095h1;
        }
        ThreadLocal threadLocal = f8329a;
        C6384n.m27920d(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            return context.getSharedPreferences(str, 0);
        } finally {
            f8329a.set(Boolean.TRUE);
        }
    }
}
