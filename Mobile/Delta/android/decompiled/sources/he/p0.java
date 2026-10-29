package he;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class p0<E> extends t<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t<Object> f19249e = new p0(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f19250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f19251d;

    public p0(Object[] objArr, int i10) {
        this.f19250c = objArr;
        this.f19251d = i10;
    }

    @Override // he.t, he.r
    public int b(Object[] objArr, int i10) {
        System.arraycopy(this.f19250c, 0, objArr, i10, this.f19251d);
        return i10 + this.f19251d;
    }

    @Override // he.r
    public Object[] c() {
        return this.f19250c;
    }

    @Override // he.r
    public int d() {
        return this.f19251d;
    }

    @Override // he.r
    public int e() {
        return 0;
    }

    @Override // he.r
    public boolean f() {
        return false;
    }

    @Override // java.util.List
    public E get(int i10) {
        ge.n.j(i10, this.f19251d);
        E e10 = (E) this.f19250c[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19251d;
    }
}
