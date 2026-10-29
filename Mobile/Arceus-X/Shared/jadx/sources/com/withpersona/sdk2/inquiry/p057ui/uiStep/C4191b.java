package com.withpersona.sdk2.inquiry.p057ui.uiStep;

import androidx.p616lifecycle.AbstractC0991x0;
import androidx.p616lifecycle.C0949d0;
import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.p057ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu.C9578i0;
import nu.InterfaceC9564b0;
import org.jetbrains.annotations.NotNull;
import p421rr.C11091g1;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.uiStep.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001)B%\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R*\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u0017\u0010(\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001a\u0010'¨\u0006*"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/uiStep/b;", "Landroidx/lifecycle/x0;", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "initialInput", "Lrr/g1$e;", "uiStepStateManagerFactory", "<init>", "(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lrr/g1$e;)V", "", "d", "()V", "input", "f", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;)V", "b", "Landroidx/lifecycle/l0;", "c", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "Lnu/b0;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "Lnu/b0;", "_result", "Landroidx/lifecycle/d0;", "", "e", "Landroidx/lifecycle/d0;", "getInquiryId", "()Landroidx/lifecycle/d0;", "setInquiryId", "(Landroidx/lifecycle/d0;)V", "inquiryId", "getSessionToken", "setSessionToken", "sessionToken", "Lrr/g1;", "g", "Lrr/g1;", "()Lrr/g1;", "uiStepStateManager", "a", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4191b extends AbstractC0991x0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C0967l0 savedStateHandle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final UiWorkflow.Input initialInput;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9564b0<UiWorkflow.InterfaceC4141b> _result;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public C0949d0<String> inquiryId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public C0949d0<String> sessionToken;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C11091g1 uiStepStateManager;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.uiStep.b$a */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/uiStep/b$a;", "", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "initialInput", "Lcom/withpersona/sdk2/inquiry/ui/uiStep/b;", "a", "(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/ui/uiStep/b;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C4191b mo21676a(@NotNull C0967l0 savedStateHandle, @NotNull UiWorkflow.Input initialInput);
    }

    public C4191b(@NotNull C0967l0 savedStateHandle, @NotNull UiWorkflow.Input initialInput, @NotNull C11091g1.e uiStepStateManagerFactory) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(initialInput, "initialInput");
        Intrinsics.checkNotNullParameter(uiStepStateManagerFactory, "uiStepStateManagerFactory");
        this.savedStateHandle = savedStateHandle;
        this.initialInput = initialInput;
        this._result = C9578i0.m37758b(0, 0, null, 7, null);
        this.inquiryId = savedStateHandle.m4948c("inquiry_id", null);
        this.sessionToken = savedStateHandle.m4948c(RealTrackingEventsLogger.KEY_SESSION_TOKEN, null);
        this.uiStepStateManager = uiStepStateManagerFactory.mo41888a(initialInput, savedStateHandle);
    }

    @Override // androidx.p616lifecycle.AbstractC0991x0
    /* JADX INFO: renamed from: d */
    public void mo5012d() {
        this.uiStepStateManager.m41880l0();
        super.mo5012d();
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final C11091g1 getUiStepStateManager() {
        return this.uiStepStateManager;
    }

    /* JADX INFO: renamed from: f */
    public final void m21675f(@NotNull UiWorkflow.Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.uiStepStateManager.m45395b().setValue(input);
    }
}
