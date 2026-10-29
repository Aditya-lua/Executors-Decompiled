package nb;

/* JADX INFO: loaded from: classes.dex */
public abstract class b5 extends a4 {
    public boolean b;

    public b5(g7 g7Var) {
        super(g7Var);
        this.f25625a.k();
    }

    public final boolean i() {
        return this.b;
    }

    public final void j() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (m()) {
            return;
        }
        this.f25625a.l();
        this.b = true;
    }

    public final void l() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        n();
        this.f25625a.l();
        this.b = true;
    }

    public abstract boolean m();

    public void n() {
    }
}
