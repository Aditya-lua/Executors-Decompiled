package ee;

import java.util.List;

/* JADX INFO: renamed from: ee.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C5091r extends AbstractC5093s {

    /* JADX INFO: renamed from: c */
    public final transient int f19905c;

    /* JADX INFO: renamed from: d */
    public final transient int f19906d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC5093s f19907e;

    public C5091r(AbstractC5093s abstractC5093s, int i10, int i11) {
        this.f19907e = abstractC5093s;
        this.f19905c = i10;
        this.f19906d = i11;
    }

    @Override // ee.AbstractC5087p
    /* JADX INFO: renamed from: b */
    public final int mo23827b() {
        return this.f19907e.mo23828c() + this.f19905c + this.f19906d;
    }

    @Override // ee.AbstractC5087p
    /* JADX INFO: renamed from: c */
    public final int mo23828c() {
        return this.f19907e.mo23828c() + this.f19905c;
    }

    @Override // ee.AbstractC5087p
    /* JADX INFO: renamed from: d */
    public final Object[] mo23829d() {
        return this.f19907e.mo23829d();
    }

    @Override // ee.AbstractC5093s
    /* JADX INFO: renamed from: e */
    public final AbstractC5093s subList(int i10, int i11) {
        C5081m.m23817c(i10, i11, this.f19906d);
        int i12 = this.f19905c;
        return this.f19907e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C5081m.m23815a(i10, this.f19906d, "index");
        return this.f19907e.get(i10 + this.f19905c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19906d;
    }

    @Override // ee.AbstractC5093s, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
