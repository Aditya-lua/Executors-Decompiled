package p306nb;

/* JADX INFO: renamed from: nb.k8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9159k8 extends C9143j8 {

    /* JADX INFO: renamed from: b */
    public boolean f33144b;

    public AbstractC9159k8(C9094g7 c9094g7) {
        super(c9094g7);
        this.f33067a.m36331k();
    }

    /* JADX INFO: renamed from: i */
    public abstract boolean mo36257i();

    /* JADX INFO: renamed from: j */
    public void mo36441j() {
    }

    /* JADX INFO: renamed from: k */
    public final boolean m36454k() {
        return this.f33144b;
    }

    /* JADX INFO: renamed from: l */
    public final void m36455l() {
        if (!m36454k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m36456m() {
        if (this.f33144b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo36257i()) {
            return;
        }
        this.f33067a.m36332l();
        this.f33144b = true;
    }

    /* JADX INFO: renamed from: n */
    public final void m36457n() {
        if (this.f33144b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo36441j();
        this.f33067a.m36332l();
        this.f33144b = true;
    }
}
