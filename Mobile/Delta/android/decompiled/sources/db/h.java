package db;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f14521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f14522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f14523e;

    public h(i iVar, int i10, int i11) {
        Objects.requireNonNull(iVar);
        this.f14523e = iVar;
        this.f14521c = i10;
        this.f14522d = i11;
    }

    @Override // db.d
    public final Object[] a() {
        return this.f14523e.a();
    }

    @Override // db.d
    public final int b() {
        return this.f14523e.b() + this.f14521c;
    }

    @Override // db.d
    public final int c() {
        return this.f14523e.b() + this.f14521c + this.f14522d;
    }

    @Override // db.i
    /* JADX INFO: renamed from: f */
    public final i subList(int i10, int i11) {
        s.d(i10, i11, this.f14522d);
        int i12 = this.f14521c;
        return this.f14523e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        s.b(i10, this.f14522d, "index");
        return this.f14523e.get(i10 + this.f14521c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14522d;
    }

    @Override // db.i, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
