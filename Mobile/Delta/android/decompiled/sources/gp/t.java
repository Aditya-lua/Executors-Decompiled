package gp;

import com.withpersona.sdk2.inquiry.network.upload.UploadService;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements ft.d<UploadService> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f18359a;
    public final ft.i<jv.y> b;

    public t(com.withpersona.sdk2.inquiry.internal.network.f fVar, ft.i<jv.y> iVar) {
        this.f18359a = fVar;
        this.b = iVar;
    }

    public static t a(com.withpersona.sdk2.inquiry.internal.network.f fVar, ft.i<jv.y> iVar) {
        return new t(fVar, iVar);
    }

    public static UploadService c(com.withpersona.sdk2.inquiry.internal.network.f fVar, jv.y yVar) {
        return (UploadService) ft.h.e(fVar.o(yVar));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public UploadService get() {
        return c(this.f18359a, this.b.get());
    }
}
