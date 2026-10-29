package p306nb;

/* JADX INFO: renamed from: nb.b5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9008b5 extends C8990a4 {

    /* JADX INFO: renamed from: b */
    public boolean f32715b;

    public AbstractC9008b5(C9094g7 c9094g7) {
        super(c9094g7);
        this.f33067a.m36331k();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m36120i() {
        return this.f32715b;
    }

    /* JADX INFO: renamed from: j */
    public final void m36121j() {
        if (!m36120i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m36122k() {
        if (this.f32715b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo36124m()) {
            return;
        }
        this.f33067a.m36332l();
        this.f32715b = true;
    }

    /* JADX INFO: renamed from: l */
    public final void m36123l() {
        if (this.f32715b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo36125n();
        this.f33067a.m36332l();
        this.f32715b = true;
    }

    /* JADX INFO: renamed from: m */
    public abstract boolean mo36124m();

    /* JADX INFO: renamed from: n */
    public void mo36125n() {
    }
}
