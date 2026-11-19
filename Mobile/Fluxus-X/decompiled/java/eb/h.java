package eb;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f13312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f13313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f13314e;

    public h(i iVar, int i10, int i11) {
        Objects.requireNonNull(iVar);
        this.f13314e = iVar;
        this.f13312c = i10;
        this.f13313d = i11;
    }

    @Override // eb.d
    public final Object[] a() {
        return this.f13314e.a();
    }

    @Override // eb.d
    public final int b() {
        return this.f13314e.b() + this.f13312c;
    }

    @Override // eb.d
    public final int c() {
        return this.f13314e.b() + this.f13312c + this.f13313d;
    }

    @Override // eb.i
    /* JADX INFO: renamed from: f */
    public final i subList(int i10, int i11) {
        s.d(i10, i11, this.f13313d);
        int i12 = this.f13312c;
        return this.f13314e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        s.b(i10, this.f13313d, "index");
        return this.f13314e.get(i10 + this.f13312c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13313d;
    }

    @Override // eb.i, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
