package p306nb;

/* JADX INFO: renamed from: nb.xd */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9372xd extends C9308td {

    /* JADX INFO: renamed from: c */
    public boolean f33660c;

    public AbstractC9372xd(C9197me c9197me) {
        super(c9197me);
        this.f33516b.m36539e0();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m37066i() {
        return this.f33660c;
    }

    /* JADX INFO: renamed from: j */
    public final void m37067j() {
        if (!m37066i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m37068k() {
        if (this.f33660c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo36126l();
        this.f33516b.m36541f0();
        this.f33660c = true;
    }

    /* JADX INFO: renamed from: l */
    public abstract boolean mo36126l();
}
