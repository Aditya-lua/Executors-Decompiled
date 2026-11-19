package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public abstract class a4 extends i3 {
    public static final boolean b = a7.B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f6983a;

    public /* synthetic */ a4(z3 z3Var) {
    }

    public static int u(x5 x5Var) {
        int iZzn = x5Var.zzn();
        return v(iZzn) + iZzn;
    }

    public static int v(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int w(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public final void a() {
        if (c() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (c() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public abstract int c();

    public abstract void d(byte b10);

    public abstract void e(int i10, boolean z10);

    public abstract void f(int i10, s3 s3Var);

    public abstract void g(int i10, int i11);

    public abstract void h(int i10);

    public abstract void i(int i10, long j10);

    public abstract void j(long j10);

    public abstract void k(int i10, int i11);

    public abstract void l(int i10);

    public abstract void m(int i10, x5 x5Var);

    public abstract void n(int i10, s3 s3Var);

    public abstract void o(int i10, String str);

    public abstract void p(int i10, int i11);

    public abstract void q(int i10, int i11);

    public abstract void r(int i10);

    public abstract void s(int i10, long j10);

    public abstract void t(long j10);
}
