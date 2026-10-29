package p078dh;

import p504w1.C12283g;

/* JADX INFO: renamed from: dh.b */
/* JADX INFO: loaded from: classes2.dex */
public class C4608b {

    /* JADX INFO: renamed from: d */
    public static C4608b f18874d;

    /* JADX INFO: renamed from: b */
    public int f18876b;

    /* JADX INFO: renamed from: c */
    public Object f18877c = new Object();

    /* JADX INFO: renamed from: a */
    public C12283g<C4607a> f18875a = new C12283g<>();

    /* JADX INFO: renamed from: b */
    public static C4608b m22756b() {
        if (f18874d == null) {
            synchronized (C4608b.class) {
                try {
                    if (f18874d == null) {
                        f18874d = new C4608b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f18874d;
    }

    /* JADX INFO: renamed from: a */
    public void m22757a() {
        this.f18875a.m45598a();
        this.f18876b = 0;
    }

    /* JADX INFO: renamed from: c */
    public int m22758c() {
        return this.f18876b;
    }

    /* JADX INFO: renamed from: d */
    public C4607a m22759d(long j10) {
        return this.f18875a.m45601e(j10);
    }

    /* JADX INFO: renamed from: e */
    public void m22760e(C4607a c4607a) {
        synchronized (this.f18877c) {
            try {
                C4607a c4607aM45601e = this.f18875a.m45601e(c4607a.m22748b());
                if (c4607aM45601e != null) {
                    c4607aM45601e.m22755i(c4607a);
                } else {
                    this.f18875a.m45604i(c4607a.m22748b(), c4607a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
