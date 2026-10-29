package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class p1 extends n1 {
    public /* synthetic */ p1(w1 w1Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final k1 a(s1 s1Var, k1 k1Var) {
        k1 k1Var2;
        synchronized (s1Var) {
            try {
                k1Var2 = s1Var.b;
                if (k1Var2 != k1Var) {
                    s1Var.b = k1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return k1Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final r1 b(s1 s1Var, r1 r1Var) {
        r1 r1Var2;
        synchronized (s1Var) {
            try {
                r1Var2 = s1Var.f7232c;
                if (r1Var2 != r1Var) {
                    s1Var.f7232c = r1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return r1Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final void c(r1 r1Var, r1 r1Var2) {
        r1Var.b = r1Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final void d(r1 r1Var, Thread thread) {
        r1Var.f7222a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final boolean e(s1 s1Var, k1 k1Var, k1 k1Var2) {
        synchronized (s1Var) {
            try {
                if (s1Var.b != k1Var) {
                    return false;
                }
                s1Var.b = k1Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final boolean f(s1 s1Var, Object obj, Object obj2) {
        synchronized (s1Var) {
            try {
                if (s1Var.f7231a != obj) {
                    return false;
                }
                s1Var.f7231a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final boolean g(s1 s1Var, r1 r1Var, r1 r1Var2) {
        synchronized (s1Var) {
            try {
                if (s1Var.f7232c != r1Var) {
                    return false;
                }
                s1Var.f7232c = r1Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
