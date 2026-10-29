package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.google.android.material.datepicker.o */
/* JADX INFO: loaded from: classes2.dex */
public class C2803o {

    /* JADX INFO: renamed from: c */
    public static final C2803o f10161c = new C2803o(null, null);

    /* JADX INFO: renamed from: a */
    public final Long f10162a;

    /* JADX INFO: renamed from: b */
    public final TimeZone f10163b;

    public C2803o(Long l10, TimeZone timeZone) {
        this.f10162a = l10;
        this.f10163b = timeZone;
    }

    /* JADX INFO: renamed from: c */
    public static C2803o m12701c() {
        return f10161c;
    }

    /* JADX INFO: renamed from: a */
    public Calendar m12702a() {
        return m12703b(this.f10163b);
    }

    /* JADX INFO: renamed from: b */
    public Calendar m12703b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f10162a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
