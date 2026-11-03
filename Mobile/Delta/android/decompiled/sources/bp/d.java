package bp;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements dt.d<xo.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f4359a;

    public d(c cVar) {
        this.f4359a = cVar;
    }

    public static d a(c cVar) {
        return new d(cVar);
    }

    public static xo.h b(c cVar) {
        return (xo.h) dt.h.e(cVar.getEnvironment());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public xo.h get() {
        return b(this.f4359a);
    }
}
