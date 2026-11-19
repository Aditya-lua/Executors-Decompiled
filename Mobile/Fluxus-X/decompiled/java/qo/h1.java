package qo;

import com.github.luben.zstd.BuildConfig;
import no.u2;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lqo/h1;", "Landroidx/lifecycle/x0;", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lno/u2$b;", "initialInput", "Lqo/e1$c;", "documentStepStateManagerFactory", "<init>", "(Landroidx/lifecycle/l0;Lno/u2$b;Lqo/e1$c;)V", "input", BuildConfig.FLAVOR, "f", "(Lno/u2$b;)V", "b", "Landroidx/lifecycle/l0;", "c", "Lno/u2$b;", "Lqo/e1;", "d", "Lqo/e1;", "e", "()Lqo/e1;", "stateManager", "a", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h1 extends androidx.p000lifecycle.x0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final androidx.p000lifecycle.l0 savedStateHandle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final u2.Input initialInput;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e1 stateManager;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lqo/h1$a;", BuildConfig.FLAVOR, "Landroidx/lifecycle/l0;", "savedStateHandle", "Lno/u2$b;", "initialInput", "Lqo/h1;", "a", "(Landroidx/lifecycle/l0;Lno/u2$b;)Lqo/h1;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        h1 a(@NotNull androidx.p000lifecycle.l0 savedStateHandle, @NotNull u2.Input initialInput);
    }

    public h1(@NotNull androidx.p000lifecycle.l0 savedStateHandle, @NotNull u2.Input initialInput, @NotNull e1.c documentStepStateManagerFactory) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(initialInput, "initialInput");
        Intrinsics.checkNotNullParameter(documentStepStateManagerFactory, "documentStepStateManagerFactory");
        this.savedStateHandle = savedStateHandle;
        this.initialInput = initialInput;
        this.stateManager = documentStepStateManagerFactory.a(initialInput, savedStateHandle);
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final e1 getStateManager() {
        return this.stateManager;
    }

    public final void f(@NotNull u2.Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.stateManager.b().setValue(input);
    }
}
