package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f8428a;
    public p b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile s0 f8429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile h f8430d;

    public void a(s0 s0Var) {
        if (this.f8429c != null) {
            return;
        }
        synchronized (this) {
            if (this.f8429c != null) {
                return;
            }
            try {
                if (this.f8428a != null) {
                    this.f8429c = s0Var.h().b(this.f8428a, this.b);
                    this.f8430d = this.f8428a;
                } else {
                    this.f8429c = s0Var;
                    this.f8430d = h.b;
                }
            } catch (b0 unused) {
                this.f8429c = s0Var;
                this.f8430d = h.b;
            }
        }
    }

    public int b() {
        if (this.f8430d != null) {
            return this.f8430d.size();
        }
        h hVar = this.f8428a;
        if (hVar != null) {
            return hVar.size();
        }
        if (this.f8429c != null) {
            return this.f8429c.c();
        }
        return 0;
    }

    public s0 c(s0 s0Var) {
        a(s0Var);
        return this.f8429c;
    }

    public s0 d(s0 s0Var) {
        s0 s0Var2 = this.f8429c;
        this.f8428a = null;
        this.f8430d = null;
        this.f8429c = s0Var;
        return s0Var2;
    }

    public h e() {
        if (this.f8430d != null) {
            return this.f8430d;
        }
        h hVar = this.f8428a;
        if (hVar != null) {
            return hVar;
        }
        synchronized (this) {
            try {
                if (this.f8430d != null) {
                    return this.f8430d;
                }
                if (this.f8429c == null) {
                    this.f8430d = h.b;
                } else {
                    this.f8430d = this.f8429c.b();
                }
                return this.f8430d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
