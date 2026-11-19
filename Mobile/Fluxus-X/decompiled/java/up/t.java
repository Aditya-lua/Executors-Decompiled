package up;

import com.withpersona.sdk2.inquiry.network.upload.UploadService;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements wt.d<UploadService> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f33828a;
    public final wt.i<sw.y> b;

    public t(com.withpersona.sdk2.inquiry.internal.network.f fVar, wt.i<sw.y> iVar) {
        this.f33828a = fVar;
        this.b = iVar;
    }

    public static t a(com.withpersona.sdk2.inquiry.internal.network.f fVar, wt.i<sw.y> iVar) {
        return new t(fVar, iVar);
    }

    public static UploadService c(com.withpersona.sdk2.inquiry.internal.network.f fVar, sw.y yVar) {
        return (UploadService) wt.h.e(fVar.o(yVar));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public UploadService get() {
        return c(this.f33828a, this.b.get());
    }
}
