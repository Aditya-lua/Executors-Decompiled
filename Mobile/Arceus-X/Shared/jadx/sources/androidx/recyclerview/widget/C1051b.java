package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import p507w4.InterfaceC12307b;

/* JADX INFO: renamed from: androidx.recyclerview.widget.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1051b implements InterfaceC12307b {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RecyclerView.AbstractC1025h f4131a;

    public C1051b(@NonNull RecyclerView.AbstractC1025h abstractC1025h) {
        this.f4131a = abstractC1025h;
    }

    @Override // p507w4.InterfaceC12307b
    /* JADX INFO: renamed from: a */
    public void mo5856a(int i10, int i11) {
        this.f4131a.m5483o(i10, i11);
    }

    @Override // p507w4.InterfaceC12307b
    /* JADX INFO: renamed from: b */
    public void mo5857b(int i10, int i11) {
        this.f4131a.m5484p(i10, i11);
    }

    @Override // p507w4.InterfaceC12307b
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: c */
    public void mo5858c(int i10, int i11, Object obj) {
        this.f4131a.m5482n(i10, i11, obj);
    }

    @Override // p507w4.InterfaceC12307b
    /* JADX INFO: renamed from: d */
    public void mo5859d(int i10, int i11) {
        this.f4131a.m5481m(i10, i11);
    }
}
