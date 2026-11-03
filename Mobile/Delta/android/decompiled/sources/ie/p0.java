package ie;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class p0<E> extends t<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t<Object> f21071e = new p0(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f21072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f21073d;

    public p0(Object[] objArr, int i10) {
        this.f21072c = objArr;
        this.f21073d = i10;
    }

    @Override // ie.t, ie.r
    public int b(Object[] objArr, int i10) {
        System.arraycopy(this.f21072c, 0, objArr, i10, this.f21073d);
        return i10 + this.f21073d;
    }

    @Override // ie.r
    public Object[] c() {
        return this.f21072c;
    }

    @Override // ie.r
    public int d() {
        return this.f21073d;
    }

    @Override // ie.r
    public int e() {
        return 0;
    }

    @Override // ie.r
    public boolean f() {
        return false;
    }

    @Override // java.util.List
    public E get(int i10) {
        he.n.j(i10, this.f21073d);
        E e10 = (E) this.f21072c[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f21073d;
    }
}
