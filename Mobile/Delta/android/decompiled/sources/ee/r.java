package ee;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f16092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f16093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f16094e;

    public r(s sVar, int i10, int i11) {
        this.f16094e = sVar;
        this.f16092c = i10;
        this.f16093d = i11;
    }

    @Override // ee.p
    public final int b() {
        return this.f16094e.c() + this.f16092c + this.f16093d;
    }

    @Override // ee.p
    public final int c() {
        return this.f16094e.c() + this.f16092c;
    }

    @Override // ee.p
    public final Object[] d() {
        return this.f16094e.d();
    }

    @Override // ee.s
    /* JADX INFO: renamed from: e */
    public final s subList(int i10, int i11) {
        m.c(i10, i11, this.f16093d);
        int i12 = this.f16092c;
        return this.f16094e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        m.a(i10, this.f16093d, "index");
        return this.f16094e.get(i10 + this.f16092c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16093d;
    }

    @Override // ee.s, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
