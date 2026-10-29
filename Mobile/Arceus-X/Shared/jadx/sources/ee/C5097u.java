package ee;

import java.util.Objects;

/* JADX INFO: renamed from: ee.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C5097u extends AbstractC5093s {

    /* JADX INFO: renamed from: d */
    public static final AbstractC5093s f19911d = new C5097u(new Object[0], 0);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f19912c;

    public C5097u(Object[] objArr, int i10) {
        this.f19912c = objArr;
    }

    @Override // ee.AbstractC5093s, ee.AbstractC5087p
    /* JADX INFO: renamed from: a */
    public final int mo23826a(Object[] objArr, int i10) {
        System.arraycopy(this.f19912c, 0, objArr, 0, 0);
        return 0;
    }

    @Override // ee.AbstractC5087p
    /* JADX INFO: renamed from: b */
    public final int mo23827b() {
        return 0;
    }

    @Override // ee.AbstractC5087p
    /* JADX INFO: renamed from: c */
    public final int mo23828c() {
        return 0;
    }

    @Override // ee.AbstractC5087p
    /* JADX INFO: renamed from: d */
    public final Object[] mo23829d() {
        return this.f19912c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C5081m.m23815a(i10, 0, "index");
        Object obj = this.f19912c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
