package bp;

import com.withpersona.sdk2.inquiry.FallbackMode;
import sm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements dt.d<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<FallbackMode> f4390a;
    public final dt.i<a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<xo.h> f4391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<w> f4392d;

    public j(dt.i<FallbackMode> iVar, dt.i<a> iVar2, dt.i<xo.h> iVar3, dt.i<w> iVar4) {
        this.f4390a = iVar;
        this.b = iVar2;
        this.f4391c = iVar3;
        this.f4392d = iVar4;
    }

    public static j a(dt.i<FallbackMode> iVar, dt.i<a> iVar2, dt.i<xo.h> iVar3, dt.i<w> iVar4) {
        return new j(iVar, iVar2, iVar3, iVar4);
    }

    public static i c(FallbackMode fallbackMode, a aVar, xo.h hVar, w wVar) {
        return new i(fallbackMode, aVar, hVar, wVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f4390a.get(), this.b.get(), this.f4391c.get(), this.f4392d.get());
    }
}
