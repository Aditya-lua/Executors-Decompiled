package p1;

/* JADX INFO: loaded from: classes.dex */
public final class k<T> extends androidx.p000lifecycle.b0<T> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.p000lifecycle.a0<T> f28174m;

    @Override // androidx.p000lifecycle.a0
    public T f() {
        androidx.p000lifecycle.a0<T> a0Var = this.f28174m;
        if (a0Var == null) {
            return null;
        }
        return a0Var.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void r(androidx.p000lifecycle.a0<T> a0Var) {
        androidx.p000lifecycle.a0<T> a0Var2 = this.f28174m;
        if (a0Var2 != null) {
            super.q(a0Var2);
        }
        this.f28174m = a0Var;
        super.p(a0Var, new androidx.p000lifecycle.e0() { // from class: p1.j
            @Override // androidx.p000lifecycle.e0
            public final void a(Object obj) {
                this.f28172a.o(obj);
            }
        });
    }
}
