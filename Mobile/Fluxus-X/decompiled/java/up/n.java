package up;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements wt.d<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.withpersona.sdk2.inquiry.internal.network.f f33822a;

    public n(com.withpersona.sdk2.inquiry.internal.network.f fVar) {
        this.f33822a = fVar;
    }

    public static n a(com.withpersona.sdk2.inquiry.internal.network.f fVar) {
        return new n(fVar);
    }

    public static boolean c(com.withpersona.sdk2.inquiry.internal.network.f fVar) {
        return fVar.getRedactAppIdentifyingInformation();
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c(this.f33822a));
    }
}
