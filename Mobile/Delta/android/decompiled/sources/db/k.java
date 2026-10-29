package db;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f14544e = new k(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f14545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f14546d;

    public k(Object[] objArr, int i10) {
        this.f14545c = objArr;
        this.f14546d = i10;
    }

    @Override // db.d
    public final Object[] a() {
        return this.f14545c;
    }

    @Override // db.d
    public final int b() {
        return 0;
    }

    @Override // db.d
    public final int c() {
        return this.f14546d;
    }

    @Override // db.i, db.d
    public final int d(Object[] objArr, int i10) {
        Object[] objArr2 = this.f14545c;
        int i11 = this.f14546d;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        s.b(i10, this.f14546d, "index");
        Object obj = this.f14545c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14546d;
    }
}
