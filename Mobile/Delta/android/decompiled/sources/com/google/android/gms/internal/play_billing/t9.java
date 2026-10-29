package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class t9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f7322a;
    public x9 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z9 f7323c = z9.j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7324d;

    public final void a() {
        this.f7322a = null;
        this.b = null;
        this.f7323c.e(null);
    }

    public final boolean b(Object obj) {
        this.f7324d = true;
        x9 x9Var = this.b;
        boolean z10 = x9Var != null && x9Var.c(obj);
        if (z10) {
            this.f7322a = null;
            this.b = null;
            this.f7323c = null;
        }
        return z10;
    }

    public final void finalize() {
        z9 z9Var;
        x9 x9Var = this.b;
        if (x9Var != null && !x9Var.isDone()) {
            x9Var.d(new u9("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f7322a))));
        }
        if (this.f7324d || (z9Var = this.f7323c) == null) {
            return;
        }
        z9Var.e(null);
    }
}
