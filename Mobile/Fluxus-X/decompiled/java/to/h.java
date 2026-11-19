package to;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements wt.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f32618a;

    public h(g gVar) {
        this.f32618a = gVar;
    }

    public static d a(g gVar) {
        return (d) wt.h.e(gVar.a());
    }

    public static h b(g gVar) {
        return new h(gVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d get() {
        return a(this.f32618a);
    }
}
