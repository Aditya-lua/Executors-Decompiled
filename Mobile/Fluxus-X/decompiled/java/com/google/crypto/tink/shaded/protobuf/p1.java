package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public class p1 extends n1<o1, o1> {
    @Override // com.google.crypto.tink.shaded.protobuf.n1
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public o1 g(Object obj) {
        return ((y) obj).unknownFields;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(o1 o1Var) {
        return o1Var.d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(o1 o1Var) {
        return o1Var.e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public o1 k(o1 o1Var, o1 o1Var2) {
        if (o1.c().equals(o1Var2)) {
            return o1Var;
        }
        return o1.c().equals(o1Var) ? o1.j(o1Var, o1Var2) : o1Var.i(o1Var2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public o1 n() {
        return o1.k();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, o1 o1Var) {
        p(obj, o1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, o1 o1Var) {
        ((y) obj).unknownFields = o1Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public o1 r(o1 o1Var) {
        o1Var.h();
        return o1Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(o1 o1Var, t1 t1Var) {
        o1Var.p(t1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(o1 o1Var, t1 t1Var) {
        o1Var.r(t1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    public void j(Object obj) {
        g(obj).h();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    public boolean q(f1 f1Var) {
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(o1 o1Var, int i10, int i11) {
        o1Var.n(s1.c(i10, 5), Integer.valueOf(i11));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(o1 o1Var, int i10, long j10) {
        o1Var.n(s1.c(i10, 1), Long.valueOf(j10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(o1 o1Var, int i10, o1 o1Var2) {
        o1Var.n(s1.c(i10, 3), o1Var2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(o1 o1Var, int i10, h hVar) {
        o1Var.n(s1.c(i10, 2), hVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(o1 o1Var, int i10, long j10) {
        o1Var.n(s1.c(i10, 0), Long.valueOf(j10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public o1 f(Object obj) {
        o1 o1VarG = g(obj);
        if (o1VarG != o1.c()) {
            return o1VarG;
        }
        o1 o1VarK = o1.k();
        p(obj, o1VarK);
        return o1VarK;
    }
}
