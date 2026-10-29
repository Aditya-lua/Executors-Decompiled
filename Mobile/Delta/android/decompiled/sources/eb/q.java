package eb;

/* JADX INFO: loaded from: classes.dex */
public final class q implements q0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile k f15354f = new k(p.f15324a);
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15356c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f15358e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f15357d = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15355a = "com.google.android.gms.fido";

    public q(String str, String str2, Object obj, l lVar, boolean z10) {
        this.b = str2;
        this.f15356c = obj;
        this.f15358e = lVar;
    }

    @Override // eb.q0
    public final Object zza() {
        f.a();
        synchronized (this) {
            f.b();
            n nVar = o.f15311a;
            throw null;
        }
    }
}
