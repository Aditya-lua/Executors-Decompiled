package ob;

/* JADX INFO: loaded from: classes.dex */
public abstract class g5 extends f4 {
    public boolean b;

    public g5(l7 l7Var) {
        super(l7Var);
        this.f27641a.k();
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
        this.f27641a.l();
        this.b = true;
    }

    public final void l() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        n();
        this.f27641a.l();
        this.b = true;
    }

    public abstract boolean m();

    public void n() {
    }
}
