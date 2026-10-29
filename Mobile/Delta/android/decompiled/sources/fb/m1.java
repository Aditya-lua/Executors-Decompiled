package fb;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends n1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f16554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f16555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1 f16556e;

    public m1(n1 n1Var, int i10, int i11) {
        Objects.requireNonNull(n1Var);
        this.f16556e = n1Var;
        this.f16554c = i10;
        this.f16555d = i11;
    }

    @Override // fb.i1
    public final Object[] a() {
        return this.f16556e.a();
    }

    @Override // fb.i1
    public final int b() {
        return this.f16556e.b() + this.f16554c;
    }

    @Override // fb.i1
    public final int c() {
        return this.f16556e.b() + this.f16554c + this.f16555d;
    }

    @Override // fb.n1
    /* JADX INFO: renamed from: e */
    public final n1 subList(int i10, int i11) {
        z0.c(i10, i11, this.f16555d);
        int i12 = this.f16554c;
        return this.f16556e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        z0.a(i10, this.f16555d, "index");
        return this.f16556e.get(i10 + this.f16554c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16555d;
    }

    @Override // fb.n1, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
