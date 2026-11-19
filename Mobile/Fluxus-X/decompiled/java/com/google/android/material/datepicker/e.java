package com.google.android.material.datepicker;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class e {
    public static String a(Context context, long j10, boolean z10, boolean z11, boolean z12) {
        String strD = d(j10);
        if (z10) {
            strD = String.format(context.getString(jc.i.f20434q), strD);
        }
        if (z11) {
            return String.format(context.getString(jc.i.f20433p), strD);
        }
        return z12 ? String.format(context.getString(jc.i.f20430m), strD) : strD;
    }

    public static String b(long j10) {
        return c(j10, Locale.getDefault());
    }

    public static String c(long j10, Locale locale) {
        return u.d(locale).format(new Date(j10));
    }

    public static String d(long j10) {
        return i(j10) ? b(j10) : g(j10);
    }

    public static String e(Context context, int i10) {
        return u.g().get(1) == i10 ? String.format(context.getString(jc.i.f20431n), Integer.valueOf(i10)) : String.format(context.getString(jc.i.f20432o), Integer.valueOf(i10));
    }

    public static String f(long j10) {
        return u.k(Locale.getDefault()).format(new Date(j10));
    }

    public static String g(long j10) {
        return h(j10, Locale.getDefault());
    }

    public static String h(long j10, Locale locale) {
        return u.l(locale).format(new Date(j10));
    }

    public static boolean i(long j10) {
        Calendar calendarG = u.g();
        Calendar calendarI = u.i();
        calendarI.setTimeInMillis(j10);
        return calendarG.get(1) == calendarI.get(1);
    }
}
