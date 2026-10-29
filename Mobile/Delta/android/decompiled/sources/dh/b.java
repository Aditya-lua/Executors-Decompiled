package dh;

import w1.g;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static b f14622d;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f14624c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g<a> f14623a = new g<>();

    public static b b() {
        if (f14622d == null) {
            synchronized (b.class) {
                try {
                    if (f14622d == null) {
                        f14622d = new b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f14622d;
    }

    public void a() {
        this.f14623a.a();
        this.b = 0;
    }

    public int c() {
        return this.b;
    }

    public a d(long j10) {
        return this.f14623a.e(j10);
    }

    public void e(a aVar) {
        synchronized (this.f14624c) {
            try {
                a aVarE = this.f14623a.e(aVar.b());
                if (aVarE != null) {
                    aVarE.i(aVar);
                } else {
                    this.f14623a.i(aVar.b(), aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
