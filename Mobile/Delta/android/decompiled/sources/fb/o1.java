package fb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends n1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n1 f16561e = new o1(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f16562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f16563d;

    public o1(Object[] objArr, int i10) {
        this.f16562c = objArr;
        this.f16563d = i10;
    }

    @Override // fb.i1
    public final Object[] a() {
        return this.f16562c;
    }

    @Override // fb.i1
    public final int b() {
        return 0;
    }

    @Override // fb.i1
    public final int c() {
        return this.f16563d;
    }

    @Override // fb.n1, fb.i1
    public final int d(Object[] objArr, int i10) {
        Object[] objArr2 = this.f16562c;
        int i11 = this.f16563d;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        z0.a(i10, this.f16563d, "index");
        Object obj = this.f16562c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16563d;
    }
}
