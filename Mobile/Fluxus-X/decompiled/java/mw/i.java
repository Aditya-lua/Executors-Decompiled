package mw;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f24856a;
    public h b;

    public synchronized void a(h hVar) {
        try {
            if (hVar == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            h hVar2 = this.b;
            if (hVar2 != null) {
                hVar2.f24855c = hVar;
                this.b = hVar;
            } else {
                if (this.f24856a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.b = hVar;
                this.f24856a = hVar;
            }
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized h b() {
        h hVar;
        hVar = this.f24856a;
        if (hVar != null) {
            h hVar2 = hVar.f24855c;
            this.f24856a = hVar2;
            if (hVar2 == null) {
                this.b = null;
            }
        }
        return hVar;
    }

    public synchronized h c(int i10) {
        try {
            if (this.f24856a == null) {
                wait(i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return b();
    }
}
