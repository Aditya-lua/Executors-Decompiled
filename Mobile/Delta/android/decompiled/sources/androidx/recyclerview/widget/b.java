package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class b implements w4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final RecyclerView.h f3132a;

    public b(@NonNull RecyclerView.h hVar) {
        this.f3132a = hVar;
    }

    @Override // w4.b
    public void a(int i10, int i11) {
        this.f3132a.o(i10, i11);
    }

    @Override // w4.b
    public void b(int i10, int i11) {
        this.f3132a.p(i10, i11);
    }

    @Override // w4.b
    @SuppressLint({"UnknownNullness"})
    public void c(int i10, int i11, Object obj) {
        this.f3132a.n(i10, i11, obj);
    }

    @Override // w4.b
    public void d(int i10, int i11) {
        this.f3132a.m(i10, i11);
    }
}
