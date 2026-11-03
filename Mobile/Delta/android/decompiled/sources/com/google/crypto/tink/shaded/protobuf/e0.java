package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f8502a;
    public p b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile s0 f8503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile h f8504d;

    public void a(s0 s0Var) {
        if (this.f8503c != null) {
            return;
        }
        synchronized (this) {
            if (this.f8503c != null) {
                return;
            }
            try {
                if (this.f8502a != null) {
                    this.f8503c = s0Var.h().b(this.f8502a, this.b);
                    this.f8504d = this.f8502a;
                } else {
                    this.f8503c = s0Var;
                    this.f8504d = h.b;
                }
            } catch (b0 unused) {
                this.f8503c = s0Var;
                this.f8504d = h.b;
            }
        }
    }

    public int b() {
        if (this.f8504d != null) {
            return this.f8504d.size();
        }
        h hVar = this.f8502a;
        if (hVar != null) {
            return hVar.size();
        }
        if (this.f8503c != null) {
            return this.f8503c.c();
        }
        return 0;
    }

    public s0 c(s0 s0Var) {
        a(s0Var);
        return this.f8503c;
    }

    public s0 d(s0 s0Var) {
        s0 s0Var2 = this.f8503c;
        this.f8502a = null;
        this.f8504d = null;
        this.f8503c = s0Var;
        return s0Var2;
    }

    public h e() {
        if (this.f8504d != null) {
            return this.f8504d;
        }
        h hVar = this.f8502a;
        if (hVar != null) {
            return hVar;
        }
        synchronized (this) {
            try {
                if (this.f8504d != null) {
                    return this.f8504d;
                }
                if (this.f8503c == null) {
                    this.f8504d = h.b;
                } else {
                    this.f8504d = this.f8503c.b();
                }
                return this.f8504d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
