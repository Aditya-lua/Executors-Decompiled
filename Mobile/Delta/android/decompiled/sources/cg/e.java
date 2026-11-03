package cg;

import java.util.concurrent.TimeUnit;
import zf.p;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f4961d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f4962e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f4963a = p.c();
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4964c;

    public static boolean c(int i10) {
        if (i10 != 429) {
            return i10 >= 500 && i10 < 600;
        }
        return true;
    }

    public static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    public final synchronized long a(int i10) {
        if (c(i10)) {
            return (long) Math.min(Math.pow(2.0d, this.f4964c) + this.f4963a.e(), f4962e);
        }
        return f4961d;
    }

    public synchronized boolean b() {
        return this.f4964c == 0 || this.f4963a.a() > this.b;
    }

    public final synchronized void e() {
        this.f4964c = 0;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f4964c++;
        this.b = this.f4963a.a() + a(i10);
    }
}
