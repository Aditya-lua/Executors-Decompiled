package ee;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f16096d = new u(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f16097c;

    public u(Object[] objArr, int i10) {
        this.f16097c = objArr;
    }

    @Override // ee.s, ee.p
    public final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f16097c, 0, objArr, 0, 0);
        return 0;
    }

    @Override // ee.p
    public final int b() {
        return 0;
    }

    @Override // ee.p
    public final int c() {
        return 0;
    }

    @Override // ee.p
    public final Object[] d() {
        return this.f16097c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        m.a(i10, 0, "index");
        Object obj = this.f16097c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
