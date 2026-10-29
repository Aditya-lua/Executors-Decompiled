package dp;

import com.withpersona.sdk2.inquiry.FallbackMode;
import um.w;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements ft.d<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<FallbackMode> f14796a;
    public final ft.i<a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<zo.h> f14797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<w> f14798d;

    public j(ft.i<FallbackMode> iVar, ft.i<a> iVar2, ft.i<zo.h> iVar3, ft.i<w> iVar4) {
        this.f14796a = iVar;
        this.b = iVar2;
        this.f14797c = iVar3;
        this.f14798d = iVar4;
    }

    public static j a(ft.i<FallbackMode> iVar, ft.i<a> iVar2, ft.i<zo.h> iVar3, ft.i<w> iVar4) {
        return new j(iVar, iVar2, iVar3, iVar4);
    }

    public static i c(FallbackMode fallbackMode, a aVar, zo.h hVar, w wVar) {
        return new i(fallbackMode, aVar, hVar, wVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f14796a.get(), this.b.get(), this.f14797c.get(), this.f14798d.get());
    }
}
