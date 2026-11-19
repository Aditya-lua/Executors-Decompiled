package up;

import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements wt.d<FallbackModeService> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f33815a;
    public final wt.i<sw.y> b;

    public g(com.withpersona.sdk2.inquiry.internal.network.f fVar, wt.i<sw.y> iVar) {
        this.f33815a = fVar;
        this.b = iVar;
    }

    public static g a(com.withpersona.sdk2.inquiry.internal.network.f fVar, wt.i<sw.y> iVar) {
        return new g(fVar, iVar);
    }

    public static FallbackModeService b(com.withpersona.sdk2.inquiry.internal.network.f fVar, sw.y yVar) {
        return (FallbackModeService) wt.h.e(fVar.b(yVar));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public FallbackModeService get() {
        return b(this.f33815a, this.b.get());
    }
}
