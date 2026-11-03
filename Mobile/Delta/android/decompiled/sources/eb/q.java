package eb;

/* JADX INFO: loaded from: classes.dex */
public final class q implements q0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile k f15968f = new k(p.f15938a);
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15970c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f15972e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f15971d = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15969a = "com.google.android.gms.fido";

    public q(String str, String str2, Object obj, l lVar, boolean z10) {
        this.b = str2;
        this.f15970c = obj;
        this.f15972e = lVar;
    }

    @Override // eb.q0
    public final Object zza() {
        f.a();
        synchronized (this) {
            f.b();
            n nVar = o.f15925a;
            throw null;
        }
    }
}
