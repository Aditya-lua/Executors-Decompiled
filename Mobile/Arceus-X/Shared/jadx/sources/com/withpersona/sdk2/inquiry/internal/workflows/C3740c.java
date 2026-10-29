package com.withpersona.sdk2.inquiry.internal.workflows;

import androidx.p616lifecycle.AbstractC0991x0;
import androidx.p616lifecycle.C0949d0;
import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props;
import com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu.C9578i0;
import nu.InterfaceC9564b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p177hp.C6491e0;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.workflows.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001'B\u001b\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R*\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u0018\u0010&\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/workflows/c;", "Landroidx/lifecycle/x0;", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lhp/e0$b;", "inquiryStateManagerFactory", "<init>", "(Landroidx/lifecycle/l0;Lhp/e0$b;)V", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;", "props", "Lhp/e0;", "e", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;)Lhp/e0;", "", "d", "()V", "b", "Landroidx/lifecycle/l0;", "c", "Lhp/e0$b;", "Lnu/b0;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "Lnu/b0;", "_result", "Landroidx/lifecycle/d0;", "", "Landroidx/lifecycle/d0;", "getInquiryId", "()Landroidx/lifecycle/d0;", "setInquiryId", "(Landroidx/lifecycle/d0;)V", "inquiryId", "f", "getSessionToken", "setSessionToken", "sessionToken", "g", "Lhp/e0;", "inquiryStateManager", "a", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3740c extends AbstractC0991x0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C0967l0 savedStateHandle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C6491e0.b inquiryStateManagerFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9564b0<InquiryWorkflow$Output> _result;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public C0949d0<String> inquiryId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public C0949d0<String> sessionToken;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public C6491e0 inquiryStateManager;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.workflows.c$a */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/workflows/c$a;", "", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/internal/workflows/c;", "a", "(Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/internal/workflows/c;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C3740c mo18867a(@NotNull C0967l0 savedStateHandle);
    }

    public C3740c(@NotNull C0967l0 savedStateHandle, @NotNull C6491e0.b inquiryStateManagerFactory) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(inquiryStateManagerFactory, "inquiryStateManagerFactory");
        this.savedStateHandle = savedStateHandle;
        this.inquiryStateManagerFactory = inquiryStateManagerFactory;
        this._result = C9578i0.m37758b(0, 0, null, 7, null);
        this.inquiryId = savedStateHandle.m4948c("inquiry_id", null);
        this.sessionToken = savedStateHandle.m4948c(RealTrackingEventsLogger.KEY_SESSION_TOKEN, null);
    }

    @Override // androidx.p616lifecycle.AbstractC0991x0
    /* JADX INFO: renamed from: d */
    public void mo5012d() {
        C6491e0 c6491e0 = this.inquiryStateManager;
        if (c6491e0 != null) {
            c6491e0.m28300L();
        }
        super.mo5012d();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final C6491e0 m18866e(@NotNull InquiryWorkflow$Props props) {
        Intrinsics.checkNotNullParameter(props, "props");
        C6491e0 c6491e0 = this.inquiryStateManager;
        if (c6491e0 != null) {
            return c6491e0;
        }
        C6491e0 c6491e0Mo28320a = this.inquiryStateManagerFactory.mo28320a(props, this.savedStateHandle);
        this.inquiryStateManager = c6491e0Mo28320a;
        return c6491e0Mo28320a;
    }
}
