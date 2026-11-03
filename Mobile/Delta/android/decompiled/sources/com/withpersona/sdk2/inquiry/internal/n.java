package com.withpersona.sdk2.inquiry.internal;

import xo.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements m.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f11940a;

    public n(h0 h0Var) {
        this.f11940a = h0Var;
    }

    public static dt.i<m.a> a(h0 h0Var) {
        return dt.e.a(new n(h0Var));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.m.a
    public m create(String str) {
        return this.f11940a.b(str);
    }
}
