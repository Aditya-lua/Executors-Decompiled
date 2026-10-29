package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f6546a = new i1();

    public static SharedPreferences a(Context context, String str, int i10, e1 e1Var) {
        y0.a();
        h1 h1Var = str.equals("") ? new h1() : null;
        if (h1Var != null) {
            return h1Var;
        }
        ThreadLocal threadLocal = f6546a;
        ge.n.d(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            return context.getSharedPreferences(str, 0);
        } finally {
            f6546a.set(Boolean.TRUE);
        }
    }
}
