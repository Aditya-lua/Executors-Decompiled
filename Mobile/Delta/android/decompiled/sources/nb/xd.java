package nb;

/* JADX INFO: loaded from: classes.dex */
public abstract class xd extends td {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26113c;

    public xd(me meVar) {
        super(meVar);
        this.b.e0();
    }

    public final boolean i() {
        return this.f26113c;
    }

    public final void j() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.f26113c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        l();
        this.b.f0();
        this.f26113c = true;
    }

    public abstract boolean l();
}
