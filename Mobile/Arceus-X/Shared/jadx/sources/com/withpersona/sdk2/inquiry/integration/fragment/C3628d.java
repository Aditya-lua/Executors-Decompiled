package com.withpersona.sdk2.inquiry.integration.fragment;

import androidx.p616lifecycle.AbstractC0991x0;
import androidx.p616lifecycle.C0949d0;
import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu.C9578i0;
import nu.InterfaceC9564b0;
import nu.InterfaceC9566c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.fragment.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001*B\u001b\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R*\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR(\u0010)\u001a\u0004\u0018\u00010\n2\b\u0010$\u001a\u0004\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/fragment/d;", "Landroidx/lifecycle/x0;", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/integration/fragment/b$c;", "integrationStepStateManagerFactory", "<init>", "(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/integration/fragment/b$c;)V", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;", "input", "Lcom/withpersona/sdk2/inquiry/integration/fragment/b;", "e", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/integration/fragment/b;", "", "f", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;)V", "b", "Landroidx/lifecycle/l0;", "c", "Lcom/withpersona/sdk2/inquiry/integration/fragment/b$c;", "Lnu/b0;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "d", "Lnu/b0;", "_result", "Landroidx/lifecycle/d0;", "", "Landroidx/lifecycle/d0;", "getInquiryId", "()Landroidx/lifecycle/d0;", "setInquiryId", "(Landroidx/lifecycle/d0;)V", "inquiryId", "getSessionToken", "setSessionToken", "sessionToken", "value", "g", "Lcom/withpersona/sdk2/inquiry/integration/fragment/b;", "getIntegrationStepStateManager", "()Lcom/withpersona/sdk2/inquiry/integration/fragment/b;", "integrationStepStateManager", "a", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3628d extends AbstractC0991x0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C0967l0 savedStateHandle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C3626b.c integrationStepStateManagerFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9564b0<IntegrationWorkflow.InterfaceC3611b> _result;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public C0949d0<String> inquiryId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public C0949d0<String> sessionToken;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public C3626b integrationStepStateManager;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.fragment.d$a */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/fragment/d$a;", "", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/integration/fragment/d;", "a", "(Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/integration/fragment/d;", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C3628d mo18059a(@NotNull C0967l0 savedStateHandle);
    }

    public C3628d(@NotNull C0967l0 savedStateHandle, @NotNull C3626b.c integrationStepStateManagerFactory) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(integrationStepStateManagerFactory, "integrationStepStateManagerFactory");
        this.savedStateHandle = savedStateHandle;
        this.integrationStepStateManagerFactory = integrationStepStateManagerFactory;
        this._result = C9578i0.m37758b(0, 0, null, 7, null);
        this.inquiryId = savedStateHandle.m4948c("inquiry_id", null);
        this.sessionToken = savedStateHandle.m4948c(RealTrackingEventsLogger.KEY_SESSION_TOKEN, null);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final C3626b m18057e(@NotNull IntegrationWorkflow.Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        C3626b c3626b = this.integrationStepStateManager;
        if (c3626b != null) {
            return c3626b;
        }
        C3626b c3626bMo18055a = this.integrationStepStateManagerFactory.mo18055a(input, this.savedStateHandle);
        this.integrationStepStateManager = c3626bMo18055a;
        return c3626bMo18055a;
    }

    /* JADX INFO: renamed from: f */
    public final void m18058f(@NotNull IntegrationWorkflow.Input input) {
        InterfaceC9566c0<IntegrationWorkflow.Input> interfaceC9566c0M45395b;
        Intrinsics.checkNotNullParameter(input, "input");
        C3626b c3626b = this.integrationStepStateManager;
        if (c3626b == null || (interfaceC9566c0M45395b = c3626b.m45395b()) == null) {
            return;
        }
        interfaceC9566c0M45395b.setValue(input);
    }
}
