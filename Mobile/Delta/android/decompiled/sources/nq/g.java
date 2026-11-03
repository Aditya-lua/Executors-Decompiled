package nq;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements dt.d<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f27413a;

    public g(f fVar) {
        this.f27413a = fVar;
    }

    public static g a(f fVar) {
        return new g(fVar);
    }

    public static e b(f fVar) {
        return (e) dt.h.e(fVar.getExternalInquiryController());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e get() {
        return b(this.f27413a);
    }
}
