package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f7918c = new o(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f7919a;
    public final TimeZone b;

    public o(Long l10, TimeZone timeZone) {
        this.f7919a = l10;
        this.b = timeZone;
    }

    public static o c() {
        return f7918c;
    }

    public Calendar a() {
        return b(this.b);
    }

    public Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f7919a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
