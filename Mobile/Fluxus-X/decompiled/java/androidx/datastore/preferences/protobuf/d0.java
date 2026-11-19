package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f1962a;
    public o b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile r0 f1963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile g f1964d;

    public void a(r0 r0Var) {
        if (this.f1963c != null) {
            return;
        }
        synchronized (this) {
            if (this.f1963c != null) {
                return;
            }
            try {
                if (this.f1962a != null) {
                    this.f1963c = r0Var.i().a(this.f1962a, this.b);
                    this.f1964d = this.f1962a;
                } else {
                    this.f1963c = r0Var;
                    this.f1964d = g.b;
                }
            } catch (a0 unused) {
                this.f1963c = r0Var;
                this.f1964d = g.b;
            }
        }
    }

    public int b() {
        if (this.f1964d != null) {
            return this.f1964d.size();
        }
        g gVar = this.f1962a;
        if (gVar != null) {
            return gVar.size();
        }
        if (this.f1963c != null) {
            return this.f1963c.c();
        }
        return 0;
    }

    public r0 c(r0 r0Var) {
        a(r0Var);
        return this.f1963c;
    }

    public r0 d(r0 r0Var) {
        r0 r0Var2 = this.f1963c;
        this.f1962a = null;
        this.f1964d = null;
        this.f1963c = r0Var;
        return r0Var2;
    }

    public g e() {
        if (this.f1964d != null) {
            return this.f1964d;
        }
        g gVar = this.f1962a;
        if (gVar != null) {
            return gVar;
        }
        synchronized (this) {
            try {
                if (this.f1964d != null) {
                    return this.f1964d;
                }
                if (this.f1963c == null) {
                    this.f1964d = g.b;
                } else {
                    this.f1964d = this.f1963c.b();
                }
                return this.f1964d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
