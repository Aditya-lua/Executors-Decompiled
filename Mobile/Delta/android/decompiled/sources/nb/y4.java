package nb;

/* JADX INFO: loaded from: classes.dex */
public final class y4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f26121g = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26122a;
    public final k0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f26123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f26124d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f26125e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f26126f = null;

    public /* synthetic */ y4(String str, Object obj, Object obj2, k0 k0Var, byte[] bArr) {
        this.f26122a = str;
        this.f26123c = obj;
        this.b = k0Var;
    }

    public final String a() {
        return this.f26122a;
    }

    public final Object b(Object obj) {
        synchronized (this.f26124d) {
        }
        if (obj != null) {
            return obj;
        }
        if (s4.f25940a == null) {
            return this.f26123c;
        }
        synchronized (f26121g) {
            try {
                if (f.a()) {
                    return this.f26126f == null ? this.f26123c : this.f26126f;
                }
                try {
                    for (y4 y4Var : z4.f26149a) {
                        if (f.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            k0 k0Var = y4Var.b;
                            if (k0Var != null) {
                                objZza = k0Var.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f26121g) {
                            y4Var.f26126f = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                k0 k0Var2 = this.b;
                if (k0Var2 != null) {
                    try {
                        return k0Var2.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f26123c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
