package or;

import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<g.c<mp.b>> f27735a;
    public final ft.i<qr.c> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<um.w> f27736c;

    public k6(ft.i<g.c<mp.b>> iVar, ft.i<qr.c> iVar2, ft.i<um.w> iVar3) {
        this.f27735a = iVar;
        this.b = iVar2;
        this.f27736c = iVar3;
    }

    public static k6 a(ft.i<g.c<mp.b>> iVar, ft.i<qr.c> iVar2, ft.i<um.w> iVar3) {
        return new k6(iVar, iVar2, iVar3);
    }

    public static com.withpersona.sdk2.inquiry.ui.k c(g.c<mp.b> cVar, qr.c cVar2, um.w wVar, String str, String str2, String str3, String str4, Map<String, ? extends ComponentParam> map) {
        return new com.withpersona.sdk2.inquiry.ui.k(cVar, cVar2, wVar, str, str2, str3, str4, map);
    }

    public com.withpersona.sdk2.inquiry.ui.k b(String str, String str2, String str3, String str4, Map<String, ? extends ComponentParam> map) {
        return c(this.f27735a.get(), this.b.get(), this.f27736c.get(), str, str2, str3, str4, map);
    }
}
