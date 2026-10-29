package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2657t9 {

    /* JADX INFO: renamed from: a */
    public Object f9391a;

    /* JADX INFO: renamed from: b */
    public C2701x9 f9392b;

    /* JADX INFO: renamed from: c */
    public C2723z9 f9393c = C2723z9.m11863j();

    /* JADX INFO: renamed from: d */
    public boolean f9394d;

    /* JADX INFO: renamed from: a */
    public final void m11762a() {
        this.f9391a = null;
        this.f9392b = null;
        this.f9393c.mo11730e(null);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11763b(Object obj) {
        this.f9394d = true;
        C2701x9 c2701x9 = this.f9392b;
        boolean z10 = c2701x9 != null && c2701x9.m11844c(obj);
        if (z10) {
            this.f9391a = null;
            this.f9392b = null;
            this.f9393c = null;
        }
        return z10;
    }

    public final void finalize() {
        C2723z9 c2723z9;
        C2701x9 c2701x9 = this.f9392b;
        if (c2701x9 != null && !c2701x9.isDone()) {
            c2701x9.m11845d(new C2668u9("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f9391a))));
        }
        if (this.f9394d || (c2723z9 = this.f9393c) == null) {
            return;
        }
        c2723z9.mo11730e(null);
    }
}
