package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f2156a;
    public o b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile r0 f2157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile g f2158d;

    public void a(r0 r0Var) {
        if (this.f2157c != null) {
            return;
        }
        synchronized (this) {
            if (this.f2157c != null) {
                return;
            }
            try {
                if (this.f2156a != null) {
                    this.f2157c = r0Var.h().a(this.f2156a, this.b);
                    this.f2158d = this.f2156a;
                } else {
                    this.f2157c = r0Var;
                    this.f2158d = g.b;
                }
            } catch (a0 unused) {
                this.f2157c = r0Var;
                this.f2158d = g.b;
            }
        }
    }

    public int b() {
        if (this.f2158d != null) {
            return this.f2158d.size();
        }
        g gVar = this.f2156a;
        if (gVar != null) {
            return gVar.size();
        }
        if (this.f2157c != null) {
            return this.f2157c.c();
        }
        return 0;
    }

    public r0 c(r0 r0Var) {
        a(r0Var);
        return this.f2157c;
    }

    public r0 d(r0 r0Var) {
        r0 r0Var2 = this.f2157c;
        this.f2156a = null;
        this.f2158d = null;
        this.f2157c = r0Var;
        return r0Var2;
    }

    public g e() {
        if (this.f2158d != null) {
            return this.f2158d;
        }
        g gVar = this.f2156a;
        if (gVar != null) {
            return gVar;
        }
        synchronized (this) {
            try {
                if (this.f2158d != null) {
                    return this.f2158d;
                }
                if (this.f2157c == null) {
                    this.f2158d = g.b;
                } else {
                    this.f2158d = this.f2157c.b();
                }
                return this.f2158d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
