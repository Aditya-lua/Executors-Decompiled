package pq;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements ft.d<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f28819a;

    public g(f fVar) {
        this.f28819a = fVar;
    }

    public static g a(f fVar) {
        return new g(fVar);
    }

    public static e b(f fVar) {
        return (e) ft.h.e(fVar.getExternalInquiryController());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e get() {
        return b(this.f28819a);
    }
}
