package z;

/* JADX INFO: loaded from: classes.dex */
public class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38621a = new Object();
    public final a0.c0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38622c;

    public t3(a0.c0 c0Var, int i10) {
        this.b = c0Var;
        this.f38622c = i10;
    }

    public int a() {
        int i10;
        synchronized (this.f38621a) {
            i10 = this.f38622c;
        }
        return i10;
    }

    public void b(int i10) {
        synchronized (this.f38621a) {
            this.f38622c = i10;
        }
    }
}
