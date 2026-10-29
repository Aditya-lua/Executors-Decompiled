package eb;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f15257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f15258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1 f15259e;

    public d1(e1 e1Var, int i10, int i11) {
        this.f15259e = e1Var;
        this.f15257c = i10;
        this.f15258d = i11;
    }

    @Override // eb.z0
    public final int b() {
        return this.f15259e.c() + this.f15257c + this.f15258d;
    }

    @Override // eb.z0
    public final int c() {
        return this.f15259e.c() + this.f15257c;
    }

    @Override // eb.z0
    public final Object[] e() {
        return this.f15259e.e();
    }

    @Override // eb.e1
    /* JADX INFO: renamed from: g */
    public final e1 subList(int i10, int i11) {
        n0.e(i10, i11, this.f15258d);
        int i12 = this.f15257c;
        return this.f15259e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        n0.a(i10, this.f15258d, "index");
        return this.f15259e.get(i10 + this.f15257c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15258d;
    }

    @Override // eb.e1, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
