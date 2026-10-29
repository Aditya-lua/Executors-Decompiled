package com.withpersona.sdk2.inquiry.document.step;

import androidx.p616lifecycle.AbstractC0991x0;
import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/step/d;", "Landroidx/lifecycle/x0;", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "initialInput", "Lcom/withpersona/sdk2/inquiry/document/step/b$c;", "documentStepStateManagerFactory", "<init>", "(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/step/b$c;)V", "input", "", "f", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)V", "b", "Landroidx/lifecycle/l0;", "c", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/document/step/b;", "d", "Lcom/withpersona/sdk2/inquiry/document/step/b;", "e", "()Lcom/withpersona/sdk2/inquiry/document/step/b;", "stateManager", "a", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3475d extends AbstractC0991x0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C0967l0 savedStateHandle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final DocumentWorkflow.Input initialInput;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C3473b stateManager;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.d$a */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/step/d$a;", "", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "initialInput", "Lcom/withpersona/sdk2/inquiry/document/step/d;", "a", "(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/document/step/d;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C3475d mo16905a(@NotNull C0967l0 savedStateHandle, @NotNull DocumentWorkflow.Input initialInput);
    }

    public C3475d(@NotNull C0967l0 savedStateHandle, @NotNull DocumentWorkflow.Input initialInput, @NotNull C3473b.c documentStepStateManagerFactory) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(initialInput, "initialInput");
        Intrinsics.checkNotNullParameter(documentStepStateManagerFactory, "documentStepStateManagerFactory");
        this.savedStateHandle = savedStateHandle;
        this.initialInput = initialInput;
        this.stateManager = documentStepStateManagerFactory.mo16899a(initialInput, savedStateHandle);
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final C3473b getStateManager() {
        return this.stateManager;
    }

    /* JADX INFO: renamed from: f */
    public final void m16904f(@NotNull DocumentWorkflow.Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.stateManager.m45395b().setValue(input);
    }
}
