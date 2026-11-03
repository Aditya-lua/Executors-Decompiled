package mr;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<or.c> f25129a;
    public final dt.i<wn.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<g.c<kp.b>> f25130c;

    public l1(dt.i<or.c> iVar, dt.i<wn.a> iVar2, dt.i<g.c<kp.b>> iVar3) {
        this.f25129a = iVar;
        this.b = iVar2;
        this.f25130c = iVar3;
    }

    public static l1 a(dt.i<or.c> iVar, dt.i<wn.a> iVar2, dt.i<g.c<kp.b>> iVar3) {
        return new l1(iVar, iVar2, iVar3);
    }

    public static com.withpersona.sdk2.inquiry.ui.d c(or.c cVar, wn.a aVar, g.c<kp.b> cVar2, String str, String str2, String str3, String str4) {
        return new com.withpersona.sdk2.inquiry.ui.d(cVar, aVar, cVar2, str, str2, str3, str4);
    }

    public com.withpersona.sdk2.inquiry.ui.d b(String str, String str2, String str3, String str4) {
        return c(this.f25129a.get(), this.b.get(), this.f25130c.get(), str, str2, str3, str4);
    }
}
