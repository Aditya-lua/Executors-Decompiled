package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import org.jetbrains.annotations.Nullable;
import zo.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements r.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f12082a;

    public s(n0 n0Var) {
        this.f12082a = n0Var;
    }

    public static ft.i<r.a> b(n0 n0Var) {
        return ft.e.a(new s(n0Var));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.r.a
    public r a(String str, @Nullable String str2, String str3, String str4, InquirySessionConfig inquirySessionConfig) {
        return this.f12082a.b(str, str2, str3, str4, inquirySessionConfig);
    }
}
