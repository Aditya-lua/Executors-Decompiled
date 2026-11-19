package dr;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements wt.d<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f12630a;

    public g(f fVar) {
        this.f12630a = fVar;
    }

    public static g a(f fVar) {
        return new g(fVar);
    }

    public static e b(f fVar) {
        return (e) wt.h.e(fVar.getExternalInquiryController());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e get() {
        return b(this.f12630a);
    }
}
