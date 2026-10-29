package b1;

import n0.a0;
import n0.b0;
import n0.c0;
import n0.d0;
import n0.e0;
import n0.x;
import n0.y;
import n0.z;
import n0.z3;

/* JADX INFO: loaded from: classes.dex */
public class l implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f3818a;
    public final z3 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3819c;

    public l(z3 z3Var, e0 e0Var) {
        this(e0Var, z3Var, -1L);
    }

    @Override // n0.e0
    public d0 b() {
        e0 e0Var = this.f3818a;
        return e0Var != null ? e0Var.b() : d0.UNKNOWN;
    }

    @Override // n0.e0
    public z3 c() {
        return this.b;
    }

    @Override // n0.e0
    public b0 d() {
        e0 e0Var = this.f3818a;
        return e0Var != null ? e0Var.d() : b0.UNKNOWN;
    }

    @Override // n0.e0
    public x f() {
        e0 e0Var = this.f3818a;
        return e0Var != null ? e0Var.f() : x.UNKNOWN;
    }

    @Override // n0.e0
    public a0 g() {
        e0 e0Var = this.f3818a;
        return e0Var != null ? e0Var.g() : a0.UNKNOWN;
    }

    @Override // n0.e0
    public long getTimestamp() {
        e0 e0Var = this.f3818a;
        if (e0Var != null) {
            return e0Var.getTimestamp();
        }
        long j10 = this.f3819c;
        if (j10 != -1) {
            return j10;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // n0.e0
    public c0 h() {
        e0 e0Var = this.f3818a;
        return e0Var != null ? e0Var.h() : c0.UNKNOWN;
    }

    @Override // n0.e0
    public z i() {
        e0 e0Var = this.f3818a;
        return e0Var != null ? e0Var.i() : z.UNKNOWN;
    }

    @Override // n0.e0
    public y j() {
        e0 e0Var = this.f3818a;
        return e0Var != null ? e0Var.j() : y.UNKNOWN;
    }

    public l(z3 z3Var, long j10) {
        this(null, z3Var, j10);
    }

    public l(e0 e0Var, z3 z3Var, long j10) {
        this.f3818a = e0Var;
        this.b = z3Var;
        this.f3819c = j10;
    }
}
