package sq;

import androidx.p000lifecycle.l0;
import androidx.p000lifecycle.x0;
import com.github.luben.zstd.BuildConfig;
import mq.q5;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import tq.k2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lsq/n;", "Landroidx/lifecycle/x0;", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lmq/q5$b;", "initialInput", "Ltq/k2$d;", "selfieStepStateManagerFactory", "<init>", "(Landroidx/lifecycle/l0;Lmq/q5$b;Ltq/k2$d;)V", "input", BuildConfig.FLAVOR, "f", "(Lmq/q5$b;)V", "b", "Landroidx/lifecycle/l0;", "c", "Lmq/q5$b;", "Ltq/k2;", "d", "Ltq/k2;", "e", "()Ltq/k2;", "selfieStepStateManager", "a", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends x0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final l0 savedStateHandle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final q5.Input initialInput;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k2 selfieStepStateManager;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lsq/n$a;", BuildConfig.FLAVOR, "Landroidx/lifecycle/l0;", "savedStateHandle", "Lmq/q5$b;", "initialInput", "Lsq/n;", "a", "(Landroidx/lifecycle/l0;Lmq/q5$b;)Lsq/n;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        n a(@NotNull l0 savedStateHandle, @NotNull q5.Input initialInput);
    }

    public n(@NotNull l0 savedStateHandle, @NotNull q5.Input initialInput, @NotNull k2.d selfieStepStateManagerFactory) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(initialInput, "initialInput");
        Intrinsics.checkNotNullParameter(selfieStepStateManagerFactory, "selfieStepStateManagerFactory");
        this.savedStateHandle = savedStateHandle;
        this.initialInput = initialInput;
        this.selfieStepStateManager = selfieStepStateManagerFactory.a(initialInput, savedStateHandle);
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final k2 getSelfieStepStateManager() {
        return this.selfieStepStateManager;
    }

    public final void f(@NotNull q5.Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.selfieStepStateManager.b().setValue(input);
    }
}
