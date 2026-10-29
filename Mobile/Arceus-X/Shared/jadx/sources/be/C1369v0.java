package be;

/* JADX INFO: renamed from: be.v0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1369v0 implements InterfaceC1376y0, InterfaceC1366u0 {

    /* JADX INFO: renamed from: c */
    public static final Object f5409c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC1376y0 f5410a;

    /* JADX INFO: renamed from: b */
    public volatile Object f5411b = f5409c;

    public C1369v0(InterfaceC1376y0 interfaceC1376y0) {
        this.f5410a = interfaceC1376y0;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1366u0 m7224a(InterfaceC1376y0 interfaceC1376y0) {
        return interfaceC1376y0 instanceof InterfaceC1366u0 ? (InterfaceC1366u0) interfaceC1376y0 : new C1369v0(interfaceC1376y0);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC1376y0 m7225b(InterfaceC1376y0 interfaceC1376y0) {
        interfaceC1376y0.getClass();
        return interfaceC1376y0 instanceof C1369v0 ? interfaceC1376y0 : new C1369v0(interfaceC1376y0);
    }

    @Override // be.InterfaceC1376y0
    public final Object zza() {
        Object objZza;
        Object obj = this.f5411b;
        Object obj2 = f5409c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.f5411b;
                if (objZza == obj2) {
                    objZza = this.f5410a.zza();
                    Object obj3 = this.f5411b;
                    if (obj3 != obj2 && obj3 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.f5411b = objZza;
                    this.f5410a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objZza;
    }
}
