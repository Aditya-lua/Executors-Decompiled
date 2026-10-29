package p074db;

import java.util.Objects;

/* JADX INFO: renamed from: db.k */
/* JADX INFO: loaded from: classes.dex */
public final class C4529k extends AbstractC4527i {

    /* JADX INFO: renamed from: e */
    public static final AbstractC4527i f18578e = new C4529k(new Object[0], 0);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f18579c;

    /* JADX INFO: renamed from: d */
    public final transient int f18580d;

    public C4529k(Object[] objArr, int i10) {
        this.f18579c = objArr;
        this.f18580d = i10;
    }

    @Override // p074db.AbstractC4522d
    /* JADX INFO: renamed from: a */
    public final Object[] mo22484a() {
        return this.f18579c;
    }

    @Override // p074db.AbstractC4522d
    /* JADX INFO: renamed from: b */
    public final int mo22485b() {
        return 0;
    }

    @Override // p074db.AbstractC4522d
    /* JADX INFO: renamed from: c */
    public final int mo22486c() {
        return this.f18580d;
    }

    @Override // p074db.AbstractC4527i, p074db.AbstractC4522d
    /* JADX INFO: renamed from: d */
    public final int mo22487d(Object[] objArr, int i10) {
        Object[] objArr2 = this.f18579c;
        int i11 = this.f18580d;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C4537s.m22510b(i10, this.f18580d, "index");
        Object obj = this.f18579c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18580d;
    }
}
