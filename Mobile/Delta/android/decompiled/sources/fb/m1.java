package fb;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends n1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f17150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f17151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1 f17152e;

    public m1(n1 n1Var, int i10, int i11) {
        Objects.requireNonNull(n1Var);
        this.f17152e = n1Var;
        this.f17150c = i10;
        this.f17151d = i11;
    }

    @Override // fb.i1
    public final Object[] a() {
        return this.f17152e.a();
    }

    @Override // fb.i1
    public final int b() {
        return this.f17152e.b() + this.f17150c;
    }

    @Override // fb.i1
    public final int c() {
        return this.f17152e.b() + this.f17150c + this.f17151d;
    }

    @Override // fb.n1
    /* JADX INFO: renamed from: e */
    public final n1 subList(int i10, int i11) {
        z0.c(i10, i11, this.f17151d);
        int i12 = this.f17150c;
        return this.f17152e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        z0.a(i10, this.f17151d, "index");
        return this.f17152e.get(i10 + this.f17150c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17151d;
    }

    @Override // fb.n1, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
