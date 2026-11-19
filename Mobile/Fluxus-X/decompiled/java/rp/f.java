package rp;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements wt.d<so.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f30839a;
    public final wt.i<i> b;

    public f(c cVar, wt.i<i> iVar) {
        this.f30839a = cVar;
        this.b = iVar;
    }

    public static f a(c cVar, wt.i<i> iVar) {
        return new f(cVar, iVar);
    }

    public static so.a b(c cVar, i iVar) {
        return (so.a) wt.h.e(cVar.c(iVar));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public so.a get() {
        return b(this.f30839a, this.b.get());
    }
}
