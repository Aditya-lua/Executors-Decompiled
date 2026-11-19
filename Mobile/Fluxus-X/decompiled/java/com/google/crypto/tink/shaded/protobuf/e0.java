package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f8342a;
    public p b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile s0 f8343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile h f8344d;

    public void a(s0 s0Var) {
        if (this.f8343c != null) {
            return;
        }
        synchronized (this) {
            if (this.f8343c != null) {
                return;
            }
            try {
                if (this.f8342a != null) {
                    this.f8343c = s0Var.i().b(this.f8342a, this.b);
                    this.f8344d = this.f8342a;
                } else {
                    this.f8343c = s0Var;
                    this.f8344d = h.b;
                }
            } catch (b0 unused) {
                this.f8343c = s0Var;
                this.f8344d = h.b;
            }
        }
    }

    public int b() {
        if (this.f8344d != null) {
            return this.f8344d.size();
        }
        h hVar = this.f8342a;
        if (hVar != null) {
            return hVar.size();
        }
        if (this.f8343c != null) {
            return this.f8343c.c();
        }
        return 0;
    }

    public s0 c(s0 s0Var) {
        a(s0Var);
        return this.f8343c;
    }

    public s0 d(s0 s0Var) {
        s0 s0Var2 = this.f8343c;
        this.f8342a = null;
        this.f8344d = null;
        this.f8343c = s0Var;
        return s0Var2;
    }

    public h e() {
        if (this.f8344d != null) {
            return this.f8344d;
        }
        h hVar = this.f8342a;
        if (hVar != null) {
            return hVar;
        }
        synchronized (this) {
            try {
                if (this.f8344d != null) {
                    return this.f8344d;
                }
                if (this.f8343c == null) {
                    this.f8344d = h.b;
                } else {
                    this.f8344d = this.f8343c.b();
                }
                return this.f8344d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
