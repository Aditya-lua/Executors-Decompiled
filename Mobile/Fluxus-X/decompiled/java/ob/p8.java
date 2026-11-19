package ob;

/* JADX INFO: loaded from: classes.dex */
public abstract class p8 extends o8 {
    public boolean b;

    public p8(l7 l7Var) {
        super(l7Var);
        this.f27641a.k();
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
        this.f27641a.l();
        this.b = true;
    }

    public final void n() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        j();
        this.f27641a.l();
        this.b = true;
    }
}
