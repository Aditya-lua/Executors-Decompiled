package gp;

import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements ft.d<FallbackModeService> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f18346a;
    public final ft.i<jv.y> b;

    public g(com.withpersona.sdk2.inquiry.internal.network.f fVar, ft.i<jv.y> iVar) {
        this.f18346a = fVar;
        this.b = iVar;
    }

    public static g a(com.withpersona.sdk2.inquiry.internal.network.f fVar, ft.i<jv.y> iVar) {
        return new g(fVar, iVar);
    }

    public static FallbackModeService b(com.withpersona.sdk2.inquiry.internal.network.f fVar, jv.y yVar) {
        return (FallbackModeService) ft.h.e(fVar.b(yVar));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public FallbackModeService get() {
        return b(this.f18346a, this.b.get());
    }
}
