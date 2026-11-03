package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f7424a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7426d;

    public z(c0 c0Var) {
        x.c(c0Var, "ticker");
        this.f7424a = c0Var;
    }

    public static z b(c0 c0Var) {
        z zVar = new z(c0Var);
        zVar.e();
        return zVar;
    }

    public static z c(c0 c0Var) {
        return new z(c0Var);
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(h(), TimeUnit.NANOSECONDS);
    }

    public final z d() {
        this.f7425c = 0L;
        this.b = false;
        return this;
    }

    public final z e() {
        x.e(!this.b, "This stopwatch is already running.");
        this.b = true;
        this.f7426d = this.f7424a.a();
        return this;
    }

    public final z f() {
        long jA = this.f7424a.a();
        x.e(this.b, "This stopwatch is already stopped.");
        this.b = false;
        this.f7425c += jA - this.f7426d;
        return this;
    }

    public final boolean g() {
        return this.b;
    }

    public final long h() {
        return this.b ? (this.f7424a.a() - this.f7426d) + this.f7425c : this.f7425c;
    }

    public final String toString() {
        String str;
        long jH = h();
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(jH, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(jH, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(jH, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(jH, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(jH, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(jH, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jH / timeUnit2.convert(1L, timeUnit)));
        switch (y.f7418a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return str2 + " " + str;
    }
}
