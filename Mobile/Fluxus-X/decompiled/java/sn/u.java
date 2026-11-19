package sn;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements wt.d<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<er.c> f31720a;

    public u(wt.i<er.c> iVar) {
        this.f31720a = iVar;
    }

    public static u a(wt.i<er.c> iVar) {
        return new u(iVar);
    }

    public static t c(er.c cVar) {
        return new t(cVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c(this.f31720a.get());
    }
}
