package com.withpersona.sdk2.inquiry.internal;

import hr.InquirySessionConfig;
import np.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f10090a;

    public b0(s0 s0Var) {
        this.f10090a = s0Var;
    }

    public static wt.i<a0.a> b(s0 s0Var) {
        return wt.e.a(new b0(s0Var));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.a0.a
    public a0 a(String str, String str2, InquirySessionConfig inquirySessionConfig) {
        return this.f10090a.b(str, str2, inquirySessionConfig);
    }
}
