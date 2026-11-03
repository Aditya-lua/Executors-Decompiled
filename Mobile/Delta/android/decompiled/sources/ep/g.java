package ep;

import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements dt.d<FallbackModeService> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f16244a;
    public final dt.i<hv.y> b;

    public g(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<hv.y> iVar) {
        this.f16244a = fVar;
        this.b = iVar;
    }

    public static g a(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<hv.y> iVar) {
        return new g(fVar, iVar);
    }

    public static FallbackModeService b(com.withpersona.sdk2.inquiry.internal.network.f fVar, hv.y yVar) {
        return (FallbackModeService) dt.h.e(fVar.b(yVar));
    }

    @Override // ft.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public FallbackModeService get() {
        return b(this.f16244a, this.b.get());
    }
}
