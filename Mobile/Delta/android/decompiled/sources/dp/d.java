package dp;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements ft.d<zo.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14765a;

    public d(c cVar) {
        this.f14765a = cVar;
    }

    public static d a(c cVar) {
        return new d(cVar);
    }

    public static zo.h b(c cVar) {
        return (zo.h) ft.h.e(cVar.getEnvironment());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public zo.h get() {
        return b(this.f14765a);
    }
}
