package p100eb;

import java.util.List;

/* JADX INFO: renamed from: eb.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4914d1 extends AbstractC4920e1 {

    /* JADX INFO: renamed from: c */
    public final transient int f19636c;

    /* JADX INFO: renamed from: d */
    public final transient int f19637d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC4920e1 f19638e;

    public C4914d1(AbstractC4920e1 abstractC4920e1, int i10, int i11) {
        this.f19638e = abstractC4920e1;
        this.f19636c = i10;
        this.f19637d = i11;
    }

    @Override // p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: b */
    public final int mo23564b() {
        return this.f19638e.mo23565c() + this.f19636c + this.f19637d;
    }

    @Override // p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: c */
    public final int mo23565c() {
        return this.f19638e.mo23565c() + this.f19636c;
    }

    @Override // p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: e */
    public final Object[] mo23566e() {
        return this.f19638e.mo23566e();
    }

    @Override // p100eb.AbstractC4920e1
    /* JADX INFO: renamed from: g */
    public final AbstractC4920e1 subList(int i10, int i11) {
        C4973n0.m23681e(i10, i11, this.f19637d);
        int i12 = this.f19636c;
        return this.f19638e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C4973n0.m23677a(i10, this.f19637d, "index");
        return this.f19638e.get(i10 + this.f19636c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19637d;
    }

    @Override // p100eb.AbstractC4920e1, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
