package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f2001a;
    public o b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile r0 f2002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile g f2003d;

    public void a(r0 r0Var) {
        if (this.f2002c != null) {
            return;
        }
        synchronized (this) {
            if (this.f2002c != null) {
                return;
            }
            try {
                if (this.f2001a != null) {
                    this.f2002c = r0Var.h().a(this.f2001a, this.b);
                    this.f2003d = this.f2001a;
                } else {
                    this.f2002c = r0Var;
                    this.f2003d = g.b;
                }
            } catch (a0 unused) {
                this.f2002c = r0Var;
                this.f2003d = g.b;
            }
        }
    }

    public int b() {
        if (this.f2003d != null) {
            return this.f2003d.size();
        }
        g gVar = this.f2001a;
        if (gVar != null) {
            return gVar.size();
        }
        if (this.f2002c != null) {
            return this.f2002c.c();
        }
        return 0;
    }

    public r0 c(r0 r0Var) {
        a(r0Var);
        return this.f2002c;
    }

    public r0 d(r0 r0Var) {
        r0 r0Var2 = this.f2002c;
        this.f2001a = null;
        this.f2003d = null;
        this.f2002c = r0Var;
        return r0Var2;
    }

    public g e() {
        if (this.f2003d != null) {
            return this.f2003d;
        }
        g gVar = this.f2001a;
        if (gVar != null) {
            return gVar;
        }
        synchronized (this) {
            try {
                if (this.f2003d != null) {
                    return this.f2003d;
                }
                if (this.f2002c == null) {
                    this.f2003d = g.b;
                } else {
                    this.f2003d = this.f2002c.b();
                }
                return this.f2003d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
