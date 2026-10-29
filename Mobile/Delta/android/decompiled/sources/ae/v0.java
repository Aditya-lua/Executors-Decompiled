package ae;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 implements y0, u0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f367c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile y0 f368a;
    public volatile Object b = f367c;

    public v0(y0 y0Var) {
        this.f368a = y0Var;
    }

    public static u0 a(y0 y0Var) {
        return y0Var instanceof u0 ? (u0) y0Var : new v0(y0Var);
    }

    public static y0 b(y0 y0Var) {
        y0Var.getClass();
        return y0Var instanceof v0 ? y0Var : new v0(y0Var);
    }

    @Override // ae.y0, ae.u0
    public final Object zza() {
        Object objZza;
        Object obj = this.b;
        Object obj2 = f367c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.b;
                if (objZza == obj2) {
                    objZza = this.f368a.zza();
                    Object obj3 = this.b;
                    if (obj3 != obj2 && obj3 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.b = objZza;
                    this.f368a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objZza;
    }
}
