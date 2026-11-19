package es;

import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<g.d<aq.b>> f14661a;
    public final wt.i<gs.c> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<hn.w> f14662c;

    public y6(wt.i<g.d<aq.b>> iVar, wt.i<gs.c> iVar2, wt.i<hn.w> iVar3) {
        this.f14661a = iVar;
        this.b = iVar2;
        this.f14662c = iVar3;
    }

    public static y6 a(wt.i<g.d<aq.b>> iVar, wt.i<gs.c> iVar2, wt.i<hn.w> iVar3) {
        return new y6(iVar, iVar2, iVar3);
    }

    public static x6 c(g.d<aq.b> dVar, gs.c cVar, hn.w wVar, String str, String str2, String str3, String str4, Map<String, ? extends ComponentParam> map) {
        return new x6(dVar, cVar, wVar, str, str2, str3, str4, map);
    }

    public x6 b(String str, String str2, String str3, String str4, Map<String, ? extends ComponentParam> map) {
        return c(this.f14661a.get(), this.b.get(), this.f14662c.get(), str, str2, str3, str4, map);
    }
}
