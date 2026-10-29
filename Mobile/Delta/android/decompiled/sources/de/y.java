package de;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f14611c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile d0 f14612a;
    public volatile Object b = f14611c;

    public y(d0 d0Var) {
        this.f14612a = d0Var;
    }

    public static d0 b(d0 d0Var) {
        return d0Var instanceof y ? d0Var : new y(d0Var);
    }

    @Override // de.e0
    public final Object a() {
        Object objA;
        Object obj = this.b;
        Object obj2 = f14611c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.b;
                if (objA == obj2) {
                    objA = this.f14612a.a();
                    Object obj3 = this.b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.b = objA;
                    this.f14612a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objA;
    }
}
