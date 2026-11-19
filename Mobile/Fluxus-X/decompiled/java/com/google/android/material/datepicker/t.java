package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f7836c = new t(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f7837a;
    public final TimeZone b;

    public t(Long l10, TimeZone timeZone) {
        this.f7837a = l10;
        this.b = timeZone;
    }

    public static t c() {
        return f7836c;
    }

    public Calendar a() {
        return b(this.b);
    }

    public Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f7837a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
