package com.withpersona.sdk2.inquiry.internal.workflows;

import androidx.p616lifecycle.AbstractC0991x0;
import androidx.p616lifecycle.C0949d0;
import androidx.p616lifecycle.C0967l0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.workflows.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0013\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/workflows/e;", "Landroidx/lifecycle/x0;", "Landroidx/lifecycle/l0;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/l0;)V", "", "g", "()V", "b", "Landroidx/lifecycle/l0;", "f", "()Landroidx/lifecycle/l0;", "Landroidx/lifecycle/d0;", "", "c", "Landroidx/lifecycle/d0;", "e", "()Landroidx/lifecycle/d0;", "renderingName", "a", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3742e extends AbstractC0991x0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C0967l0 savedStateHandle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C0949d0<String> renderingName;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.workflows.e$a */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/workflows/e$a;", "", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/internal/workflows/e;", "a", "(Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/internal/workflows/e;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C3742e mo18872a(@NotNull C0967l0 savedStateHandle);
    }

    public C3742e(@NotNull C0967l0 savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        this.renderingName = savedStateHandle.m4948c("renderingName", null);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final C0949d0<String> m18869e() {
        return this.renderingName;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final C0967l0 getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX INFO: renamed from: g */
    public final void m18871g() {
        Iterator<T> it = this.savedStateHandle.m4952g().iterator();
        while (it.hasNext()) {
            this.savedStateHandle.m4954i((String) it.next(), null);
        }
    }
}
