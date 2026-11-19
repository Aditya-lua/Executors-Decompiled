package ob;

/* JADX INFO: loaded from: classes.dex */
public final class d5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f27183g = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27184a;
    public final p0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f27185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f27186d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f27187e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f27188f = null;

    public /* synthetic */ d5(String str, Object obj, Object obj2, p0 p0Var, byte[] bArr) {
        this.f27184a = str;
        this.f27185c = obj;
        this.b = p0Var;
    }

    public final String a() {
        return this.f27184a;
    }

    public final Object b(Object obj) {
        synchronized (this.f27186d) {
        }
        if (obj != null) {
            return obj;
        }
        if (x4.f27961a == null) {
            return this.f27185c;
        }
        synchronized (f27183g) {
            try {
                if (f.a()) {
                    return this.f27188f == null ? this.f27185c : this.f27188f;
                }
                try {
                    for (d5 d5Var : e5.f27224a) {
                        if (f.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            p0 p0Var = d5Var.b;
                            if (p0Var != null) {
                                objZza = p0Var.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f27183g) {
                            d5Var.f27188f = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                p0 p0Var2 = this.b;
                if (p0Var2 != null) {
                    try {
                        return p0Var2.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f27185c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
