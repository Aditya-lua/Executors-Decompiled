package cg;

import java.util.concurrent.TimeUnit;
import p603zf.C13809p;

/* JADX INFO: renamed from: cg.e */
/* JADX INFO: loaded from: classes2.dex */
public class C1666e {

    /* JADX INFO: renamed from: d */
    public static final long f6428d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e */
    public static final long f6429e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a */
    public final C13809p f6430a = C13809p.m50283c();

    /* JADX INFO: renamed from: b */
    public long f6431b;

    /* JADX INFO: renamed from: c */
    public int f6432c;

    /* JADX INFO: renamed from: c */
    public static boolean m8364c(int i10) {
        if (i10 != 429) {
            return i10 >= 500 && i10 < 600;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m8365d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m8366a(int i10) {
        if (m8364c(i10)) {
            return (long) Math.min(Math.pow(2.0d, this.f6432c) + this.f6430a.m50289e(), f6429e);
        }
        return f6428d;
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m8367b() {
        return this.f6432c == 0 || this.f6430a.m50287a() > this.f6431b;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m8368e() {
        this.f6432c = 0;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m8369f(int i10) {
        if (m8365d(i10)) {
            m8368e();
            return;
        }
        this.f6432c++;
        this.f6431b = this.f6430a.m50287a() + m8366a(i10);
    }
}
