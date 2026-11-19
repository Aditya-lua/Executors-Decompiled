package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class g9 extends x1 {
    public g9() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.x1
    public final void a(q9 q9Var, q9 q9Var2) {
        q9Var.b = q9Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.x1
    public final void b(q9 q9Var, Thread thread) {
        q9Var.f7219a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.x1
    public final boolean c(s9 s9Var, k5 k5Var, k5 k5Var2) {
        synchronized (s9Var) {
            try {
                if (s9Var.b != k5Var) {
                    return false;
                }
                s9Var.b = k5Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.x1
    public final boolean d(s9 s9Var, Object obj, Object obj2) {
        synchronized (s9Var) {
            try {
                if (s9Var.f7315a != obj) {
                    return false;
                }
                s9Var.f7315a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.x1
    public final boolean e(s9 s9Var, q9 q9Var, q9 q9Var2) {
        synchronized (s9Var) {
            try {
                if (s9Var.f7316c != q9Var) {
                    return false;
                }
                s9Var.f7316c = q9Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
