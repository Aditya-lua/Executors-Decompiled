package nb;

/* JADX INFO: loaded from: classes.dex */
public abstract class k8 extends j8 {
    public boolean b;

    public k8(g7 g7Var) {
        super(g7Var);
        this.f25625a.k();
    }

    public abstract boolean i();

    public void j() {
    }

    public final boolean k() {
        return this.b;
    }

    public final void l() {
        if (!k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void m() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (i()) {
            return;
        }
        this.f25625a.l();
        this.b = true;
    }

    public final void n() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        j();
        this.f25625a.l();
        this.b = true;
    }
}
