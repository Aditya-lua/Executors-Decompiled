package p306nb;

/* JADX INFO: renamed from: nb.y4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9379y4 {

    /* JADX INFO: renamed from: g */
    public static final Object f33670g = new Object();

    /* JADX INFO: renamed from: a */
    public final String f33671a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9151k0 f33672b;

    /* JADX INFO: renamed from: c */
    public final Object f33673c;

    /* JADX INFO: renamed from: d */
    public final Object f33674d = new Object();

    /* JADX INFO: renamed from: e */
    public volatile Object f33675e = null;

    /* JADX INFO: renamed from: f */
    public volatile Object f33676f = null;

    public /* synthetic */ C9379y4(String str, Object obj, Object obj2, InterfaceC9151k0 interfaceC9151k0, byte[] bArr) {
        this.f33671a = str;
        this.f33673c = obj;
        this.f33672b = interfaceC9151k0;
    }

    /* JADX INFO: renamed from: a */
    public final String m37078a() {
        return this.f33671a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m37079b(Object obj) {
        synchronized (this.f33674d) {
        }
        if (obj != null) {
            return obj;
        }
        if (C9283s4.f33450a == null) {
            return this.f33673c;
        }
        synchronized (f33670g) {
            try {
                if (C9070f.m36294a()) {
                    return this.f33676f == null ? this.f33673c : this.f33676f;
                }
                try {
                    for (C9379y4 c9379y4 : C9395z4.f33757a) {
                        if (C9070f.m36294a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            InterfaceC9151k0 interfaceC9151k0 = c9379y4.f33672b;
                            if (interfaceC9151k0 != null) {
                                objZza = interfaceC9151k0.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f33670g) {
                            c9379y4.f33676f = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC9151k0 interfaceC9151k1 = this.f33672b;
                if (interfaceC9151k1 != null) {
                    try {
                        return interfaceC9151k1.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f33673c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
