package dn;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements dt.d<com.withpersona.sdk2.camera.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<oq.c> f15160a;

    public q(dt.i<oq.c> iVar) {
        this.f15160a = iVar;
    }

    public static q a(dt.i<oq.c> iVar) {
        return new q(iVar);
    }

    public static com.withpersona.sdk2.camera.b c(oq.c cVar) {
        return new com.withpersona.sdk2.camera.b(cVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.camera.b get() {
        return c(this.f15160a.get());
    }
}
