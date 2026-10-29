package com.withpersona.sdk2.inquiry.workflows;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/workflows/SimpleWorkflowState;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;", "<init>", "()V", "other", "", "t0", "(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)Z", "workflows_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SimpleWorkflowState implements WorkflowState {
    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowState
    public boolean t0(@NotNull WorkflowState other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return getClass() == other.getClass();
    }
}
