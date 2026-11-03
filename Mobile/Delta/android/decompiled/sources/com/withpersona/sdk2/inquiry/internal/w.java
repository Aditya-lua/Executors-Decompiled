package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import xo.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f12180a;

    public w(p0 p0Var) {
        this.f12180a = p0Var;
    }

    public static dt.i<v.a> b(p0 p0Var) {
        return dt.e.a(new w(p0Var));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.v.a
    public v a(String str, String str2, InquirySessionConfig inquirySessionConfig) {
        return this.f12180a.b(str, str2, inquirySessionConfig);
    }
}
