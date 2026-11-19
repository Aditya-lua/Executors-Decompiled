package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class b implements x4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final RecyclerView.h f2679a;

    public b(@NonNull RecyclerView.h hVar) {
        this.f2679a = hVar;
    }

    @Override // x4.b
    public void a(int i10, int i11) {
        this.f2679a.o(i10, i11);
    }

    @Override // x4.b
    public void b(int i10, int i11) {
        this.f2679a.p(i10, i11);
    }

    @Override // x4.b
    @SuppressLint({"UnknownNullness"})
    public void c(int i10, int i11, Object obj) {
        this.f2679a.n(i10, i11, obj);
    }

    @Override // x4.b
    public void d(int i10, int i11) {
        this.f2679a.m(i10, i11);
    }
}
