package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.material.datepicker.p */
/* JADX INFO: loaded from: classes2.dex */
public class C2804p {

    /* JADX INFO: renamed from: a */
    public static AtomicReference<C2803o> f10164a = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public static long m12704a(long j10) {
        Calendar calendarM12712i = m12712i();
        calendarM12712i.setTimeInMillis(j10);
        return m12706c(calendarM12712i).getTimeInMillis();
    }

    @TargetApi(24)
    /* JADX INFO: renamed from: b */
    public static DateFormat m12705b(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m12711h());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    /* JADX INFO: renamed from: c */
    public static Calendar m12706c(Calendar calendar) {
        Calendar calendarM12713j = m12713j(calendar);
        Calendar calendarM12712i = m12712i();
        calendarM12712i.set(calendarM12713j.get(1), calendarM12713j.get(2), calendarM12713j.get(5));
        return calendarM12712i;
    }

    @TargetApi(24)
    /* JADX INFO: renamed from: d */
    public static DateFormat m12707d(Locale locale) {
        return m12705b("MMMMEEEEd", locale);
    }

    /* JADX INFO: renamed from: e */
    public static C2803o m12708e() {
        C2803o c2803o = f10164a.get();
        return c2803o == null ? C2803o.m12701c() : c2803o;
    }

    /* JADX INFO: renamed from: f */
    public static TimeZone m12709f() {
        return TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: renamed from: g */
    public static Calendar m12710g() {
        Calendar calendarM12702a = m12708e().m12702a();
        calendarM12702a.set(11, 0);
        calendarM12702a.set(12, 0);
        calendarM12702a.set(13, 0);
        calendarM12702a.set(14, 0);
        calendarM12702a.setTimeZone(m12709f());
        return calendarM12702a;
    }

    @TargetApi(24)
    /* JADX INFO: renamed from: h */
    public static android.icu.util.TimeZone m12711h() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: renamed from: i */
    public static Calendar m12712i() {
        return m12713j(null);
    }

    /* JADX INFO: renamed from: j */
    public static Calendar m12713j(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m12709f());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    @TargetApi(24)
    /* JADX INFO: renamed from: k */
    public static DateFormat m12714k(Locale locale) {
        return m12705b("yMMMM", locale);
    }

    @TargetApi(24)
    /* JADX INFO: renamed from: l */
    public static DateFormat m12715l(Locale locale) {
        return m12705b("yMMMMEEEEd", locale);
    }
}
