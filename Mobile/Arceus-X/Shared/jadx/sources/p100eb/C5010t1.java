package p100eb;

import java.util.Objects;

/* JADX INFO: renamed from: eb.t1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5010t1 extends AbstractC4920e1 {

    /* JADX INFO: renamed from: e */
    public static final AbstractC4920e1 f19809e = new C5010t1(new Object[0], 0);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f19810c;

    /* JADX INFO: renamed from: d */
    public final transient int f19811d;

    public C5010t1(Object[] objArr, int i10) {
        this.f19810c = objArr;
        this.f19811d = i10;
    }

    @Override // p100eb.AbstractC4920e1, p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: a */
    public final int mo23574a(Object[] objArr, int i10) {
        System.arraycopy(this.f19810c, 0, objArr, 0, this.f19811d);
        return this.f19811d;
    }

    @Override // p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: b */
    public final int mo23564b() {
        return this.f19811d;
    }

    @Override // p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: c */
    public final int mo23565c() {
        return 0;
    }

    @Override // p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: e */
    public final Object[] mo23566e() {
        return this.f19810c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C4973n0.m23677a(i10, this.f19811d, "index");
        Object obj = this.f19810c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19811d;
    }
}
