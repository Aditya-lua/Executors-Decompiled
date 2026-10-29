package or;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<qr.c> f27740a;
    public final ft.i<yn.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<g.c<mp.b>> f27741c;

    public l1(ft.i<qr.c> iVar, ft.i<yn.a> iVar2, ft.i<g.c<mp.b>> iVar3) {
        this.f27740a = iVar;
        this.b = iVar2;
        this.f27741c = iVar3;
    }

    public static l1 a(ft.i<qr.c> iVar, ft.i<yn.a> iVar2, ft.i<g.c<mp.b>> iVar3) {
        return new l1(iVar, iVar2, iVar3);
    }

    public static com.withpersona.sdk2.inquiry.ui.d c(qr.c cVar, yn.a aVar, g.c<mp.b> cVar2, String str, String str2, String str3, String str4) {
        return new com.withpersona.sdk2.inquiry.ui.d(cVar, aVar, cVar2, str, str2, str3, str4);
    }

    public com.withpersona.sdk2.inquiry.ui.d b(String str, String str2, String str3, String str4) {
        return c(this.f27740a.get(), this.b.get(), this.f27741c.get(), str, str2, str3, str4);
    }
}
