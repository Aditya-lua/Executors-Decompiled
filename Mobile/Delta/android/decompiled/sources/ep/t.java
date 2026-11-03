package ep;

import com.withpersona.sdk2.inquiry.network.upload.UploadService;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements dt.d<UploadService> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f16257a;
    public final dt.i<hv.y> b;

    public t(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<hv.y> iVar) {
        this.f16257a = fVar;
        this.b = iVar;
    }

    public static t a(com.withpersona.sdk2.inquiry.internal.network.f fVar, dt.i<hv.y> iVar) {
        return new t(fVar, iVar);
    }

    public static UploadService c(com.withpersona.sdk2.inquiry.internal.network.f fVar, hv.y yVar) {
        return (UploadService) dt.h.e(fVar.o(yVar));
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public UploadService get() {
        return c(this.f16257a, this.b.get());
    }
}
