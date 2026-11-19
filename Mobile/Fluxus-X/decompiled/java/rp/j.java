package rp;

import com.withpersona.sdk2.inquiry.FallbackMode;
import hn.w;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements wt.d<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<FallbackMode> f30868a;
    public final wt.i<a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<np.h> f30869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<w> f30870d;

    public j(wt.i<FallbackMode> iVar, wt.i<a> iVar2, wt.i<np.h> iVar3, wt.i<w> iVar4) {
        this.f30868a = iVar;
        this.b = iVar2;
        this.f30869c = iVar3;
        this.f30870d = iVar4;
    }

    public static j a(wt.i<FallbackMode> iVar, wt.i<a> iVar2, wt.i<np.h> iVar3, wt.i<w> iVar4) {
        return new j(iVar, iVar2, iVar3, iVar4);
    }

    public static i c(FallbackMode fallbackMode, a aVar, np.h hVar, w wVar) {
        return new i(fallbackMode, aVar, hVar, wVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f30868a.get(), this.b.get(), this.f30869c.get(), this.f30870d.get());
    }
}
