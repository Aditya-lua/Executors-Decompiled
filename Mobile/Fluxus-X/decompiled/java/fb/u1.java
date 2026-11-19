package fb;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends h1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object[] f15873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u1 f15874i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f15875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f15876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f15877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f15878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f15879g;

    static {
        Object[] objArr = new Object[0];
        f15873h = objArr;
        f15874i = new u1(objArr, 0, objArr, 0, 0);
    }

    public u1(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f15875c = objArr;
        this.f15876d = i10;
        this.f15877e = objArr2;
        this.f15878f = i11;
        this.f15879g = i12;
    }

    @Override // fb.z0
    public final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f15875c, 0, objArr, 0, this.f15879g);
        return this.f15879g;
    }

    @Override // fb.z0
    public final int b() {
        return this.f15879g;
    }

    @Override // fb.z0
    public final int c() {
        return 0;
    }

    @Override // fb.z0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f15877e;
            if (objArr.length != 0) {
                int iA = y0.a(obj.hashCode());
                while (true) {
                    int i10 = iA & this.f15878f;
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

    @Override // fb.h1, fb.z0
    public final c2 d() {
        return i().listIterator(0);
    }

    @Override // fb.z0
    public final Object[] e() {
        return this.f15875c;
    }

    @Override // fb.h1
    public final boolean g() {
        return true;
    }

    @Override // fb.h1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15876d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // fb.h1
    public final e1 j() {
        return e1.h(this.f15875c, this.f15879g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15879g;
    }
}
