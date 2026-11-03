package ch;

import w1.g;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static b f4971d;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4973c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g<a> f4972a = new g<>();

    public static b b() {
        if (f4971d == null) {
            synchronized (b.class) {
                try {
                    if (f4971d == null) {
                        f4971d = new b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f4971d;
    }

    public void a() {
        this.f4972a.a();
        this.b = 0;
    }

    public int c() {
        return this.b;
    }

    public a d(long j10) {
        return this.f4972a.e(j10);
    }

    public void e(a aVar) {
        synchronized (this.f4973c) {
            try {
                a aVarE = this.f4972a.e(aVar.b());
                if (aVarE != null) {
                    aVarE.i(aVar);
                } else {
                    this.f4972a.i(aVar.b(), aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
