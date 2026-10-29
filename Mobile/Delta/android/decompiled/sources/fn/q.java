package fn;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements ft.d<com.withpersona.sdk2.camera.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<qq.c> f16964a;

    public q(ft.i<qq.c> iVar) {
        this.f16964a = iVar;
    }

    public static q a(ft.i<qq.c> iVar) {
        return new q(iVar);
    }

    public static com.withpersona.sdk2.camera.b c(qq.c cVar) {
        return new com.withpersona.sdk2.camera.b(cVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.camera.b get() {
        return c(this.f16964a.get());
    }
}
