package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2514g9 extends AbstractC2693x1 {
    public C2514g9() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2693x1
    /* JADX INFO: renamed from: a */
    public final void mo11408a(C2624q9 c2624q9, C2624q9 c2624q10) {
        c2624q9.f9208b = c2624q10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2693x1
    /* JADX INFO: renamed from: b */
    public final void mo11409b(C2624q9 c2624q9, Thread thread) {
        c2624q9.f9207a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2693x1
    /* JADX INFO: renamed from: c */
    public final boolean mo11410c(C2646s9 c2646s9, C2554k5 c2554k5, C2554k5 c2554k6) {
        synchronized (c2646s9) {
            try {
                if (c2646s9.f9382b != c2554k5) {
                    return false;
                }
                c2646s9.f9382b = c2554k6;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2693x1
    /* JADX INFO: renamed from: d */
    public final boolean mo11411d(C2646s9 c2646s9, Object obj, Object obj2) {
        synchronized (c2646s9) {
            try {
                if (c2646s9.f9381a != obj) {
                    return false;
                }
                c2646s9.f9381a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2693x1
    /* JADX INFO: renamed from: e */
    public final boolean mo11412e(C2646s9 c2646s9, C2624q9 c2624q9, C2624q9 c2624q10) {
        synchronized (c2646s9) {
            try {
                if (c2646s9.f9383c != c2624q9) {
                    return false;
                }
                c2646s9.f9383c = c2624q10;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
