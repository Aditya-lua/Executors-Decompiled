package p138fv;

/* JADX INFO: renamed from: fv.a */
/* JADX INFO: loaded from: classes2.dex */
public class RunnableC5838a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final C5846i f22240a = new C5846i();

    /* JADX INFO: renamed from: b */
    public final C5840c f22241b;

    public RunnableC5838a(C5840c c5840c) {
        this.f22241b = c5840c;
    }

    /* JADX INFO: renamed from: a */
    public void m26200a(C5851n c5851n, Object obj) {
        this.f22240a.m26224a(C5845h.m26222a(c5851n, obj));
        this.f22241b.m26207e().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        C5845h c5845hM26225b = this.f22240a.m26225b();
        if (c5845hM26225b == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f22241b.m26209g(c5845hM26225b);
    }
}
