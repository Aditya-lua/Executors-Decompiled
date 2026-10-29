package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import androidx.p000lifecycle.l0;
import androidx.p000lifecycle.x0;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d;", "Landroidx/lifecycle/x0;", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "initialInput", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$c;", "stateManagerFactory", "<init>", "(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$c;)V", "input", "", "f", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)V", "d", "()V", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;", "e", "()Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;", "governmentIdStepStateManager", "a", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d extends x0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final b governmentIdStepStateManager;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d$a;", "", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "initialInput", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d;", "a", "(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        d a(@NotNull l0 savedStateHandle, @NotNull GovernmentIdWorkflow.Input initialInput);
    }

    public d(@NotNull l0 savedStateHandle, @NotNull GovernmentIdWorkflow.Input initialInput, @NotNull b.c stateManagerFactory) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(initialInput, "initialInput");
        Intrinsics.checkNotNullParameter(stateManagerFactory, "stateManagerFactory");
        this.governmentIdStepStateManager = stateManagerFactory.a(initialInput, savedStateHandle);
    }

    @Override // androidx.p000lifecycle.x0
    public void d() {
        super.d();
        this.governmentIdStepStateManager.e0();
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getGovernmentIdStepStateManager() {
        return this.governmentIdStepStateManager;
    }

    public final void f(@NotNull GovernmentIdWorkflow.Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.governmentIdStepStateManager.b().setValue(input);
    }
}
