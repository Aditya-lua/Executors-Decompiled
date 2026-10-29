package p125fb;

import java.util.Objects;

/* JADX INFO: renamed from: fb.o1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5549o1 extends AbstractC5546n1 {

    /* JADX INFO: renamed from: e */
    public static final AbstractC5546n1 f21335e = new C5549o1(new Object[0], 0);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f21336c;

    /* JADX INFO: renamed from: d */
    public final transient int f21337d;

    public C5549o1(Object[] objArr, int i10) {
        this.f21336c = objArr;
        this.f21337d = i10;
    }

    @Override // p125fb.AbstractC5530i1
    /* JADX INFO: renamed from: a */
    public final Object[] mo25194a() {
        return this.f21336c;
    }

    @Override // p125fb.AbstractC5530i1
    /* JADX INFO: renamed from: b */
    public final int mo25195b() {
        return 0;
    }

    @Override // p125fb.AbstractC5530i1
    /* JADX INFO: renamed from: c */
    public final int mo25196c() {
        return this.f21337d;
    }

    @Override // p125fb.AbstractC5546n1, p125fb.AbstractC5530i1
    /* JADX INFO: renamed from: d */
    public final int mo25197d(Object[] objArr, int i10) {
        Object[] objArr2 = this.f21336c;
        int i11 = this.f21337d;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C5581z0.m25235a(i10, this.f21337d, "index");
        Object obj = this.f21336c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21337d;
    }
}
