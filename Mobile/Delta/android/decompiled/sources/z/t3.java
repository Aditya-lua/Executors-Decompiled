package z;

/* JADX INFO: loaded from: classes.dex */
public class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37516a = new Object();
    public final a0.c0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37517c;

    public t3(a0.c0 c0Var, int i10) {
        this.b = c0Var;
        this.f37517c = i10;
    }

    public int a() {
        int i10;
        synchronized (this.f37516a) {
            i10 = this.f37517c;
        }
        return i10;
    }

    public void b(int i10) {
        synchronized (this.f37516a) {
            this.f37517c = i10;
        }
    }
}
