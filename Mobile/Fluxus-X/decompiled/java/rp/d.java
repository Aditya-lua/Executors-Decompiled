package rp;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements wt.d<np.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f30837a;

    public d(c cVar) {
        this.f30837a = cVar;
    }

    public static d a(c cVar) {
        return new d(cVar);
    }

    public static np.h b(c cVar) {
        return (np.h) wt.h.e(cVar.getEnvironment());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public np.h get() {
        return b(this.f30837a);
    }
}
