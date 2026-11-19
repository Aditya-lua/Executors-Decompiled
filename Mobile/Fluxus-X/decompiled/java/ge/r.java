package ge;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f17719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f17720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f17721e;

    public r(s sVar, int i10, int i11) {
        this.f17721e = sVar;
        this.f17719c = i10;
        this.f17720d = i11;
    }

    @Override // ge.p
    public final int b() {
        return this.f17721e.c() + this.f17719c + this.f17720d;
    }

    @Override // ge.p
    public final int c() {
        return this.f17721e.c() + this.f17719c;
    }

    @Override // ge.p
    public final Object[] d() {
        return this.f17721e.d();
    }

    @Override // ge.s
    /* JADX INFO: renamed from: e */
    public final s subList(int i10, int i11) {
        m.c(i10, i11, this.f17720d);
        int i12 = this.f17719c;
        return this.f17721e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        m.a(i10, this.f17720d, "index");
        return this.f17721e.get(i10 + this.f17719c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17720d;
    }

    @Override // ge.s, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
