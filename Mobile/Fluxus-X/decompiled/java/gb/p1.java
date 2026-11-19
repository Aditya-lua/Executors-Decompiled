package gb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class p1 extends o1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o1 f17656e = new p1(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f17657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f17658d;

    public p1(Object[] objArr, int i10) {
        this.f17657c = objArr;
        this.f17658d = i10;
    }

    @Override // gb.j1
    public final Object[] a() {
        return this.f17657c;
    }

    @Override // gb.j1
    public final int b() {
        return 0;
    }

    @Override // gb.j1
    public final int c() {
        return this.f17658d;
    }

    @Override // gb.o1, gb.j1
    public final int d(Object[] objArr, int i10) {
        Object[] objArr2 = this.f17657c;
        int i11 = this.f17658d;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        a1.a(i10, this.f17658d, "index");
        Object obj = this.f17657c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17658d;
    }
}
