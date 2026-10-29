package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import com.withpersona.sdk2.inquiry.FieldMapping;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import fo.InterfaceC5720a;
import gp.InterfaceC6203w;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p136ft.InterfaceC5835i;
import p152go.C6159e;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C3717t {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<InterfaceC6203w> f15553a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<InterfaceC5720a> f15554b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<UiStepSavedStateHelper> f15555c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C6159e> f15556d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<Context> f15557e;

    public C3717t(InterfaceC5835i<InterfaceC6203w> interfaceC5835i, InterfaceC5835i<InterfaceC5720a> interfaceC5835i2, InterfaceC5835i<UiStepSavedStateHelper> interfaceC5835i3, InterfaceC5835i<C6159e> interfaceC5835i4, InterfaceC5835i<Context> interfaceC5835i5) {
        this.f15553a = interfaceC5835i;
        this.f15554b = interfaceC5835i2;
        this.f15555c = interfaceC5835i3;
        this.f15556d = interfaceC5835i4;
        this.f15557e = interfaceC5835i5;
    }

    /* JADX INFO: renamed from: a */
    public static C3717t m18808a(InterfaceC5835i<InterfaceC6203w> interfaceC5835i, InterfaceC5835i<InterfaceC5720a> interfaceC5835i2, InterfaceC5835i<UiStepSavedStateHelper> interfaceC5835i3, InterfaceC5835i<C6159e> interfaceC5835i4, InterfaceC5835i<Context> interfaceC5835i5) {
        return new C3717t(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5);
    }

    /* JADX INFO: renamed from: c */
    public static TransitionWorker m18809c(String str, @Nullable String str2, String str3, @Nullable String str4, List<FieldMapping> list, InquirySessionConfig inquirySessionConfig, TransitionWorker.TransitionData transitionData, InterfaceC6203w interfaceC6203w, InterfaceC5720a interfaceC5720a, UiStepSavedStateHelper uiStepSavedStateHelper, C6159e c6159e, Context context) {
        return new TransitionWorker(str, str2, str3, str4, list, inquirySessionConfig, transitionData, interfaceC6203w, interfaceC5720a, uiStepSavedStateHelper, c6159e, context);
    }

    /* JADX INFO: renamed from: b */
    public TransitionWorker m18810b(String str, @Nullable String str2, String str3, @Nullable String str4, List<FieldMapping> list, InquirySessionConfig inquirySessionConfig, TransitionWorker.TransitionData transitionData) {
        return m18809c(str, str2, str3, str4, list, inquirySessionConfig, transitionData, this.f15553a.get(), this.f15554b.get(), this.f15555c.get(), this.f15556d.get(), this.f15557e.get());
    }
}
