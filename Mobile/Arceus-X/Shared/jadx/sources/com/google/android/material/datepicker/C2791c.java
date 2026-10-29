package com.google.android.material.datepicker;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import p194ic.C6745i;

/* JADX INFO: renamed from: com.google.android.material.datepicker.c */
/* JADX INFO: loaded from: classes2.dex */
public class C2791c {
    /* JADX INFO: renamed from: a */
    public static String m12615a(Context context, long j10, boolean z10, boolean z11, boolean z12) {
        String strM12618d = m12618d(j10);
        if (z10) {
            strM12618d = String.format(context.getString(C6745i.f26098q), strM12618d);
        }
        if (z11) {
            return String.format(context.getString(C6745i.f26097p), strM12618d);
        }
        return z12 ? String.format(context.getString(C6745i.f26094m), strM12618d) : strM12618d;
    }

    /* JADX INFO: renamed from: b */
    public static String m12616b(long j10) {
        return m12617c(j10, Locale.getDefault());
    }

    /* JADX INFO: renamed from: c */
    public static String m12617c(long j10, Locale locale) {
        return C2804p.m12707d(locale).format(new Date(j10));
    }

    /* JADX INFO: renamed from: d */
    public static String m12618d(long j10) {
        return m12623i(j10) ? m12616b(j10) : m12621g(j10);
    }

    /* JADX INFO: renamed from: e */
    public static String m12619e(Context context, int i10) {
        return C2804p.m12710g().get(1) == i10 ? String.format(context.getString(C6745i.f26095n), Integer.valueOf(i10)) : String.format(context.getString(C6745i.f26096o), Integer.valueOf(i10));
    }

    /* JADX INFO: renamed from: f */
    public static String m12620f(long j10) {
        return C2804p.m12714k(Locale.getDefault()).format(new Date(j10));
    }

    /* JADX INFO: renamed from: g */
    public static String m12621g(long j10) {
        return m12622h(j10, Locale.getDefault());
    }

    /* JADX INFO: renamed from: h */
    public static String m12622h(long j10, Locale locale) {
        return C2804p.m12715l(locale).format(new Date(j10));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m12623i(long j10) {
        Calendar calendarM12710g = C2804p.m12710g();
        Calendar calendarM12712i = C2804p.m12712i();
        calendarM12712i.setTimeInMillis(j10);
        return calendarM12710g.get(1) == calendarM12712i.get(1);
    }
}
