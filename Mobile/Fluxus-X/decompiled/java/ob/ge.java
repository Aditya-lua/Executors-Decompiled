package ob;

/* JADX INFO: loaded from: classes.dex */
public abstract class ge extends zd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27363c;

    public ge(ve veVar) {
        super(veVar);
        this.b.e0();
    }

    public final boolean i() {
        return this.f27363c;
    }

    public final void j() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.f27363c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        l();
        this.b.f0();
        this.f27363c = true;
    }

    public abstract boolean l();
}
