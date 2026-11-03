package dv;

/* JADX INFO: loaded from: classes2.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f15429a = new i();
    public final c b;

    public a(c cVar) {
        this.b = cVar;
    }

    public void a(n nVar, Object obj) {
        this.f15429a.a(h.a(nVar, obj));
        this.b.e().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        h hVarB = this.f15429a.b();
        if (hVarB == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.b.g(hVarB);
    }
}
