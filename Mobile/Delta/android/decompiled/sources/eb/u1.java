package eb;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends h1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object[] f16017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u1 f16018i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f16019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f16020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f16021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f16022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f16023g;

    static {
        Object[] objArr = new Object[0];
        f16017h = objArr;
        f16018i = new u1(objArr, 0, objArr, 0, 0);
    }

    public u1(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f16019c = objArr;
        this.f16020d = i10;
        this.f16021e = objArr2;
        this.f16022f = i11;
        this.f16023g = i12;
    }

    @Override // eb.z0
    public final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f16019c, 0, objArr, 0, this.f16023g);
        return this.f16023g;
    }

    @Override // eb.z0
    public final int b() {
        return this.f16023g;
    }

    @Override // eb.z0
    public final int c() {
        return 0;
    }

    @Override // eb.z0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f16021e;
            if (objArr.length != 0) {
                int iA = y0.a(obj.hashCode());
                while (true) {
                    int i10 = iA & this.f16022f;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iA = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // eb.h1, eb.z0
    public final c2 d() {
        return i().listIterator(0);
    }

    @Override // eb.z0
    public final Object[] e() {
        return this.f16019c;
    }

    @Override // eb.h1
    public final boolean g() {
        return true;
    }

    @Override // eb.h1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f16020d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // eb.h1
    public final e1 k() {
        return e1.h(this.f16019c, this.f16023g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f16023g;
    }
}
