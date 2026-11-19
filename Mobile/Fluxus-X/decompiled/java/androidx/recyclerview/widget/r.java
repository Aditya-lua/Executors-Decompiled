package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends RecyclerView.n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2835g = true;

    @SuppressLint({"UnknownNullness"})
    public final void A(RecyclerView.g0 g0Var) {
        I(g0Var);
        h(g0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void B(RecyclerView.g0 g0Var) {
        J(g0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void C(RecyclerView.g0 g0Var, boolean z10) {
        K(g0Var, z10);
        h(g0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void D(RecyclerView.g0 g0Var, boolean z10) {
        L(g0Var, z10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void E(RecyclerView.g0 g0Var) {
        M(g0Var);
        h(g0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void F(RecyclerView.g0 g0Var) {
        N(g0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void G(RecyclerView.g0 g0Var) {
        O(g0Var);
        h(g0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void H(RecyclerView.g0 g0Var) {
        P(g0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public void I(RecyclerView.g0 g0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void J(RecyclerView.g0 g0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void K(RecyclerView.g0 g0Var, boolean z10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void L(RecyclerView.g0 g0Var, boolean z10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void M(RecyclerView.g0 g0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void N(RecyclerView.g0 g0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void O(RecyclerView.g0 g0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void P(RecyclerView.g0 g0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean a(@NonNull RecyclerView.g0 g0Var, RecyclerView.n.c cVar, @NonNull RecyclerView.n.c cVar2) {
        int i10;
        int i11;
        return (cVar == null || ((i10 = cVar.f2592a) == (i11 = cVar2.f2592a) && cVar.b == cVar2.b)) ? w(g0Var) : y(g0Var, i10, cVar.b, i11, cVar2.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean b(@NonNull RecyclerView.g0 g0Var, @NonNull RecyclerView.g0 g0Var2, @NonNull RecyclerView.n.c cVar, @NonNull RecyclerView.n.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f2592a;
        int i13 = cVar.b;
        if (g0Var2.K()) {
            int i14 = cVar.f2592a;
            i11 = cVar.b;
            i10 = i14;
        } else {
            i10 = cVar2.f2592a;
            i11 = cVar2.b;
        }
        return x(g0Var, g0Var2, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean c(@NonNull RecyclerView.g0 g0Var, @NonNull RecyclerView.n.c cVar, RecyclerView.n.c cVar2) {
        int i10 = cVar.f2592a;
        int i11 = cVar.b;
        View view = g0Var.f2564a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f2592a;
        int top = cVar2 == null ? view.getTop() : cVar2.b;
        if (g0Var.w() || (i10 == left && i11 == top)) {
            return z(g0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(g0Var, i10, i11, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean d(@NonNull RecyclerView.g0 g0Var, @NonNull RecyclerView.n.c cVar, @NonNull RecyclerView.n.c cVar2) {
        int i10 = cVar.f2592a;
        int i11 = cVar2.f2592a;
        if (i10 != i11 || cVar.b != cVar2.b) {
            return y(g0Var, i10, cVar.b, i11, cVar2.b);
        }
        E(g0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean f(@NonNull RecyclerView.g0 g0Var) {
        return !this.f2835g || g0Var.u();
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean w(RecyclerView.g0 g0Var);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean x(RecyclerView.g0 g0Var, RecyclerView.g0 g0Var2, int i10, int i11, int i12, int i13);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean y(RecyclerView.g0 g0Var, int i10, int i11, int i12, int i13);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean z(RecyclerView.g0 g0Var);
}
