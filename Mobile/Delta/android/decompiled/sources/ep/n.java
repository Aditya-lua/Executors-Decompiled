package ep;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements dt.d<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f16251a;

    public n(com.withpersona.sdk2.inquiry.internal.network.f fVar) {
        this.f16251a = fVar;
    }

    public static n a(com.withpersona.sdk2.inquiry.internal.network.f fVar) {
        return new n(fVar);
    }

    public static boolean c(com.withpersona.sdk2.inquiry.internal.network.f fVar) {
        return fVar.getRedactAppIdentifyingInformation();
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c(this.f16251a));
    }
}
