package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.recyclerview.widget.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1067r extends RecyclerView.AbstractC1031n {

    /* JADX INFO: renamed from: g */
    public boolean f4323g = true;

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: A */
    public final void m6041A(RecyclerView.AbstractC1023f0 abstractC1023f0) {
        m6049I(abstractC1023f0);
        m5517h(abstractC1023f0);
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: B */
    public final void m6042B(RecyclerView.AbstractC1023f0 abstractC1023f0) {
        m6050J(abstractC1023f0);
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: C */
    public final void m6043C(RecyclerView.AbstractC1023f0 abstractC1023f0, boolean z10) {
        m6051K(abstractC1023f0, z10);
        m5517h(abstractC1023f0);
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: D */
    public final void m6044D(RecyclerView.AbstractC1023f0 abstractC1023f0, boolean z10) {
        m6052L(abstractC1023f0, z10);
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: E */
    public final void m6045E(RecyclerView.AbstractC1023f0 abstractC1023f0) {
        m6053M(abstractC1023f0);
        m5517h(abstractC1023f0);
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: F */
    public final void m6046F(RecyclerView.AbstractC1023f0 abstractC1023f0) {
        m6054N(abstractC1023f0);
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: G */
    public final void m6047G(RecyclerView.AbstractC1023f0 abstractC1023f0) {
        m6055O(abstractC1023f0);
        m5517h(abstractC1023f0);
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: H */
    public final void m6048H(RecyclerView.AbstractC1023f0 abstractC1023f0) {
        m6056P(abstractC1023f0);
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: I */
    public void m6049I(RecyclerView.AbstractC1023f0 abstractC1023f0) {
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: J */
    public void m6050J(RecyclerView.AbstractC1023f0 abstractC1023f0) {
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: K */
    public void m6051K(RecyclerView.AbstractC1023f0 abstractC1023f0, boolean z10) {
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: L */
    public void m6052L(RecyclerView.AbstractC1023f0 abstractC1023f0, boolean z10) {
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: M */
    public void m6053M(RecyclerView.AbstractC1023f0 abstractC1023f0) {
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: N */
    public void m6054N(RecyclerView.AbstractC1023f0 abstractC1023f0) {
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: O */
    public void m6055O(RecyclerView.AbstractC1023f0 abstractC1023f0) {
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: P */
    public void m6056P(RecyclerView.AbstractC1023f0 abstractC1023f0) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1031n
    /* JADX INFO: renamed from: a */
    public boolean mo5511a(@NonNull RecyclerView.AbstractC1023f0 abstractC1023f0, RecyclerView.AbstractC1031n.c cVar, @NonNull RecyclerView.AbstractC1031n.c cVar2) {
        int i10;
        int i11;
        return (cVar == null || ((i10 = cVar.f4014a) == (i11 = cVar2.f4014a) && cVar.f4015b == cVar2.f4015b)) ? mo5913w(abstractC1023f0) : mo5915y(abstractC1023f0, i10, cVar.f4015b, i11, cVar2.f4015b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1031n
    /* JADX INFO: renamed from: b */
    public boolean mo5512b(@NonNull RecyclerView.AbstractC1023f0 abstractC1023f0, @NonNull RecyclerView.AbstractC1023f0 abstractC1023f1, @NonNull RecyclerView.AbstractC1031n.c cVar, @NonNull RecyclerView.AbstractC1031n.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f4014a;
        int i13 = cVar.f4015b;
        if (abstractC1023f1.m5429K()) {
            int i14 = cVar.f4014a;
            i11 = cVar.f4015b;
            i10 = i14;
        } else {
            i10 = cVar2.f4014a;
            i11 = cVar2.f4015b;
        }
        return mo5914x(abstractC1023f0, abstractC1023f1, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1031n
    /* JADX INFO: renamed from: c */
    public boolean mo5513c(@NonNull RecyclerView.AbstractC1023f0 abstractC1023f0, @NonNull RecyclerView.AbstractC1031n.c cVar, RecyclerView.AbstractC1031n.c cVar2) {
        int i10 = cVar.f4014a;
        int i11 = cVar.f4015b;
        View view = abstractC1023f0.f3981a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f4014a;
        int top = cVar2 == null ? view.getTop() : cVar2.f4015b;
        if (abstractC1023f0.m5454w() || (i10 == left && i11 == top)) {
            return mo5916z(abstractC1023f0);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo5915y(abstractC1023f0, i10, i11, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1031n
    /* JADX INFO: renamed from: d */
    public boolean mo5514d(@NonNull RecyclerView.AbstractC1023f0 abstractC1023f0, @NonNull RecyclerView.AbstractC1031n.c cVar, @NonNull RecyclerView.AbstractC1031n.c cVar2) {
        int i10 = cVar.f4014a;
        int i11 = cVar2.f4014a;
        if (i10 != i11 || cVar.f4015b != cVar2.f4015b) {
            return mo5915y(abstractC1023f0, i10, cVar.f4015b, i11, cVar2.f4015b);
        }
        m6045E(abstractC1023f0);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1031n
    /* JADX INFO: renamed from: f */
    public boolean mo5515f(@NonNull RecyclerView.AbstractC1023f0 abstractC1023f0) {
        return !this.f4323g || abstractC1023f0.m5452u();
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: w */
    public abstract boolean mo5913w(RecyclerView.AbstractC1023f0 abstractC1023f0);

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: x */
    public abstract boolean mo5914x(RecyclerView.AbstractC1023f0 abstractC1023f0, RecyclerView.AbstractC1023f0 abstractC1023f1, int i10, int i11, int i12, int i13);

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: y */
    public abstract boolean mo5915y(RecyclerView.AbstractC1023f0 abstractC1023f0, int i10, int i11, int i12, int i13);

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: z */
    public abstract boolean mo5916z(RecyclerView.AbstractC1023f0 abstractC1023f0);
}
