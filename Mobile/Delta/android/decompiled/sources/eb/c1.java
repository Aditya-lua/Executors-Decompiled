package eb;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient e1 f15868c;

    public c1(e1 e1Var) {
        this.f15868c = e1Var;
    }

    @Override // eb.e1, eb.z0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f15868c.contains(obj);
    }

    @Override // eb.e1
    public final e1 f() {
        return this.f15868c;
    }

    @Override // eb.e1
    /* JADX INFO: renamed from: g */
    public final e1 subList(int i10, int i11) {
        n0.e(i10, i11, this.f15868c.size());
        e1 e1Var = this.f15868c;
        return e1Var.subList(e1Var.size() - i11, this.f15868c.size() - i10).f();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        n0.a(i10, this.f15868c.size(), "index");
        return this.f15868c.get(m(i10));
    }

    @Override // eb.e1, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f15868c.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return m(iLastIndexOf);
        }
        return -1;
    }

    @Override // eb.e1, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f15868c.indexOf(obj);
        if (iIndexOf >= 0) {
            return m(iIndexOf);
        }
        return -1;
    }

    public final int m(int i10) {
        return (this.f15868c.size() - 1) - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15868c.size();
    }

    @Override // eb.e1, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
