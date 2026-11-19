package com.withpersona.sdk2.inquiry.internal;

import np.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements p.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f10874a;

    public q(j0 j0Var) {
        this.f10874a = j0Var;
    }

    public static wt.i<p.a> a(j0 j0Var) {
        return wt.e.a(new q(j0Var));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.p.a
    public p create(String str) {
        return this.f10874a.b(str);
    }
}
