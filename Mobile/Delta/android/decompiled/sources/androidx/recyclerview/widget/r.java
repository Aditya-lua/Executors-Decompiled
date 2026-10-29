package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends RecyclerView.n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3288g = true;

    @SuppressLint({"UnknownNullness"})
    public final void A(RecyclerView.f0 f0Var) {
        I(f0Var);
        h(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void B(RecyclerView.f0 f0Var) {
        J(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void C(RecyclerView.f0 f0Var, boolean z10) {
        K(f0Var, z10);
        h(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void D(RecyclerView.f0 f0Var, boolean z10) {
        L(f0Var, z10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void E(RecyclerView.f0 f0Var) {
        M(f0Var);
        h(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void F(RecyclerView.f0 f0Var) {
        N(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void G(RecyclerView.f0 f0Var) {
        O(f0Var);
        h(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void H(RecyclerView.f0 f0Var) {
        P(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public void I(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void J(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void K(RecyclerView.f0 f0Var, boolean z10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void L(RecyclerView.f0 f0Var, boolean z10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void M(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void N(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void O(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void P(RecyclerView.f0 f0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean a(@NonNull RecyclerView.f0 f0Var, RecyclerView.n.c cVar, @NonNull RecyclerView.n.c cVar2) {
        int i10;
        int i11;
        return (cVar == null || ((i10 = cVar.f3045a) == (i11 = cVar2.f3045a) && cVar.b == cVar2.b)) ? w(f0Var) : y(f0Var, i10, cVar.b, i11, cVar2.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean b(@NonNull RecyclerView.f0 f0Var, @NonNull RecyclerView.f0 f0Var2, @NonNull RecyclerView.n.c cVar, @NonNull RecyclerView.n.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f3045a;
        int i13 = cVar.b;
        if (f0Var2.K()) {
            int i14 = cVar.f3045a;
            i11 = cVar.b;
            i10 = i14;
        } else {
            i10 = cVar2.f3045a;
            i11 = cVar2.b;
        }
        return x(f0Var, f0Var2, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean c(@NonNull RecyclerView.f0 f0Var, @NonNull RecyclerView.n.c cVar, RecyclerView.n.c cVar2) {
        int i10 = cVar.f3045a;
        int i11 = cVar.b;
        View view = f0Var.f3016a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f3045a;
        int top = cVar2 == null ? view.getTop() : cVar2.b;
        if (f0Var.w() || (i10 == left && i11 == top)) {
            return z(f0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(f0Var, i10, i11, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean d(@NonNull RecyclerView.f0 f0Var, @NonNull RecyclerView.n.c cVar, @NonNull RecyclerView.n.c cVar2) {
        int i10 = cVar.f3045a;
        int i11 = cVar2.f3045a;
        if (i10 != i11 || cVar.b != cVar2.b) {
            return y(f0Var, i10, cVar.b, i11, cVar2.b);
        }
        E(f0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean f(@NonNull RecyclerView.f0 f0Var) {
        return !this.f3288g || f0Var.u();
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean w(RecyclerView.f0 f0Var);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean x(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i10, int i11, int i12, int i13);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean y(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean z(RecyclerView.f0 f0Var);
}
