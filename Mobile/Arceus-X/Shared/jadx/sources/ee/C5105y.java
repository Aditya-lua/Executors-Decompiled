package ee;

/* JADX INFO: renamed from: ee.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C5105y implements InterfaceC5064d0 {

    /* JADX INFO: renamed from: c */
    public static final Object f19924c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC5064d0 f19925a;

    /* JADX INFO: renamed from: b */
    public volatile Object f19926b = f19924c;

    public C5105y(InterfaceC5064d0 interfaceC5064d0) {
        this.f19925a = interfaceC5064d0;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5064d0 m23845b(InterfaceC5064d0 interfaceC5064d0) {
        return interfaceC5064d0 instanceof C5105y ? interfaceC5064d0 : new C5105y(interfaceC5064d0);
    }

    @Override // ee.InterfaceC5066e0
    /* JADX INFO: renamed from: a */
    public final Object mo23769a() {
        Object objMo23769a;
        Object obj = this.f19926b;
        Object obj2 = f19924c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objMo23769a = this.f19926b;
                if (objMo23769a == obj2) {
                    objMo23769a = this.f19925a.mo23769a();
                    Object obj3 = this.f19926b;
                    if (obj3 != obj2 && obj3 != objMo23769a) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objMo23769a + ". This is likely due to a circular dependency.");
                    }
                    this.f19926b = objMo23769a;
                    this.f19925a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objMo23769a;
    }
}
