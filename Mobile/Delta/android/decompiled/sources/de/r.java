package de;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f14596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f14597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f14598e;

    public r(s sVar, int i10, int i11) {
        this.f14598e = sVar;
        this.f14596c = i10;
        this.f14597d = i11;
    }

    @Override // de.p
    public final int b() {
        return this.f14598e.c() + this.f14596c + this.f14597d;
    }

    @Override // de.p
    public final int c() {
        return this.f14598e.c() + this.f14596c;
    }

    @Override // de.p
    public final Object[] d() {
        return this.f14598e.d();
    }

    @Override // de.s
    /* JADX INFO: renamed from: e */
    public final s subList(int i10, int i11) {
        m.c(i10, i11, this.f14597d);
        int i12 = this.f14596c;
        return this.f14598e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        m.a(i10, this.f14597d, "index");
        return this.f14598e.get(i10 + this.f14596c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14597d;
    }

    @Override // de.s, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
