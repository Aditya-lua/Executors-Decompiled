package eb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f13315e = new k(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f13316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f13317d;

    public k(Object[] objArr, int i10) {
        this.f13316c = objArr;
        this.f13317d = i10;
    }

    @Override // eb.d
    public final Object[] a() {
        return this.f13316c;
    }

    @Override // eb.d
    public final int b() {
        return 0;
    }

    @Override // eb.d
    public final int c() {
        return this.f13317d;
    }

    @Override // eb.i, eb.d
    public final int d(Object[] objArr, int i10) {
        Object[] objArr2 = this.f13316c;
        int i11 = this.f13317d;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        s.b(i10, this.f13317d, "index");
        Object obj = this.f13316c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13317d;
    }
}
