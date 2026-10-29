package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import com.withpersona.sdk2.inquiry.FieldMapping;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<gp.w> f12083a;
    public final ft.i<fo.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<UiStepSavedStateHelper> f12084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<go.e> f12085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.i<Context> f12086e;

    public t(ft.i<gp.w> iVar, ft.i<fo.a> iVar2, ft.i<UiStepSavedStateHelper> iVar3, ft.i<go.e> iVar4, ft.i<Context> iVar5) {
        this.f12083a = iVar;
        this.b = iVar2;
        this.f12084c = iVar3;
        this.f12085d = iVar4;
        this.f12086e = iVar5;
    }

    public static t a(ft.i<gp.w> iVar, ft.i<fo.a> iVar2, ft.i<UiStepSavedStateHelper> iVar3, ft.i<go.e> iVar4, ft.i<Context> iVar5) {
        return new t(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static TransitionWorker c(String str, @Nullable String str2, String str3, @Nullable String str4, List<FieldMapping> list, InquirySessionConfig inquirySessionConfig, TransitionWorker.TransitionData transitionData, gp.w wVar, fo.a aVar, UiStepSavedStateHelper uiStepSavedStateHelper, go.e eVar, Context context) {
        return new TransitionWorker(str, str2, str3, str4, list, inquirySessionConfig, transitionData, wVar, aVar, uiStepSavedStateHelper, eVar, context);
    }

    public TransitionWorker b(String str, @Nullable String str2, String str3, @Nullable String str4, List<FieldMapping> list, InquirySessionConfig inquirySessionConfig, TransitionWorker.TransitionData transitionData) {
        return c(str, str2, str3, str4, list, inquirySessionConfig, transitionData, this.f12083a.get(), this.b.get(), this.f12084c.get(), this.f12085d.get(), this.f12086e.get());
    }
}
