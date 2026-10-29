package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.FieldMapping;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements TransitionWorker.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f12087a;

    public u(t tVar) {
        this.f12087a = tVar;
    }

    public static ft.i<TransitionWorker.a> b(t tVar) {
        return ft.e.a(new u(tVar));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.TransitionWorker.a
    public TransitionWorker a(String str, @Nullable String str2, String str3, @Nullable String str4, List<FieldMapping> list, InquirySessionConfig inquirySessionConfig, TransitionWorker.TransitionData transitionData) {
        return this.f12087a.b(str, str2, str3, str4, list, inquirySessionConfig, transitionData);
    }
}
