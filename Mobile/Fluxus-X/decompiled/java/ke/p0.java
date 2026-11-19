package ke;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class p0<E> extends t<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t<Object> f21393e = new p0(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f21394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f21395d;

    public p0(Object[] objArr, int i10) {
        this.f21394c = objArr;
        this.f21395d = i10;
    }

    @Override // ke.t, ke.r
    public int b(Object[] objArr, int i10) {
        System.arraycopy(this.f21394c, 0, objArr, i10, this.f21395d);
        return i10 + this.f21395d;
    }

    @Override // ke.r
    public Object[] c() {
        return this.f21394c;
    }

    @Override // ke.r
    public int d() {
        return this.f21395d;
    }

    @Override // ke.r
    public int e() {
        return 0;
    }

    @Override // ke.r
    public boolean f() {
        return false;
    }

    @Override // java.util.List
    public E get(int i10) {
        je.n.j(i10, this.f21395d);
        E e10 = (E) this.f21394c[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f21395d;
    }
}
