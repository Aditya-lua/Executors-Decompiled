package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import com.withpersona.sdk2.inquiry.FieldMapping;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<ep.w> f12164a;
    public final dt.i<co.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<UiStepSavedStateHelper> f12165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<eo.e> f12166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dt.i<Context> f12167e;

    public t(dt.i<ep.w> iVar, dt.i<co.a> iVar2, dt.i<UiStepSavedStateHelper> iVar3, dt.i<eo.e> iVar4, dt.i<Context> iVar5) {
        this.f12164a = iVar;
        this.b = iVar2;
        this.f12165c = iVar3;
        this.f12166d = iVar4;
        this.f12167e = iVar5;
    }

    public static t a(dt.i<ep.w> iVar, dt.i<co.a> iVar2, dt.i<UiStepSavedStateHelper> iVar3, dt.i<eo.e> iVar4, dt.i<Context> iVar5) {
        return new t(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static TransitionWorker c(String str, @Nullable String str2, String str3, @Nullable String str4, List<FieldMapping> list, InquirySessionConfig inquirySessionConfig, TransitionWorker.TransitionData transitionData, ep.w wVar, co.a aVar, UiStepSavedStateHelper uiStepSavedStateHelper, eo.e eVar, Context context) {
        return new TransitionWorker(str, str2, str3, str4, list, inquirySessionConfig, transitionData, wVar, aVar, uiStepSavedStateHelper, eVar, context);
    }

    public TransitionWorker b(String str, @Nullable String str2, String str3, @Nullable String str4, List<FieldMapping> list, InquirySessionConfig inquirySessionConfig, TransitionWorker.TransitionData transitionData) {
        return c(str, str2, str3, str4, list, inquirySessionConfig, transitionData, this.f12164a.get(), this.b.get(), this.f12165c.get(), this.f12166d.get(), this.f12167e.get());
    }
}
