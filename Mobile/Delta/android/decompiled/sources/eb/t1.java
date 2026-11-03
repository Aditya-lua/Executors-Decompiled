package eb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t1 extends e1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e1 f16011e = new t1(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f16012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f16013d;

    public t1(Object[] objArr, int i10) {
        this.f16012c = objArr;
        this.f16013d = i10;
    }

    @Override // eb.e1, eb.z0
    public final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f16012c, 0, objArr, 0, this.f16013d);
        return this.f16013d;
    }

    @Override // eb.z0
    public final int b() {
        return this.f16013d;
    }

    @Override // eb.z0
    public final int c() {
        return 0;
    }

    @Override // eb.z0
    public final Object[] e() {
        return this.f16012c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        n0.a(i10, this.f16013d, "index");
        Object obj = this.f16012c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16013d;
    }
}
