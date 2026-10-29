package p125fb;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: fb.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5543m1 extends AbstractC5546n1 {

    /* JADX INFO: renamed from: c */
    public final transient int f21325c;

    /* JADX INFO: renamed from: d */
    public final transient int f21326d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC5546n1 f21327e;

    public C5543m1(AbstractC5546n1 abstractC5546n1, int i10, int i11) {
        Objects.requireNonNull(abstractC5546n1);
        this.f21327e = abstractC5546n1;
        this.f21325c = i10;
        this.f21326d = i11;
    }

    @Override // p125fb.AbstractC5530i1
    /* JADX INFO: renamed from: a */
    public final Object[] mo25194a() {
        return this.f21327e.mo25194a();
    }

    @Override // p125fb.AbstractC5530i1
    /* JADX INFO: renamed from: b */
    public final int mo25195b() {
        return this.f21327e.mo25195b() + this.f21325c;
    }

    @Override // p125fb.AbstractC5530i1
    /* JADX INFO: renamed from: c */
    public final int mo25196c() {
        return this.f21327e.mo25195b() + this.f21325c + this.f21326d;
    }

    @Override // p125fb.AbstractC5546n1
    /* JADX INFO: renamed from: e */
    public final AbstractC5546n1 subList(int i10, int i11) {
        C5581z0.m25237c(i10, i11, this.f21326d);
        int i12 = this.f21325c;
        return this.f21327e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C5581z0.m25235a(i10, this.f21326d, "index");
        return this.f21327e.get(i10 + this.f21325c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21326d;
    }

    @Override // p125fb.AbstractC5546n1, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
