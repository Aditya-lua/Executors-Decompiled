package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z */
/* JADX INFO: loaded from: classes.dex */
public final class C2713z {

    /* JADX INFO: renamed from: a */
    public final AbstractC2461c0 f9425a;

    /* JADX INFO: renamed from: b */
    public boolean f9426b;

    /* JADX INFO: renamed from: c */
    public long f9427c;

    /* JADX INFO: renamed from: d */
    public long f9428d;

    public C2713z(AbstractC2461c0 abstractC2461c0) {
        C2691x.m11817c(abstractC2461c0, "ticker");
        this.f9425a = abstractC2461c0;
    }

    /* JADX INFO: renamed from: b */
    public static C2713z m11849b(AbstractC2461c0 abstractC2461c0) {
        C2713z c2713z = new C2713z(abstractC2461c0);
        c2713z.m11853e();
        return c2713z;
    }

    /* JADX INFO: renamed from: c */
    public static C2713z m11850c(AbstractC2461c0 abstractC2461c0) {
        return new C2713z(abstractC2461c0);
    }

    /* JADX INFO: renamed from: a */
    public final long m11851a(TimeUnit timeUnit) {
        return timeUnit.convert(m11856h(), TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: d */
    public final C2713z m11852d() {
        this.f9427c = 0L;
        this.f9426b = false;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final C2713z m11853e() {
        C2691x.m11819e(!this.f9426b, "This stopwatch is already running.");
        this.f9426b = true;
        this.f9428d = this.f9425a.mo11271a();
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final C2713z m11854f() {
        long jMo11271a = this.f9425a.mo11271a();
        C2691x.m11819e(this.f9426b, "This stopwatch is already stopped.");
        this.f9426b = false;
        this.f9427c += jMo11271a - this.f9428d;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m11855g() {
        return this.f9426b;
    }

    /* JADX INFO: renamed from: h */
    public final long m11856h() {
        return this.f9426b ? (this.f9425a.mo11271a() - this.f9428d) + this.f9427c : this.f9427c;
    }

    public final String toString() {
        String str;
        long jM11856h = m11856h();
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(jM11856h, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(jM11856h, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(jM11856h, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(jM11856h, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(jM11856h, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(jM11856h, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jM11856h / timeUnit2.convert(1L, timeUnit)));
        switch (C2702y.f9418a[timeUnit.ordinal()]) {
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
