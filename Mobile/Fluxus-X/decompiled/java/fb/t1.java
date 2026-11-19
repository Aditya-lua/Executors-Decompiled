package fb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t1 extends e1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e1 f15867e = new t1(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f15868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f15869d;

    public t1(Object[] objArr, int i10) {
        this.f15868c = objArr;
        this.f15869d = i10;
    }

    @Override // fb.e1, fb.z0
    public final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f15868c, 0, objArr, 0, this.f15869d);
        return this.f15869d;
    }

    @Override // fb.z0
    public final int b() {
        return this.f15869d;
    }

    @Override // fb.z0
    public final int c() {
        return 0;
    }

    @Override // fb.z0
    public final Object[] e() {
        return this.f15868c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        n0.a(i10, this.f15869d, "index");
        Object obj = this.f15868c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15869d;
    }
}
