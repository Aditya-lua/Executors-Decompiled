package p074db;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: db.h */
/* JADX INFO: loaded from: classes.dex */
public final class C4526h extends AbstractC4527i {

    /* JADX INFO: renamed from: c */
    public final transient int f18574c;

    /* JADX INFO: renamed from: d */
    public final transient int f18575d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC4527i f18576e;

    public C4526h(AbstractC4527i abstractC4527i, int i10, int i11) {
        Objects.requireNonNull(abstractC4527i);
        this.f18576e = abstractC4527i;
        this.f18574c = i10;
        this.f18575d = i11;
    }

    @Override // p074db.AbstractC4522d
    /* JADX INFO: renamed from: a */
    public final Object[] mo22484a() {
        return this.f18576e.mo22484a();
    }

    @Override // p074db.AbstractC4522d
    /* JADX INFO: renamed from: b */
    public final int mo22485b() {
        return this.f18576e.mo22485b() + this.f18574c;
    }

    @Override // p074db.AbstractC4522d
    /* JADX INFO: renamed from: c */
    public final int mo22486c() {
        return this.f18576e.mo22485b() + this.f18574c + this.f18575d;
    }

    @Override // p074db.AbstractC4527i
    /* JADX INFO: renamed from: f */
    public final AbstractC4527i subList(int i10, int i11) {
        C4537s.m22512d(i10, i11, this.f18575d);
        int i12 = this.f18574c;
        return this.f18576e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C4537s.m22510b(i10, this.f18575d, "index");
        return this.f18576e.get(i10 + this.f18574c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18575d;
    }

    @Override // p074db.AbstractC4527i, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
